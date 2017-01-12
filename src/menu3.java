import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;


public class menu3 extends JFrame {
	private int hauteur=500;
	private int largeur=500;	
	private JPopupMenu pop=new JPopupMenu("Menu contextuelle");
	private JMenuItem pop1 = new JMenuItem("item 1");
	private JMenuItem pop2 = new JMenuItem("item 2");
	
	public menu3() {
		this.setTitle("Ma fenêtre avec menu contextuelle");
		this.setSize(hauteur, largeur);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		
		pop.add(pop1);
		pop.add(pop2);
		
		JMenuBar barremenus = new JMenuBar();
		setJMenuBar(barremenus);
		
		JMenu couleur = new JMenu("couleur");
		barremenus.add(couleur);
		
		JMenuItem rouge = new JMenuItem("Rouge");
		rouge.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				getContentPane().setBackground(Color.red);
			}
		});	
		couleur.add(rouge);
		couleur.addSeparator();
		
		JMenuItem vert = new JMenuItem("Vert");
		vert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				getContentPane().setBackground(Color.green);
			}
		});	
		
		couleur.add(vert);
		couleur.addSeparator();
		
		JMenuItem bleu = new JMenuItem("Bleu");
		couleur.add(bleu);
		bleu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				getContentPane().setBackground(Color.blue);
			}
		});		
		
		this.addMouseListener (new MouseListener() {	
			 public void mouseClicked(MouseEvent e) {}
			 public void mouseEntered(MouseEvent e) {	}
			 public void mouseExited(MouseEvent e) { }
			 public void mousePressed(MouseEvent e) { }
			 public void mouseReleased(MouseEvent e) {	
				  if(e.getButton()==MouseEvent.BUTTON3){
						pop.show(getContentPane(),e.getX(),e.getY());
			  }       
			  }
		}	
	  );
	}

}