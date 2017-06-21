package ShapeDrawing;

/**
 * @author Sarmad
 * Class to define objects which will hold the cartesian
 * coordinate of the point (relative pixel location); for
 * instance the one where the user clicked on the 
 */
public class Point {

	private int x;
	private int y;

	public Point(int a, int b){
		x = a;
		y = b;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}