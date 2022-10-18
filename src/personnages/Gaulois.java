package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force,nb_trophees; 
	private Equipement trophees[] = new Equipement[100]; 
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion+=forcePotion;
		if(forcePotion == 3) {
			System.out.println("<< Merci Druide, je sens que ma force est"+forcePotion +"fois d�cupl�e.>> ");
		}
	}
	
	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public int getEffetPotion() {
		return effetPotion;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<"+ texte +">>");
	
	}

	private String prendreParole() {
		return "Le gaulois " + nom + ": ";
	}

	 public void frapper(Gaulois gaulois) { 
	 	 System.out.println(nom + " envoie un grand coup dans la machoire de " + gaulois.getNom()); 
	 }

	 public void frapper(Romain romain) { 
		 System.out.println(nom  +  "  envoie  un  grand  coup  dans  la m�choire de " + romain.getNom()); 
		 Equipement  trophees[]  =  romain.recevoirCoup((force  /  3)  * effetPotion); 
		 for  (int  i  =  0;  trophees  !=  null  &&  i  <  trophees.length;  i++, nb_trophees++) { 
			 this.trophees[nb_trophees] = trophees[i]; 
		 } 
		 return; 
	 } 
	 


		public static void main(String[] args) {
			Gaulois asterix = new Gaulois("Asterix",9);
			Gaulois minus = new Gaulois("Minus",6);
			asterix.boirePotion(3);
			
		}
}