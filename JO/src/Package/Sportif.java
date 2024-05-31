package Package;

import java.util.*;

public class Sportif {

	Equipe sonEquipe;
	ArrayList<Resultat> sonResulat;
	Sport sonsport;
	Pays sonPays;
	Categorie saCategorie;
	private char nomSportif;
	private char prenomSportif;
	private int age;

	/**
	 * 
	 * @param nomSportif
	 * @param age
	 */
	public Sportif(String nomSportif, int age) {
		this.nomSportif = nomSportif;
		this.age = age;
		throw new UnsupportedOperationException();
	}

	public void ajouterResultat(Resultat resultat){
		 if(!(sonResultats.contains(resultat))){
            sonResultats.add(resultat);
        }else{
            
            System.out.println("Le résultat que vous souhaitez ajouter est dejà présent");
        }

	}

	public void supprimerResultat(Resultat resultat){
		if(sonResulat.contains(resultat))
		{
			sonResulat.remove(resultat);
		}
		else
		{
			System.out.println("Le resultat que vous voulez supprimer n'existe pas");
		}
	}
	

}