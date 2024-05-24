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
		throw new UnsupportedOperationException();
	}

	public void ajouterEquipe(Equipe e){
		lEquipe.add(e);
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

}