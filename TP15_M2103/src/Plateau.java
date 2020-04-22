
public class Plateau {
	
	public static final int NB_CASE=49;
	private Case[] cases;
	
	public Plateau() {
		this.cases = new Case [NB_CASE];
		for (int i=0; i<cases.length; i++) {
			switch(i) {
			case 5:
				cases[i]= new CaseSpéciale(5, 6, 20);
				break;
			case 12:
				cases[i]= new CaseAttente(12, 2);
				break;
			case 15:
				cases[i]= new CasePaire(15);
				break;
			case 16:
				cases[i]= new CaseSpéciale(16, 4, 22);
				break;
			case 18:
				cases[i]= new CaseAttente(18, 5);
				break;
			case 20:
				cases[i]= new CasePaire(20);
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
			case 36:
				cases[i]= new CaseSpéciale(36, 1, 10);
				break;
			case 40:
				cases[i]= new CaseRattrapage(40);
				break;
			case 45:
				cases[i]= new CaseSpéciale(45, 2, 10);
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
		if(position+a>(cases.length-1)) {
			return (2*((cases.length-1)-position) - a);
		}
		return a;
	}
}
