import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel {
	
	private int i = 0;
	
	public void paintComponent(Graphics g) {
		System.out.println("Execution numéro : " + (i++));
		
		int largeur=this.getWidth();
		int hauteur=this.getHeight();

		   /*rond*/
		   g.setColor(Color.yellow);    
		   g.fillOval((largeur/4-largeur/8),(hauteur/2+hauteur/8), hauteur/4, hauteur/4);
		  
		   /*carre*/
		   g.setColor(Color.blue);    
		   g.drawRect((largeur/2+largeur/8), (hauteur/8), hauteur/4, hauteur/4);
		  
		   /*triangle*/
		   int x[] = {hauteur/4, hauteur/8, (hauteur/2-hauteur/8)};
		   int y[] = {largeur/8, (largeur/4+largeur/8), (largeur/4+largeur/8)};
		   g.setColor(Color.green); 
		   g.drawPolygon(x, y,3);
		   
		   /*image*/
		   try {
			      Image img = ImageIO.read(new File("logo-imie.png")); 
			      g.drawImage(img, (hauteur/2 + hauteur/8),(largeur/2 +largeur/8),/*width,height,*/this);
			   } catch (IOException e) {
			      e.printStackTrace();
			    }              

		   
}
	
}