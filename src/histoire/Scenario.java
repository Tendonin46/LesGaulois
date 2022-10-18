package histoire;

import java.util.Random;

import personnages.Druide;
import personnages.Gaulois;

public class Scenario {
//	public static void parlerG(String texte, String nom) {
//		System.out.println(prendreParoleG(nom)+"<<"+ texte +">>");
//	
//	}
//
//	private String prendreParoleG(String nom) {
//		return "Le gaulois " + nom + ": ";
//		
//	}
//	public void parlerD(String texte, String nom) {
//		System.out.println(prendreParoleD(nom)+"<<"+ texte +">>");
//	}
//	private String prendreParoleD(String nom) {
//		return "Le druide " + nom + ": ";
//	}
//	
//		
//	 public void frapper(Gaulois gaulois, String nom) { 
//	 System.out.println(nom + " envoie un grand coup dans la machoire de " + gaulois.getNom()); 
//	 }
//	 public void preparerPotion(int effetPotionMin,int effetPotionMax) {
//			Random n = new Random();
//			int force = n.nextInt(effetPotionMin,effetPotionMax);
//			if(force > 7) {
//				System.out.println("<< J'ai préparé une super potion de force "+force+" >> ");
//			}
//			else {
//				System.out.println("<< Je n'ai pas trouvé tout les ingredients, ma potion est seulement de force "+force+ " >> ");
//			}
//		}
//	
//	 public void booster(Gaulois gaulois) {
//		System.out.println("<< Non, Obélix !... Tu n'auras pas de potion magique! >>");	
//		}
//	 private int effetPotion = 1;
//	 
//	 public void boirePotion(int forcePotion) {
//			effetPotion=forcePotion;
//			System.out.println("<< Merci Druide, je sens que ma force est "+ forcePotion +" fois décuplée. >> ");
//			
//		}
	 
	 public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",9);
		Gaulois minus = new Gaulois("Minus",6);
		Gaulois obelix = new Gaulois("Obelix",100);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion(6,7);
		booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste!");
		obelix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU...UN GAUGAU...");
		asterix.frapper(minus);
		minus.parler("Aie");
		asterix.frapper(minus);
		minus.parler("Aie");
		asterix.frapper(minus);
		minus.parler("J'abandonne");
	}
}
