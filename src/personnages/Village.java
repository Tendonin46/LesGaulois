package personnages;

public class Village {
	private String nom;
	Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(String gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
			Gaulois[nbVillageois++] = gaulois;
		}
	}

	public String trouverHabitant(int numVillageois) {
		return Gaulois[numVillageois];

	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}


	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", 30);
		Gaulois gaulois = village.trouverHabitant(30);

	}
}
