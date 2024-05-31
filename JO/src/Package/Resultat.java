package Package;

import java.util.*;

public class Resultat {

	ArrayList<Equipe> classementEquipe;
	private Session laSession;
	ArrayList<Sportif> leSportif;
	
	/**
	 * 
	/**
	 * 
	 * @param nomEpreuve
	 * @param numSession
	 */

	public void afficherResultat(String nomEpreuve, String numSession) {
		// TODO - implement Pays.afficherPays
		System.out.println("Nom de l'épreuve : " + nomEpreuve);
		System.out.println("Numero de la session : " + numSession);

		throw new UnsupportedOperationException();
	}
 
	public void supprimerSportif(Sportif sportif){
		if((leSportif.contains(sportif))){
            leSportif.remove(sportif);
        }else{
            System.out.println("Le sportif n'existe pas pour ce resultat");
        }
	}


	public void ajouterSportif(Sportif sportif){
		if(!(leSportif.contains(sportif))){
            leSportif.add(sportif);
        }else{
            System.out.println("Le sportif est déjà présente dans ce resultat");
        }

	}



	public void supprimerEquipe(Equipe equipe){
		if((classementEquipe.contains(equipe))){
            classementEquipe.remove(equipe);
        }else{
            System.out.println("L'equipe n'existe pas pour ce resultat");
        }
	}


	public void ajouterEquipe(Equipe equipe){
		if(!(classementEquipe.contains(equipe))){
            classementEquipe.add(equipe);
        }else{
            System.out.println("L'equipe est déjà présente dans ce resultat");
        }

	}

