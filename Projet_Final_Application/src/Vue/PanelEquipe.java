package Vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelEquipe extends JPanel {

	JButton ajouterEquipe;
	JPanel equipe;
	


	PanelEquipe(){
		
		
		ajouterEquipe = new JButton("ajouterEquipe");
		equipe = new JPanel();
		
		setLayout(new BorderLayout());

		equipe.add(ajouterEquipe);
		add(equipe, BorderLayout.EAST);
		
	}
	public static void main(String[] args) {
		JFrame fenetre = new JFrame("Panel Equipe");
        SousClasseEquipe sa = new SousClasseEquipe("France");
        SousClasseEquipe sb = new SousClasseEquipe("Algerie");
        SousClasseEquipe sc = new SousClasseEquipe("Côte d'Ivoire");
        SousClasseEquipe sd = new SousClasseEquipe("Turquie");
        SousClasseEquipe se = new SousClasseEquipe("Srilanka");
        SousClasseEquipe sf = new SousClasseEquipe("Tunisie");

        fenetre.setLayout(new GridLayout(7,3));

        PanelEquipe pa = new PanelEquipe();
        fenetre.add(pa);
        fenetre.add(sa);
        fenetre.add(sb);
        fenetre.add(sc);
        fenetre.add(sd);
        fenetre.add(se);
        fenetre.add(sf);


        
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits on close
        fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);

        fenetre.setVisible(true);
		
	}
		
}
