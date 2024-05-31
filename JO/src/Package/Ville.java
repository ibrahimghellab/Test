package Package;

import java.util.*;

public class Ville {

	ArrayList<Session> lesSessions;
	Pays sonPays;
	ArrayList<SiteEpreuve> sesSitesEpreuves;
	private String nomVille;
	private int codepostalVille;

	/**
	 * @param nomVille
	 * @param codePostal
	 */
	public Ville(String nomVille,int codePostal) {
		this.nomVille=nomVille;
		this.codePostal=codePostal
		
		throw new UnsupportedOperationException();
	}

	public void afficherVille() {
		System.out.println("Nom de la ville est  " + nomVille +" son code postale est "+ codePostal);
		throw new UnsupportedOperationException();
	}

	

}