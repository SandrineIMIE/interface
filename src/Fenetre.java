import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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

package Interface;

public class Fenetre extends JFrame {
	/*private JPanel calque =new JPanel();*/

	public Fenetre() {
		this.setTitle("Mon dessin cyan");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.cyan);
		Panneau panneaud = new Panneau ();
		this.setContentPane(panneaud);
		
		/*panneau.setBackground(Color.pink);
		panneau.setSize(500, 500);
		panneau.setBounds(5, 5, 5, 5);*/	
		/*JPanel calque1 =new JPanel();
		JPanel calque2 =new JPanel();*/
		
		/*JButton bouton = new JButton("Mon bouton");
		
		JCheckBox case1 = new JCheckBox ("option 1");
		JCheckBox case2 = new JCheckBox ("option 2");
		
		JRadioButton b_oui= new JRadioButton("oui");
		JRadioButton b_non= new JRadioButton("non");
		ButtonGroup groupeBouton = new ButtonGroup();
		groupeBouton.add(b_oui);
		groupeBouton.add(b_non);
		JTextField champsaisie = new JTextField ("Champs",20);
		
		String couleurs[] = {
		        "Rouge",
		        "Bleu",
		        "Vert",
		        "Jaune",
		        "Orange",
		        "Rose",
		        "Violet"};
		JComboBox listederoulante = new JComboBox(couleurs);

		panneau.add(bouton)
		panneau.add(case1);
		panneau.add(case2);
		panneau.add(b_oui);
		panneau.add(b_non);
		panneau.add(etiquette);
		panneau.add(champsaisie);	
		panneau.add(listederoulante);*/
		
		/** layout Flow**/
		
		/*this.getContentPane().setLayout(new FlowLayout());
		JButton bouton = new JButton("Mon bouton");*/
		
		/** layout Grid**/
		/*this.getContentPane().setLayout(new GridLayout(3,2));
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));*/
		
		/** layout Border**/
		/*this.getContentPane().setLayout(new BorderLayout());
		JButton n = new JButton("North");
		JButton s = new JButton("Sud");
		JButton o = new JButton("Ouest");
		JButton e = new JButton("Est");
		JButton c = new JButton("Centre");
		
		this.getContentPane().add(c,BorderLayout.CENTER);
		 this.getContentPane().add(n,BorderLayout.NORTH);
		 this.getContentPane().add(s,BorderLayout.SOUTH);
		 this.getContentPane().add(o,BorderLayout.WEST);
		 this.getContentPane().add(e,BorderLayout.EAST);
		 e.setPreferredSize(o.getPreferredSize());
		 n.setBackground(Color.yellow);
		 s.setBackground(Color.orange);
		 o.setBackground(Color.blue);
		 c.setBackground(Color.white);
		 e.setBackground(Color.red);*/
		
		/** layout BOX**/
		/*panneau.setBounds(20, 30, 30, 10);
		panneau.setLayout(new BoxLayout(panneau, BoxLayout.PAGE_AXIS));
		this.getContentPane().add(new JButton("1"));
		this.getContentPane().add(new JButton("2"));
		this.getContentPane().add(new JButton("3"));
		this.getContentPane().add(new JButton("4"));
		this.getContentPane().add(new JButton("5"));*/
		
		/*/** layout Mix BOX-GRID**/
		/*panneau.setLayout(new BoxLayout(panneau, BoxLayout.PAGE_AXIS));
		JPanel cas1 =new JPanel();
		cas1.setLayout(new BoxLayout(cas1, BoxLayout.PAGE_AXIS));
		cas1.setBackground(Color.DARK_GRAY);
		cas1.setSize(250, 250);
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		cas1.add(b1);
		cas1.add(b2);
		cas1.add(b3);
		
		JPanel cas2 =new JPanel();
		cas2.setLayout(new GridLayout(2,3));
		cas2.setSize(250, 250);
		cas2.setBackground(Color.LIGHT_GRAY);
		cas2.add(b4);
		cas2.add(b5);
		cas2.add(b6);
		cas2.add(b7);
		cas2.add(b8);
		JPanel cas3 =new JPanel();
		
		cas3.add(cas1);
		cas3.add(cas2);*/
		this.setVisible(true);
		  }	
		}