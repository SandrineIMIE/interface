import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Dessin extends JFrame {

	public Dessin() {
		this.setTitle("Mes dessins");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.white);	
		Panneau panneau= new Panneau ();
		panneau.setVisible(true);
		this.setContentPane(panneau);
		this.setVisible(true);
			
		  }	
		}