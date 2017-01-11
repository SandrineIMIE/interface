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

public class FenetreClic2 extends JFrame  {
	private Boutonb bouton1;
	private Boutonb bouton2;
	private JPanel panneau = new JPanel ();
	
	public FenetreClic2() {
		super("test clics sur deux boutons ecouteur interne");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		bouton1=new Boutonb("mon bouton 1");
		bouton2=new Boutonb("mon bouton 2");
		
		/*bouton1.addActionListener(new EcouteBouton1());
		bouton2.addActionListener(new EcouteBouton2());*/
		bouton1.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
				System.out.println("clic sur le bouton 1 !");
			}
		});
		bouton2.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
				System.out.println("clic sur le bouton 2 !");
			}
		});
		addMouseListener (new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("toto !");
				}
			 public void mouseEntered(MouseEvent event) {	}
			 public void mouseExited(MouseEvent event) { }
			 public void mousePressed(MouseEvent event) { }
			  public void mouseReleased(MouseEvent event) {	}       
		});
		
		panneau.add(bouton1);
		panneau.add(bouton2);
		
		setContentPane(panneau);
		setVisible(true);
		  }	
	
	/*public void actionPerformed(ActionEvent e){
	
			System.out.println("clic sur le bouton 1 !");
	}*/
	
	
	/*class EcouteBouton1 implements ActionListener {
		public void actionPerformed(ActionEvent e){
			System.out.println("clic sur le bouton 1 !");
	}
	}
	class EcouteBouton2 implements ActionListener {
		public void actionPerformed(ActionEvent e){
			System.out.println("clic sur le bouton 2 !");
	}
	}
*/

}