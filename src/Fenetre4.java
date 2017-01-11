	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
	import java.awt.GridBagLayout;
	import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class Fenetre4 extends JFrame{

	  public Fenetre4(){
		 this.setTitle("Ma fenêtre");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.cyan);
		this.getContentPane().setLayout( new FlowLayout());
		JPanel panneau =new JPanel();
		this.setContentPane(panneau);
		
		JPanel menu=new JPanel();
		menu.setLayout(new BoxLayout(menu, BoxLayout.PAGE_AXIS));
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		menu.add(b1);
		menu.add(b2);
		menu.add(b3);
		JPanel grid=new JPanel();
		grid.setLayout(new GridLayout(2,3));
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		grid.add(b4);
		grid.add(b5);
		grid.add(b6);
		grid.add(b7);
		grid.add(b8);
		panneau.getContentPane().add(menu);
		panneau.getContentPane().add(grid);
		panneau.setVisible(true);	
	    this.setVisible(false);		
	  }
	}
