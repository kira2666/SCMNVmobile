package ca.csf.dfc.projsynth.scmnv.view;

import android.os.Bundle;
import android.support.design.widget.*;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

import ca.csf.dfc.projsynth.scmnv.R;
import ca.csf.dfc.projsynth.scmnv.modele.Post;
import ca.csf.dfc.projsynth.scmnv.modele.Utilisateur;

public class newPostActivity extends baseActivity {

        private static final String TAG = "NewPostActivity";
        private static final String REQUIRED = "Required";

        // [START declare_database_ref]
        private DatabaseReference mDatabase;
        // [END declare_database_ref]

        private EditText mTitleField;
        private EditText mBodyField;
        private FloatingActionButton mSubmitButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_new_post);

            // [START initialize_database_ref]
            mDatabase = FirebaseDatabase.getInstance().getReference();
            // [END initialize_database_ref]

            mTitleField = (EditText) findViewById(R.id.field_title);
            mBodyField = (EditText) findViewById(R.id.field_body);
            mSubmitButton = (FloatingActionButton) findViewById(R.id.fab_submit_post);

            mSubmitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    submitPost();
                }
            });
        }

        private void submitPost() {
            final String title = mTitleField.getText().toString();
            final String body = mBodyField.getText().toString();

            // Title is required
            if (TextUtils.isEmpty(title)) {
                mTitleField.setError(REQUIRED);
                return;
            }

            // Body is required
            if (TextUtils.isEmpty(body)) {
                mBodyField.setError(REQUIRED);
                return;
            }

            // Disable button so there are no multi-posts
            setEditingEnabled(false);
            Toast.makeText(this, "Posting...", Toast.LENGTH_SHORT).show();

            // [START single_value_read]
            final String userId = getUid();
            mDatabase.child("users").child(userId).addListenerForSingleValueEvent(
                    new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            // Get user value
                            Utilisateur user = dataSnapshot.getValue(Utilisateur.class);

                            // [START_EXCLUDE]
                            if (user == null) {
                                // User is null, error out
                                Log.e(TAG, "User " + userId + " is unexpectedly null");
                                Toast.makeText(newPostActivity.this,
                                        "Error: could not fetch user.",
                                        Toast.LENGTH_SHORT).show();
                            } else {
                                // Write new post
                                writeNewPost(userId, user.userName, title, body);
                            }

                            // Finish this Activity, back to the stream
                            setEditingEnabled(true);
                            finish();
                            // [END_EXCLUDE]
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {
                            Log.w(TAG, "getUser:onCancelled", databaseError.toException());
                            // [START_EXCLUDE]
                            setEditingEnabled(true);
                            // [END_EXCLUDE]
                        }
                    });
            // [END single_value_read]
        }

        private void setEditingEnabled(boolean enabled) {
            mTitleField.setEnabled(enabled);
            mBodyField.setEnabled(enabled);
            if (enabled) {
                mSubmitButton.setVisibility(View.VISIBLE);
            } else {
                mSubmitButton.setVisibility(View.GONE);
            }
        }

        // [START write_fan_out]
        private void writeNewPost(String userId, String username, String title, String body) {
            // Create new post at /user-posts/$userid/$postid and at
            // /posts/$postid simultaneously
            String key = mDatabase.child("posts").push().getKey();
            Post post = new Post(userId, username, title, body);
            Map<String, Object> postValues = post.toMap();

            Map<String, Object> childUpdates = new HashMap<>();
            childUpdates.put("/posts/" + key, postValues);
            childUpdates.put("/user-posts/" + userId + "/" + key, postValues);

            mDatabase.updateChildren(childUpdates);
        }
        // [END write_fan_out]
    }



