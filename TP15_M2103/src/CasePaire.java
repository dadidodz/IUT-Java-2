
public class CasePaire extends Case{
		
	public CasePaire(int num�ro) {
		super(num�ro);
	}
	
	public int calculD�placement(int valeur) throws IllegalArgumentException {
		if  (valeur % 2 == 0) {
			return valeur;
		} else {
			return (0 - valeur);
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "avancer de la valeur du d� si elle est est paire");
	}
}
