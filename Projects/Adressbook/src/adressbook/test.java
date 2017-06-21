package adressbook;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class test  {

	AddressBook object=new AddressBook();
	
	public JFrame frame;
	public JTextField tfName;
	public JTextField tlName;
	public JTextField taD;
	public JTextField tZip;
	public JTextField tPNumber;
    public JButton enterButton;
    public JButton btnPrint;
    public JButton btnEdit;
    public JButton btnDelete;
    public JButton btnAdd;
    public JTextArea txtArea;
   // public JTable table;
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);

   
   
   

	
	public test() {


		//initialize();
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		


		JLabel lblaB = new JLabel("Address Book");
		lblaB.setIcon(new ImageIcon("C:\\Users\\zahid\\Desktop\\images (1).jpg"));
		lblaB.setFont(new Font("MingLiU", Font.BOLD | Font.ITALIC, 15));
		lblaB.setBounds(253, 11, 241, 56);
		lblaB.setForeground(Color.red);
		frame.getContentPane().add(lblaB);

		JLabel lblFN = new JLabel("First Name");
		lblFN.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFN.setBounds(20, 110, 94, 14);
		frame.getContentPane().add(lblFN);
		
		JLabel lblZip = new JLabel("zip");
		lblZip.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblZip.setBounds(20, 197, 54, 20);
		frame.getContentPane().add(lblZip);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhoneNumber.setBounds(20, 233, 76, 14);
		frame.getContentPane().add(lblPhoneNumber);

		tfName = new JTextField();
		tfName.setBounds(95, 107, 119, 20);
		frame.getContentPane().add(tfName);
		tfName.setColumns(10);
		//tfName.setText("hello");

		JLabel lblLN = new JLabel("Last Name");
		lblLN.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLN.setBounds(20, 135, 63, 14);
		frame.getContentPane().add(lblLN);

		tlName = new JTextField();
		tlName.setBounds(95, 135, 119, 20);
		frame.getContentPane().add(tlName);
		tlName.setColumns(10);

		JLabel lblad = new JLabel("Address");
		lblad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblad.setBounds(20, 160, 63, 26);
		frame.getContentPane().add(lblad);

		taD = new JTextField();
		taD.setBounds(95, 163, 119, 23);
		frame.getContentPane().add(taD);
		taD.setColumns(10);
		
		tZip = new JTextField();
		tZip.setBounds(95, 197, 119, 20);
		frame.getContentPane().add(tZip);
		tZip.setColumns(10);
		
		tPNumber = new JTextField();
		tPNumber.setBounds(93, 228, 121, 20);
		frame.getContentPane().add(tPNumber);
		tPNumber.setColumns(10);

		 enterButton = new JButton(" enter");
		enterButton.setForeground(Color.RED);
		enterButton.setBackground(Color.BLACK);
		enterButton.setIcon(new ImageIcon(test.class.getResource("/com/sun/javafx/scene/control/skin/caspian/images/enter-icon.png")));
		
		enterButton.setBounds(253, 310, 107, 31);
		frame.getContentPane().add(enterButton);
		
		btnPrint = new JButton("print");
		
		btnPrint.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnPrint.setBounds(393, 106, 89, 23);
		frame.getContentPane().add(btnPrint);
		
		btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnEdit.setBounds(393, 135, 89, 23);
		frame.getContentPane().add(btnEdit);
		
		btnDelete = new JButton("Delete");
		
		btnDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnDelete.setBounds(393, 162, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		btnAdd = new JButton("Add");
		
		btnAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnAdd.setBounds(393, 78, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		 model.addColumn("Col1");
		    model.addColumn("Col2");

		    model.addRow(new Object[] { "v1", "v2" });

		    model.addRow(new Object[] { "v1" });

		    model.addRow(new Object[] { "v1", "v2", "v3" });
		 frame.add(new JScrollPane(table));
//		table = new JTable();
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null},
//				
//			},
//			new String[] {
//				"New column", "New column"
//			}
//		));
//		table.setBounds(412, 410, 142, 37);
		//frame.getContentPane().add(table);
		
		//table = new JTable();
		
		//table.setModel(null);
		
		
		
		
		
		
		
		
//	
		testbutton();
	}

	

	public void testbutton(){
//		enterButton.addActionListener(new ActionListener() 
//			 {
//				public void actionPerformed(ActionEvent arg0) {
//					
//					String fN=tfName.getText();
//					String lN=tlName.getText();
//					String ad=taD.getText();
//					String zip =tZip.getText();
//					String pN =tPNumber.getText();
//				    object.add(fN,lN,ad,zip,pN);
//					
//				}
//			});
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				object.print();
                
			}
		});
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tlName.setEditable(false);
				taD.setEditable(false);
				tZip.setEditable(false);
				tPNumber.setEditable(false);
				
				
				enterButton.addActionListener(new ActionListener() 
				 {
					public void actionPerformed(ActionEvent arg0) {
						
						String fN=tfName.getText();
						//object.deleteContact(fN);
					    object.deleteContact(fN);
						
					}
				});
				
			}
		});
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tlName.setEditable(true);
				taD.setEditable(true);
				tZip.setEditable(true);
				tPNumber.setEditable(true);
				String fN=tfName.getText();
				String lN=tlName.getText();
				String ad=taD.getText();
				String zip =tZip.getText();
				String pN =tPNumber.getText();
			    object.add(fN,lN,ad,zip,pN);
				table.add(tfName, new Object[]{fN,lN});
				
			    //object.add(fN,lN,ad,zip,pN);
//			    enterButton.addActionListener(new ActionListener() 
//				 {
//					public void actionPerformed(ActionEvent arg0) {
//						
//						String fN=tfName.getText();
//						String lN=tlName.getText();
//						String ad=taD.getText();
//						String zip =tZip.getText();
//						String pN =tPNumber.getText();
//					    object.add(fN,lN,ad,zip,pN);
//					    System.out.println("sas");
//						
//					}
//				});
			}
		});
		
	}
	}
		

	//}



	
	
