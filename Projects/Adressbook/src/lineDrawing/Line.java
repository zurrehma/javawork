package lineDrawing;
import java.util.ArrayList;

// A line is made up of many different points, which are added
// to the list after every left click.
public class Line {

	private ArrayList<Point> pointList;


	public Line(){
		pointList = new ArrayList<Point>();
	}

	public void addPoint(Point p){
		pointList.add(p);
	}

	public ArrayList<Point> getPoints() {
		return pointList; 
		/* Technically, the above return statement breaks encapsulation. 
		We should not be returning the list this way. Do you know why?...
		Notice that pointList is private in this class, which means
		only this class's members should have access to it, no one outside
		this class should be able to access it. BUT, when you return
		it's reference to some external class this way, that class can then manipulate
		the list. This approach can cause big security and privacy issues.
		So instead of returning the reference, we should have made a deep copy
		and returned it's reference. */
	}
}