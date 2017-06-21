package ShapeDrawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

/**
 * This class constructs the GUI, and defines the behaviour on click
 * events at the drawing area, given that a shape is selected. 
 */
public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("Basic Shape Drawing");
//		JMenuBar menuBar = new JMenuBar();
//		JMenu edit = new JMenu("Edit");
//		menuBar.add(edit);

		JToolBar toolBar = new JToolBar();
		//toolBar.setFloatable(false);

		MyShapeButton circleButton = new MyShapeButton("E:/Projects/Adressbook/src/ShapeDrawing/circle.png","Draw a Circle");
		MyShapeButton rectangleButton = new MyShapeButton("E:/Projects/Adressbook/src/ShapeDrawing/rectangle.png","Draw a Ractangle");
		MyShapeButton triangleButton = new MyShapeButton("E:/Projects/Adressbook/src/ShapeDrawing/triangle.png","Draw a Triangle");
		JButton save=new JButton("save");
		JButton load=new JButton("load");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(circleButton);
		buttonGroup.add(rectangleButton);
		buttonGroup.add(triangleButton);
		buttonGroup.add(save);
		buttonGroup.add(load);
		

		toolBar.add(circleButton);
		toolBar.add(rectangleButton);
		toolBar.add(triangleButton);
		toolBar.add(save);
		toolBar.add(load);
		add(toolBar, BorderLayout.NORTH);
		
		MyPanel drawingPanel = new MyPanel();
		drawingPanel.setBackground(Color.YELLOW);
		drawingPanel.addMouseListener(new MouseAdapter() {
			Shape shape = null;
			@Override
			public void mouseClicked(MouseEvent e) {
				Point clickPoint = new Point(e.getPoint().x, e.getPoint().y);
				if(circleButton.isSelected())
					shape = new Circle(clickPoint);
				if(triangleButton.isSelected())
					shape = new Triangle(clickPoint);
				if(rectangleButton.isSelected())
					shape = new Rectangle(clickPoint);
				
					
				
				drawingPanel.addShape(shape);
				
//				Very important method call. Without it, you won't be able 
//				to draw any shape. Comment this method and test yourself
				drawingPanel.repaint();  
			}
		});
		
		save.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				//new saveload();
				drawingPanel.save();
				System.out.println("save");
			}
		});
		load.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("loading");
					drawingPanel.clear();
					Shape shape=null;
					Scanner read1=new Scanner(new FileInputStream("savedata.txt"));
					String  save;
					
					String [] split;
					while(read1.hasNextLine()){
						save=read1.nextLine();
						split=save.split(",");
						String address=split[0];
						int xcord=Integer.parseInt(split[1]);
						int ycord=Integer.parseInt(split[2]);
						Point Point = new Point(xcord, ycord);
						if(address.charAt(13)=='C'){
							shape = new Circle(Point);
						}
						 if(address.charAt(13)=='R'){
							 shape = new Rectangle(Point);
						}
						else if(address.charAt(13)=='T'){
							
							shape = new Triangle(Point);
						}
						drawingPanel.addShape(shape);
						
//						Very important method call. Without it, you won't be able 
//						to draw any shape. Comment this method and test yourself
						drawingPanel.repaint();  
					}
				} catch (FileNotFoundException s) {
					// TODO Auto-generated catch block
					s.printStackTrace();
				}
			}
		});

		add(drawingPanel);

		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
