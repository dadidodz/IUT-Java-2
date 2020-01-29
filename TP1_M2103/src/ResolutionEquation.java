import java.util.Scanner;
public class ResolutionEquation {

	public static void main(String[] args) {
		Scanner entr�e = new Scanner(System.in);
		System.out.println("Entrer le coefficient a :");
		int coefA = entr�e.nextInt();
		System.out.println("Entrer le coefficient b :");
		int coefB = entr�e.nextInt();
		System.out.println("Entrer le coefficient c :");
		int coefC = entr�e.nextInt();
		entr�e.close();
		double discriminant = Math.pow(coefB, 2) - 4*coefA*coefC;
		if (discriminant > 0) {
			double x1 = (-coefB + Math.sqrt(discriminant))/(2*coefA);
			double x2 = (-coefB - Math.sqrt(discriminant))/(2*coefA);
			System.out.println("R�solution de l'�quation : " + coefA + "x� + " + coefB + "x + " + coefC + " = 0");
			System.out.println("Discriminant : " + discriminant);
			System.out.print("2 solutions : " + x1 + " et " + x2);
		} else if (discriminant == 0) {
			double x1 = -coefB/(2*coefA);
			System.out.println("R�solution de l'�quation : " + coefA + "x� + " + coefB + "x + " + coefC + " = 0");
			System.out.println("Discriminant : " + discriminant);
			System.out.print("1 solution : " + x1);			
		} else {
			System.out.println("R�solution de l'�quation : " + coefA + "x� + " + coefB + "x + " + coefC + " = 0");
			System.out.println("Discriminant : " + discriminant);
			System.out.print("Aucune solution r�elle");
		}
	}

}
