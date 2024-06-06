package Vue;

import java.awt.GridLayout;

import javax.swing.*;

public class SousClassePanelSessionetEpreuve extends JPanel{
	String nomepreuve;
	JLabel nomEpreuve;
	JButton modifier;
	JButton supprimer;

	SousClassePanelSessionetEpreuve(String nomEpreuve2){

		nomEpreuve = new JLabel(nomEpreuve2);
		modifier = new JButton("Modifier");
		supprimer = new JButton("Supprimer");

		this.setLayout(new GridLayout(1,3));

		this.add(nomEpreuve);
		this.add(modifier);
		this.add(supprimer);

		
		



	}

	
		public static void main(String[] args) {
			JFrame fenetre = new JFrame("Panel Equipe");

	        SousClasseEquipe sa = new SousClasseEquipe("Foot");
	        fenetre.add(sa);
	        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits on close
	        fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);

	        fenetre.setVisible(true);
			
		}
			
		
	


}
