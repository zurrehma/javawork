package gui;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import java.awt.SystemColor;

public class test {

	public JFrame frame;
	private JTextField textField;
	private JTextField LowerBarTF;

	public test() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(50, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 284, 362);
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JPanel panelTopBar = new JPanel();
		panelTopBar.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTopBar.setBounds(0, 0, 284, 21);
		panelTopBar.setLayout(null);
		panel.add(panelTopBar);
		
		JLabel lblView = new JLabel("View");
		lblView.setForeground(Color.LIGHT_GRAY);
		lblView.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblView.setBounds(10, 0, 46, 21);
		panelTopBar.add(lblView);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEdit.setForeground(Color.LIGHT_GRAY);
		lblEdit.setBounds(51, 3, 46, 14);
		panelTopBar.add(lblEdit);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setForeground(Color.LIGHT_GRAY);
		lblHelp.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHelp.setBounds(87, 0, 52, 21);
		panelTopBar.add(lblHelp);
		
		JPanel panelLowerbar = new JPanel();
		panelLowerbar.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelLowerbar.setBounds(10, 21, 264, 330);
		panelLowerbar.setLayout(null);
		panel.add(panelLowerbar);
		
		LowerBarTF = new JTextField();
		LowerBarTF.setBackground(SystemColor.controlHighlight);
		LowerBarTF.setForeground(SystemColor.desktop);
		LowerBarTF.setBounds(10, 21, 244, 46);
		LowerBarTF.setColumns(10);
		panelLowerbar.add(LowerBarTF);
		
		
		
	}
}
