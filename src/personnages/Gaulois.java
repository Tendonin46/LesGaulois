package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private int forceCoup;
	private Equipement [] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void boirePotion(int forcePotion) {
		effetPotion += forcePotion;
		System.out.println("<< Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.>> ");

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
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + ": ";
//	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	
	}


//	 public void frapper(Romain romain) { 
//		 forceCoup=(force/3)*effetPotion;
//	 	 System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom()); 
//	 }

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}
	
	public void faireUneDonation(Musee musee) {
		if(trophees[0]!=null) {
			parler("Je donne tout mes trophees :");
			for(int i=0;i<nbTrophees;i++) {
				System.out.println("-"+trophees[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 9);
		Gaulois minus = new Gaulois("Minus", 6);
		asterix.boirePotion(3);

	}
}
