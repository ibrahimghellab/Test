package Package;

import java.util.*;

public class Session {

	private Resultat sonResultat;
	private Ville laVille;
	private Epreuve sonEpreuve;
	private String dateSession;
	private String horaireSession;
	private String jourSession;
	private boolean individuelleSession;
	private String descriptionSession;
	private String typeGenreSession;
	private float dureeSession;
	private int numSession;
	SiteEpreuve site;



	void modifierVille(Ville nouvelleVille){
		this.laVille=nouvelleVille;
	}
	void modifierEpreuve(Epreuve nouvelleEpreuve){
		this.sonEpreuve=nouvelleEpreuve;
	}
	void modifierdateSession(String nouvelledateSession){
		this.dateSession=nouvelledateSession;
	}
	void modifierhoraireSession(String nouvellehoraireSession){
		this.horaireSession = nouvellehoraireSession;
	}

	void modifierjourSession(String nouveauJourSession){
		this.jourSession = nouveauJourSession;
	}

	void modifierindividuelleSession (boolean nouveauIndividuelleSession){
		this.individuelleSession = nouveauIndividuelleSession;
	}


	void modifierdescriptionSesson(String nouvelleDescriptionSession){
		this.descriptionSession = nouvelleDescriptionSession;
	} 
	void modifiertypeGenresession(String nouveauTypeGenreSession){
		this.typeGenreSession = nouveauTypeGenreSession;
	}


	void modifierdureeSession(float nouvelleDureeSession){
		this.dureeSession = nouvelleDureeSession;
	}
	
	void modifiernumSession(int nouveauNumSession){
		this.numSession = nouveauNumSession;
	}



	void ajouterResultat(Resultat resultat){
		 if(!(lesResultats.contains(resultat)))
		{
            lesResultats.add(resultat);
        }
		else
		{
            System.out.println("Le résultat est déjà présent pour cette session");
        }
	}

	void supprimerResultat(Resultat r){
		 if((lesResultats.contains(r))){
            lesResultats.remove(r);
        }else{
            System.out.println("Le résultat n'existe pas pour cette session");
        }
	}

	/**
	 * 
	 * @param dateSession
	 * @param horaireSession
	 * @param jourSession
	 * @param individuelleSession
	 * @param typeGenreSession
	 * @param dureeSession
	 */
	public Session(String dateSession, String horaireSession, String jourSession, boolean individuelleSession, String typeGenreSession, float dureeSession) {
		// TODO - implement Session.Session
			this.dateSession = dateSession;
			this.horaireSession = horaireSession;
			this.jourSession = jourSession;
			this.individuelleSession = individuelleSession;
			this.typeGenreSession = typeGenreSession;
			this.dureeSession = dureeSession;
		throw new UnsupportedOperationException();
	}

	



	public void afficherPlanning() {
		// TODO - implement Session.afficherPlannin
		//for du to string 
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dateSession
	 * @param horaireSession
	 * @param jourSession
	 * @param individuelleSession
	 * @param typeGenreSession
	 * @param dureeSession
	 */

	

	/**
	 * 
	 * @param dateSession
	 * @param horaireSession
	 * @param jourSession
	 * @param nomCategorie
	 * @param typeSport
	 */


	/**
	 * 
	 * @param dateSession
	 * @param horaireSession
	 * @param jourSession
	 * @param nomCategorie
	 * @param typeSport
	 */

	
	void ajouterSport(Sport sport){
		 if(!(sesSports.contains(sport)))
		{
            sesSports.add(sport);
        }
		else
		{
            System.out.println("Le sport est déjà présent pour cette session");
        }
	}

	void supprimerResultat(Sport sport){
		 if((sesSports.contains(sport)))
		{
            sesSports.remove(sport);
        }
		else
		{
            System.out.println("Le sport n'existe pas pour cette session");
        }
	}



}