package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}

	public String getNom() {
		return nom;
	}
	public static void parler(String texte, String nom) {
		System.out.println(prendreParole(nom)+"\"\"" + texte + "\"\"");
	}
	private static String prendreParole(String nom) {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aie","Asterix");
		}
		else {
			parler("J'abandonne...","Asterix");	
		}
	}
	public static void main(String[] args) {
		System.out.println(prendreParole("Asterix"));
		parler("Bonjour","Asterix");
	}
}
