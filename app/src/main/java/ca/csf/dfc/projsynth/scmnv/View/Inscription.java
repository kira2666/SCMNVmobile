package ca.csf.dfc.projsynth.scmnv.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ca.csf.dfc.projsynth.scmnv.R;

public class inscription extends AppCompatActivity {

    // ajout des données à l'intent avec une clé afin de leur identifier pour la transmission des données.
    final String EXTRA_COURRIEL = "user_coouriel";
    final String EXTRA_PASSWORD1 = "user_password1";
    final String EXTRA_PASSWORD2 = "user_password2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        final EditText courriel = (EditText)findViewById(R.id.editTextCourriel);
        final EditText password1 = (EditText)findViewById(R.id.editTextPassword1);
        final EditText password2 = (EditText) findViewById(R.id.editTextPassword2);
        final Button buttonInscrire = (Button) findViewById(R.id.btnInsription);
        buttonInscrire.setOnClickListener(new View.OnClickListener() { //TODO: Manque des catchs pour les exceptions
            @Override
            public void onClick(View v) {
                final String courrielTxt = courriel.getText().toString(); //TODO: May produce NULLPointerException
                final String password1Txt = password1.getText().toString(); //TODO: May produce NULLPointerException
                final String password2Txt = password2.getText().toString(); //TODO: May produce NULLPointerException

                Intent intent;
                switch (v.getId()){
                    case R.id.btnInsription:
                        // Déclaration d'un pattern
                        Pattern p = Pattern.compile("[a-zA-Z-]+@[gmail]+\\.[a-zA-Z]{2,6}");

                        //Déclaration d'un matcher pour la comparaison avec le string passé en parametre.
                        Matcher m = p.matcher(courrielTxt);
                        if(!m.matches()){
                            Toast.makeText(inscription.this, R.string.email_format_error, Toast.LENGTH_SHORT).show();
                            return;
                        }
                        else if(password1Txt.equals("")){
                            Toast.makeText(inscription.this, R.string.email_or_password_empty, Toast.LENGTH_SHORT).show();
                            return;
                        }
                        else if(!password1Txt.equals(password2Txt)){
                            Toast.makeText(inscription.this, R.string.password1_or_password2_different, Toast.LENGTH_SHORT).show();
                            return;
                        }
                        intent = new Intent(inscription.this, environnement.class); //TODO: Ajouter lien vers bonne page
                        intent.putExtra(EXTRA_COURRIEL, courriel.getText().toString());
                        intent.putExtra(EXTRA_PASSWORD1, password1.getText().toString());
                        intent.putExtra(EXTRA_PASSWORD2, password2.getText().toString());
                        startActivity(intent);

                    /*case R.id.btnConnecter:
                        intent = new Intent(Inscription.this, MainActivity.class);
                        startActivity(intent);*/

                    /*case R.id.btnQuiter:
                        system.exit(0)*/
                        default:
                            break;
                }

            }
        });
    }
}
