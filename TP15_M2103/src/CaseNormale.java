
public class CaseNormale extends Case{
	
	public CaseNormale(int num�ro) {
		super(num�ro);
	}
	
	public int calculD�placement(int valeur) throws IllegalArgumentException {
		return valeur;
	}

	@Override
	public String toString() {
		return (super.toString() + "avancer de la valeur du d�");
	}
}
