package Modele;

import java.util.*;

public class Pays {

	ArrayList<Sportif> sesSportifs;
	ArrayList<Resultat> sesResultats;
	ArrayList<Equipe> lEquipe;
	ArrayList<Ville> sesVilles;
	private String NomPays;

	public Pays() {
		// TODO - implement Pays.Pay
		this.NomPays = NomPays;
		throw new UnsupportedOperationException();
	}

	public void afficherPays() {
		// TODO - implement Pays.afficherPays
		System.out.println("Nom du pays : " + NomPays);
		throw new UnsupportedOperationException();
	}

	public void supprimerSportif(Sportif s){
		 if((sesSportifs.contains(s))){
            sesSportifs.remove(s);
        }else{
            System.out.println("Le résultat n'existe pas pour cette session");
        }
	}
	
	public void modifierSportif(Sportif sportif , Sportif nouveausportif) {
		// TODO - implement Sportif.modifierSportif
        if(sesSportifs.contains(sportif))
        {
            sesSportifs.set(sesSportifs.indexOf(sportif),nouveausportif);
        }
        else
        {
            System.out.println("Le sportif que vous voulez modifier n'existe pas");
        }
		throw new UnsupportedOperationException();
	}

	public void ajouterSportif(Sportif s){
		// TODO - implement Sportif.supprimerSportif
		 if(!(sesSportifs.contains(s))){
            sesSportifs.add(s);
        }else{
            System.out.println("Le sportif est déjà présent dans ce pays");
        }
	}

	public void ajouterVille(Ville v){
		if(!(sesVilles.contains(v))){
            sesVilles.add(v);
        }else{
            System.out.println("La ville est déjà présente dans ce pays");
        }

	}

	public void supprimerVille(Ville v){
		if((sesVilles.contains(v))){
            sesVilles.remove(v);
        }else{
            System.out.println("La ville n'existe pas pour ce pays");
        }
		
	}

	public void ajouterResultat(Resultat r){
		if(!(sesResultats.contains(r))){
            sesResultats.add(r);
        }else{
            System.out.println("Le Relsultat est déjà présente dans ce pays");
        }

	}

	public void supprimerResultat(Resultat r){
		if((sesResultats.contains(r))){
            sesResultats.remove(r);
        }else{
            System.out.println("Le Resultat n'existe pas pour ce pays");
        }
		
	}

	public void ajouterEquipe(Equipe e){
		if(!(lEquipe.contains(e))){
            lEquipe.add(e);
        }else{
            System.out.println("L'equipe est déjà présente dans ce pays");
        }

	}

	public void supprimerEquipe(Equipe e){
		if((lEquipe.contains(e))){
            lEquipe.remove(e);
        }else{
            System.out.println("L'equipe n'existe pas pour ce pays");
        }
	}
	
	public void modifierNomPays(String nouveauNomPays) {
        // TODO - implement Epreuve.modifierNomEpreuve
        NomPays = nouveauNomPays;
        throw new UnsupportedOperationException();
    }

	
}