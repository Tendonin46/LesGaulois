package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom=nom;
		assert force>0: "force negative";
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
		assert force>0: "force negative";
		int x = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie","Asterix");
		}
		else {
			parler("J'abandonne...","Asterix");	
		}
		assert x<=force: "La force n'a pas diminué";
	}
	public static void main(String[] args) {
		Romain Minus=new Romain("Minus",6);
		
	}
}
