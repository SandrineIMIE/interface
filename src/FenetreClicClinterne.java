import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

public class FenetreClicClinterne extends JFrame {

	private JPanel panneau = new JPanel ();
	
	public FenetreClicClinterne() {
		super("test clics sur fenetre ecouteur interne");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		addMouseListener(new EcouteurSouris());

		setContentPane(panneau);
		setVisible(true);
		  }	
	class EcouteurSouris implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			System.out.println("clic dans la fenetre !");
		}
		
	     //Méthode appelée lors du survol de la souris
		 public void mouseEntered(MouseEvent event) {			
		 }

		 //Méthode appelée lorsque la souris sort de la zone du bouton
		 public void mouseExited(MouseEvent event) { 		
		 }

		 //Méthode appelée lorsque l'on presse le bouton 
		 public void mousePressed(MouseEvent event) { 	
		 }

		 //Méthode appelée lorsque l'on relâche le clic de souris
		  public void mouseReleased(MouseEvent event) {			
		  }       
	}

}