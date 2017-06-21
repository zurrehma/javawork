package ShapeDrawing;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

//	Default width and height
	private int width = 40;
	private int height = 30;

	public Rectangle(Point clickPoint) {
		super(clickPoint);
	}

	@Override
	public void draw(Graphics g){
		g.setColor(Color.GREEN);
		
		// Go to API docs and see what this method does, and what are the arguments
		g.fillRect(getVertexPoint().getX(),	getVertexPoint().getY(), width, height);
	}
}
