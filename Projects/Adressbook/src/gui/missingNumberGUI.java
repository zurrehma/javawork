package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class missingNumberGUI  {

	private JFrame frame;
	JButton[] button = new JButton[15];
	
	public missingNumberGUI() {
		initialize();
		frame.setVisible(true);
	}

	
	private void initialize() {
		int height=600;
		frame = new JFrame();
		frame.setBounds(100, 100, 450, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, height);
		panel.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2,4));
		
		
		
		
		
		
		
		String[] btn={"1","2","3","4","5",""};
		for(int i=0;i<btn.length;i++){
			
			button[i]=new JButton(""+btn[i]);
			button[i].addActionListener(new listner());
			panel.add(button[i]);
		}
//		button[0].addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				button[5].setText(button[0].getText());
//				button[0].setText(null);
//			}
//		});
		
	}
//	public void action(){
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
//	}
}
