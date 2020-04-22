
public class CaseSpéciale extends Case{
	
	private int valeurAttendue;
	private int numéroCaseAller;
	
	public CaseSpéciale(int numéro, int valeurAttendue, int numéroCaseAller) {
		super(numéro);
		this.valeurAttendue = valeurAttendue;
		this.numéroCaseAller = numéroCaseAller;
	}
	
	public int calculDéplacement(int valeur) throws IllegalArgumentException {
		if (valeur==this.valeurAttendue) {
			return (this.numéroCaseAller - this.getNuméro());
		} else {
			return valeur;
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "si vous faites " +  this.valeurAttendue + 
				" aller à la case n°" + this.numéroCaseAller + " sinon avancez de la valeur du dé");
	}
}