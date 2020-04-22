
public class Pion {

		private int position;
		private String couleur;
		
		public Pion(String couleur) {
			this.position = 0;
			this.couleur = couleur;
		}
		
		public void déplacement(int position) {
			this.position += position;
		}
		
		public int getPosition() {
			return this.position;
		}
		
		public String getCouleur() {
			return this.couleur;
		}
}
