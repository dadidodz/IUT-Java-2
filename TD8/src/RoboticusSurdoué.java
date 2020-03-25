public class RoboticusSurdoué extends RoboticusIntellectuel{
	
	public RoboticusSurdoué(int nbNeurones, int taille){
		super(nbNeurones, taille);
	}
	
	public int points() {
		return super.points()*2;
	}
	
	public void ajouterNeurones(int n) {
		this.setNbNeurones(this.getNbNeurones() + n);
	}
	
}
