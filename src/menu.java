import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class menu extends JFrame /*implements ActionListener*/{
	private int hauteur=500;
	private int largeur=500;
	public menu() {
		this.setTitle("Ma fenêtre avec menu");
		this.setSize(hauteur, largeur);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		
		JMenuBar barremenus = new JMenuBar();
		setJMenuBar(barremenus);
		
		JMenu couleur = new JMenu("couleur");
		barremenus.add(couleur);
		JMenu taille = new JMenu("taille");
		barremenus.add(taille);
		
		JMenuItem taille300 = new JMenuItem("300*300");
		taille300.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				getContentPane().setSize(new Dimension(300,300));
			}
		});	
		taille.add(taille300);
		taille.addSeparator();
		
		JMenuItem taille400 = new JMenuItem("400*400");
		taille400.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{	
				getContentPane().setSize(new Dimension(400,400));
			}

		});	
		taille.add(taille400);
		taille.addSeparator();
		
		JMenuItem taille500 = new JMenuItem("500*500");
		taille500.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{	
				getContentPane().setSize(new Dimension(500,500));
			}
		});	
		taille.add(taille500);
		
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
	

	}

}
