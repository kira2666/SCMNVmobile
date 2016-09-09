package ca.csf.dfc.projsynth.scmnv.view;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

import ca.csf.dfc.projsynth.scmnv.R;
import ca.csf.dfc.projsynth.scmnv.tree.FormatConverter;
import ca.csf.dfc.projsynth.scmnv.tree.TreeCalculation;

import java.util.ArrayList;
import java.util.Locale;

/*
Pass to intent as follows:

Intent intent = getIntent();
intent.putStringArrayListExtra("test", (ArrayList<String>) test);

Retrieve data as follows:

ArrayList<String> test = getIntent().getStringArrayListExtra("test");
 */
public class resultat extends AppCompatActivity {

    public final int MIN_VALUE = 1;
    NumberPicker np;
    TextToSpeech tts;
    TextView txt_Formule;
    TextView txt_result_tot;
    ArrayList<String> strlst_Formule;
    int current_Formule;
    public static int MAX_VALUE;
    Button btn_Next;
    Button btn_Back;
    Button btn_Listen;
    Button btn_decon;

    String str_Test1 = "8 y + 9 ^ 2x - e * e";

    String str_Test2 = "1+1";
    String str_Test3 = "3 y - 4 + 2 x";

    private final int REQ_CODE_SPEECH_INPUT = 100;
    String speech = "";

    //section calcul
    TreeCalculation Mytree;
    FormatConverter converter;
    String str_Complex;
    TextView txt_Complex;

    MediaPlayer mpintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);



        //On get la liste de toutes les formules au format string de l'activité précédente
        //strlst_Formule = getIntent().getStringArrayListExtra("lst_Str");

        //On hardcode la liste de String pour l'instant
        strlst_Formule = new ArrayList<String>();
        strlst_Formule.add(str_Test1);
        strlst_Formule.add(str_Test2);
        strlst_Formule.add(str_Test3);

        initNbPicker();
        initTts();
        initBtnEcouter();
        initBtnBack();
        initBtnNext();
        initBtnDeco();
        changeComplex();

        txt_Formule.clearFocus();
        promptSpeechInput();


    }



    /**
     * Showing google speech input dialog
     * http://www.androidhive.info/2014/07/android-speech-to-text-tutorial/
     * */
    private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                getString(R.string.speech_prompt));
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    getString(R.string.speech_not_supported),
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Receiving speech input
     * http://www.androidhive.info/2014/07/android-speech-to-text-tutorial/
     * */

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    speech = result.get(0);
                }
                break;
            }

        }

        if (speech.toUpperCase().equals("SUIVANT")){
            btn_Next.callOnClick();
            tts.speak("Formule suivante",TextToSpeech.QUEUE_FLUSH, null);

            if (!tts.isSpeaking()) {
                promptSpeechInput();
            }
        }
        else if (speech.toUpperCase().equals("PRÉCÉDENT")){
            btn_Back.callOnClick();
            tts.speak("Formule précédente" + "",TextToSpeech.QUEUE_FLUSH, null);
            promptSpeechInput();

        }
        else if (speech.toUpperCase().equals("DÉSACTIVER")){
            tts.speak("L'interface audio est désactivée",TextToSpeech.QUEUE_FLUSH, null);
        }

        else if (speech.toUpperCase().equals("ÉCOUTER")){
            btn_Listen.callOnClick();
            promptSpeechInput();

        }
        else if (speech.toUpperCase().equals("MENU")){
            tts.speak("Ceci est l'interface de résultats. " +
                    "Pour obtenir le nombre total de résultats, dites résultat. " +
                    "Pour avoir à la formule suivante, dites suivant." +
                    "Pour avoir pour la formule précédente, dites précédente. " +
                    "Pour écouter la formule courante, dites écouter." +
                    "Pour désactiver l'interface audio, dites désactiver." +
                    "Pour faire répéter le menu, dites menu.",TextToSpeech.QUEUE_FLUSH, null);
            promptSpeechInput();

        }

        else if (speech.toUpperCase().equals("TOTAL")){
            tts.speak("Il y a: "+ txt_result_tot.getText() + "résultats et vous êtes à la formule " + np.getValue(),TextToSpeech.QUEUE_FLUSH, null);
            promptSpeechInput();


        }
