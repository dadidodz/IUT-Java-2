
public class CalculValeurApproch�e {

	public static void main(String[] args) {
		long a = 2L;
		Rationnel r = new Rationnel(a, 1);
		Rationnel unDemi = new Rationnel (1, 2);
		for (int i=0; i < 4; i++) {
			Rationnel v = new Rationnel(a*r.getDenominateur(), r.getNumerateur());
			r = unDemi.produit(r.somme(v));
		}
		System.out.println("Valeur approch�e de racine carr�e de " + a +" = " + r);
	}

}
