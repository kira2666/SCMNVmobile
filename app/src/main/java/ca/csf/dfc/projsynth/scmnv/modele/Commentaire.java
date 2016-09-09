package ca.csf.dfc.projsynth.scmnv.modele;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by nvanc on 2016-09-07.
 */
//Cette classe pour l'utilisateur ajoute ces commentaires

// [START comment_class]
@IgnoreExtraProperties
public class Commentaire {
    public String userId;
    public String auteur;
    public String text;

    //Constructeur par défaut
    public Commentaire() {
    }

    public Commentaire(String userId, String auteur, String text) {
        this.userId = userId;
        this.auteur = auteur;
        this.text = text;
    }
}
// [END comment_class]
