
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vue extends JFrame implements Observer {

	private JPanel _panneau = new JPanel();
	private JButton _bouton;
	private JLabel _texte;
	private Controlleur _controller; 	//le controlleur que je previens au moindre changement
	
	public Vue(Controlleur controller) {
		super("Modèle MVC");
		this._controller = controller;
		setSize(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		_panneau.setLayout(new BorderLayout());
		setContentPane(_panneau);
		init();
		setVisible(true);
	}
	
	/**
	 * Init des composants
	 */
	public void init()
	{
		JPanel pan = new JPanel();
		_bouton = new JButton("Passez en rouge !");
		_bouton.addActionListener(boutonListener);
		_texte = new JLabel("Je suis en bleu !");
		_texte.setForeground(Color.BLUE);
		
		_panneau.add(_bouton, BorderLayout.NORTH);
		pan.add(_texte);
		_panneau.add(pan, BorderLayout.CENTER);
	}
	
	//Listener de mon bouton
	ActionListener boutonListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			_controller.setCouleur();
		}
	};

	@Override
	public void update(Observable o, Object arg) {
		//appele quand le modele me signale un changement
		if(o instanceof Modele) {
			Modele m = (Modele)arg;
			_texte.setForeground(m.getCouleur());
			_bouton.setText(m.getTexte());
		}
	}

}
