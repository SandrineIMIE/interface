import java.awt.Font;

import javax.swing.JButton;

public class Bouton extends JButton {

	public Bouton(String label) {
		super (label);
		this.setFont(new Font("Arial", Font.BOLD, 20));
	}

}
