import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Home {

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_10;
	public JTextField textField_11;
	public JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_30;
	private JTextField textField_28;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_29;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_45;
	private JTextField textField_49;
	private JTextField textField_44;
	private JTextField textField_50;
	private JTable table;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public Home() throws SQLException {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		// To calculate the current year 
		Year currentYear = Year.now();
		
		/* JDBC connection & query
		String url = "jdbc:mysql://85.10.205.173:3306/zetatech1";
		String userName = "zetarms1";
		String passWord = "zeta87654321";
		
		 String query = "select *from student_details_main where Reg_ID = 1";
    	 Connection con = DriverManager.getConnection(url,userName,passWord);
     	 Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(query);
         while(rs.next()) {
        	 System.out.print(rs.getString(2));
         }   
         */
		
		frame = new JFrame();
     	frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);		
		JPanel Navbar = new JPanel();
		Navbar.setBackground(new Color(0, 133, 255));
		
		JPanel Footer = new JPanel();
		Footer.setBorder(new LineBorder(new Color(192, 192, 192)));
		Footer.setBackground(new Color(240, 240, 240));
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel = new JLabel("CO & PO ATTAINMENT SYSTEM - PPG IT");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(148)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(Navbar, GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
				.addComponent(Footer, GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
					.addGap(9))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Navbar, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Footer, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(0))
		);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel HomeScreen = new JPanel();
		HomeScreen.setBackground(new Color(255, 255, 255));
		layeredPane.add(HomeScreen, "name_527794953976099");
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(192, 192, 192)));
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(new Color(255, 255, 255));
		panel_8_1.setBorder(new LineBorder(new Color(200, 200, 200)));
		GroupLayout gl_HomeScreen = new GroupLayout(HomeScreen);
		gl_HomeScreen.setHorizontalGroup(
			gl_HomeScreen.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_8, GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
				.addComponent(panel_8_1, GroupLayout.DEFAULT_SIZE, 1333, Short.MAX_VALUE)
		);
		gl_HomeScreen.setVerticalGroup(
			gl_HomeScreen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HomeScreen.createSequentialGroup()
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_8_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(422, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_8 = new JLabel("PPG INSTITUTE OF TECHNOLOGY");
		lblNewLabel_8.setForeground(new Color(64, 0, 128));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JLabel lblNewLabel_8_1 = new JLabel("Approved by AICTE , New Delhi , Affiliated to Anna University , Chennai");
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Recognized by UGC & Accredited by NAAC , IS0 9001:2015 Certified Institution");
		lblNewLabel_8_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setIcon(new ImageIcon(Home.class.getResource("/images/new_logo-removebg-preview.png")));
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(new ImageIcon(Home.class.getResource("/images/grp-removebg-preview.png")));
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.LEFT);
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGap(302)
					.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
						.addComponent(lblNewLabel_8_1, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
						.addComponent(lblNewLabel_8_1_1, GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_9_1, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
					.addGap(295))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(lblNewLabel_8_1_1))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGap(26)
							.addComponent(lblNewLabel_8_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
				.addGroup(gl_panel_8.createSequentialGroup()
					.addComponent(lblNewLabel_9_1, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_8.createSequentialGroup()
					.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_8.setLayout(gl_panel_8);
		panel_8_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Welcome , Admin27");
		lblNewLabel_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		lblNewLabel_7.setBounds(8, 10, 328, 23);
		panel_8_1.add(lblNewLabel_7);
		HomeScreen.setLayout(gl_HomeScreen);
		
		JPanel AddStudent = new JPanel();
		AddStudent.setBackground(new Color(255, 255, 255));
		layeredPane.add(AddStudent, "name_527835372818400");
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel_11.setBackground(Color.WHITE);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_4.setBounds(10, 57, 163, 27);
		panel_11.add(comboBox_4);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1_2.setBounds(199, 57, 163, 27);
		panel_11.add(comboBox_1_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Branch");
		lblNewLabel_2_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(10, 25, 91, 27);
		panel_11.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Stream");
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(10, 94, 91, 27);
		panel_11.add(lblNewLabel_2_1_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_2_1.setBounds(10, 126, 163, 27);
		panel_11.add(comboBox_2_1);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Semester");
		lblNewLabel_2_2_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_3.setBounds(199, 25, 91, 27);
		panel_11.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_2_1_3 = new JLabel("Year");
		lblNewLabel_2_2_1_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_3.setBounds(199, 94, 91, 27);
		panel_11.add(lblNewLabel_2_2_1_3);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1_1_1.setBounds(199, 126, 163, 27);
		panel_11.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Select The Details");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setForeground(Color.BLACK);
		lblNewLabel_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3_3.setBounds(10, 0, 352, 27);
		panel_11.add(lblNewLabel_3_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel_1_1.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Student Details Preview");
		lblNewLabel_3_1_2.setBounds(0, 0, 371, 27);
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_2.setForeground(Color.BLACK);
		lblNewLabel_3_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_1_2.setBackground(Color.LIGHT_GRAY);
		
		textField_38 = new JTextField();
		textField_38.setBounds(109, 149, 248, 31);
		textField_38.setColumns(10);
		textField_38.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		
		textField_39 = new JTextField();
		textField_39.setBounds(109, 111, 248, 32);
		textField_39.setColumns(10);
		textField_39.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		
		textField_40 = new JTextField();
		textField_40.setBounds(109, 227, 248, 31);
		textField_40.setColumns(10);
		textField_40.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		
		textField_41 = new JTextField();
		textField_41.setBounds(109, 189, 248, 32);
		textField_41.setColumns(10);
		textField_41.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		
		textField_42 = new JTextField();
		textField_42.setBounds(109, 303, 248, 31);
		textField_42.setColumns(10);
		textField_42.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		
		textField_43 = new JTextField();
		textField_43.setBounds(109, 265, 248, 32);
		textField_43.setColumns(10);
		textField_43.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Branch");
		lblNewLabel_2_3_1.setBounds(0, 186, 101, 32);
		lblNewLabel_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("Year");
		lblNewLabel_2_3_1_1.setBounds(0, 227, 99, 32);
		lblNewLabel_2_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_3_1_2 = new JLabel("Email");
		lblNewLabel_2_3_1_2.setBounds(0, 265, 99, 32);
		lblNewLabel_2_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_3_1_3 = new JLabel("Date of Birth");
		lblNewLabel_2_3_1_3.setBounds(0, 303, 99, 32);
		lblNewLabel_2_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_3_1_4 = new JLabel("Name");
		lblNewLabel_2_3_1_4.setBounds(7, 148, 94, 32);
		lblNewLabel_2_3_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_3_1_5 = new JLabel("Register ID");
		lblNewLabel_2_3_1_5.setBounds(7, 110, 94, 32);
		lblNewLabel_2_3_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1_5.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel_11_1.setBackground(new Color(240, 240, 240));
		
		JLabel lblNewLabel_2_3_1_5_1_3 = new JLabel("Register ID");
		lblNewLabel_2_3_1_5_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3_1_5_1_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBorder(new LineBorder(new Color(192, 192, 192)));
		
		JLabel lblNewLabel_2_3_1_5_1_5 = new JLabel("DOB");
		lblNewLabel_2_3_1_5_1_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3_1_5_1_5.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBorder(new LineBorder(new Color(192, 192, 192)));
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Student Regitration From");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_3_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_2_3_1_5_1_3_1 = new JLabel("Name");
		lblNewLabel_2_3_1_5_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3_1_5_1_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBorder(new LineBorder(new Color(192, 192, 192)));
		
		JLabel lblNewLabel_2_3_1_5_1_3_2 = new JLabel("Email ID");
		lblNewLabel_2_3_1_5_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3_1_5_1_3_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBorder(new LineBorder(new Color(192, 192, 192)));
		
		JLabel lblNewLabel_2_3_1_5_1_3_1_1 = new JLabel("Batch");
		lblNewLabel_2_3_1_5_1_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3_1_5_1_3_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		panel_1_1.setLayout(null);
		panel_1_1.add(lblNewLabel_3_1_2);
		panel_1_1.add(lblNewLabel_2_3_1_4);
		panel_1_1.add(textField_38);
		panel_1_1.add(lblNewLabel_2_3_1_5);
		panel_1_1.add(textField_39);
		panel_1_1.add(lblNewLabel_2_3_1);
		panel_1_1.add(lblNewLabel_2_3_1_1);
		panel_1_1.add(textField_40);
		panel_1_1.add(textField_41);
		panel_1_1.add(lblNewLabel_2_3_1_2);
		panel_1_1.add(lblNewLabel_2_3_1_3);
		panel_1_1.add(textField_43);
		panel_1_1.add(textField_42);
		
		JButton btnNewButton_2_1_2_2 = new JButton("Save Details");
		btnNewButton_2_1_2_2.setBounds(235, 345, 122, 32);
		panel_1_1.add(btnNewButton_2_1_2_2);
		btnNewButton_2_1_2_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JButton btnNewButton_2_1_1_1 = new JButton("Preview");
		btnNewButton_2_1_1_1.setBounds(109, 345, 118, 32);
		panel_1_1.add(btnNewButton_2_1_1_1);
		btnNewButton_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_11 = new JLabel("Photo");
		lblNewLabel_11.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(10, 29, 94, 71);
		panel_1_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_2_3_1_5_1_1 = new JLabel("Register ID");
		lblNewLabel_2_3_1_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1_5_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_3_1_5_1_1.setBounds(109, 72, 94, 32);
		panel_1_1.add(lblNewLabel_2_3_1_5_1_1);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		textField_46.setBounds(211, 73, 146, 32);
		panel_1_1.add(textField_46);
		
		JLabel lblNewLabel_2_3_1_5_1_2 = new JLabel("Batch");
		lblNewLabel_2_3_1_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3_1_5_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_3_1_5_1_2.setBounds(109, 37, 94, 32);
		panel_1_1.add(lblNewLabel_2_3_1_5_1_2);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		textField_47.setBounds(211, 38, 146, 32);
		panel_1_1.add(textField_47);
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setRowHeight(24);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Register ID", "Name", "Year", "Branch", "Email"
			}
		));
		scrollPane.setViewportView(table);
		
		JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JButton btnNewButton_2_1_2_2_1 = new JButton("Save");
		btnNewButton_2_1_2_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("Clear");
		btnNewButton_2_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		GroupLayout gl_panel_11_1 = new GroupLayout(panel_11_1);
		gl_panel_11_1.setHorizontalGroup(
			gl_panel_11_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11_1.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panel_11_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11_1.createSequentialGroup()
							.addComponent(textField_45, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(textField_44, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(textField_49, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
							.addGap(11))
						.addGroup(gl_panel_11_1.createSequentialGroup()
							.addGroup(gl_panel_11_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_3_1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_11_1.createSequentialGroup()
									.addComponent(lblNewLabel_2_3_1_5_1_3, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
									.addGap(193))
								.addGroup(Alignment.TRAILING, gl_panel_11_1.createSequentialGroup()
									.addGap(193)
									.addComponent(lblNewLabel_2_3_1_5_1_3_1, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(8)
							.addComponent(lblNewLabel_2_3_1_5_1_5, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
							.addGap(12)))
					.addGroup(gl_panel_11_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_11_1.createSequentialGroup()
							.addComponent(lblNewLabel_2_3_1_5_1_3_2, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_2_3_1_5_1_3_1_1, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
						.addGroup(gl_panel_11_1.createSequentialGroup()
							.addComponent(textField_50, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_1_2_1, 0, 99, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_11_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2_1_2_2_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_11_1.setVerticalGroup(
			gl_panel_11_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11_1.createSequentialGroup()
					.addGroup(gl_panel_11_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_3_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_11_1.createSequentialGroup()
							.addGap(37)
							.addComponent(lblNewLabel_2_3_1_5_1_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_11_1.createSequentialGroup()
							.addGap(37)
							.addComponent(lblNewLabel_2_3_1_5_1_5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_11_1.createSequentialGroup()
							.addGap(37)
							.addGroup(gl_panel_11_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2_3_1_5_1_3_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_11_1.createSequentialGroup()
							.addGap(37)
							.addComponent(lblNewLabel_2_3_1_5_1_3_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_11_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_11_1.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_45, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
							.addComponent(textField_44, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
							.addComponent(textField_49, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
							.addComponent(textField_50, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
							.addComponent(btnNewButton_2_1_2_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_1_2_1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(gl_panel_11_1.createSequentialGroup()
					.addGap(37)
					.addComponent(lblNewLabel_2_3_1_5_1_3_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_11_1.setLayout(gl_panel_11_1);
		GroupLayout gl_AddStudent = new GroupLayout(AddStudent);
		gl_AddStudent.setHorizontalGroup(
			gl_AddStudent.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AddStudent.createSequentialGroup()
					.addGroup(gl_AddStudent.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1_1, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_AddStudent.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_11_1, GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE)))
		);
		gl_AddStudent.setVerticalGroup(
			gl_AddStudent.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AddStudent.createSequentialGroup()
					.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(panel_1_1, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
				.addGroup(gl_AddStudent.createSequentialGroup()
					.addComponent(panel_11_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(scrollPane))
		);
		AddStudent.setLayout(gl_AddStudent);
		
		JPanel AddIATMark = new JPanel();
		AddIATMark.setBackground(new Color(255, 255, 255));
		layeredPane.add(AddIATMark, "name_527839212729800");
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel_1.setBackground(new Color(255, 255, 255));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel_2.setBackground(Color.WHITE);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new LineBorder(new Color(128, 128, 128)));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(128, 128, 128)));
		GroupLayout gl_AddIATMark = new GroupLayout(AddIATMark);
		gl_AddIATMark.setHorizontalGroup(
			gl_AddIATMark.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AddIATMark.createSequentialGroup()
					.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.TRAILING, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_AddIATMark.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
		);
		gl_AddIATMark.setVerticalGroup(
			gl_AddIATMark.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AddIATMark.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
				.addGroup(gl_AddIATMark.createSequentialGroup()
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel_5 = new JLabel("11");
		lblNewLabel_5.setBorder(new LineBorder(new Color(220, 220, 220)));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"--", "CO1", "CO2", "CO3", "CO4", "CO5"}));
		comboBox_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] {"--", "CO1", "CO2", "CO3", "CO4", "CO5"}));
		comboBox_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_1 = new JLabel("12");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_2 = new JLabel("13");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setModel(new DefaultComboBoxModel(new String[] {"--", "CO1", "CO2", "CO3", "CO4", "CO5"}));
		comboBox_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_1_1 = new JLabel("14");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_1_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_1_1 = new JComboBox();
		comboBox_3_1_1.setModel(new DefaultComboBoxModel(new String[] {"--", "CO1", "CO2", "CO3", "CO4", "CO5"}));
		comboBox_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_3 = new JLabel("15");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_3.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_1_1_1 = new JComboBox();
		comboBox_3_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"--", "CO1", "CO2", "CO3", "CO4", "CO5"}));
		comboBox_3_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JComboBox comboBox_3_1_1_1_1 = new JComboBox();
		comboBox_3_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"--", "CO1", "CO2", "CO3", "CO4", "CO5"}));
		comboBox_3_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_3_1 = new JLabel("16");
		lblNewLabel_5_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_3_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JButton btnNewButton_2_1_3 = new JButton("Edit");
		btnNewButton_2_1_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JButton btnNewButton_2_1_4 = new JButton("Save");
		btnNewButton_2_1_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Subject Name");
		lblNewLabel_2_2_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("staff in-charge");
		lblNewLabel_2_2_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_2.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(lblNewLabel_5_3, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(lblNewLabel_5_3_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(btnNewButton_2_1_3, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(lblNewLabel_2_2_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(comboBox_3_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(comboBox_3_2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(comboBox_3_1_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(comboBox_3_1_1_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(comboBox_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(btnNewButton_2_1_4, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(lblNewLabel_2_2_2_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_3_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_1_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_2_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_1_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_1_1_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(1)
							.addComponent(btnNewButton_2_1_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_2_2_2_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(6)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(220, 220, 220)));
		panel_5.setBackground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3_2 = new JLabel("PART - A");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.BLACK);
		lblNewLabel_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_2.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_6_1 = new JLabel("2");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_3 = new JLabel("3");
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_3.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_2 = new JLabel("4");
		lblNewLabel_6_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_2.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_4.setColumns(10);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		panel_5_2.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("PREVIEW");
		lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_2_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("Part A Qn Attended ");
		lblNewLabel_3_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3_2_1_1_1.setBackground(Color.LIGHT_GRAY);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		panel_5_1.setBackground(Color.WHITE);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_3_2_1 = new JLabel("PART - B & C");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_2_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_6_4 = new JLabel("11A");
		lblNewLabel_6_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_4.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_3 = new JLabel("11B");
		lblNewLabel_6_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_3.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_3_1 = new JLabel("12A");
		lblNewLabel_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_3_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_2_1 = new JLabel("12B");
		lblNewLabel_6_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_2_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_6_2_2 = new JLabel("13A");
		lblNewLabel_6_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_2_2.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_1_2 = new JLabel("13B");
		lblNewLabel_6_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_1_2.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_3_2_2 = new JLabel("14A");
		lblNewLabel_6_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_3_2_2.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_2_2_2 = new JLabel("14B");
		lblNewLabel_6_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_2_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_2_2_2.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_2_1_1 = new JLabel("15A");
		lblNewLabel_6_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_2_1_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_1_1_1 = new JLabel("15B");
		lblNewLabel_6_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_1_1_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_6_3_2_1_1 = new JLabel("16A");
		lblNewLabel_6_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_3_2_1_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_2_2_1_1 = new JLabel("16B");
		lblNewLabel_6_1_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_2_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_2_2_1_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBorder(new LineBorder(new Color(220, 220, 220)));
		GroupLayout gl_panel_5_1 = new GroupLayout(panel_5_1);
		gl_panel_5_1.setHorizontalGroup(
			gl_panel_5_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5_1.createSequentialGroup()
							.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(lblNewLabel_6_2_2, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(7)
									.addComponent(lblNewLabel_6_1_1_2, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3_2_2, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2_2_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(textField_20, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_21, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_22, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_23, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(lblNewLabel_6_2_1_1, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(7)
									.addComponent(lblNewLabel_6_1_1_1_1, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3_2_1_1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2_2_1_1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(textField_24, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_25, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_26, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_27, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
							.addContainerGap())
						.addGroup(gl_panel_5_1.createSequentialGroup()
							.addComponent(lblNewLabel_3_2_1, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_5_1.createSequentialGroup()
							.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(lblNewLabel_6_4, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(7)
									.addComponent(lblNewLabel_6_1_3, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3_1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2_1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(textField_16, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_17, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_18, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_19, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
							.addGap(14))))
		);
		gl_panel_5_1.setVerticalGroup(
			gl_panel_5_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addComponent(lblNewLabel_3_2_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_3_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6_2_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_1_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_3_2_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_2_2_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6_2_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_1_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_3_2_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_2_2_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(28))
		);
		panel_5_1.setLayout(gl_panel_5_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBorder(null);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_5_1, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(panel_5_2, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
					.addGap(20))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5_1, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(panel_5_2, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(panel_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		textField_30 = new JTextField();
		textField_30.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_30.setColumns(10);
		
		JLabel lblNewLabel_3_2_1_1_1_1 = new JLabel("Total");
		lblNewLabel_3_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3_2_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_3_2_1_1_1_2 = new JLabel("Part B Qn Attended ");
		lblNewLabel_3_2_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3_2_1_1_1_2.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Total");
		lblNewLabel_3_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3_2_1_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		
		textField_28 = new JTextField();
		textField_28.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_28.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_3_2_1_1_1_2_1 = new JLabel("Total Mark");
		lblNewLabel_3_2_1_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3_2_1_1_1_2_1.setBackground(Color.LIGHT_GRAY);
		
		textField_32 = new JTextField();
		textField_32.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_32.setColumns(10);
		
		JButton btnNewButton_2_1_2_1 = new JButton("Get Preview");
		btnNewButton_2_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JButton btnNewButton_2_1_2_1_1 = new JButton("Save");
		btnNewButton_2_1_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_2_1_1_1_2_1_1 = new JLabel("Percentage");
		lblNewLabel_3_2_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1_1_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3_2_1_1_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		
		textField_33 = new JTextField();
		textField_33.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_33.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(220, 220, 220));
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBorder(new LineBorder(new Color(220, 220, 220)));
		GroupLayout gl_panel_5_2 = new GroupLayout(panel_5_2);
		gl_panel_5_2.setHorizontalGroup(
			gl_panel_5_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_3_2_1_1_1, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(lblNewLabel_3_2_1_1_1_1, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_29, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(textField_30, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
							.addGap(2)))
					.addGap(8))
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_2_1_2_1, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2_1_2_1_1, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addComponent(lblNewLabel_3_2_1_1_1_2, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(lblNewLabel_3_2_1_1_1_1_1, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addComponent(textField_28, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(textField_31, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addGroup(gl_panel_5_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_2_1_1_1_2_1, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
								.addComponent(textField_32, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
							.addGap(13)
							.addGroup(gl_panel_5_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_2_1_1_1_2_1_1, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(textField_33, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
					.addContainerGap())
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_2_1_1, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_5_2.setVerticalGroup(
			gl_panel_5_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_2.createSequentialGroup()
					.addComponent(lblNewLabel_3_2_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3_2_1_1_1_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2_1_1_1_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addGap(8)
							.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addGap(7)
							.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addComponent(lblNewLabel_3_2_1_1_1_2_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5_2.createSequentialGroup()
							.addComponent(lblNewLabel_3_2_1_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(14)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_5_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2_1_2_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_1_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JLabel lblNewLabel_3_2_1_1_1_3 = new JLabel("STATUS");
		lblNewLabel_3_2_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_3_2_1_1_1_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_3_2_1_1_1_3.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(78)
					.addComponent(lblNewLabel_3_2_1_1_1_3, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
					.addGap(68))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_3_2_1_1_1_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
		);
		panel_7.setLayout(gl_panel_7);
		panel_5_2.setLayout(gl_panel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("5");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_2.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_1 = new JLabel("6");
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_6_3_2 = new JLabel("7");
		lblNewLabel_6_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_3_2.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_2_2 = new JLabel("8");
		lblNewLabel_6_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_2_2.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_6_2_1 = new JLabel("9");
		lblNewLabel_6_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_2_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_1_1 = new JLabel("10");
		lblNewLabel_6_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_1_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_6_3_2_1 = new JLabel("-");
		lblNewLabel_6_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_3_2_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_2_2_1 = new JLabel("-");
		lblNewLabel_6_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_2_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_1_2_2_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBorder(new LineBorder(new Color(220, 220, 220)));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblNewLabel_3_2, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(lblNewLabel_6_2, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_6_1_1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_11, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(lblNewLabel_6_2_1, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
									.addGap(7)
									.addComponent(lblNewLabel_6_1_1_1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3_2_1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2_2_1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(textField_12, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_14, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_15, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
							.addContainerGap())
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(7)
									.addComponent(lblNewLabel_6_1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))
							.addGap(14))))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_6_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_6_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_6_3_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_2_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_3_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6_1_2_2_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(28))
		);
		panel_5.setLayout(gl_panel_5);
		panel_2.setLayout(gl_panel_2);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("IAT Details");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3_1_1.setBounds(8, 0, 355, 27);
		panel_3.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Day");
		lblNewLabel_2_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1.setBounds(12, 27, 46, 27);
		panel_3.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("IAT Number");
		lblNewLabel_2_2_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2.setBounds(200, 27, 91, 27);
		panel_3.add(lblNewLabel_2_2_1_2);
		
		JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1_1_2.setBounds(200, 59, 163, 27);
		panel_3.add(comboBox_1_1_2);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_34.setBounds(63, 59, 50, 27);
		panel_3.add(textField_34);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Month");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1_1.setBounds(66, 27, 47, 27);
		panel_3.add(lblNewLabel_2_2_1_1_1);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_35.setBounds(8, 59, 50, 27);
		panel_3.add(textField_35);
		
		JLabel lblNewLabel_2_2_1_1_2 = new JLabel("Year");
		lblNewLabel_2_2_1_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1_2.setBounds(121, 27, 50, 27);
		panel_3.add(lblNewLabel_2_2_1_1_2);
		
		textField_36 = new JTextField();
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_36.setText(""+currentYear);
		textField_36.setColumns(10);
		textField_36.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_36.setBounds(121, 59, 50, 27);
		panel_3.add(textField_36);
		
		JLabel lblNewLabel_2_2_1_1_2_1 = new JLabel("Total Mark");
		lblNewLabel_2_2_1_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1_2_1.setBounds(121, 96, 91, 27);
		panel_3.add(lblNewLabel_2_2_1_1_2_1);
		
		textField_37 = new JTextField();
		textField_37.setText("00");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_37.setColumns(10);
		textField_37.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_37.setBounds(121, 128, 91, 27);
		panel_3.add(textField_37);
		
		JLabel lblNewLabel_2_2_1_2_1 = new JLabel("Regulation");
		lblNewLabel_2_2_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_1.setBounds(8, 96, 97, 27);
		panel_3.add(lblNewLabel_2_2_1_2_1);
		
		JComboBox comboBox_1_1_2_1 = new JComboBox();
		comboBox_1_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1_1_2_1.setBounds(8, 128, 97, 27);
		panel_3.add(comboBox_1_1_2_1);
		
		JButton btnNewButton_2_1_4_1 = new JButton("Save");
		btnNewButton_2_1_4_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_2_1_4_1.setBounds(220, 125, 70, 32);
		panel_3.add(btnNewButton_2_1_4_1);
		
		JButton btnNewButton_2_1_3_1 = new JButton("Edit");
		btnNewButton_2_1_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_2_1_3_1.setBounds(293, 125, 70, 32);
		panel_3.add(btnNewButton_2_1_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Photo ");
		lblNewLabel_4.setBorder(new LineBorder(new Color(192, 192, 192)));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(192, 192, 192));
		
		JButton btnNewButton_2_1_1 = new JButton("Previous");
		btnNewButton_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JButton btnNewButton_2_1_2 = new JButton("Next");
		btnNewButton_2_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Student Details");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_1.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_2_1_1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_2_1_2, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_1_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Please Select-", "BE CSE", "BE ECE", "BE BME", "BE AGRI", "BE MECH"}));
		comboBox.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox.setBounds(10, 57, 163, 27);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Please Select-"}));
		comboBox_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1.setBounds(199, 57, 163, 27);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 25, 91, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Subject Code");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 94, 91, 27);
		panel.add(lblNewLabel_2_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"-Please Select-"}));
		comboBox_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_2.setBounds(10, 126, 163, 27);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Semester");
		lblNewLabel_2_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(199, 25, 91, 27);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Year");
		lblNewLabel_2_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(199, 94, 91, 27);
		panel.add(lblNewLabel_2_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"-Please Select-", "IAT 1", "IAT 2", "IAT 3"}));
		comboBox_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1_1.setBounds(199, 126, 163, 27);
		panel.add(comboBox_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Get Details");
		btnNewButton_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(199, 163, 163, 32);
		panel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Select The Details");
		lblNewLabel_3.setBackground(new Color(192, 192, 192));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 0, 352, 27);
		panel.add(lblNewLabel_3);
		AddIATMark.setLayout(gl_AddIATMark);
		
		JPanel CalculateAttainment = new JPanel();
		CalculateAttainment.setBackground(new Color(255, 255, 255));
		layeredPane.add(CalculateAttainment, "name_527843826177499");
		
		JPanel StaffProfile = new JPanel();
		layeredPane.add(StaffProfile, "name_527847128747900");
		
		JPanel Others = new JPanel();
		Others.setBackground(new Color(255, 255, 255));
		layeredPane.add(Others, "name_145826217317800");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panel_9.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Edit Subject ");
		btnNewButton_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_2.setBounds(8, 70, 204, 35);
		panel_9.add(btnNewButton_2);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		GroupLayout gl_Others = new GroupLayout(Others);
		gl_Others.setHorizontalGroup(
			gl_Others.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Others.createSequentialGroup()
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 1108, Short.MAX_VALUE))
		);
		gl_Others.setVerticalGroup(
			gl_Others.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_9, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
				.addComponent(layeredPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
		);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		JPanel Subject = new JPanel();
		Subject.setBackground(new Color(255, 255, 255));
		layeredPane_1.add(Subject, "name_146620621948700");
		Subject.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		layeredPane_1.add(panel_12, "name_146625297501300");
		
		JPanel panel_13 = new JPanel();
		layeredPane_1.add(panel_13, "name_146632000753100");
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 133, 255));
		panel_10.setBounds(8, 10, 204, 35);
		panel_9.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("OPTIONS");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(25, 0, 158, 35);
		panel_10.add(lblNewLabel_10);
		lblNewLabel_10.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		
		JButton btnNewButton_2_2 = new JButton("New button");
		btnNewButton_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_2_2.setBounds(8, 115, 204, 35);
		panel_9.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("New button");
		btnNewButton_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_2_3.setBounds(8, 160, 204, 35);
		panel_9.add(btnNewButton_2_3);
		Others.setLayout(gl_Others);
		
		JButton btnNewButton_1_1 = new JButton("HOME");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(HomeScreen);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_1_1.setFocusable(false);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(0, 133, 255));
		
		JButton btnNewButton_1 = new JButton("ADD STUDENT ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(AddStudent);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
				btnNewButton_1.setBackground(new Color(0, 80, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
				btnNewButton_1.setBackground(new Color(0, 133, 255));
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 133, 255));
		btnNewButton_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_1.setBorder(null);
		
		JButton btnNewButton_1_2 = new JButton("ADD IAT MARKS");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(AddIATMark);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_1_2.setFocusable(false);
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(new Color(0, 133, 255));
		
		JButton btnNewButton_1_1_1 = new JButton("CALCULATE ATTAINMENT");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(CalculateAttainment);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_1_1_1.setFocusable(false);
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setBackground(new Color(0, 133, 255));
		
		JButton btnNewButton_1_3 = new JButton("STAFF PROFILE");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(StaffProfile);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_1_3.setFocusable(false);
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBackground(new Color(0, 133, 255));
		
		JButton btnNewButton_1_2_1 = new JButton("OTHERS");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(Others);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnNewButton_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		btnNewButton_1_2_1.setFocusable(false);
		btnNewButton_1_2_1.setBorder(null);
		btnNewButton_1_2_1.setBackground(new Color(0, 133, 255));
		GroupLayout gl_Navbar = new GroupLayout(Navbar);
		gl_Navbar.setHorizontalGroup(
			gl_Navbar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Navbar.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_1_1, GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1_2_1, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_Navbar.setVerticalGroup(
			gl_Navbar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Navbar.createSequentialGroup()
					.addGroup(gl_Navbar.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_2_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Navbar.setLayout(gl_Navbar);
		
		JLabel lblNewLabel_1 = new JLabel("© PPG Edu - "+ currentYear +" All Rights Reserved ");
		lblNewLabel_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_Footer = new GroupLayout(Footer);
		gl_Footer.setHorizontalGroup(
			gl_Footer.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Footer.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 1332, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_Footer.setVerticalGroup(
			gl_Footer.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		Footer.setLayout(gl_Footer);
		frame.getContentPane().setLayout(groupLayout);
	}
}

	