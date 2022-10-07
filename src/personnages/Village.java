package personnages;

public class Village {
	private String nom;
	private villageois[] gaulois;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom=nom;
		this.gaulois = new villageois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(String gaulois) {
		if(nbVillageois<nbVillageoisMaximum) {
			villageois[nbVillageois++]=gaulois;
		}		
	}
	
	public String trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
		
	}
	
	 public void setChef(Chef chef) { 
		 this.chef = chef; 
	 }
	 
	public String getNom() {
		return nom;
	}
	
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles",30);
		Gaulois gaulois = village.trouverHabitant(30);
		
		
		
		
	}
	

}
