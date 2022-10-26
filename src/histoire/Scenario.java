package histoire;

import java.util.Random;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario { 
	 
	 public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",9);
		Gaulois minus = new Gaulois("Minus",6);
		Gaulois obelix = new Gaulois("Obelix",100);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion(6,7);
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


