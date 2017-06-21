package lineDrawing;

import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPanel;


// Here I'm defining my own customized JPanel (I'm extending JPanel). My panel has some additional
// behaviour. It can not only draw lines on the screen, but it also (temporarily) keeps record of
// all the lines, save the lines on a file, and can reload it from the file.
public class MyPanel extends JPanel{

//	since I can draw multiple lines on a panel, I keep an array list of lines.
//	Notice that each line in turn has a list of points :)
	private ArrayList<Line> lines = new ArrayList<>();

//	method to add a line in the array list.
	public void addLine(Line line){
		lines.add(line);
	
	}

	public ArrayList<Line> getLines() {
		return lines;  // Risky
	}

	@Override
//	paintComponent() is a built-in method for any GUI component, be it a frame, button, panel etc.
//	It basically defines how a GUI component will be displayed on the screen. For this application
//	since I want that a panel should be able to draw lines on itself (an extra thing which I demand),
//	I need to implement this method. I first call, super.paintComponent(), assures that panel
//	is drawn on the screen the usual way. After that, I'd add that code through which I'm instructing
//	what else to draw.
//	Remember that paintComponent method is automatically called for every component at the start of
//	application. But this happens just once. However, since I need to draw lines on the panel after
//	every click, I need a way to manually call this method. For that we use the repaint() method of
//	the GUI component.
	public void paintComponent(Graphics g) {
		super.paintComponent(g);  // this draws the panel the usual way
		//System.out.println("1");
		// The code below will do the additional drawings
		Point p1;
		for(Line l: lines){ 	// iterate over all the lines
			//System.out.println("2");
			p1 = l.getPoints().get(0);	// I initialize the first point. Figure out why?
			//System.out.println(p1.getX());
			//System.out.println("3");
			for(Point p2: l.getPoints()){  // for every point in the current line 'l'
				//System.out.println(p2.getX());
				//System.out.println("4");
				g.drawLine(p1.getX(), p1.getY(),p2.getX(), p2.getY());	// draw the line by passing the x & y
				//System.out.println("5");
																		// coordinates of both points
				p1 = p2;
			}
		}
	}

//	saves all the lines (present in the array list of lines) in a text file
	public void saveLines() throws FileNotFoundException{
		String line = "";
		PrintWriter writer = new PrintWriter(new File("lines.txt")); // to write data to text file
//		find out what this loop does?
		for(Line l: lines){
			for(Point p: l.getPoints()){
				line = line + p.getX() + "," + p.getY() + ",";
				//System.out.println(line);
			}
			if(line.length()>0)
				line = line.substring(0, line.length()-1);
			//System.out.println("2  "+line);
			System.out.println("writing:" + line);
			writer.println(line);
			line = "";
		}
		writer.close(); // it is always recommended to close any file writer object
		lines.clear();  // clears the array list of lines (makes it empty)
	}

//	loads all the lines in the array list after reading from the file
	public void loadLines() throws FileNotFoundException{
		lines.clear();
		Scanner reader = new Scanner(new File("lines.txt"));
		while (reader.hasNextLine()) {
//		figure out how the line objects are constructed within this loop
			String lineData = reader.nextLine();
			Line line = new Line();
			String[] coords = lineData.split(",");
			for(int i=0; i<coords.length; i+=2){
				line.addPoint(new Point(Integer.parseInt(coords[i]),
						Integer.parseInt(coords[i+1])));
			}
			System.out.println(line);
			lines.add(line);
			System.out.println(lines);
			
		}
		reader.close(); // it is always recommended to close any file reader object
	}
}
