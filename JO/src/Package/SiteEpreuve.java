package Package;

import java.util.*;

public class SiteEpreuve {

	private Ville saVille;
	ArrayList<Epreuve> lEpreuve;
	private String nomSiteEpreuve;

	/**
	 * 
	 * @param nomSiteEpreuve
	 */
	public SiteEpreuve(String nomSiteEpreuve, Ville saVille) {
		this.nomSiteEpreuve=nomSiteEpreuve;
		this.saVille=saVille;		
		// TODO - implement SiteEpreuve.SiteEpreuve
		throw new UnsupportedOperationException();
	}

	public void afficherSiteEpreuve() {
		System.out.println("L'épreuve se passe dans " + this.nomSiteEpreuve);
		
		// TODO - implement SiteEpreuve.afficherSiteEpreuve
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nouveauNomSiteEpreuve
	 */
	public void modifierNomSiteEpreuve(String nouveauNomSiteEpreuve) {
		this.nomSiteEpreuve =nouveauNomSiteEpreuve;

		// TODO - implement SiteEpreuve.modifierNomSiteEpreuve
		throw new UnsupportedOperationException();
	}

		public void ajouterEpreuve(){

	}

	public void supprimerEpreuve(){
		
	}

	public void modifierVille(Ville nouvelleVille){
		this.saVille=nouvelleVille;				
	}

}