import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent; 

public class Calculette extends JFrame{
	private JPanel panneau;
	private JPanel chiffre;
	private JPanel calculer;
	private JPanel resultat;
	private int width=300;
	private int height=300;
	private JLabel ecran;
	private double chiffre1;
	private boolean cliccalcul=false;
	private boolean miseajour=false;
	private String calcul="";
	private Color fondcouleur=Color.white;
	private Color fondpanneau=fondcouleur;
	private Color fondchiffre=fondcouleur;
	private Color fondcalculer=fondcouleur;
	private String[] tabchiffres= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".","="};
	private String[] taboperateurs= {"C","+","-","*","/","<="};
	
	public Calculette() {
		this.setTitle("Calculette");
		this.setSize(width, height);
		this.setPreferredSize(new Dimension(width, height));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(fondcouleur);
		
		/**panneau principal**/
		panneau= new JPanel ();
		panneau.setVisible(true);
		panneau.setBackground(fondpanneau);
		panneau.setLayout(new BorderLayout());
		panneau.setSize(width, height);
		panneau.setBorder(BorderFactory.createEmptyBorder(10, 10,10, 10));
		/*boite de message de bienvenue*/
		JOptionPane.showMessageDialog(this,"Welcome dans ma calculatrice");
		
		/**panneau écran et de résulat**/
		resultat= new JPanel ();
		resultat.setVisible(true);
		resultat.setBackground(Color.DARK_GRAY);
		resultat.setLayout(new BorderLayout());
		ecran = new JLabel (" ");
		ecran.setHorizontalAlignment(SwingConstants.TRAILING);
		ecran.setBorder(BorderFactory.createEmptyBorder(10, 10,10, 10));
		ecran.setForeground(Color.WHITE);
		ecran.setFont(new Font("Arial", Font.ITALIC, 20));
		resultat.setPreferredSize(new Dimension(width,height/6));
		resultat.add(ecran);
		
		/**panneau chiffres**/
		chiffre = new JPanel ();
		chiffre.setVisible(true);
		chiffre.setLayout(new GridLayout(4,3));
		chiffre.setBackground(fondchiffre);
		chiffre.setBorder(BorderFactory.createEmptyBorder(10, 0,0, 0));
		chiffre.setPreferredSize(new Dimension(3*width/4,height-resultat.getHeight()));		
	    
		/*ajout des boutons*/
	    for(int i = 0; i <tabchiffres.length; i++){
	    	  Bouton numero=new Bouton(tabchiffres[i]);       

	       		chiffre.add(numero);	
	    	  switch (i){
	    	  case 10:
	    		    numero.addActionListener(new VirguleListener());
	    	  		break;
	    	  case 11:
	    		    numero.addActionListener(new EgalListener());
	    	  		break;
	    	  default :
	    	  		numero.addActionListener(new ChiffreListener());
	    	  	break;
	    	  }
	       }
		/**panneau calcul**/
		calculer= new JPanel ();
		calculer.setVisible(true);
		calculer.setBackground(fondcalculer);
		calculer.setLayout(new GridLayout(6,1));
		calculer.setBorder(BorderFactory.createEmptyBorder(10, 10,0, 0));
		calculer.setPreferredSize(new Dimension(width/4,height-resultat.getHeight()));
		
		/*ajout des boutons*/
	    for(int i = 0; i <taboperateurs.length; i++){
	    	  Bouton operateur=new Bouton(taboperateurs[i]);       
	       		calculer.add(operateur);	
	         switch (i){
	    	  	case 0:	      
	    	  		operateur.addActionListener(new ResetListener());
	    	  		operateur.setForeground(Color.red);
	    	  		break;
	    	  	case 1:
	    		    operateur.addActionListener(new PlusListener());
	    	  		break;
	    	  	case 2:
	    	  		operateur.addActionListener(new MoinsListener());
	    	  		break;
	    	  	case 3:
	    		    operateur.addActionListener(new MultiListener());
	    	  		break;
	    	  	case 4:
	    		    operateur.addActionListener(new DivListener());
	    	  		break;	
	    	  	case 5:
	    			operateur.addActionListener(new CorListener());
	    	  		break;		
	    	  }
	       }
	
		
		/**ajout des panneaux secondaires dans le principales**/
		panneau.add(resultat,BorderLayout.NORTH);
		panneau.add(chiffre,BorderLayout.CENTER);
		panneau.add(calculer,BorderLayout.EAST);

		this.setContentPane(panneau);
		this.setVisible(true);

	/**menus**/
	JMenuBar barremenus = new JMenuBar();
	setJMenuBar(barremenus);
	
	JMenu fichier = new JMenu("Fichier");
	barremenus.add(fichier);
	
	JMenu taille = new JMenu("Dimensions");
	barremenus.add(taille);	
	
	JMenu couleur = new JMenu("Couleur");
	barremenus.add(couleur);
	
	JMenuItem quit = new JMenuItem("Quitter");
	quit.addActionListener(new QuitListener());	
	fichier.add(quit);
	
	JMenuItem taille400 = new JMenuItem("400*400");
	taille400.setToolTipText("Redimensionne en 500*500");
	taille400.addActionListener(new DimListener());	
	taille.add(taille400);
	taille.addSeparator();
	
	JMenuItem taille500 = new JMenuItem("500*500");
	taille500.addActionListener(new DimListener());	
	taille500.setToolTipText("Redimensionne en 500*500");
	taille.add(taille500);
	taille.addSeparator();
	
	JMenuItem taille600 = new JMenuItem("600*600");
	taille600.addActionListener(new DimListener());	
	taille600.setToolTipText("Redimensionne en 600*600");
	taille.add(taille600);
	
	JMenuItem pink = new JMenuItem("rose");
	pink.addActionListener(new FondListener());	
	pink.setToolTipText("Change le fond en rose");
	couleur.add(pink);
	couleur.addSeparator();
	JMenuItem gris = new JMenuItem("gris");
	gris.addActionListener(new FondListener());	
	pink.setToolTipText("Change le fond en gris");
	couleur.add(gris);
	couleur.addSeparator();
	JMenuItem blanc = new JMenuItem("blanc");
	blanc.addActionListener(new FondListener());
	blanc.setToolTipText("Change le fond en blanc");
	couleur.add(blanc);
	validate();
	}
	/** méthodes changements **/

	  public void Couleurchiffre (Color fond) { 
		  fondchiffre=fond;
		  chiffre.setBackground(fondchiffre);
	  }
	  
	  public void RedimensionnerF (int a, int b) {
			this.setSize(a, b);
			this.setPreferredSize(new Dimension(a, b));
			JOptionPane.showMessageDialog(this,"Vous avez redimensionné la fenêtre","Redimensions", JOptionPane.WARNING_MESSAGE);     
	  }
	  
	  public void CouleurF (Color fond) {
		  fondcouleur=fond;
		  fondcalculer=fond;
		  fondchiffre=fond;
		  calculer.setBackground(fond);
		  chiffre.setBackground(fond);
		  panneau.setBackground(fond);
		  
		  validate();
	  }
	  
	  public void Fondoperateur (Color fond) {
		  fondcalculer=fond;
		  calculer.setBackground(fondcalculer);
	  }
	  public void Quitter (){
			  this.dispose();
			  }
	
	/**Méthode permettant d'effectuer un calcul selon l'opération choisie**/
	  private void Operation(){
	    if(calcul.equals("+")){
	      chiffre1 = chiffre1 + 
	            Double.valueOf(ecran.getText()).doubleValue();
	      ecran.setText(String.valueOf(chiffre1));
	    }
	    if(calcul.equals("-")){
	      chiffre1 = chiffre1 - 
	            Double.valueOf(ecran.getText()).doubleValue();
	      ecran.setText(String.valueOf(chiffre1));
	    }          
	    if(calcul.equals("*")){
	      chiffre1 = chiffre1 * 
	            Double.valueOf(ecran.getText()).doubleValue();
	      ecran.setText(String.valueOf(chiffre1));
	    }     
	    if(calcul.equals("/")){
	      try{
	        chiffre1 = chiffre1 / 
	              Double.valueOf(ecran.getText()).doubleValue();
	        ecran.setText(String.valueOf(chiffre1));
	      } catch(ArithmeticException e) {
	        ecran.setText("0");
	      }
	    }
	  }

	  /**Listener de l'interface**/
	  //Listener utilisé pour les chiffres
	  class ChiffreListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	      //On affiche le chiffre additionnel dans le label
	      String saisie = ((Bouton)e.getSource()).getText();
	      if(miseajour){
	    	  miseajour = false;
	      }
	      else{
	        if(!ecran.getText().equals("0"))
	          saisie = ecran.getText() +saisie;
	      }
	      ecran.setText(saisie);
	    }
	  }
	  
	  //Listener affecté au bouton ,
	  class VirguleListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	    	 String saisie = ((Bouton)e.getSource()).getText();
		      if(miseajour){
		    	  miseajour = false;
		      }
		      else{
		        if(!ecran.getText().equals("0"))
		          saisie = ecran.getText() +saisie;
		      }
		      ecran.setText(saisie);
		    }
	  }
	    
	  //Listener affecté au bouton =
	  class EgalListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	      Operation();
	      miseajour = true;
	      cliccalcul = false;
	    }
	  }
	  
	  
	  //Listener affecté au bouton de remise à zéro C
	  class ResetListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	      cliccalcul=false;
	      miseajour=true;
	      chiffre1 = 0;
	      calcul = "";
	      String label="";
	      ecran.setText(label);
	    }
	  }  
	  

	 //Listener affecté au bouton +
	  class PlusListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	      if(cliccalcul){
	    	  Operation();
	    	  ecran.setText(String.valueOf(chiffre1));
	      }
	      else{
	    	  chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
		  	  cliccalcul = true;
	      }
		  calcul = "+";
		  miseajour = true;
	    }
	  }

	  
	  //Listener affecté au bouton -
	  class MoinsListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	      if(cliccalcul){
		      Operation();
		      ecran.setText(String.valueOf(chiffre1));
	      }
	      else{
	    	  chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
	    	  cliccalcul = true;
	      }
	      calcul = "-";
	      miseajour = true;
	    }
	  }

	  //Listener affecté au bouton *
	  class MultiListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	      if(cliccalcul){
	    	  Operation();
	    	  ecran.setText(String.valueOf(chiffre1));
	      }
	      else{
	    	  chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
	    	  cliccalcul = true;
	      }
	      calcul = "*";
	      miseajour = true;
	    }
	  }

	  //Listener affecté au bouton /
	  class DivListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	      if(cliccalcul){
	       Operation();
	        	ecran.setText(String.valueOf(chiffre1));
	      }
	      else{
	    	  chiffre1 = Double.valueOf(ecran.getText()).doubleValue();
	    	  cliccalcul = true;
	      }
	      calcul = "/";
	      miseajour = true;
	    }
	  }
	  
	//Listener affecté au bouton <=
	  class CorListener implements ActionListener {
	    public void actionPerformed(ActionEvent e){
	      Operation();
	      miseajour = false;
	      String avantc=ecran.getText();
	      if(avantc.length()>0){
	    	  String apresc = avantc.substring(0, avantc.length()-1) ; 
	    	  ecran.setText(apresc);
	      }  
	      }
	    }
		//Listener affecté Fond fenetre <=
	  class FondListener implements ActionListener {
		    public void actionPerformed(ActionEvent e){
		    	String couleur=((JMenuItem)e.getSource()).getText();
		    	System.out.println(couleur);
		    	if(couleur=="gris"){
		    		Color fond=Color.LIGHT_GRAY;
		    		CouleurF(fond);
		    		}
		    	else if(couleur=="rose"){
		    		Color fond=Color.PINK;
		    		CouleurF(fond); 
		    		}
		    	else{
		    		Color fond=Color.white;
		    		CouleurF(fond);
		    		}
		    	validate();
		    	 }
	  }
		//Listener affecté dimension fenetre 
	  class DimListener implements ActionListener {
		    public void actionPerformed(ActionEvent e){
		    	String dim=((JMenuItem)e.getSource()).getText();
		    	if (dim=="400*400"){
		    		RedimensionnerF (400,400); validate();}
		    	else if  (dim=="500*500"){
		    		RedimensionnerF (500,500); validate();}
		       	else if  (dim=="600*600"){
		    		RedimensionnerF (600,600); validate();}
		    }
	  }
	//Listener affecté dimension fenetre 
	  class QuitListener implements ActionListener {
		    public void actionPerformed(ActionEvent e){
		   Quitter ();
		    }
	  }
	  
}



