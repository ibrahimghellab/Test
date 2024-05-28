package Package;
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
    public void afficherCategorie(String nomCategorie) {
        // TODO - implement Cat�gorie.afficherCategorie
        throw new UnsupportedOperationException();
    }

	public void supprimerSportif() {
		// TODO - implement Sportif.supprimerSportif
		throw new UnsupportedOperationException();
	}

	public void modifierSportif() {
		// TODO - implement Sportif.modifierSportif
		throw new UnsupportedOperationException();
	}

	public void ajouterSportif() {
		// TODO - implement Sportif.supprimerSportif
		throw new UnsupportedOperationException();
	}

}