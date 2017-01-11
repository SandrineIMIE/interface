import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class Calculette extends JFrame{
	private JPanel panneau;
	private int width=400;
	private int height=400;
	private JLabel ecran;
	private double chiffre1;
	private boolean cliccalcul=false;
	private boolean miseajour=false;
	private String calcul="";
	private String[] tabchiffres= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".","="};
	private String[] taboperateurs= {"C","+","-","*","/","<="};
	public Calculette() {
		this.setTitle("Calculette");
		this.setSize(width, height);
		this.setPreferredSize(new Dimension(width, height));
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.WHITE);	
		
		/**panneau principal**/
		panneau= new JPanel ();
		panneau.setVisible(true);
		panneau.setBackground(Color.white);
		panneau.setLayout(new BorderLayout());
		panneau.setSize(width, height);
		panneau.setBorder(BorderFactory.createEmptyBorder(10, 10,10, 10));
		
		/**panneau écran et de résulat**/
		JPanel 	resultat= new JPanel ();
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
		JPanel chiffre = new JPanel ();
		chiffre.setVisible(true);
		chiffre.setLayout(new GridLayout(4,3));
		chiffre.setBackground(Color.white);
		chiffre.setBorder(BorderFactory.createEmptyBorder(10, 0,0, 0));
		chiffre.setPreferredSize(new Dimension(3*width/4,height-resultat.getHeight()));		
	    
		/*ajout des boutons*/
	    for(int i = 0; i <tabchiffres.length; i++){
	    	  Boutonb numero=new Boutonb(tabchiffres[i]);       

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
		JPanel calculer= new JPanel ();
		calculer.setVisible(true);
		calculer.setBackground(Color.white);
		calculer.setLayout(new GridLayout(6,1));
		calculer.setBorder(BorderFactory.createEmptyBorder(10, 10,0, 0));
		calculer.setPreferredSize(new Dimension(width/4,height-resultat.getHeight()));
		
		/*ajout des boutons*/
	    for(int i = 0; i <taboperateurs.length; i++){
	    	  Boutonb operateur=new Boutonb(taboperateurs[i]);       
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
	      String saisie = ((Boutonb)e.getSource()).getText();
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
	    	 String saisie = ((Boutonb)e.getSource()).getText();
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
}
