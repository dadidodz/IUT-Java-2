
public class CaseRattrapage extends Case{
		
	public CaseRattrapage(int num�ro) {
		super(num�ro);
	}
	
	public int calculD�placement(int valeur) throws IllegalArgumentException {
		if () {
			return 0;
		} else {
			return valeur;
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "avancer de la valeur du d� si tous les pions ont rattrap� le pion courant");
	}
}