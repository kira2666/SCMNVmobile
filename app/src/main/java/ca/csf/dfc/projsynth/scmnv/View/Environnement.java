package ca.csf.dfc.projsynth.scmnv.view;


import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

import ca.csf.dfc.projsynth.scmnv.R;

public class environnement extends AppCompatActivity {

    //
    public TextToSpeech tts;
    public TextView txtFormule;
    public EditText editFormule;
    public Button btnCharger;
    public Button btnVisualiser;
    public Button btnDeconnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_environnement);
        btnCharger = (Button) findViewById(R.id.btnCharger);
        txtFormule = (TextView) findViewById(R.id.txtFormule);
        editFormule = (EditText) findViewById(R.id.editFormule);
        btnVisualiser = (Button) findViewById(R.id.btnVisualiser);
        btnDeconnexion = (Button) findViewById(R.id.btnDeconnexion);


        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.CANADA_FRENCH);
                }
            }
        });

        btnVisualiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = editFormule.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
                tts.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });

        btnCharger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String text = readFileFromAssets("MegaTest.docx");
                String text = readFileFromAssets("MathML.mml");
                //String text = readFileFromAssets("LaTeXEquation.tex");
                if(text != null){
                    editFormule.setText(text);
                }
            }
        });

    }

    private String readFileFromAssets(String filename){
        BufferedReader reader = null;
        StringBuilder builder = new StringBuilder();

        try{
            reader = new BufferedReader(new InputStreamReader(getAssets().open(filename)));
            String line;
            while ((line = reader.readLine()) != null){
                builder.append(line).append("\n");
            }
            return builder.toString();
        }catch(IOException e) {
            e.getMessage();
        }finally {
            try{
                reader.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }

    public void onPause(){
        if(tts !=null){
            tts.stop();
            tts.shutdown();
        }
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //    getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        //  if(id == R.id.action_settings){
        //return true;
        //  }
        return  super.onOptionsItemSelected(item);
    }

}