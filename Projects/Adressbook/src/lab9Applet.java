import java.applet.*;  
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;  

public class lab9Applet  extends JApplet     {

	JButton b;  
	JTextField tf; 
	JTextField tf2;
	public void init()
	{
		tf=new JTextField(20);  
			//tf.setBounds(100,20,125,20);  
		tf2=new JTextField(20);  
		//tf2.setBounds(100,80,125,20);  

		b=new JButton("Click");  
			//b.setBounds(100,150,70,40);  

		add(b);
		add(tf);
		add(tf2);
		//repaint();
	}
	public void paint(Graphics f)
	{
		f.drawString("Zahid", 30, 30);
	}
}