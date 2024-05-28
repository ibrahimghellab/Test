package Package;

import java.util.*;

public class Equipe {

    Pays lePays;
    Resultat sesResultats;
    ArrayList<Sportif> sesSportifs;
    Categorie saCategorie;
    ArrayList<Resultat> lesResultats;
    private String nomEquipe;
    private String genreEquipe;
    private String nomEntraineur;

    /**
     * 
     * @param nomEquipe
     * @param genreEquipe
     * @param nomEntraineur
     */
    public Equipe(String nomEquipe, String genreEquipe, String nomEntraineur) {
        // TODO - implement Equipe.Equipe
        throw new UnsupportedOperationException();
    }

    public void ajouterResultat(Resultat r){
        if(!(lesResultats.contains(r))){
            lesResultats.add(r);
        }else{
            // a immplémenter dans le controller
            System.out.println("Le résultat que vous souhaitez ajouter est dejà présent");
        }
    }

    public void supprimerResultat(Resultat r){
        if(lesResultats.contains(r)){
            lesResultats.remove(r);
        }else{
            // a immplémenter dans le controller
            System.out.println("La session que vous souhaitez supprimer n'existe pas");
        }
    }

    public void afficherEquipe() {
        // TODO - implement Equipe.afficherEquipe
        throw new UnsupportedOperationException();
    }

    /*public void supprimerEquipe() {
        // TODO - implement Equipe.supprimerEquipe
        throw new UnsupportedOperationException();
    }*/

    /**
     * 
     * @param sportif
     */
    public void ajouterSportif(Sportif sportif) {
        // TODO - implement Equipe.ajouterSportif
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param sportif
     */
    public void supprimerSportif(Sportif sportif) {
        // TODO - implement Equipe.supprimerSportif
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param nouveauNomEntraineur
     */
    public void modifierEntraineurEquipe(String nouveauNomEntraineur) {
        // TODO - implement Equipe.modifierEntraineurEquipe
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param nouveauNomEquipe
     */
    public void modifierNomEquipe(String nouveauNomEquipe) {
        // TODO - implement Equipe.modifierNomEquipe
        throw new UnsupportedOperationException();
    }

}