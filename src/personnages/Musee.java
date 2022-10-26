package personnages;

public class Musee {
	private Trophee [] tab  = new Trophee[200]; 
	private int nbTrophee=0;
	
	public void donnerTrophees(Gaulois gaulois, Trophee equipement) {
		tab[nbTrophee]=equipement;
		nbTrophee++;
	}
	public String extraireInstructionsCaml() {
		return trophees;
	}
}

