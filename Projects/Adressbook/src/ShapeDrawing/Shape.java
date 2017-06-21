package ShapeDrawing;
import java.awt.Graphics;

/**
 * @author Sarmad
 * Shape cannot be instantiated. 
 *
 */
public abstract class Shape {

	/**
	 * A point which pivots the shape object
	 */
	private Point vertexPoint;
	
	

	/**
	 * The constructor sets the vetex
	 * @param clickPoint The point at which the user clicked on the panel
	 */
	public Shape(Point clickPoint){
		vertexPoint = clickPoint;
	}


	public Point getVertexPoint(){
		return vertexPoint;
	}

	/**
	 * Every drawable shape must implement this method 
	 * @param g Reference of the Graphics object needed to draw on the screen 
	 */
	public abstract void draw(Graphics g);
}
