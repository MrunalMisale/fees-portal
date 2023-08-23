import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;

public class FeesPortal {

	private JFrame frmStudentFeesManagement;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeesPortal window = new FeesPortal();
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
	public FeesPortal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JLayeredPane layeredPane;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	
	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	private void initialize() {
		frmStudentFeesManagement = new JFrame();
		frmStudentFeesManagement.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\it360\\Downloads\\notebook.png"));
		frmStudentFeesManagement.setTitle("Student Fees Management System");
		frmStudentFeesManagement.getContentPane().setForeground(Color.BLACK);
		frmStudentFeesManagement.setBounds(100, 100, 500, 500);
		frmStudentFeesManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentFeesManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEES PORTAL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(145, 11, 194, 32);
		frmStudentFeesManagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to FEE Portal");
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(160, 43, 163, 14);
		frmStudentFeesManagement.getContentPane().add(lblNewLabel_1);
		
		layeredPane = new JLayeredPane();//Changes
		layeredPane.setBackground(new Color(0, 0, 0));
		layeredPane.setBounds(36, 204, 411, 216);
		frmStudentFeesManagement.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel, "name_357135773537800");
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Please Choose an Account.");
		lblNewLabel_2.setBounds(114, 97, 182, 22);
		lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel_1, "name_352088004934900");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(61, 45, 56, 20);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(142, 46, 212, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(61, 75, 56, 20);
		panel_1.add(lblNewLabel_3_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(142, 76, 212, 19);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(133, 106, 144, 14);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				if(name.equals("admin")&&password.equals("admin123")){
					String s[]={};
					Admin.main(s);
					frmStudentFeesManagement.dispose();
				}else{
					lblNewLabel_4.setText("Invalid Username or Password.");
					//JOptionPane.showMessageDialog(null,"Invalid Username or Password Error.");
					textField.setText("");passwordField.setText("");
				}
			}
		});
		btnNewButton.setBounds(161, 134, 89, 23);
		panel_1.add(btnNewButton);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel_2, "name_352092532779400");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3_2 = new JLabel("User ID");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_3_2.setBounds(61, 45, 56, 20);
		panel_2.add(lblNewLabel_3_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(142, 46, 212, 20);
		panel_2.add(textField_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Password");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_3_1_1.setBounds(61, 75, 56, 20);
		panel_2.add(lblNewLabel_3_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(142, 76, 212, 19);
		panel_2.add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(109, 109, 178, 14);
		panel_2.add(lblNewLabel_5);
		
		
		JButton btnNewButton_2 = new JButton("Login");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField_1.getText();
				String password=String.valueOf(passwordField_1.getPassword());
				boolean status=DatabaseConn.validate(name, password);
				if(status){
					String s[]={};
					AccountantPage.main(s);
					//AccountantPage.main(String[]);
					frmStudentFeesManagement.dispose();
				}else{
					lblNewLabel_5.setText("Invalid Username, Password.");
					//JOptionPane.showMessageDialog(AccountantLogin.this,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_2.setBounds(161, 134, 89, 23);
		panel_2.add(btnNewButton_2);
		
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(36, 105, 411, 70);
		frmStudentFeesManagement.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Accountant");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_2);
			}
		});
		btnNewButton_1.setBounds(254, 22, 125, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Admin");
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
			}
		});
		btnNewButton_1_1.setBounds(25, 22, 125, 23);
		panel_3.add(btnNewButton_1_1);
		
	
		
		/*textField_2.setBounds(59, 53, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);*/
	}
}
