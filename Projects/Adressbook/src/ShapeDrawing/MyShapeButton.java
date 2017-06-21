package ShapeDrawing;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class MyShapeButton extends JToggleButton{

	public MyShapeButton(String imageFileName,String text) {

//		Sets the image icon on the button
		setIcon(new ImageIcon(imageFileName)); 

//		Do you understand what the following two method calls do?
		setBorderPainted(false);
		setFocusPainted(false);
		setToolTipText(text);
		
		
	}
}
