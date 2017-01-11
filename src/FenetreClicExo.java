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

public class FenetreClicExo extends JFrame implements ActionListener {
	private Boutonb bouton1;

	private JPanel panneau = new JPanel ();
	private int count=0;
	public FenetreClicExo() {
		super("test clics sur deux boutons");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		bouton1=new Boutonb("Désactivé");
		bouton1.addActionListener(this);
		panneau.add(bouton1);
		
		setContentPane(panneau);
		setVisible(true);
		  }	
	/*public void actionPerformed(ActionEvent e){
	
			System.out.println("clic sur le bouton 1 !");
	}*/
	public void actionPerformed(ActionEvent e){	
		if (bouton1.getText()=="Désactivé"){
			bouton1.setText("Activé");
		}
		else if (bouton1.getText()=="Activé"){
			bouton1.setText("Désactivé");
		}
			
	}

}