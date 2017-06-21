package upcastanddowncast;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	public JFrame frame;
	private JTextField firstTextField;
	private JTextField SecondTextField;
	private JTextField AnswerField;
	public JButton addButton;
	private JButton subButton;
	private JButton divButton;
	private JButton btnX;
	private JLabel lblCalculator;

	
	public calculator() {
		initialize();
	}

	
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstNumber = new JLabel("first Number");
		lblFirstNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblFirstNumber.setBounds(10, 64, 89, 14);
		frame.getContentPane().add(lblFirstNumber);
		
		firstTextField = new JTextField();
		firstTextField.setBounds(127, 62, 89, 20);
		frame.getContentPane().add(firstTextField);
		firstTextField.setColumns(10);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSecondNumber.setBounds(10, 102, 107, 14);
		frame.getContentPane().add(lblSecondNumber);
		
		SecondTextField = new JTextField();
		SecondTextField.setBounds(127, 100, 89, 20);
		frame.getContentPane().add(SecondTextField);
		SecondTextField.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblAnswer.setBounds(10, 156, 82, 14);
		frame.getContentPane().add(lblAnswer);
		
		AnswerField = new JTextField();
		AnswerField.setBounds(127, 145, 89, 31);
		frame.getContentPane().add(AnswerField);
		AnswerField.setColumns(10);
		
		 addButton = new JButton("+");
		
		addButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		addButton.setBounds(303, 61, 69, 23);
		frame.getContentPane().add(addButton);
		
		subButton = new JButton("-");
		
		subButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		subButton.setBounds(303, 95, 69, 23);
		frame.getContentPane().add(subButton);
		
		divButton = new JButton("/");
		
		divButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		divButton.setBounds(303, 129, 69, 23);
		frame.getContentPane().add(divButton);
		
		btnX = new JButton("x");
		
		btnX.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnX.setBounds(303, 163, 69, 23);
		frame.getContentPane().add(btnX);
		
		lblCalculator = new JLabel("Calculator");
		lblCalculator.setForeground(Color.BLUE);
		lblCalculator.setFont(new Font("Goudy Old Style", Font.BOLD, 27));
		lblCalculator.setBounds(135, 11, 160, 31);
		frame.getContentPane().add(lblCalculator);
	    action();
	    
	}
	public void action(){
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int fN=Integer.parseInt(firstTextField.getText());
				int lN=Integer.parseInt(SecondTextField.getText());
				int ans=fN+lN;
				AnswerField.setText(Integer.toString(ans));
				
			}
		});
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int fN=Integer.parseInt(firstTextField.getText());
				int lN=Integer.parseInt(SecondTextField.getText());
				int ans=fN-lN;
				AnswerField.setText(Integer.toString(ans));
			}
		});
		divButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int fN=Integer.parseInt(firstTextField.getText());
				int lN=Integer.parseInt(SecondTextField.getText());
				int ans=fN/lN;
				AnswerField.setText(Integer.toString(ans));
			}
		});
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int fN=Integer.parseInt(firstTextField.getText());
				int lN=Integer.parseInt(SecondTextField.getText());
				int ans=fN*lN;
				AnswerField.setText(Integer.toString(ans));
			}
		});
	}
public static void main(String[] args){
	calculator obj=new calculator();
	obj.frame.setVisible(true);
}
}
