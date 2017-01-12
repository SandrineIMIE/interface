import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class menu2 extends JFrame {
	private int hauteur=500;
	private int largeur=500;
	public menu2() {
		this.setTitle("Ma fenêtre avec menu");
		this.setSize(hauteur, largeur);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		
		JLabel texte= new JLabel(" La forme Rond a été choisi par défaut");
		getContentPane().add(texte);
		
		JMenuBar barremenus = new JMenuBar();
		setJMenuBar(barremenus);
		
		JMenu couleur = new JMenu("couleur");
		barremenus.add(couleur);
		
		JMenuItem rouge = new JMenuItem("Rouge");
		rouge.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				getContentPane().setBackground(Color.red);
				texte.setForeground(Color.white);
			}
		});	
		couleur.add(rouge);
		couleur.addSeparator();
		
		JMenuItem vert = new JMenuItem("Vert");
		vert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				getContentPane().setBackground(Color.green);
				texte.setForeground(Color.white);
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
				texte.setForeground(Color.white);
			}
		});	
		//**//		
		
		JMenu forme = new JMenu("forme");
		barremenus.add(forme);
		
		JRadioButtonMenuItem rond = new JRadioButtonMenuItem("Rond");	
		JRadioButtonMenuItem carre = new JRadioButtonMenuItem("Carre");	
		ButtonGroup GroupeForm = new ButtonGroup();
		GroupeForm.add(rond);
		GroupeForm.add(carre);
		rond.setSelected(true);
		forme.add(rond);
		forme.add(carre);
		validate();/*pour actualiser l'action de choix*/
			
		rond.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				if (rond.isSelected())
						texte.setText("l'option Rond a été choisi");
			}
		});
			carre.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				if (carre.isSelected())
					texte.setText("l'option Carré a été choisi");
			}
		});
	}
}