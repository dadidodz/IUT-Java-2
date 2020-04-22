
public abstract class Case {
	
	private int numéro;
	
	public Case(int numéro) throws IllegalArgumentException {
		if (numéro>48) {
			throw new IllegalArgumentException("Numéro de case supérieur à 48");
		}
		this.numéro = numéro;
	}
	
	protected int getNuméro() {
		return this.numéro;
	}
	
	public abstract int calculDéplacement(int valeur);
	
	@Override
	public String toString() {
		return "[case n°" + numéro + "] : ";
	}
}
