import java.awt.Graphics;

public abstract class Figure {
	private Point p1;
	private Point p2;
	
	public Figure(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Point getPoint1() {
		return this.p1;
	}
	
	public Point getPoint2() {
		return this.p2;
	}
	
	public abstract void tracer(Graphics g);
}
