import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import java.awt.Toolkit;

public class AccountantPage extends FeesPortal {

	private JFrame frmStudentFeesManagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantPage window = new AccountantPage();
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
	public AccountantPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JPanel panel_no = new JPanel();
	JLayeredPane layeredPane;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	private void initialize() {
		frmStudentFeesManagement = new JFrame();
		frmStudentFeesManagement.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\it360\\Downloads\\notebook.png"));
		frmStudentFeesManagement.setTitle("Student Fees Management System - Accountant");
		frmStudentFeesManagement.setBounds(100, 100, 500, 500);
		frmStudentFeesManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentFeesManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEES PORTAL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(145, 11, 194, 32);
		frmStudentFeesManagement.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Accountant Section");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(160, 43, 163, 14);
		frmStudentFeesManagement.getContentPane().add(lblNewLabel_1);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(196, 95, 251, 329);
		frmStudentFeesManagement.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel, "name_423711728062500");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel_1, "name_423715050742900");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Student Details");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(44, 11, 163, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 48, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(63, 45, 178, 20);
		panel_1.add(textField);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 78, 57, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Course");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 108, 57, 14);
		panel_1.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(63, 105, 178, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_6 = new JLabel("Fee");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 138, 35, 14);
		panel_1.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(63, 135, 68, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_3.setBounds(63, 78, 178, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Paid");
		lblNewLabel_7.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(139, 138, 35, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Due");
		lblNewLabel_8.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(139, 163, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_4.setBounds(173, 135, 68, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Address");
		lblNewLabel_9.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(10, 188, 46, 14);
		panel_1.add(lblNewLabel_9);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textArea.setBounds(63, 188, 178, 55);
		panel_1.add(textArea);
		
		JLabel lblNewLabel_10 = new JLabel("Contact");
		lblNewLabel_10.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(10, 163, 46, 14);
		panel_1.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_5.setBounds(63, 161, 68, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int fee1=Integer.parseInt(textField_2.getText());
				int paid1=Integer.parseInt(textField_4.getText());
				int due= fee1- paid1;
				textField_6.setText(String.valueOf(due));
			}
		});
		textField_6.setEditable(false);
		textField_6.setBounds(173, 161, 68, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(68, 254, 114, 14);
		panel_1.add(lblNewLabel_11);
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String email=textField_3.getText();
				String course=textField_1.getText();
				int fee=Integer.parseInt(textField_2.getText());
				int paid=Integer.parseInt(textField_4.getText());
				String address=textArea.getText();
				String contactno=textField_5.getText();
				int due=fee-paid;
				Student s=new Student(name,email,course,fee,paid, due,address,contactno);
				int status=DatabaseConn_2.save(s);
				
				if(status>0){
					lblNewLabel_11.setText("Added Successfully!");
					//JOptionPane.showMessageDialog(AddStudent.this,"Student added successfully!");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					textField_3.setText("");textField_4.setText("");textField_5.setText("");
					textField_6.setText("");textArea.setText("");
				}else{
					lblNewLabel_11.setText("Sorry, Unable to Add Student!");
					//JOptionPane.showMessageDialog(Add.this,"Sorry, Unable to add student!");
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setBounds(81, 283, 89, 23);
		panel_1.add(btnNewButton);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		layeredPane.add(panel_2, "name_430099558465500");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Student Details");
		lblNewLabel_2_1.setBounds(44, 11, 163, 14);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_12 = new JLabel("Roll No.");
		lblNewLabel_12.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(10, 38, 46, 14);
		panel_2.add(lblNewLabel_12);
		
		textField_7 = new JTextField();
		textField_7.setBounds(60, 36, 46, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setBounds(44, 259, 163, 14);
		panel_2.add(lblNewLabel_20);
		
		JButton btnNewButton_4 = new JButton("Load");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String srollno=textField_7.getText();
				if(srollno==null||srollno.trim().equals("")){
					lblNewLabel_20.setText("Please Enter Roll No. first!");
				}else{
				int rollno=Integer.parseInt(srollno);
				Student s=DatabaseConn_2.getStudentByRollno(rollno);
				textField_8.setText(s.getName());
				textField_9.setText(s.getEmail());
				textField_10.setText(s.getCourse());
				textField_13.setText(String.valueOf(s.getFee()));
				textField_12.setText(String.valueOf(s.getPaid()));
				textField_14.setText(String.valueOf(s.getDue()));
				textField_11.setText(s.getContactno());
				}
			}
		});
		btnNewButton_4.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_4.setBounds(163, 34, 73, 23);
		panel_2.add(btnNewButton_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 63, 231, 2);
		panel_2.add(separator);
		
		JLabel lblNewLabel_13 = new JLabel("Name");
		lblNewLabel_13.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_13.setBounds(10, 73, 46, 14);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Email");
		lblNewLabel_14.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_14.setBounds(10, 103, 46, 14);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Course");
		lblNewLabel_15.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_15.setBounds(10, 133, 46, 14);
		panel_2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Contact");
		lblNewLabel_16.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_16.setBounds(10, 163, 46, 14);
		panel_2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Paid");
		lblNewLabel_17.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_17.setBounds(124, 200, 46, 14);
		panel_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Fee");
		lblNewLabel_18.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_18.setBounds(10, 200, 46, 14);
		panel_2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Due");
		lblNewLabel_19.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		lblNewLabel_19.setBounds(10, 230, 46, 14);
		panel_2.add(lblNewLabel_19);
		
		textField_8 = new JTextField();
		textField_8.setBounds(56, 71, 170, 20);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(56, 101, 170, 20);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(56, 131, 170, 20);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(56, 161, 65, 20);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(163, 198, 64, 20);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(56, 198, 65, 20);
		panel_2.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int fee1=Integer.parseInt(textField_13.getText());
				int paid1=Integer.parseInt(textField_12.getText());
				int due= fee1- paid1;
				textField_14.setText(String.valueOf(due));
			}
		});
		textField_14.setBounds(56, 228, 65, 20);
		panel_2.add(textField_14);
		textField_14.setColumns(10);
		
		
		
		JButton btnNewButton_5 = new JButton("Update");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField_8.getText();
				String email=textField_9.getText();
				String course=textField_10.getText();
				int fee=Integer.parseInt(textField_13.getText());
				int paid=Integer.parseInt(textField_12.getText());
				int due=Integer.parseInt(textField_14.getText());
				String contactno=textField_11.getText();
				int rollno=Integer.parseInt(textField_7.getText());
				
				Student s=new Student(rollno,name,email,course,fee,paid,due,contactno);
				int status=DatabaseConn_2.update(s);
				
				if(status>0){
					
					AccountantPage.main(new String[]{});
					frmStudentFeesManagement.dispose();
				}else{
					//JOptionPane.showMessageDialog(EditStudent.this,"Sorry, Unable to add student!");
				}
			}
		});
		btnNewButton_5.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnNewButton_5.setBounds(81, 280, 89, 23);
		panel_2.add(btnNewButton_5);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 189, 231, 2);
		panel_2.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 255, 231, 2);
		panel_2.add(separator_2);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
			}
		});
		btnAddStudent.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnAddStudent.setBounds(29, 95, 134, 23);
		frmStudentFeesManagement.getContentPane().add(btnAddStudent);
		
		JButton btnNewButton_1 = new JButton("Edit Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_2);
				
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_1.setBounds(29, 155, 134, 23);
		frmStudentFeesManagement.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Student");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent.main(new String[]{});
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_2.setBounds(29, 215, 134, 23);
		frmStudentFeesManagement.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Due Report");
		btnNewButton_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DueFee.main(new String[]{});
			}
		});
		btnNewButton_3.setBounds(29, 275, 134, 23);
		frmStudentFeesManagement.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_2_1 = new JButton("Logout");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeesPortal.main(new String[]{});
			}
		});
		btnNewButton_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_2_1.setBounds(29, 348, 134, 23);
		frmStudentFeesManagement.getContentPane().add(btnNewButton_2_1);
	}
}
