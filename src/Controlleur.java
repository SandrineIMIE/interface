

public class Controlleur {

	private Modele model;	//le modele lie au controlleur
	
	public Controlleur(Modele mod) {
		model = mod;
	}
	
	/**
	 * La vue a signale un clic sur le bouton
	 */
	public void setCouleur() {
		model.setCouleur(); //on avertit le modele du changement
	}

}
