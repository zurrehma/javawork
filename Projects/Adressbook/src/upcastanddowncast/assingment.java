package upcastanddowncast;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class assingment {

	public JFrame frame;
	public JTextArea textArea;
	public JButton writeButton;
	public JButton doneButton;
	public JButton btnSearch;
	public JTextField searchtextField;

	String text;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		btnSearch = new JButton("search");
		
		panel.add(btnSearch);
		
//			
		searchtextField = new JTextField();
		panel.add(searchtextField);
		searchtextField.setColumns(10);
//		if(textArea==null)
//		{
//			searchtextField.setEditable(false);
//		}
		
		doneButton = new JButton("done");
		
		doneButton.setVerticalAlignment(SwingConstants.TOP);
		panel.add(doneButton);
		
		writeButton = new JButton("write");
		writeButton.setHorizontalAlignment(SwingConstants.LEFT);
		
		panel.add(writeButton);
		
		textArea = new JTextArea();
		textArea.setRows(20);
		textArea.setColumns(60);
		panel.add(textArea);
		textArea.setEditable(false);
		actions();
	}
	public void actions(){
		
		writeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setEditable(true);
				//textArea.setForeground(Color.blue);
				
			}
		});
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  text=textArea.getText();
				 //System.out.println(text);
			}
		});
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String regex=searchtextField.getText();
				Pattern pattern=Pattern.compile(regex);
				Matcher m=pattern.matcher(text);
				int counter=0;
				String find="";
				while(m.find())
					{
						 find=m.group();
						//System.out.println(m.group());
						counter++;
					}
				if(counter>0){
					textArea.setText(text+"       "+"[ "+find+" founded "+counter+" times ]");
				}
				if(counter==0){
					textArea.setText(text+"       "+"[no match found]");
				}
			}
		});
	}

}
