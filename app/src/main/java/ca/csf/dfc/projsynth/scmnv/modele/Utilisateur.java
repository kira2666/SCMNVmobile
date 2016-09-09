package ca.csf.dfc.projsynth.scmnv.modele;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by nvanc on 2016-09-07.
 */

// [START blog_utilisateur_class]
@IgnoreExtraProperties
public class Utilisateur {
    public String userName;
    public  String email;

    //Constructeur par défaut
    public Utilisateur() {

    }

    //Constructeur par init
    public Utilisateur(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
}
// [END blog_utilisateur_class]
