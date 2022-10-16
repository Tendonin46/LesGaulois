package histoire;

import java.util.Random;

import personnages.Druide;
import personnages.Gaulois;

public class Scenario {
	public static void parlerG(String texte, String nom) {
		System.out.println(prendreParoleG(nom)+"<<"+ texte +">>");
	
	}

	private static String prendreParoleG(String nom) {
		return "Le gaulois " + nom + ": ";
		
	}
	public static void parlerD(String texte, String nom) {
		System.out.println(prendreParoleD(nom)+"<<"+ texte +">>");
	}
	private static String prendreParoleD(String nom) {
		return "Le druide " + nom + ": ";
	}
	
		
	 public static void frapper(Gaulois gaulois, String nom) { 
	 System.out.println(nom + " envoie un grand coup dans la machoire de " + gaulois.getNom()); 
	 }
	 public static void preparerPotion(int effetPotionMin,int effetPotionMax) {
			Random n = new Random();
			int force = n.nextInt(effetPotionMin,effetPotionMax);
			if(force > 7) {
				System.out.println("<< J'ai préparé une super potion de force "+force+" >> ");
			}
			else {
				System.out.println("<< Je n'ai pas trouvé tout les ingredients, ma potion est seulement de force "+force+ " >> ");
			}
		}
	
	 public static void booster(Gaulois gaulois) {
		System.out.println("<< Non, Obélix !... Tu n'auras pas de potion magique! >>");	
		}
	 private static int effetPotion = 1;
	 
	 public static void boirePotion(int forcePotion) {
			effetPotion=forcePotion;
			if(forcePotion == 6) {
				System.out.println("<< Merci Druide, je sens que ma force est "+forcePotion +" fois décuplée. >> ");
			}
		}
	 
	 public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",9);
		Gaulois minus = new Gaulois("Minus",6);
		Gaulois Obélix = new Gaulois("Obélix",100);
		Druide panoramix = new Druide("Panoramix",5,10);
		parlerD("Je vais aller préparer une petite potion...","Panoramix");
		preparerPotion(6,7);
		booster(Obélix);
		parlerG("Par Bélénos, ce n'est pas juste!","Obélix");
		boirePotion(6);
		parlerG("Bonjour","Asterix");
		parlerG("UN GAU...UN GAUGAU...","Minus");
		frapper(minus,"Asterix");
		parlerG("Aie","Minus");
		frapper(minus,"Asterix");
		parlerG("Aie","Minus");
		frapper(minus,"Asterix");
		parlerG("J'abandonne","Minus");
	}
}
