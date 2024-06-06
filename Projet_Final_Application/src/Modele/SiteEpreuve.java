package Modele;

import java.util.*;

public class SiteEpreuve {

	private Ville saVille;
	private String nomSiteEpreuve;

	/**
	 * 
	 * @param nomSiteEpreuve
	 */
	public SiteEpreuve(String nomSiteEpreuve, Ville saVille) {
		this.nomSiteEpreuve=nomSiteEpreuve;
		this.saVille=saVille;		
		
		throw new UnsupportedOperationException();
	}

	public void afficherSiteEpreuve() {
		System.out.println("L'épreuve se passe au " + this.nomSiteEpreuve + "dans la ville de "+saVille);
		
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nouveauNomSiteEpreuve
	 */
	public void modifierNomSiteEpreuve(String nouveauNomSiteEpreuve) {
		this.nomSiteEpreuve =nouveauNomSiteEpreuve;

		throw new UnsupportedOperationException();
	}

		/*public void ajouterEpreuve(Epreuve epreuve){
		if(!(lEpreuve.contains(epreuve)))
		{
        	lEpreuve.add(epreuve);
        }
		else
		{           
            System.out.println("L'épreuve que vous souhaitez ajouter est dejà présente");
        }
	}

	public void supprimerEpreuve(Epreuve epreuve){
		if(lEpreuve.contains(epreuve))
		{
            lEpreuve.remove(epreuve);
        }
		else
		{
            System.out.println("L'épreuve que vous souhaitez supprimer n'existe pas");
        }
	}*/

	public void modifierVille(Ville nouvelleVille){
		this.saVille=nouvelleVille;				
	}

}