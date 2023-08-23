import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Admin extends FeesPortal {

	private JFrame frmStudentFeesManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.frmStudentFeesManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JLayeredPane layeredPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	//Override method
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	
	private void initialize() {
		frmStudentFeesManagement = new JFrame();
		frmStudentFeesManagement.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\it360\\Downloads\\notebook.png"));
		frmStudentFeesManagement.setTitle("Student Fees Management System - Admin");
		frmStudentFeesManagement.setBounds(100, 100, 500, 500);
		frmStudentFeesManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentFeesManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEES PORTAL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(145, 11, 194, 32);
		frmStudentFeesManagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Section");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(160, 43, 163, 14);
		frmStudentFeesManagement.getContentPane().add(lblNewLabel_1);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(196, 95, 251, 329);
		frmStudentFeesManagement.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_0 = new JPanel();
		panel_0.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel_0, "name_397576548725100");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel_1, "name_397583230034800");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Accountant Details");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(44, 11, 163, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 49, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField.setBounds(79, 47, 151, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 79, 57, 14);
		panel_1.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(79, 77, 151, 20);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 109, 57, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contact No.");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 139, 70, 14);
		panel_1.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(79, 107, 151, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(79, 137, 151, 20);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(44, 168, 163, 14);
		panel_1.add(lblNewLabel_7);
		
		JButton btnNewButton_3 = new JButton("Add");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				String email=textField_1.getText();
				String contact=textField_2.getText();
				
				Accountant a=new Accountant(name,password,email,contact);
				int status=DatabaseConn.save(a);
				
				if(status>0){
					//JOptionPane.showMessageDialog(AddAccountant.this,"Accountant added successfully!");
					lblNewLabel_7.setText("Added Successfully!");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					passwordField.setText("");
				}else{
					//JOptionPane.showMessageDialog(AddAccountant.this,"Sorry, Unable to add Accountant!");
					lblNewLabel_7.setText("Error Occured.");
				}
			}
			}
		);
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_3.setBounds(81, 212, 89, 23);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel_2, "name_397586304012800");
		
		JButton btnNewButton = new JButton("Add Accountant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton.setBounds(29, 95, 134, 23);
		frmStudentFeesManagement.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Accountant");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_2);
				ViewAccountant.main(new String[]{});
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_1.setBounds(29, 155, 134, 23);
		frmStudentFeesManagement.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeesPortal.main(new String[]{});
				frmStudentFeesManagement.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_2.setBounds(29, 215, 134, 23);
		frmStudentFeesManagement.getContentPane().add(btnNewButton_2);
	}
}
