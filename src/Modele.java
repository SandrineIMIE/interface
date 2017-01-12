
import java.awt.Color;
import java.util.Observable;

public class Modele extends Observable {

	//Donnees de mon modele
	private Color couleur;
	private String texte;

	public Modele() {
		couleur = Color.BLUE;
		texte = "Passer en rouge !";
	}

	public Color getCouleur() {
		return couleur;
	}
	
	public String getTexte() {
		return texte;
	}

	public void setCouleur() {
		
		if(couleur == Color.BLUE) {
			couleur = Color.RED;
			texte = "Passer en bleu !";
		}
		else {
			couleur = Color.BLUE;
			texte = "Passer en rouge !";
		}
		
		setChanged();				//signale qu'il y a eu des changements
		notifyObservers(this); 		//previent les observateurs du changement
	}
}
