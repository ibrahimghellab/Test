package Modele;

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
	private SiteEpreuve site;



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



	void ajouter_modifier_Resultat(Resultat resultat){	
            this.sonResultat=resultat;        
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






}