
public class CaseAttente extends Case{
	
	private int valeurAttendue;
	
	public CaseAttente(int numéro, int valeurAttendue) {
		super(numéro);
		this.valeurAttendue = valeurAttendue;
	}
	
	public int calculDéplacement(int valeur) throws IllegalArgumentException {
		if (valeur==this.valeurAttendue) {
			return valeur;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "avancer de la valeur du dé si elle est égale à " + this.valeurAttendue);
	}
}