/*
        else if (Integer.parseInt(speech) >= MIN_VALUE && Integer.parseInt(speech) <= MAX_VALUE){
            np.setValue(Integer.parseInt(speech));
            current_Formule = np.getValue();
            txt_Formule.setText(strlst_Formule.get(current_Formule-1));
            tts.speak("vous êtes à la formule " + np.getValue(),TextToSpeech.QUEUE_FLUSH, null);
            promptSpeechInput();
        }
        */

        else{
            tts.speak("Répétez s'il vous plait",TextToSpeech.QUEUE_FLUSH, null);
            promptSpeechInput();
        }

    }


    private void initBtnEcouter() {
        //Bouton Écouter
        btn_Listen = (Button) findViewById(R.id.btn_Ecouter);
        btn_Listen.setBackgroundColor(Color.parseColor("#FFE665"));
        btn_Listen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                if (Mytree.getComplexity() < 1.5) {
                } else if (Mytree.getComplexity() < 2.5) {
                } else if (Mytree.getComplexity() < 3.5) {
                } else if (Mytree.getComplexity() < 4.5) {
                } else {
                }

                tts.speak(strlst_Formule.get(current_Formule-1), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    public void initBtnDeco() {

        //Bouton Déconnexion
        btn_decon = (Button) findViewById(R.id.btn_Deconnexion);
        btn_decon.setBackgroundColor(Color.parseColor("#CC0000"));
        btn_decon.setTextColor(Color.WHITE);
    }

    public void initBtnNext(){
        //Bouton Next
        //On devra faire le changement nous même parce que le number picker n'a pas de notify avec le setValue
        btn_Next = (Button) findViewById(R.id.btn_Next);
        btn_Next.setBackgroundColor(Color.parseColor("#0072FF"));
        btn_Next.setTextColor(Color.WHITE);
        btn_Next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (np.getValue() < MAX_VALUE){
                    np.setValue(np.getValue()+1);
                    current_Formule = np.getValue();
                    txt_Formule.setText(strlst_Formule.get(current_Formule-1));
                }
                changeComplex();
            }
        });
    }

    private void initBtnBack(){
        //Bouton Back
        //On devra faire le changement nous même parce que le number picker n'a pas de notify avec le setValue
        btn_Back = (Button) findViewById(R.id.btn_Back);
        btn_Back.setBackgroundColor(Color.parseColor("#0072FF"));
        btn_Back.setTextColor(Color.WHITE);
        btn_Back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (np.getValue() > MIN_VALUE){
                    np.setValue(np.getValue()-1);
                    current_Formule = np.getValue();
                    txt_Formule.setText(strlst_Formule.get(current_Formule-1));
                }
                changeComplex();
            }
        });
    }

    public void initNbPicker(){
        np = (NumberPicker) findViewById(R.id.np_Courant);
        // On set le minimum et maximum value du number Picker
        np.setMinValue(MIN_VALUE);
        np.setMaxValue(strlst_Formule.size());
        MAX_VALUE = strlst_Formule.size();

        //On ajoute le listener au number picker
        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(){
            @Override
            public void onValueChange(NumberPicker p_np, int p_oldNum, int p_newNum){
                np.setValue(p_newNum);
                current_Formule = np.getValue();
                txt_Formule.setText(strlst_Formule.get(current_Formule-1));
            }
        });

        //On set le chiffre maximum à côté du number picker
        txt_result_tot = (TextView) findViewById(R.id.txt_Resultat_Total);
        txt_result_tot.setText("" + strlst_Formule.size());

        //On set le text de la formule courante à partir du number picker
        current_Formule = np.getValue();
        txt_Formule =(TextView) findViewById(R.id.txt_Formule);
        txt_Formule.setText(strlst_Formule.get(current_Formule-1));
    }

    public void initTts(){
        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.CANADA_FRENCH);
                    tts.setSpeechRate((float)0.8);
                    tts.setVoice(new Voice("test",Locale.CANADA_FRENCH,Voice.QUALITY_VERY_HIGH,Voice.LATENCY_NORMAL,false,null));
                }
            }
        });
    }

    public void changeComplex(){
        /* PARTIE CALCUL DE COMPLEXITÉ */

        try {
            Mytree = new TreeCalculation(strlst_Formule.get(current_Formule-1));

            txt_Complex = (TextView) findViewById(R.id.txt_ValueComplex);
            txt_Complex.setText("" + Mytree.getComplexity());
            Log.d("Complexité", "" +Mytree.getComplexity());
            Log.d("Texte Complexité", "" +txt_Complex.getText());

        }
        catch (Throwable exp) {}
    }
}
