
public class Plateau {
	
	public static final int NB_CASE=49;
	private Case[] cases;
	
	public Plateau() {
		this.cases = new Case [NB_CASE];
		for (int i=0; i<cases.length; i++) {
			switch(i) {
				case 12:
					cases[i]= new CaseAttente(12, 2);
					break;
				case 18:
					cases[i]= new CaseAttente(18, 5);
					break;
				case 24:
					cases[i]= new CaseAttente(24, 2);
					break;
				case 27:
					cases[i]= new CaseAttente(27, 5);
					break;
				case 33:
					cases[i]= new CaseAttente(33, 4);
					break;
				default:
					cases[i]= new CaseNormale(i);
			}
		}
	}
	
	public int calculDéplacement (int position, int valeur) throws IllegalArgumentException {
		if (valeur<0 || valeur>6) {
			throw new IllegalArgumentException("Valeur de déplacement inférieure à 0 ou supérieure à 6");
		}
		System.out.println(this.cases[position].toString());
		int a = cases[position].calculDéplacement(valeur);
		if(position+a>cases.length) {
			return (2*(cases.length-position) - a);
		}
		return a;
	}
}
