package personnages;

public class Musee {
	private Trophee [] tab  = new Trophee[200]; 
	private int nbTrophee=0;
	
	public void donnerTrophees(Gaulois gaulois, Trophee equipement) {
		tab[nbTrophee]=equipement;
		nbTrophee++;
	}
	
	public String extraireInstructionsCaml() {
        	String texte = "let musee = [\n";
        	for (int i = 0; i < nbTrophees; i++) {
            		String nom = trophees[i].donnerNom();
            		Equipement equipement = trophees[i].getEquipement();
            		if (nbTrophees - 1 != i) {
                		texte += """ + nom + ""," + """ + equipement + "";\n";
            		} else {
                		texte += """ + nom + ""," + """ + equipement + ""\n";
            		}
        	}
        	texte += "]";
        	return texte;
    	}
		
}

