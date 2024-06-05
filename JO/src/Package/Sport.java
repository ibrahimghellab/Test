package Package;

import java.util.*;

public class Sport {

	ArrayList<Sportif> leSportif;
	ArrayList<Session> sesSessions;
	private String nomSport;

	/**
	 * 
	 * @param nomSport
	 */
	public Sport(String nomSport) {
		// TODO - implement Sport.Sport
		this.nomSport = nomSport;
		
		throw new UnsupportedOperationException();
	}

	public void supprimerSportif(Sportif f){
		if((leSportif.contains(f))){
            leSportif.remove(f);
        }else{
            System.out.println("Le sportif n'existe pas pour ce sport");
        }
	}


	public void ajouterSportif(Sportif f){
		if(!(leSportif.contains(f))){
            leSportif.add(f);
        }else{
            System.out.println("Le sportif est déjà présente dans ce sport");
        }

	}

	
	public void supprimerSession(Session s){
		if((sesSessions.contains(s))){
            sesSessions.remove(s);
        }else{
            System.out.println("La session n'existe pas pour ce sport");
        }
	}


	public void ajouterSession(Session s){
		if(!(sesSessions.contains(s))){
            sesSessions.add(s);
        }else{
            System.out.println("La session est déjà présente dans ce sport");
        }

	}



}