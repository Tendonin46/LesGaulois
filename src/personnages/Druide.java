package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	
	public static void preparerPotion(int effetPotionMin,int effetPotionMax) {
		Random n = new Random();
		int force = n.nextInt(effetPotionMin,effetPotionMax);
		if(force > 7) {
			System.out.println("<< J'ai préparé une super potion de force >> "+ force);
		}
		else {
			System.out.println("<< Je n'ai pas trouvé tout les ingredients, ma potion est seulement de force >> "+ force);
		}
	}
	
	public void booster(Gaulois gaulois) {
		Gaulois Obélix = null;
		if(gaulois==Obélix) {
			System.out.println("<< Non, Obélix !... Tu n'auras pas de potion magique! >>");	
		}
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		preparerPotion(5,10);
	}
}
