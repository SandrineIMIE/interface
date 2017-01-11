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
	 //Méthode appelée lors du clic de souris
	public void mouseClicked(MouseEvent e) {

	}
	
     //Méthode appelée lors du survol de la souris
	 public void mouseEntered(MouseEvent event) {
		 this.setBackground(Color.red);
	 }

	 //Méthode appelée lorsque la souris sort de la zone du bouton
	 public void mouseExited(MouseEvent event) { 
		 this.setBackground(Color.blue);
	 }

	 //Méthode appelée lorsque l'on presse le bouton 
	 public void mousePressed(MouseEvent event) { 
		 this.setBackground(Color.yellow);
		 this.setText("Pressé !");
	 }

	 //Méthode appelée lorsque l'on relâche le clic de souris
	  public void mouseReleased(MouseEvent event) {
		  this.setText("Relâché !");
		  this.setBackground(Color.yellow);
	  }       

}
