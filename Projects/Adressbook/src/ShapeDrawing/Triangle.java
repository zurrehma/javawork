package ShapeDrawing;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Triangle extends Shape{

	private int height = 40;

	public Triangle(Point clickPoint) {
		super(clickPoint);
	}

	
//	Find out how the following method draws the triangle
	@Override
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		int x = getVertexPoint().getX();
		int y = getVertexPoint().getY();
		int[] xCoords = {x, x-(height/2),x+(height/2)};
		int[] yCoords = {y, y+height, y+height};
		Polygon triangle = new Polygon(xCoords, yCoords, 3);
		g.fillPolygon(triangle);
	}
}