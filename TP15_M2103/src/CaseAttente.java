
public class CaseAttente extends Case{
	
	private int valeurAttendue;
	
	public CaseAttente(int num�ro, int valeurAttendue) {
		super(num�ro);
		this.valeurAttendue = valeurAttendue;
	}
	
	public int calculD�placement(int valeur) throws IllegalArgumentException {
		if (valeur==this.valeurAttendue) {
			return valeur;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "avancer de la valeur du d� si elle est �gale � " + this.valeurAttendue);
	}
}
