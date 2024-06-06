package Modele;
//Non
import java.util.*;

public class Categorie {

    ArrayList<Sportif> leSportif;
    ArrayList<Equipe> lEquipe;
    private String nomCategorie;
    private float poidsMin;
    private int poidsMax;

    /**
     * 
     * @param poidsMin
     * @param poidsMax
     * @param nomCategorie
     */
    public Categorie(int poidsMin, int poidsMax, String nomCategorie) {
        // TODO - implement Cat�gorie.Cat�gorie
        this.poidsMin=poidsMin;
        this.poidsMax=poidsMax;
        this.nomCategorie=nomCategorie;
        throw new UnsupportedOperationException();
    }

    public void ajouterEquipe(Equipe e){
        if(!(lEquipe.contains(e))){
            lEquipe.add(e);
        }else{
            // a immplémenter dans le controller
            System.out.println("L'équipe que vous souhaitez ajouter est dejà présente");
        }
        
    }

    public void supprimerEquipe(Equipe e){
        if(lEquipe.contains(e)){
            lEquipe.remove(e);
        }else{
            // a immplémenter dans le controller
            System.out.println("L'équipe que vous souhaitez supprimer n'existe pas");
        }
    }


    /**
     * 
     * @param nomCategorie
     */
    public void afficherCategorie() {
        
        System.out.println("Cette equipe est dans la catégorie : " + this.nomCategorie);              
        throw new UnsupportedOperationException();
    }

	public void supprimerSportif(Sportif sportif) {
        
		if(leSportif.contains(sportif))
        {
			leSportif.remove(sportif);
		}
        else
        {
			System.out.println("Le sportif que vous voulez supprimer n'est pas présent");
		}
		throw new UnsupportedOperationException();

	}

	public void modifierSportif(Sportif sportif , Sportif nouveausportif) {
		// TODO - implement Sportif.modifierSportif
        if(leSportif.contains(sportif))
        {
            leSportif.set(leSportif.indexOf(sportif),nouveausportif);
        }
        else
        {
            System.out.println("Le sportif que vous voulez modifier n'existe pas");
        }
		throw new UnsupportedOperationException();
	}

	public void ajouterSportif(Sportif sportif) {
		// TODO - implement Sportif.supprimerSportif
        if(!(leSportif.contains(sportif)))
        {
            leSportif.add(sportif);
        }else
        {            
            System.out.println("Le sportif que vous voulez ajouter est déjà présent");
        }
		throw new UnsupportedOperationException();
	}

}