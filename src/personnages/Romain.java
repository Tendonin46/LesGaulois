package personnages;

public class Romain {
	private static String nom;
	private int force;
	private static Equipement[] equipements = new Equipement[2];
	private static int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom=nom;
		assert force>0: "force negative";
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	public static void parler(String texte, String nom) {
		System.out.println(prendreParole(nom)+"\"\"" + texte + "\"\"");
	}
	private static String prendreParole(String nom) {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force>0: "force negative";
		int x = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie","Asterix");
		}
		else {
			parler("J'abandonne...","Asterix");	
		}
		assert x<=force: "La force n'a pas diminué";
	}
	
	public static void sEquiper(Equipement Equip) {
		switch(nbEquipement) {
			case 2:
				System.out.println("Le soldat "+nom+" est déjà bien protégé.");
				break;
			case 1:
				if(Equip==equipements[0]) {
					System.out.println("Le soldat "+nom+" possède déjà un "+Equip+"!");
				}
				else {
					equipements[nbEquipement++]=Equip;
					System.out.println("Le soldat "+nom+" s'équipe avec un "+Equip+".");
				}
				break;	
			default:
				equipements[nbEquipement++]=Equip;
				System.out.println("Le soldat "+nom+" s'équipe avec un "+Equip+".");
				break;
		}
	}
	
	public static void main(String[] args) {
		Romain Minus=new Romain("Minus",6);
		sEquiper(Equipement.CASQUE);
		sEquiper(Equipement.CASQUE);
		sEquiper(Equipement.BOUCLIER);
		sEquiper(Equipement.CASQUE);
	}
}
