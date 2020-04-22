
public class CasePaire extends Case{
		
	public CasePaire(int numéro) {
		super(numéro);
	}
	
	public int calculDéplacement(int valeur) throws IllegalArgumentException {
		if  (valeur % 2 == 0) {
			return valeur;
		} else {
			return (0 - valeur);
		}
	}

	@Override
	public String toString() {
		return (super.toString() + "avancer de la valeur du dé si elle est est paire");
	}
}
