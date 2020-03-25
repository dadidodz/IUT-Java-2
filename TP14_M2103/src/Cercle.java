import java.awt.Graphics;

public class Cercle extends Figure{
	
	public Cercle(Point p1, Point p2) {
		super(p1, p2);
	}
	
	public double rayon() {
		return Point.distance(this.getPoint1(), this.getPoint2());
	}
	
	public double diamètre() {
		return (Point.distance(this.getPoint1(), this.getPoint2())*2);
	}
	
	public double périmètre() {
		return (2*Math.PI*Point.distance(this.getPoint1(), this.getPoint2()));
	}
	
	public double surface () {
		return (Math.PI*Math.pow(Point.distance(this.getPoint1(), this.getPoint2()), 2.0));
	}

	@Override
	public void tracer(Graphics g) {
		g.drawOval(this.getPoint1().getX(), this.getPoint1().getY(), (int)this.diamètre(), (int)this.diamètre());
		
	}
	
}