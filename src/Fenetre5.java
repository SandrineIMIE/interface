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

public class Fenetre5 extends JFrame implements ActionListener {
	/*private JPanel calque =new JPanel();*/
	private Boutonb bouton1;
	/*private Bouton bouton2;*/
	private JPanel panneau = new JPanel ();
	
	public Fenetre5() {
		super("test clics sur deux boutons");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		addMouseListener((MouseListener) this);
		JPanel panneau = new JPanel ();
		this.setContentPane(panneau);
		bouton1=new Boutonb("mon bouton 1");
		bouton1.addActionListener(this);
		panneau.add(bouton1);
		/*bouton2=new Bouton("mon bouton 2");
		bouton2.addActionListener(this);
		panneau.add(bouton2);*/
			setVisible(true);
		this.setVisible(true);
		panneau.setVisible(true);
		  }	
	
	public void actionPerformed(ActionEvent e){
			bouton1.setText("activé");
			System.out.println("activé!");
	}
	/*public void actionPerformed(ActionEvent e){
		if(e.getSource()=="bouton1")
			System.out.println("clic sur le bouton 1 !");
		else if(e.getSource()=="bouton2")
			System.out.println("clic sur le bouton 2 !");
	}*/

}