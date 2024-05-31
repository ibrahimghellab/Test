package Package;

import java.util.*;

public class Sportif {

	Equipe sonEquipe;
	ArrayList<Resultat> sonResultat;
	Sport sonsport;
	Pays sonPays;
	Categorie saCategorie;
	private String nomSportif;
	private String prenomSportif;
	private int age;

	/**
	 * @param prenomSportif
	 * @param nomSportif
	 * @param age
	 */
	public Sportif(String nomSportif,String prenomSportif, int age) {
		this.nomSportif = nomSportif;
		this.prenomSportif = prenomSportif;
		this.age = age;
		throw new UnsupportedOperationException();
	}

	public void ajouterResultat(Resultat resultat){
		 if(!(sonResultat.contains(resultat))){
            sonResultat.add(resultat);
        }else{
            
            System.out.println("Le résultat que vous souhaitez ajouter est dejà présent");
        }

	}

	public void supprimerResultat(Resultat resultat){
		if(sonResultat.contains(resultat))
		{
			sonResultat.remove(resultat);
		}
		else
		{
			System.out.println("Le resultat que vous voulez supprimer n'existe pas");
		}
	}
	

