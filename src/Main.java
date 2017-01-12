public class Main {
	
	public Main() {	}

	public static void main(String[] args) {
		//Creation du modele
		Modele modele = new Modele();
		
		//Creation du controlleur
		Controlleur controle = new Controlleur(modele);
		
		//Creation de la vue
		Vue vuecalculette = new Vue(controle);
		
		//ma vue observe mon modele
		modele.addObserver(vuecalculette); 
	}
}
