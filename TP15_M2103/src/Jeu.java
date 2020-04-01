
public class Jeu {
	
	private int position;
	private Plateau plateau;
	
	public Jeu() {
		this.position = 0;
		this.plateau = new Plateau();
	}
	
	private void setPosition(int position) {
		this.position += position;
	}
	
	private static int lancerD�() {
		return ((int)(6*Math.random())+1);
	}
	
	public void jouerPartie() {
		while (!this.estPartieFinie()) {
			this.jouerPion();
		}
	}
	
	private boolean estPartieFinie() {
		return (this.position == 49);
	}
	
	private void jouerPion() {
		int d� = Jeu.lancerD�();
		String NewLine = System.getProperty("line.separator");
		System.out.println("Position du pion avant de jouer : " + this.position);
		System.out.println("Lancer du d� : " + d�);
		this.setPosition(this.plateau.calculD�placement(this.position, d�));
		System.out.println("Position du pion apr�s avoir jouer : " + this.position);
		System.out.print(""+ NewLine);
	}
	
}
