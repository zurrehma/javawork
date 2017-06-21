package gui;
import java.applet.*;  
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;  

public class lab9Applet  extends JApplet implements ActionListener     {

	JButton b;  
	JTextField tf; 
	JTextField tf2;
	JTextField tf3;
	public void paint(Graphics g)
	{
		tf=new JTextField(20);  
		tf.setBounds(50,20,125,20);  
		tf2=new JTextField(20);  
		tf2.setBounds(50,40,125,20);  
		tf3=new JTextField(20);  
		tf3.setBounds(50,100,125,20);
		tf3.setVisible(false);
		  
		b=new JButton("Click");  
		b.setBounds(50,150,70,40);  
		  
		add(b);
		add(tf);
		add(tf2);
		add(tf3);
		
		//setLayout(null);
		b.addActionListener(this);
		System.out.println("hello");
//		g.draw3DRect(25, 25, 100, 40, true);
//		
//		g.fillRect(12, 12, 100, 40);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		float tf1value=Float.parseFloat(tf.getText());
		float tf2value=Float.parseFloat(tf2.getText());
		float tf3value=tf1value+tf2value;
		tf.setVisible(false);
		tf2.setVisible(false);
		tf3.setText("the sum is"+tf3value);
		tf3.setVisible(true);
		b.setVisible(false);
		
	
		
	}
	
}
