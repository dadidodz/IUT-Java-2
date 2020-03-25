public class Application {
	
	public static void main(String[] args) {
		 List<Roboticus> jeu1 ;
		 // créer le jeu1 et y ajouter plusieurs Roboticus
		 List<Roboticus> jeu2 ;
		 // créer le jeu2 et y ajouter plusieurs Roboticus
		 System.out.println("Avant de jouer :");
		 System.out.println("Jeu 1 " + "\n" + Application.toStringJeu(jeu1));
		 System.out.println("Jeu 2 " + "\n" + Application.toStringJeu(jeu2));
		 Application.jouer(jeu1, jeu2);
		 System.out.println("Après avoir joué :");
		 System.out.println("Jeu 1 " + "\n" + Application.toStringJeu(jeu1));
		 System.out.println("Jeu 2 " + "\n" + Application.toStringJeu(jeu2));
		 }
	
		 public static String toStringJeu(List<Roboticus> jeu) {
			 
		 }
		 
		 public static void jouer(List<Roboticus> jeu1, List<Roboticus> jeu2) {
		 
		 }



}



