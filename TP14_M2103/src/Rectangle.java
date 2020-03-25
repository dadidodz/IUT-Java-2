import java.awt.Graphics;
import java.lang.Math;
public class Rectangle extends Figure {
	
	public Rectangle(Point p1, Point p2) {
		super(p1, p2);
	}
	
	public int largeur() {
		return (Math.abs(this.getPoint2().getX()-this.getPoint1().getX()));
	}
	
	public int hauteur() {
		return (Math.abs(this.getPoint2().getY()-this.getPoint1().getY()));
	}
	
	public double périmètre() {
		return (2*((this.largeur())+(this.hauteur())));
	}
	
	public double surface() {
		return (this.largeur()*this.hauteur());
	}

	@Override
	public void tracer(Graphics g) {
		g.drawRect(this.getPoint1().getX(), this.getPoint1().getY(), this.largeur(), this.hauteur());
		
	}
}
