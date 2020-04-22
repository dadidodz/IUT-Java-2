
public class CaseRattrapage extends Case{
		
	public CaseRattrapage(int numéro) {
		super(numéro);
	}
	
	public int calculDéplacement(int valeur) throws IllegalArgumentException {
		if () {
			return 0;
		} else {
			return valeur;
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "avancer de la valeur du dé si tous les pions ont rattrapé le pion courant");
	}
}