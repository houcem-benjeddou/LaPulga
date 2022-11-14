/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdset;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author benje
 */
public class TdSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(2, "Toukebri", "Aymen");
        Etudiant e2 = new Etudiant(3, "Houcem", "Benjeddou");
        Etudiant e3 = new Etudiant(252, "Houssem", "Hosni");
        Etudiant e4 = new Etudiant(1, "Houssem", "Hosni");

//        EspritHashSet ehs = new EspritHashSet();
//        ehs.ajouterEtudiant(e1);
//        ehs.ajouterEtudiant(e2);
//        ehs.ajouterEtudiant(e3);
//        ehs.displayEtudiants();
//        ehs.ajouterEtudiant(e4);
//        ehs.displayEtudiants();
//
//        System.out.println("Presence Par Id : " + ehs.rechercherEtudiant(1));

        EspritTreeSet ets = new EspritTreeSet();
        ets.ajouterEtudiant(e1);
        ets.ajouterEtudiant(e2);
        ets.ajouterEtudiant(e3);
        ets.displayEtudiants();
        ets.ajouterEtudiant(e4);
        ets.displayEtudiants();

        System.out.println("Presence Par Id : " + ets.rechercherEtudiant(1));

    }

}
