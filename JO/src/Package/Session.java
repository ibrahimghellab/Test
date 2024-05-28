package Package;

public class Session {

	private ArrayList<Resultat> lesResultats;
	private Ville laVille;
	private Epreuve sonEpreuve;
	private String dateSession;
	private String horaireSession;
	private String jourSession;
	private boolean individuelleSession;
	private String descriptionSession;
	private String typeGenresession;
	private float dureeSession;
	private int numSession;
	private ArrayList<Sport> sesSports;

	void modifierVille(Ville v){
		laVille=v;
	}
	void modifierEpreuve(Epreuve e){
		sonEpreuve=e;
	}
	void modifierdateSession(String dateSession){
		this.dateSession=dateSession;
	}
	void modifierhoraireSession(String horaireSession){
		this.horaireSession = horaireSession;
	}

	void modifierjourSession(String jourSession){
		this.jourSession = jourSession;
	}

	void modifierindividuelleSession (boolean individuelleSession){
		this.individuelleSession =individuelleSession;
	}


	void modifierdescriptionSesson(String descriptionSession){
		this.descriptionSession = descriptionSession;
	} 
	void modifiertypeGenresession[String typeGenresession){
		this.typeGenreSession = typeGenreSession;
	}]


	void modifierdureeSession(float dureeSession){
		this.dureeSession = dureeSession;
	}
	
	void modifiernumSession(int numSession){
		this.numSession = numSession;
	}



	void ajouterResultat(Resultat r){
		 if(!(lesResultats.contains(r))){
            lesResultats.add(r);
        }else{
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
			this individuelleSession = individuelleSession;
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

	
	void ajouterSport(Sport s){
		 if(!(sesSports.contains(s))){
            sesSports.add(s);
        }else{
            System.out.println("Le sport est déjà présent pour cette session");
        }
	}

	void supprimerResultat(Sport s){
		 if((sesSports.contains(s))){
            sesSports.remove(s);
        }else{
            System.out.println("Le sport n'existe pas pour cette session");
        }
	}



}