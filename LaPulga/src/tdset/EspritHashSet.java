/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdset;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author benje
 */
public class EspritHashSet implements University {

    HashSet<Etudiant> etudiants = new HashSet<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return this.etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(int id) {
        Iterator<Etudiant> iterator = this.etudiants.iterator();
        while (iterator.hasNext()) {
            Etudiant e = iterator.next();
            if (e.getId() == id) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        this.etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        System.out.println(this.etudiants);
    }

}
