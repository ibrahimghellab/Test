package Package;

import java.util.*;

public class Equipe {

    Pays lePays;
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
        this.nomEquipe=nomEquipe;
        this.genreEquipe=genreEquipe;
        this.nomEntraineur=nomEntraineur;

        throw new UnsupportedOperationException();
    }

    public void ajouterResultat(Resultat resultat){
        if(!(lesResultats.contains(resultat))){
            lesResultats.add(resultat);
        }else{
            // a immplémenter dans le controller
            System.out.println("Le résultat que vous souhaitez ajouter est dejà présent");
        }
    }

    public void supprimerResultat(Resultat resultat){
        if(lesResultats.contains(resultat)){
            lesResultats.remove(resultat);
        }else{
            // a immplémenter dans le controller
            System.out.println("La session que vous souhaitez supprimer n'existe pas");
        }
    }

    public void afficherEquipe() {
        // TODO - implement Equipe.afficherEquipe
        
		System.out.println("Nom de l'équipe : " + nomEquipe +" de genre "+ genreEquipe+" entrainer par "+nomEntraineur);
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
     

		 if(!(sesSportifs.contains(sportif))){
            sesSportifs.add(sportif);
        }else{
            // a immplémenter dans le controller
            System.out.println("Le sportif que vous voulez ajouter est déjà présent");
        }
		throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param sportif
     */
    public void supprimerSportif(Sportif sportif) {
        // TODO - implement Equipe.supprimerSportif
       

		if(sesSportifs.contains(sportif)){
			sesSportifs.remove(sportif);
		}else{

			System.out.println("Le sportif que vous voulez supprimer n'est pas présent");

		}
		throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param nouveauNomEntraineur
     */
    public void modifierEntraineurEquipe(String nouveauNomEntraineur) {
       this.nomEntraineur=nouveauNomEntraineur;

        // TODO - implement Equipe.modifierEntraineurEquipe
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param nouveauNomEquipe
     */
    public void modifierNomEquipe(String nouveauNomEquipe) {
        // TODO - implement Equipe.modifierNomEquipe
		this.nomEquipe = nouveauNomEquipe;
        throw new UnsupportedOperationException();
		
    }

}