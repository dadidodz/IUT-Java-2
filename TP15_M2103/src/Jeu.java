
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
	
	private static int lancerDé() {
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
		int dé = Jeu.lancerDé();
		String NewLine = System.getProperty("line.separator");
		System.out.println("Position du pion avant de jouer : " + this.position);
		System.out.println("Lancer du dé : " + dé);
		this.setPosition(this.plateau.calculDéplacement(this.position, dé));
		System.out.println("Position du pion après avoir jouer : " + this.position);
		System.out.print(""+ NewLine);
	}
	
}
