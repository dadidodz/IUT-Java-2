
public class CaseSp�ciale extends Case{
	
	private int valeurAttendue;
	private int num�roCaseAller;
	
	public CaseSp�ciale(int num�ro, int valeurAttendue, int num�roCaseAller) {
		super(num�ro);
		this.valeurAttendue = valeurAttendue;
		this.num�roCaseAller = num�roCaseAller;
	}
	
	public int calculD�placement(int valeur) throws IllegalArgumentException {
		if (valeur==this.valeurAttendue) {
			return (this.num�roCaseAller - this.getNum�ro());
		} else {
			return valeur;
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "si vous faites " +  this.valeurAttendue + 
				" aller � la case n�" + this.num�roCaseAller + " sinon avancez de la valeur du d�");
	}
}