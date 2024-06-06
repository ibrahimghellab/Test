package Vue;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelUserAccueil extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon imgA;
	JLabel Labelimg;
	
	PanelUserAccueil() {
		imgA=new ImageIcon("imageAccueil.jpg");
		Labelimg=new JLabel(imgA);
		Labelimg.setIcon(imgA);
		add(Labelimg);
	}
	
	
}
