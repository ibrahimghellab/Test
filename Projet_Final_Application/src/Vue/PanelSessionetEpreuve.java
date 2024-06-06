package Vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelSessionetEpreuve extends JPanel{
	
	JButton ajouterEpreuve;
	
	
	PanelSessionetEpreuve(){
		
		
		ajouterEpreuve = new JButton("ajouterEpreuve");
		
		setLayout(new BorderLayout());

		this.add(ajouterEpreuve, BorderLayout.EAST);
		
		
	}
	public static void main(String[] args) {
		JFrame fenetre=new JFrame();
		
		PanelSessionetEpreuve pa=new PanelSessionetEpreuve();
		
        fenetre.setLayout(new GridLayout(2,1));
		fenetre.add(pa,BorderLayout.CENTER);
		fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		fenetre.setVisible(true);
		
	}
	
	

}
