package personnages;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Equipement getEquipement() {
		return equipement;
	}
	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}
	public Gaulois getGaulois() {
		return gaulois;
	}
	public void setGaulois(Gaulois gaulois) {
		this.gaulois = gaulois;
	}
	
	public String donnerNom(Gaulois gaulois) {
		return gaulois.getNom();
	}
	
}
