
public class RoboticusSportif extends Roboticus {
	private int nbPattes;
	
	public RoboticusSportif(int nbPattes, int taille) {
		super(taille);
		this.nbPattes = nbPattes;
	}
	
	public int getNbPattes() {
		return this.nbPattes;
	}
	
	public int points() {
		return this.getTaille()*this.nbPattes;
	}
}
