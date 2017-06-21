package lineDrawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

// This class is responsible for constructing the GUI window (or frame) for
// drawing. Note the main() method at the end. We just create the object of GUI.
// No method call, nothing. This is a very good example of 'event-driven programming'.
// The code is written such that something happens only when the mouse is clicked, 
// either on the yellow region, or on the buttons.

public class GUI {
//	int sx=0; for creation of one line and then breaking it
	public GUI(){
		constructGUI();
	}

//	I keep this method private because it will be called only by my constructor.
//	No one else outside this class calls it.
	private void constructGUI(){

//		I create a JFrame object which displays a window
		JFrame jf = new JFrame("Line Drawing");
		

//		I instantiate MyPanel object, which is my own customized JPanel
		MyPanel jpCenter = new MyPanel();
		jpCenter.setBackground(Color.YELLOW); // I set panel's background color

//		Next, I add a Listener object with my panel. Listeners are special kind
//		of objects which listen for events, and if the event occurs, they do something.
//		An event is usually any interaction of user with the GUI. For example, when I
//		move or click my mouse, it is an event. When I press a key on the keyboard, it
//		is an event. Since there are different type of events, there are different type
//		of listeners. For example, MouseListener, KeyListener, ActionListener,
//		ChangeListener, WindowListener etc. MouseListener listens for mouse related
//		events (like mouse clicks etc.), ActionListener normally listen for button
//		presses etc. So, the kind of event for which I'm listening dictates which kind
//		of listener object I need to instantiate. 
//		In the code below, I define and instantiate a MouseAdapter (a class which has
//		already implemented the MouseListener interface, see API for details) as an
//		anonymous inner class. Whenever I click on the panel, the listener's
//		mouseClicked method is called.
		jpCenter.addMouseListener(new MouseAdapter() {

// 			I'll keep a reference of the line which I'm drawing at the moment
			private Line currentLine;

//			This methods belongs to MouseListener. It is called whenever mouse is clicked
//			on the panel. Note that we DO NOT call this method. It is automatically called.
			public void mouseClicked(MouseEvent e) {
				if(SwingUtilities.isLeftMouseButton(e)){// this condition checks whether the
														// click was a left mouse click or not.

					if(currentLine == null){			// for the first left click, after the application
						currentLine = new Line();		// starts, there's no line. So we need to
						System.out.println(currentLine);
						jpCenter.addLine(currentLine);	// instantiate a line object, and add it into our
														// list of lines
						System.out.println("left click, for the 1st time");
					}
//					For any left click, get the click position coordinates from the event object, use
//					these to instantiate a new point object, and then add that new point to the current
//					line's list of points.
					currentLine.addPoint(new Point(e.getX(), e.getY()));
					System.out.println(e.getX());
//					sx++;
//					if(sx==2){
//						currentLine=null;
//						sx=0;
//					}
					System.out.println("added point to line " + (jpCenter.getLines().size()));

//					this method updates the view of the panel. It in turn calls the paintComponent() method
//					defined inside MyPanel class. See that method's comments and definition for details.
					jpCenter.repaint();
				}

//				this condition checks if the click is a right click. Try to understand the code inside it.
//				I want that whenever a right click is done, the current line is dumped, and a new line
//				is ready for drawing.
				if(SwingUtilities.isRightMouseButton(e)){
					if(currentLine != null){
						currentLine = new Line();
						System.out.println(currentLine);
						jpCenter.addLine(currentLine);
						System.out.println("previous line gone. New line created");
					}
					else
						System.out.println("empty right click, no line yet");
				}
			}
		});
		jf.add(jpCenter, BorderLayout.CENTER);  // I add the yellow panel at the center of the frame

		JPanel bottomJPanel = new JPanel();
		JButton saveButton = new JButton("Save");

//		Now see this section carefully. I'm adding an action listener with the button, because I know
//		that this listener listens for button press events. Again, the actionPerformed() method of this
//		listener is automatically called whenever the button is pressed.
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				There are only two statements. The one that saves all the lines in the files, and the other
//				which repaints the panel.
				try {
					jpCenter.saveLines(); // carefully explore what this method does
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				jpCenter.repaint(); // very important method call. Try commenting it and see what happens. Why?
			}
		});
		JButton loadButton = new JButton("Load");

//		same thing for load button, as explained for the save button above.
		loadButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					jpCenter.loadLines();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				jpCenter.repaint(); // again...
			}
		});

//		I add the load and save buttons in another JPanel, and add that panel at the bottom (south)
//		of the frame
		bottomJPanel.add(loadButton);
		bottomJPanel.add(saveButton);
		jf.add(bottomJPanel, BorderLayout.SOUTH);

// 		Mandatory. If you forget to make this method call, frame will not appear on the screen
		jf.setVisible(true);

		jf.setSize(500, 300); // Optional to call. It sets the initial display size of the frame
		jf.setResizable(false); // Optional.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Optional
	}

	public static void main(String[] args){
		new GUI();
	}
}