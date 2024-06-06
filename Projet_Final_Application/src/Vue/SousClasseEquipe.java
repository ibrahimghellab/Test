package Vue;

import java.awt.GridLayout;

import javax.swing.*;

public class SousClasseEquipe extends JPanel{
	String nompays;
	JLabel nomPays;
	JButton modifier;
	JButton supprimer;

	SousClasseEquipe (String nomPays2){

		nomPays = new JLabel(nomPays2);
		modifier = new JButton("Modifier");
		supprimer = new JButton("Supprimer");

		this.setLayout(new GridLayout(1,3));

		this.add(nomPays);
		this.add(modifier);
		this.add(supprimer);

		
		



	}

	
		public static void main(String[] args) {
			JFrame fenetre = new JFrame("Panel Equipe");

	        SousClasseEquipe sa = new SousClasseEquipe("France");
	        fenetre.add(sa);
	        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits on close
	        fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);

	        fenetre.setVisible(true);
			
		}
			
		
	


}
