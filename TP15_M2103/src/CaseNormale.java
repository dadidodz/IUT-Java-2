
public class CaseNormale extends Case{
	
	public CaseNormale(int numéro) {
		super(numéro);
	}
	
	public int calculDéplacement(int valeur) throws IllegalArgumentException {
		return valeur;
	}

	@Override
	public String toString() {
		return (super.toString() + "avancer de la valeur du dé");
	}
}
