package personnages;

public class Village {
	private String nom;
	static Gaulois[] villageois;
	private static int nbVillageois = 0;
	private static int nbVillageoisMaximum;
	private Chef chef;
	
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public static void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois++] = gaulois;
		}
	}

	public static Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];

	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public static void afficherVillageois() {
		System.out.println("Dans le village du chef Abraracourcix vivent les légendaires gaulois: ");
		
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//On obtient cette execption parce que le tableau est de taille 30 et l'element d'indice 30 n'existe pas
		Gaulois Abraracoursix = new Gaulois("Abraracoursix",6);
		ajouterHabitant(Abraracoursix);
		Gaulois Asterix = new Gaulois("Asterix",8);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//On obtient parce que le tableau ne contient qu'un seul élément qui se situe à l'indice 0 donc à l'indice 1 il n'y a rien
		Gaulois Obélix = new Gaulois("Obélix",25);
		ajouterHabitant(Obélix);
		

	}
}
