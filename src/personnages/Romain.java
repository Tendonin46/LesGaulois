package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force > 0 : "force negative";
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "  envoie  un  grand  coup  dans  la mâchoire de " + romain.getNom());
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"\"" + texte + "\"\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
//	public void recevoirCoup(int forceCoup) {
//		assert force>0: "force negative";
//		int x = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie");
//		}
//		else {
//			parler("J'abandonne...");	
//		}
//		assert x<=force: "La force n'a pas diminué";
//	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calcResEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		if (force == 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");

		}
		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calcResEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement  de  " + nom.toString() + " s'envole sous la force du coup.");

		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}

		}
		return equipementEjecte;
	}

	public void sEquiper(Equipement Equip) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà  bien protégé.");
			break;
		case 1:
			if (Equip == equipements[0]) {
				System.out.println("Le soldat " + nom + " possède déjà un " + Equip + "!");
			} else {
				ajouterEquipement(Equip);
			}
			break;
		default:

			ajouterEquipement(Equip);
			break;
		}
	}

	private void ajouterEquipement(Equipement Equip) {
		equipements[nbEquipement] = Equip;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + Equip + ".");
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
