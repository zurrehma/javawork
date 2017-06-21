package gui;

import java.awt.Color;

import javax.swing.*;

public class cal extends JFrame {
	public cal(){
		JFrame jf=new JFrame("calculator");
		jf.setSize(300, 300);
		jf.setLayout(null);
		JPanel jp=new JPanel();
		
		JPanel jp1=new JPanel();
		jp1.setBackground(Color.BLUE);
//		jp.setSize(width, height);
//		JButton jb=new JButton("1");
//		jb.setSize(50, 30);
//		jf.add(jb
		jf.add(jp);
		jf.add(jp1);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     //new cal();
	     test t1=new test();
	     t1.frame.setVisible(true);
	}

}
