
public class RoboticusIntellectuel extends Roboticus{
	private int nbNeurones;
	
	public RoboticusIntellectuel(int nbNeurones, int taille) {
		super(taille);
		this.nbNeurones = nbNeurones;
	}
	
	public int getNbNeurones() {
		return this.nbNeurones;
	}
	
	public void setNbNeurones(int n) {
		this.nbNeurones = n;
	}
	
	public int points() {
		return this.getTaille()*this.nbNeurones;
	}
}
