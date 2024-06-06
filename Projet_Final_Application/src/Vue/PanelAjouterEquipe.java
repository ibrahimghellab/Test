package Vue;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelAjouterEquipe extends JPanel {
	
	JPanel p;
	JPanel p2;
	JButton valider;
	JLabel nomEquipe;
	JLabel genreEquipe;
	JTextField textnomEquipe;
	JTextField nomAthletes;
	
	PanelAjouterEquipe(){
		
		
		valider = new JButton("Valider");
		nomEquipe = new JLabel("Entrer le nom de l'equipe");
		textnomEquipe = new JTextField();
		genreEquipe = new JLabel("Entrer le genre de l'équipe (H/F/Mixte)");
		nomAthletes = new JTextField();
		p = new JPanel();
		p2 = new JPanel();
		setLayout(new BorderLayout());
		
		
        p.setLayout(new GridLayout(2,1));
        p2.setLayout(new GridLayout(1,1));
		p.add(nomEquipe);
		p.add(textnomEquipe);
		p.add(genreEquipe);
		p.add(nomAthletes);
		p2.add(valider);
		add(p, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fenetre = new JFrame("Modifier_Equipe");
		JPanel p = new PanelAjouterEquipe();
		fenetre.setSize(500,500);
		fenetre.add(p);
		fenetre.setVisible(true);
		

	}

}
