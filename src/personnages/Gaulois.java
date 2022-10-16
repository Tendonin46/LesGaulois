package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private static int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public static void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		if(forcePotion == 3) {
			System.out.println("<< Merci Druide, je sens que ma force est"+forcePotion +"fois décuplée.>> ");
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

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",9);
		Gaulois minus = new Gaulois("Minus",6);
		boirePotion(3);
		
	}
	public static void parler(String texte, String nom) {
		System.out.println(prendreParole(nom)+"<<"+ texte +">>");
	
	}

	private static String prendreParole(String nom) {
		return "Le gaulois " + nom + ": ";
		
	}

	 public static void frapper(Gaulois gaulois, String nom,int effetPotion,int force) { 
		 int forceCoup = (force/3) * effetPotion;
	 System.out.println(nom + " envoie un grand coup dans la machoire de " + gaulois.getNom()); 
	 }
}