package Package;

import java.util.*;

public class Epreuve {

    ArrayList<Session> sesSessions;
    ArrayList<SiteEpreuve> lesSitesEpreuves;
    private String nomEpreuve;

    /**
     * 
     * @param numSession
     * @param nomEpreuve
     */
    public Epreuve(int numSession, String nomEpreuve) {
        // TODO - implement Epreuve.Epreuve
        throw new UnsupportedOperationException();
    }

    /*public void supprimerEpreuve() {
        // TODO - implement Epreuve.supprimerEpreuve
        throw new UnsupportedOperationException();
    }*/

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
        throw new UnsupportedOperationException();
    }
    
    /**
     * 
     * @param siteEpreuve
     */
    public void supprimerSiteEpreuve(SiteEpreuve siteEpreuve) {
        // TODO - implement Epreuve.ajouterSiteEpreuve
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param nouveauNomEpreuve
     */
    public void modifierNomEpreuve(int nouveauNomEpreuve) {
        // TODO - implement Epreuve.modifierNomEpreuve
        throw new UnsupportedOperationException();
    }

}
