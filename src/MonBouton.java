import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class MonBouton extends JButton implements MouseListener {

	public MonBouton( String label)  {
		super (label);
		addMouseListener(this);
		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(200,100));
	}
	 //M�thode appel�e lors du clic de souris
	public void mouseClicked(MouseEvent e) {

	}
	
     //M�thode appel�e lors du survol de la souris
	 public void mouseEntered(MouseEvent event) {
		 this.setBackground(Color.red);
	 }

	 //M�thode appel�e lorsque la souris sort de la zone du bouton
	 public void mouseExited(MouseEvent event) { 
		 this.setBackground(Color.blue);
	 }

	 //M�thode appel�e lorsque l'on presse le bouton 
	 public void mousePressed(MouseEvent event) { 
		 this.setBackground(Color.yellow);
		 this.setText("Press� !");
	 }

	 //M�thode appel�e lorsque l'on rel�che le clic de souris
	  public void mouseReleased(MouseEvent event) {
		  this.setText("Rel�ch� !");
		  this.setBackground(Color.yellow);
	  }       

}
