import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<Figure> list = new ArrayList<Figure>();
		list.add(new Cercle(new Point(70, 100), new Point(120,150)));
		list.add(new Cercle(new Point(50, 20), new Point(70,140)));
		list.add(new Cercle(new Point(100, 90), new Point(60,120)));
		list.add(new Rectangle(new Point(70, 100), new Point(10,20)));
		list.add(new Rectangle(new Point(60, 80), new Point(90,170)));
		new FenetreFigures(list);
	}

}
