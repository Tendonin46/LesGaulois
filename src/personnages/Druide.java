package personnages;
import java.util.Random;
import personnages.Gaulois;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à  "+ effetPotionMax + ".");
	}
	
	public void preparerPotion(int effetPotionMin,int effetPotionMax) {
		Random n = new Random();
		forcePotion = n.nextInt(effetPotionMax-effetPotionMin);
		forcePotion+=effetPotionMin;
		if(forcePotion> 7) {
			System.out.println("<< J'ai préparé une super potion de force >> "+ forcePotion);
		}
		else {
			System.out.println("<< Je n'ai pas trouvé tout les ingredients, ma potion est seulement de force >> "+ forcePotion);
		}
	}
	 public void boirePotion(int forcePotion) {
		 	effetPotionMin=forcePotion;
			System.out.println("<< Merci Druide, je sens que ma force est "+ forcePotion +" fois décuplée. >> ");
		
		}
	 public void booster(Gaulois gaulois) {
		 if(gaulois.getNom()=="Obelix"){
			System.out.println("<< Non, Obélix !... Tu n'auras pas de potion magique! >>");	
			}
		 else{
			 gaulois.boirePotion(forcePotion);
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
		panoramix.preparerPotion(5,10);
	}
}
