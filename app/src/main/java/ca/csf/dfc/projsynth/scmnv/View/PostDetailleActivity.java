package ca.csf.dfc.projsynth.scmnv.view;
//Source https://firebase.google.com/docs/database/android/retrieve-data
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import ca.csf.dfc.projsynth.scmnv.R;
import ca.csf.dfc.projsynth.scmnv.modele.Commentaire;
import ca.csf.dfc.projsynth.scmnv.modele.Post;

public class postDetailleActivity extends baseActivity implements View.OnClickListener {
    private static final String TAG = "PostDetailActivity";

    public static final String EXTRA_POST_KEY = "post_key";

    private DatabaseReference mPostReference;
    private DatabaseReference mCommentsReference;
    private ValueEventListener mPostListener;
    private String mPostKey;

    private Context mContext;


    private TextView mAuthorView;
    private TextView mTitleView;
    private TextView mBodyView;
    private EditText mCommentField;
    private Button mCommentButton;
    private RecyclerView mCommentsRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detaille);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Get post key from intent
        mPostKey = getIntent().getStringExtra(EXTRA_POST_KEY);
        if (mPostKey == null) {
            throw new IllegalArgumentException("Must pass EXTRA_POST_KEY");
        }

        // Initialize Database
        mPostReference = FirebaseDatabase.getInstance().getReference()
                .child("posts").child(mPostKey);
        mCommentsReference = FirebaseDatabase.getInstance().getReference()
                .child("post-comments").child(mPostKey);

        // Initialize Views
        mAuthorView = (TextView) findViewById(R.id.post_author);
        mTitleView = (TextView) findViewById(R.id.post_title);
        mBodyView = (TextView) findViewById(R.id.post_body);
        mCommentField = (EditText) findViewById(R.id.field_comment_text);
        mCommentButton = (Button) findViewById(R.id.button_post_comment);
        mCommentsRecycler = (RecyclerView) findViewById(R.id.recycler_comments);

        mCommentButton.setOnClickListener(this);
        mCommentsRecycler.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onClick(View v) {
        // Ajouter une valeur d'évennement listener à un post
        // [START post_value_event_listener]
        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get objet Post et utiliser les valeurs pour mettre à jour IU
                Post post = dataSnapshot.getValue(Post.class);
                // [START_EXCLUDE]
                mAuthorView.setText(post.author);
                mTitleView.setText(post.title);
                mBodyView.setText(post.body);
                // [END_EXCLUDE]
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Recevoir les messages d'erreur
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // [START_EXCLUDE]
                Toast.makeText(postDetailleActivity.this, "Failed to load post.",
                        Toast.LENGTH_SHORT).show();
                // [END_EXCLUDE]
            }
        };
        mPostReference.addValueEventListener(postListener);
        // [END post_value_event_listener]
    }

        private static class CommentViewHolder extends RecyclerView.ViewHolder {

            public TextView authorView;
            public TextView bodyView;

            public CommentViewHolder(View itemView) {
                super(itemView);

                authorView = (TextView) itemView.findViewById(R.id.comment_author);
                bodyView = (TextView) itemView.findViewById(R.id.comment_body);
            }
        }

        private static class CommentAdapter extends RecyclerView.Adapter<CommentViewHolder> {


            private Context mContext;
            private DatabaseReference mDatabaseReference;
            private ChildEventListener mChildEventListener;

            private List<String> mCommentIds = new ArrayList<>();
            private List<Commentaire> mComments = new ArrayList<>();

            public CommentAdapter(final Context context, DatabaseReference ref) {
                mContext = context;
                mDatabaseReference = ref;

                // Create child event listener
                // Créate child event listener
                // [START child_event_listener_recycler]
                ChildEventListener childEventListener = new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                        Log.d(TAG, "onChildAdded:" + dataSnapshot.getKey());

                        // A nouveau commentaire ajouté et l'ajouter à la liste
                        Commentaire commentaire = dataSnapshot.getValue(Commentaire.class);

                        // ...

                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                        Log.d(TAG, "onChildChanged:" + dataSnapshot.getKey());

                        // Un commentaire a changé par l'utilisation de la clé pour vérifier l'affichage

                        Commentaire newComment = dataSnapshot.getValue(Commentaire.class);
                        String commentaireCle = dataSnapshot.getKey();

                        // ...

                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {

                        //  Un commentaire a changé par l'utilisation de la clé pour vérifier l'affichage
                        // Vérifier si enlever
                        String commentKey = dataSnapshot.getKey();

                        // ...

                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                        // Un commentaire a changé par l'utilisation de la clé pour vérifier l'affichage

                        Commentaire movedComment = dataSnapshot.getValue(Commentaire.class);
                        String commentKey = dataSnapshot.getKey();

                        // ...
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.w(TAG, "Les commentaires postulés sont annulés", databaseError.toException());
                        Toast.makeText(mContext, "Erreur pour retélécharger.",
                                Toast.LENGTH_SHORT).show();

                    }

                };
                ref.addChildEventListener(childEventListener);
            }

            @Override
            public CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return null;
            }

            @Override
            public void onBindViewHolder(CommentViewHolder holder, int position) {

            }

            @Override
            public int getItemCount() {
                return 0;
            }
        }
    }
