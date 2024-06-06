
package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.*;

public class PanelUserMenu extends JPanel{

	//Déclaration des composants
	JButton accueil;
	JButton planning;
	JButton resultat;
	JButton classement;
	JButton parametre;
	ImageIcon imgA;
	JLabel Labelimg;
	
	
	public PanelUserMenu() {
		// TODO Auto-generated constructor stub
		
		
		accueil=new JButton("ACCUEIL");
		planning=new JButton("PLANNING");
		resultat = new JButton("RESULTAT");
		classement=new JButton("CLASSEMENT");
		parametre = new JButton("PARAMETRE");
		accueil.setBackground(new Color(255,215,0));
		planning.setBackground(new Color(255,215,0));
		resultat.setBackground(new Color(255,215,0));
		classement.setBackground(new Color(255,215,0));
		parametre.setBackground(new Color(255,215,0));
		add(accueil);
		add(planning);
		add(resultat);
		add(classement);
		add(parametre);
		imgA=new ImageIcon("imageAccueil.jpg");
		Labelimg=new JLabel(imgA);
		Labelimg.setIcon(imgA);
		add(Labelimg);
		
		
		setLayout(new GridLayout(6,1));
		
		
	
	}
	public static void main(String[] args) {
		JFrame fenetre=new JFrame();
		
		PanelUserAccueil pa=new PanelUserAccueil();
		
		fenetre.setLayout(new BorderLayout());
		PanelUserMenu p=new PanelUserMenu();
		fenetre.add(p,BorderLayout.WEST);
		fenetre.add(pa,BorderLayout.CENTER);
		fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		fenetre.setVisible(true);
		
	}
	
}
