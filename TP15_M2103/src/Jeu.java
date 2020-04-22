
public class Jeu {
	
	public static final int NB_PIONS=3;
	private Pion[] pions;
	private Plateau plateau;
	
	public Jeu() {
		String [] tabCouleurs = {"rouge", "vert", "bleu"};
		this.plateau = new Plateau();
		this.pions = new Pion[NB_PIONS];
		for (int i=0; i<pions.length; i++) {
			this.pions[i]= new Pion(tabCouleurs[i]);
		}
	}
	
	private static int lancerD�() {
		return ((int)(6*Math.random())+1);
	}
	
	public void jouerPartie() {
		int i=0;
		while (!this.estPartieFinie()) {
				this.jouerPion(i);
				i=(i+1)%pions.length;
			}
		}
	
	private boolean estPartieFinie() {
		boolean retour = false;
		for (int i=0; i<pions.length && !retour; i++) {
			if (this.pions[i].getPosition()==48) {
				retour = true;
			}
		}
		return retour;			
	}
	
	private void jouerPion(int num�roPion) {
			int d� = Jeu.lancerD�();
			String NewLine = System.getProperty("line.separator");
			System.out.println("Position du pion " + this.pions[num�roPion].getCouleur() + " avant de jouer : " + this.pions[num�roPion].getPosition());
			System.out.println("Lancer du d� : " + d�);
			this.pions[num�roPion].d�placement(this.plateau.calculD�placement(pions[num�roPion].getPosition(), d�));
			System.out.println("Position du pion " + this.pions[num�roPion].getCouleur() + " apr�s avoir jouer : " + this.pions[num�roPion].getPosition());
			System.out.print(""+ NewLine);
	}
}
