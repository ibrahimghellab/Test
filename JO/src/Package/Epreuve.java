package Package;

import java.util.*;

public class Epreuve {

    ArrayList<Session> sesSessions;
    Sport sport;
    private String nomEpreuve;

    /**
     * 
     * 
     * @param nomEpreuve
     */
    public Epreuve( String nomEpreuve) {
        this.nomEpreuve=nomEpreuve;
        // TODO - implement Epreuve.Epreuve
        throw new UnsupportedOperationException();
    }

   
    public void ajouterSession(Session s){
        if(!(sesSessions.contains(s))){
            sesSessions.add(s);
        }else{
            // a immplémenter dans le controller
            System.out.println("La session que vous souhaitez ajouter est dejà présente");
        }
    } 


    public void supprimerSession(Session s){
        if(sesSessions.contains(s)){
            sesSessions.remove(s);
        }else{
            // a immplémenter dans le controller
            System.out.println("La session que vous souhaitez supprimer n'existe pas");
        }
    }

    /**
     * 
     * @param siteEpreuve
     */
    public void ajouterSiteEpreuve(SiteEpreuve siteEpreuve) {
        // TODO - implement Epreuve.ajouterSiteEpreuve
        if(!(lesSitesEpreuves.contains(siteEpreuve))){
            lesSitesEpreuves.add (siteEpreuve);
        }else{
            System.out.println("Le site épreuve est déjà présent pour cette épreuve");
        }
        throw new UnsupportedOperationException();
    }
    
    /**
     * 
     * @param siteEpreuve
     */
    public void supprimerSiteEpreuve(SiteEpreuve siteEpreuve) {
        // TODO - implement Epreuve.ajouterSiteEpreuve
        if(lesSitesEpreuves.contains(siteEpreuve)){
            lesSitesEpreuves.remove(siteEpreuve);
        }else{
            System.out.println("Le site épreuve n'existe pas");
        }
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param nouveauNomEpreuve
     */
    public void modifierNomEpreuve(String nouveauNomEpreuve) {
        // TODO - implement Epreuve.modifierNomEpreuve
        nomEpreuve=nouveauNomEpreuve;
        throw new UnsupportedOperationException();
    }

}
