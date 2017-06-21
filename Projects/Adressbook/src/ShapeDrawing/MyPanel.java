package ShapeDrawing;

import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JPanel;

import lineDrawing.Point;

public class MyPanel extends JPanel {
	
//	Why not use a simple array of Shapes?
	ArrayList<Shape> shapes = new ArrayList<>();

	public void addShape(Shape s){
		shapes.add(s);
		//System.out.println(s.getVertexPoint().getX());
		
	}
	public void save(){
		try {
//			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("save.dat"));
			PrintWriter writer=new PrintWriter("savedata.txt");
			System.out.println("o");
			for(Shape s: shapes){
				System.out.println("loop");
				writer.println(s+","+s.getVertexPoint().getX()+","+s.getVertexPoint().getY());
//				outputStream.
			}
			writer.close();
			//shapes.clear();
//			outputStream.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//shapes.clear();
	
	}
	public void clear(){
		shapes.clear();
	}
//	public void load(){
//		try {
//			shapes.clear();
//			Shape shape=null;
//			Scanner read1=new Scanner(new FileInputStream("savedata.txt"));
//			String  save;
//			
//			String [] split;
//			while(read1.hasNextLine()){
//				save=read1.nextLine();
//				split=save.split(",");
//				String address=split[0];
//				int xcord=Integer.parseInt(split[1]);
//				int ycord=Integer.parseInt(split[2]);
//				Point Point = new Point(xcord, ycord);
//				if(address.charAt(13)=='C'){
//				   
//				}
//				
//				
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

//	Following method is automatically called in the sequence of method calls
//	which happen once we call repaint()
	@Override
	protected void paintComponent(Graphics g) {
//		Comment following method call to the parent and see what's the
//		impact. Can you figure out why?
		super.paintComponent(g);
		
		for(Shape s: shapes){
			//System.out.println("2");
			s.draw(g); 	// This is a polymorphic call
		}
	}
}