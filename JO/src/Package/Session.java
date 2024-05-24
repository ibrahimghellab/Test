package Package;

public class Session {

	Resultat leResultat;
	Ville laVille;
	Epreuve sonEpreuve;
	private String dateSession;
	private String horaireSession;
	private String jourSession;
	private boolean individuelleSession;
	private String descriptionSession;
	private String typeGenresession;
	private float dureeSession;
	private int numSession;

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
		throw new UnsupportedOperationException();
	}

	public void afficherSession() {
		// TODO - implement Session.afficherSession
		throw new UnsupportedOperationException();
	}

	public void supprimerSession() {
		// TODO - implement Session.supprimerSession
		throw new UnsupportedOperationException();
	}

	public void afficherPlanning() {
		// TODO - implement Session.afficherPlanning
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
	public void modifierSession(String dateSession, String horaireSession, boolean jourSession, boolean individuelleSession, String typeGenreSession, float dureeSession) {
		// TODO - implement Session.modifierSession
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dateSession
	 * @param horaireSession
	 * @param jourSession
	 * @param nomCategorie
	 * @param typeSport
	 */
	public void creerPlanning(String dateSession, String horaireSession, String jourSession, String nomCategorie, String typeSport) {
		// TODO - implement Session.creerPlanning
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dateSession
	 * @param horaireSession
	 * @param jourSession
	 * @param nomCategorie
	 * @param typeSport
	 */
	public void modifierPlanning(String dateSession, String horaireSession, String jourSession, String nomCategorie, String typeSport) {
		// TODO - implement Session.modifierPlanning
		throw new UnsupportedOperationException();
	}

	public void ajouterVille(){

	}

	public void supprimerVille(){
		
	}

}