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
// test message to check update
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
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JTree;

public class Home {

	public JFrame frame;
	public JTextField txtDkdnhgklhn;
	public JTextField textField_1;
	public JTextField textField_4;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;

	public JPanel Add_Student;
	public JPanel Student_Profile;
	public JPanel Student_List;
	public JPanel Update_Student;
	public JPanel Delete_Student;
	public JPanel Add_Profile_Photo;
	private JTextField textField_6;
	private JTextField textField_12;
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
	private JTextField textField_26;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_25;
	private JTextField textField_27;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTable table_1;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	
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
		
		//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 - keyor github login
		
		
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
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		
		JLabel lblNewLabel_5_4 = new JLabel("11");
		lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_4.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_1_2 = new JLabel("11");
		lblNewLabel_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_1_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_4 = new JComboBox();
		comboBox_3_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JComboBox comboBox_3_1_2 = new JComboBox();
		comboBox_3_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_6_1 = new JLabel("11");
		lblNewLabel_5_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_6_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_1_4_1 = new JLabel("11");
		lblNewLabel_5_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_1_4_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_6_1 = new JComboBox();
		comboBox_3_6_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JComboBox comboBox_3_1_4_1 = new JComboBox();
		comboBox_3_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_2_4_1 = new JLabel("11");
		lblNewLabel_5_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_2_4_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_3_1_1 = new JLabel("11");
		lblNewLabel_5_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_3_1_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_2_4_1 = new JComboBox();
		comboBox_3_2_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JComboBox comboBox_3_3_1_1 = new JComboBox();
		comboBox_3_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("11");
		lblNewLabel_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_1_1_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_1_1_1 = new JComboBox();
		comboBox_3_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setBackground(new Color(255, 255, 255));
		panel_4_1_1.setBorder(new LineBorder(new Color(128, 128, 128)));
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("IAT Preview");
		lblNewLabel_3_3_1_1.setBounds(9, 1, 339, 27);
		lblNewLabel_3_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_3_1_1.setBackground(Color.LIGHT_GRAY);
		
		textField_58 = new JTextField();
		textField_58.setBounds(34, 71, 134, 30);
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_58.setColumns(10);
		textField_58.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_2_2_1_2_2 = new JLabel("PART A Attended ");
		lblNewLabel_2_2_1_2_2.setBounds(34, 38, 134, 27);
		lblNewLabel_2_2_1_2_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2_2_1_2_2_1 = new JLabel("PART A Marks");
		lblNewLabel_2_2_1_2_2_1.setBounds(186, 38, 134, 27);
		lblNewLabel_2_2_1_2_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		textField_59 = new JTextField();
		textField_59.setBounds(186, 71, 134, 30);
		textField_59.setHorizontalAlignment(SwingConstants.CENTER);
		textField_59.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_59.setColumns(10);
		textField_59.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_3_2 = new JLabel("PART - A");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.BLACK);
		lblNewLabel_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_2.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("PART - B & C");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setForeground(Color.BLACK);
		lblNewLabel_3_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_2_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_5 = new JLabel("1");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_1 = new JLabel("2");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_2 = new JLabel("6");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_2 = new JComboBox();
		comboBox_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_2_1 = new JLabel("10");
		lblNewLabel_5_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_2_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_2_1 = new JComboBox();
		comboBox_3_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_3 = new JLabel("7");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_3.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_3 = new JComboBox();
		comboBox_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_6 = new JLabel("3");
		lblNewLabel_5_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_6.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_6 = new JComboBox();
		comboBox_3_6.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_2_4 = new JLabel("8");
		lblNewLabel_5_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_2_4.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_2_4 = new JComboBox();
		comboBox_3_2_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_1_4 = new JLabel("4");
		lblNewLabel_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_1_4.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_1_4 = new JComboBox();
		comboBox_3_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_3_1 = new JLabel("9");
		lblNewLabel_5_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_3_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_3_1 = new JComboBox();
		comboBox_3_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		
		JLabel lblNewLabel_5_1_4_2 = new JLabel("5");
		lblNewLabel_5_1_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_4_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_1_4_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JComboBox comboBox_3_7 = new JComboBox();
		comboBox_3_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_5_2, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_5_3, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(comboBox_3_2, 0, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(comboBox_3_3, 0, 57, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_5_1, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(comboBox_3, 0, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(comboBox_3_1, 0, 57, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_5_6, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_5_1_4, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(comboBox_3_6, 0, 56, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(comboBox_3_1_4, 0, 56, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_5_2_4, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_5_3_1, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(comboBox_3_2_4, 0, 56, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(comboBox_3_3_1, 0, 56, Short.MAX_VALUE)))
					.addGap(8)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox_3_2_1, Alignment.LEADING, 0, 57, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5_2_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(lblNewLabel_5_1_4_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
						.addComponent(comboBox_3_7, 0, 57, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(lblNewLabel_5_1_4_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_3_7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_5_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_3_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_3_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_3_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_3_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5_6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_1_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_3_6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_3_1_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5_2_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_3_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_3_2_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_3_3_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(null);
		panel_5.setBackground(new Color(255, 255, 255));
		
		textField_4 = new JTextField();
		textField_4.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3_3 = new JLabel("Marks Obtained ");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setForeground(Color.BLACK);
		lblNewLabel_3_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_3.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_5_5 = new JLabel("11");
		lblNewLabel_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1 = new JLabel("11");
		lblNewLabel_5_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_1 = new JLabel("11");
		lblNewLabel_5_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_2 = new JLabel("11");
		lblNewLabel_5_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_2 = new JLabel("11");
		lblNewLabel_5_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_3 = new JLabel("11");
		lblNewLabel_5_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_3.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_3 = new JLabel("11");
		lblNewLabel_5_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_3.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_2_2 = new JLabel("11");
		lblNewLabel_5_5_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_2_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_1_1 = new JLabel("11");
		lblNewLabel_5_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_1_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_3_1 = new JLabel("11");
		lblNewLabel_5_5_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_3_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBorder(new LineBorder(new Color(220, 220, 220)));
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("IAT Details");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3_1_1.setBounds(8, 0, 285, 27);
		panel_3.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Day");
		lblNewLabel_2_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1.setBounds(12, 27, 46, 27);
		panel_3.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("IAT Number");
		lblNewLabel_2_2_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2.setBounds(179, 27, 92, 27);
		panel_3.add(lblNewLabel_2_2_1_2);
		
		JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1_1_2.setBounds(179, 59, 114, 27);
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
		lblNewLabel_2_2_1_1_2_1.setBounds(86, 96, 91, 27);
		panel_3.add(lblNewLabel_2_2_1_1_2_1);
		
		textField_37 = new JTextField();
		textField_37.setText("00");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_37.setColumns(10);
		textField_37.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_37.setBounds(86, 128, 85, 27);
		panel_3.add(textField_37);
		
		JLabel lblNewLabel_2_2_1_2_1 = new JLabel("Regulation");
		lblNewLabel_2_2_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_1.setBounds(8, 96, 97, 27);
		panel_3.add(lblNewLabel_2_2_1_2_1);
		
		JComboBox comboBox_1_1_2_1 = new JComboBox();
		comboBox_1_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1_1_2_1.setBounds(8, 128, 70, 27);
		panel_3.add(comboBox_1_1_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("Photo ");
		lblNewLabel_4.setBorder(new LineBorder(new Color(192, 192, 192)));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBackground(new Color(192, 192, 192));
		
		txtDkdnhgklhn = new JTextField();
		txtDkdnhgklhn.setHorizontalAlignment(SwingConstants.CENTER);
		txtDkdnhgklhn.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		txtDkdnhgklhn.setBorder(new LineBorder(new Color(220, 220, 220)));
		txtDkdnhgklhn.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Student Details");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_1.setBackground(Color.LIGHT_GRAY);
		
		JButton btnNewButton_2_1_1 = new JButton("Previous");
		btnNewButton_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JButton btnNewButton_2_1_2 = new JButton("Next");
		btnNewButton_2_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDkdnhgklhn, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnNewButton_2_1_1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton_2_1_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtDkdnhgklhn, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2_1_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(11))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Please Select-", "BE CSE", "BE ECE", "BE BME", "BE AGRI", "BE MECH"}));
		comboBox.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox.setBounds(10, 57, 129, 27);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Please Select-"}));
		comboBox_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1.setBounds(163, 57, 129, 27);
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
		comboBox_2.setBounds(10, 126, 129, 27);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Semester");
		lblNewLabel_2_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(163, 25, 91, 27);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Year");
		lblNewLabel_2_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(163, 94, 91, 27);
		panel.add(lblNewLabel_2_2_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"-Please Select-", "IAT 1", "IAT 2", "IAT 3"}));
		comboBox_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		comboBox_1_1.setBounds(163, 126, 129, 27);
		panel.add(comboBox_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Get Details");
		btnNewButton_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_2_1.setBounds(163, 161, 129, 32);
		panel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Select The Details");
		lblNewLabel_3.setBackground(new Color(192, 192, 192));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 0, 283, 27);
		panel.add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
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
				"Student Name", "S.NO", "Register Number", "Total Mark", "Result"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(36);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setMinWidth(39);
		scrollPane.setViewportView(table);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel_2_1.setBackground(Color.WHITE);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBorder(null);
		panel_5_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Marks Obtained ");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_3_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel_3_3_1.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_5_5_4 = new JLabel("11A");
		lblNewLabel_5_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_4.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_4 = new JLabel("12A");
		lblNewLabel_5_5_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_4.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_2_1 = new JLabel("11");
		lblNewLabel_5_5_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_2_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_1_2 = new JLabel("11");
		lblNewLabel_5_5_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_1_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_3_2 = new JLabel("11");
		lblNewLabel_5_5_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_3_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_3_2.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_2_1 = new JLabel("11");
		lblNewLabel_5_5_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_2_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_4_1 = new JLabel("11B");
		lblNewLabel_5_5_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_4_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		textField_18.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_4_1 = new JLabel("12B");
		lblNewLabel_5_5_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_4_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_2_1_1 = new JLabel("11");
		lblNewLabel_5_5_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_2_1_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_1_2_1 = new JLabel("11");
		lblNewLabel_5_5_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_1_2_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_3_2_1 = new JLabel("11");
		lblNewLabel_5_5_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_3_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_3_2_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		JLabel lblNewLabel_5_5_1_2_1_1 = new JLabel("11");
		lblNewLabel_5_5_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_5_1_2_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_5_5_1_2_1_1.setBorder(new LineBorder(new Color(220, 220, 220)));
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBorder(new LineBorder(new Color(220, 220, 220)));
		GroupLayout gl_panel_5_1 = new GroupLayout(panel_5_1);
		gl_panel_5_1.setHorizontalGroup(
			gl_panel_5_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(8)
					.addComponent(lblNewLabel_5_5_4, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(lblNewLabel_5_5_1_4, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(lblNewLabel_5_5_2_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(lblNewLabel_5_5_1_1_2, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(lblNewLabel_5_5_3_2, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(lblNewLabel_5_5_1_2_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6))
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addGap(8)
					.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(textField_12, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(textField_14, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(textField_15, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(textField_16, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6))
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_3_1, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5_1.createSequentialGroup()
							.addComponent(lblNewLabel_5_5_4_1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(lblNewLabel_5_5_1_4_1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(6)
							.addComponent(lblNewLabel_5_5_2_1_1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(lblNewLabel_5_5_1_1_2_1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_5_5_3_2_1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_5_5_1_2_1_1, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
						.addGroup(gl_panel_5_1.createSequentialGroup()
							.addComponent(textField_17, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(textField_18, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(6)
							.addComponent(textField_19, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(textField_20, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(textField_21, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(textField_22, GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_5_1.setVerticalGroup(
			gl_panel_5_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5_1.createSequentialGroup()
					.addComponent(lblNewLabel_3_3_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_5_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_3_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_5_4_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_4_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_1_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_3_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_2_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(94))
		);
		panel_5_1.setLayout(gl_panel_5_1);
		GroupLayout gl_AddIATMark = new GroupLayout(AddIATMark);
		gl_AddIATMark.setHorizontalGroup(
			gl_AddIATMark.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AddIATMark.createSequentialGroup()
					.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_AddIATMark.createSequentialGroup()
							.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_2, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_AddIATMark.createSequentialGroup()
									.addGroup(gl_AddIATMark.createParallelGroup(Alignment.TRAILING)
										.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
										.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_AddIATMark.createSequentialGroup()
									.addGap(8)
									.addComponent(lblNewLabel_3_2_1, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
								.addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
								.addComponent(panel_4_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
							.addGap(5)
							.addComponent(panel_4_1_1, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1027, Short.MAX_VALUE)))
		);
		gl_AddIATMark.setVerticalGroup(
			gl_AddIATMark.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AddIATMark.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
				.addGroup(gl_AddIATMark.createSequentialGroup()
					.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_AddIATMark.createSequentialGroup()
							.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_2_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4_1, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_AddIATMark.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))
						.addComponent(panel_4_1_1, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
		);
		panel_4_1_1.setLayout(null);
		panel_4_1_1.add(lblNewLabel_3_3_1_1);
		panel_4_1_1.add(lblNewLabel_2_2_1_2_2);
		panel_4_1_1.add(textField_58);
		panel_4_1_1.add(lblNewLabel_2_2_1_2_2_1);
		panel_4_1_1.add(textField_59);
		
		JLabel lblNewLabel_2_2_1_2_2_2 = new JLabel("PART A Attended ");
		lblNewLabel_2_2_1_2_2_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_2_2.setBounds(34, 111, 134, 27);
		panel_4_1_1.add(lblNewLabel_2_2_1_2_2_2);
		
		textField_60 = new JTextField();
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_60.setColumns(10);
		textField_60.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_60.setBounds(34, 144, 134, 30);
		panel_4_1_1.add(textField_60);
		
		JLabel lblNewLabel_2_2_1_2_2_1_1 = new JLabel("PART A Marks");
		lblNewLabel_2_2_1_2_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_2_1_1.setBounds(186, 111, 134, 27);
		panel_4_1_1.add(lblNewLabel_2_2_1_2_2_1_1);
		
		textField_61 = new JTextField();
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_61.setColumns(10);
		textField_61.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_61.setBounds(186, 144, 134, 30);
		panel_4_1_1.add(textField_61);
		
		JLabel lblNewLabel_2_2_1_2_2_3 = new JLabel("Total Marks");
		lblNewLabel_2_2_1_2_2_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_2_3.setBounds(34, 184, 134, 27);
		panel_4_1_1.add(lblNewLabel_2_2_1_2_2_3);
		
		textField_62 = new JTextField();
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_62.setColumns(10);
		textField_62.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_62.setBounds(34, 217, 134, 30);
		panel_4_1_1.add(textField_62);
		
		JLabel lblNewLabel_2_2_1_2_2_1_2 = new JLabel("Obtained Marks");
		lblNewLabel_2_2_1_2_2_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_2_1_2.setBounds(186, 184, 134, 27);
		panel_4_1_1.add(lblNewLabel_2_2_1_2_2_1_2);
		
		textField_63 = new JTextField();
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_63.setColumns(10);
		textField_63.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_63.setBounds(186, 217, 134, 30);
		panel_4_1_1.add(textField_63);
		
		JLabel lblNewLabel_2_2_1_2_2_4 = new JLabel("Percentage");
		lblNewLabel_2_2_1_2_2_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_2_4.setBounds(34, 257, 134, 27);
		panel_4_1_1.add(lblNewLabel_2_2_1_2_2_4);
		
		textField_64 = new JTextField();
		textField_64.setHorizontalAlignment(SwingConstants.CENTER);
		textField_64.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_64.setColumns(10);
		textField_64.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_64.setBounds(34, 290, 134, 30);
		panel_4_1_1.add(textField_64);
		
		JLabel lblNewLabel_2_2_1_2_2_1_3 = new JLabel("Result Status");
		lblNewLabel_2_2_1_2_2_1_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_2_1_3.setBounds(186, 257, 134, 27);
		panel_4_1_1.add(lblNewLabel_2_2_1_2_2_1_3);
		
		textField_65 = new JTextField();
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		textField_65.setColumns(10);
		textField_65.setBorder(new LineBorder(new Color(220, 220, 220)));
		textField_65.setBounds(186, 290, 134, 30);
		panel_4_1_1.add(textField_65);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Preview");
		btnNewButton_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_2_1_1_1.setBounds(34, 330, 286, 32);
		panel_4_1_1.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_2_1_1_1_1 = new JButton("Save & Upload");
		btnNewButton_2_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_2_1_1_1_1.setBounds(34, 369, 286, 32);
		panel_4_1_1.add(btnNewButton_2_1_1_1_1);
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(7)
					.addComponent(panel_5_1, GroupLayout.PREFERRED_SIZE, 311, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(9)
					.addComponent(panel_5_1, GroupLayout.PREFERRED_SIZE, 184, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_2_1.setLayout(gl_panel_2_1);
		
		JLabel lblNewLabel_5_7 = new JLabel("B-Mark");
		lblNewLabel_5_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_5_7.setBorder(null);
		lblNewLabel_5_7.setBounds(179, 98, 56, 22);
		panel_3.add(lblNewLabel_5_7);
		
		JComboBox comboBox_3_5 = new JComboBox();
		comboBox_3_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		comboBox_3_5.setBounds(179, 128, 56, 27);
		panel_3.add(comboBox_3_5);
		
		JComboBox comboBox_3_5_1 = new JComboBox();
		comboBox_3_5_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		comboBox_3_5_1.setBounds(243, 128, 50, 27);
		panel_3.add(comboBox_3_5_1);
		
		JLabel lblNewLabel_5_7_1 = new JLabel("C-Mark");
		lblNewLabel_5_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_7_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_5_7_1.setBorder(null);
		lblNewLabel_5_7_1.setBounds(237, 98, 56, 22);
		panel_3.add(lblNewLabel_5_7_1);
		
		JButton btnNewButton_2_1_2_1 = new JButton("Edit");
		btnNewButton_2_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		
		JButton btnNewButton_2_1_2_1_1 = new JButton("Save");
		btnNewButton_2_1_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		GroupLayout gl_panel_4_1 = new GroupLayout(panel_4_1);
		gl_panel_4_1.setHorizontalGroup(
			gl_panel_4_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4_1.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_panel_4_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4_1.createSequentialGroup()
							.addComponent(lblNewLabel_5_4, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_5_1_2, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_5_6_1, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(lblNewLabel_5_1_4_1, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(lblNewLabel_5_1_1_1, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
						.addGroup(gl_panel_4_1.createSequentialGroup()
							.addComponent(comboBox_3_4, 0, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(comboBox_3_1_2, 0, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(comboBox_3_6_1, 0, 57, Short.MAX_VALUE)
							.addGap(8)
							.addComponent(comboBox_3_1_4_1, 0, 57, Short.MAX_VALUE)
							.addGap(5)
							.addComponent(comboBox_3_1_1_1, 0, 57, Short.MAX_VALUE))
						.addGroup(gl_panel_4_1.createSequentialGroup()
							.addGroup(gl_panel_4_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4_1.createSequentialGroup()
									.addComponent(lblNewLabel_5_2_4_1, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_5_3_1_1, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
								.addGroup(gl_panel_4_1.createSequentialGroup()
									.addComponent(comboBox_3_2_4_1, 0, 57, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(comboBox_3_3_1_1, 0, 57, Short.MAX_VALUE)))
							.addGap(76)
							.addGroup(gl_panel_4_1.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_2_1_2_1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
								.addGroup(gl_panel_4_1.createSequentialGroup()
									.addComponent(btnNewButton_2_1_2_1_1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
									.addGap(1)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(6))
		);
		gl_panel_4_1.setVerticalGroup(
			gl_panel_4_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_4_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_6_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1_4_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_1_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_4_1.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_3_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_6_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_1_4_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3_1_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_4_1.createSequentialGroup()
							.addGroup(gl_panel_4_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5_2_4_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_3_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGap(3)
							.addGroup(gl_panel_4_1.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_3_2_4_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_3_3_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_4_1.createSequentialGroup()
							.addComponent(btnNewButton_2_1_2_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnNewButton_2_1_2_1_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
		);
		panel_4_1.setLayout(gl_panel_4_1);
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(8)
					.addComponent(lblNewLabel_5_5, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(lblNewLabel_5_5_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(lblNewLabel_5_5_2, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(lblNewLabel_5_5_1_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(lblNewLabel_5_5_3, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(lblNewLabel_5_5_1_2, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(8)
					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(59)
					.addComponent(lblNewLabel_5_5_1_3, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(lblNewLabel_5_5_2_2, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(lblNewLabel_5_5_1_1_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(lblNewLabel_5_5_3_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(57))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(59)
					.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(8)
					.addComponent(textField_11, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(57))
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_3, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5_5_1_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_1_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_3_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
		);
		panel_5.setLayout(gl_panel_5);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(7)
					.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(9)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(gl_panel_2);
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
		
		JPanel AddStudent = new JPanel();
		AddStudent.setBackground(new Color(255, 255, 255));
		layeredPane.add(AddStudent, "name_86960927493400");
		
		JPanel Side_Nav_Student = new JPanel();
		Side_Nav_Student.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Side_Nav_Student.setBackground(new Color(240, 240, 240));
		
		JLayeredPane Student_Main_Content = new JLayeredPane();
		Student_Main_Content.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		GroupLayout gl_AddStudent = new GroupLayout(AddStudent);
		gl_AddStudent.setHorizontalGroup(
			gl_AddStudent.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AddStudent.createSequentialGroup()
					.addComponent(Side_Nav_Student, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Student_Main_Content, GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE))
		);
		gl_AddStudent.setVerticalGroup(
			gl_AddStudent.createParallelGroup(Alignment.LEADING)
				.addComponent(Side_Nav_Student, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
				.addComponent(Student_Main_Content, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
		);
		Side_Nav_Student.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Student List");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				Student_Main_Content.removeAll();
				Student_Main_Content.add(Student_List);
				Student_Main_Content.repaint();
				Student_Main_Content.revalidate();
		
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_3.setBounds(8, 47, 209, 33);
		Side_Nav_Student.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Student Profile");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Student_Main_Content.removeAll();
				Student_Main_Content.add(Student_Profile);
				Student_Main_Content.repaint();
				Student_Main_Content.revalidate();
			}
		});
		btnNewButton_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_3_1.setBounds(8, 90, 209, 33);
		Side_Nav_Student.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_6 = new JLabel("Details");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(new Color(128, 128, 128));
		lblNewLabel_6.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(8, 10, 209, 27);
		Side_Nav_Student.add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(8, 141, 209, 1);
		Side_Nav_Student.add(separator);
		
		JLabel lblNewLabel_6_1 = new JLabel("Manage ");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setForeground(Color.GRAY);
		lblNewLabel_6_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_6_1.setBounds(8, 150, 209, 27);
		Side_Nav_Student.add(lblNewLabel_6_1);
		
		JButton btnNewButton_3_4 = new JButton("Add Student Details");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				
				
				
			Student_Main_Content.removeAll();
			Student_Main_Content.add(Add_Student);
			Student_Main_Content.repaint();
			Student_Main_Content.revalidate();
				
				
				
				
				
				
			}
		});
		btnNewButton_3_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_3_4.setBounds(8, 187, 209, 33);
		Side_Nav_Student.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_1_1 = new JButton("Update Student Details");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Student_Main_Content.removeAll();
				Student_Main_Content.add(Update_Student);
				Student_Main_Content.repaint();
				Student_Main_Content.revalidate();
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_3_1_1.setBounds(8, 230, 209, 33);
		Side_Nav_Student.add(btnNewButton_3_1_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Others");
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1_1.setForeground(Color.GRAY);
		lblNewLabel_6_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		lblNewLabel_6_1_1.setBounds(8, 336, 209, 27);
		Side_Nav_Student.add(lblNewLabel_6_1_1);
		
		JButton btnNewButton_3_4_1 = new JButton("Add Profile photo");
		btnNewButton_3_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				Student_Main_Content.removeAll();
				Student_Main_Content.add(Add_Profile_Photo);
				Student_Main_Content.repaint();
				Student_Main_Content.revalidate();
				
				
				
				
			
			}
		});
		btnNewButton_3_4_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_3_4_1.setBounds(8, 373, 209, 33);
		Side_Nav_Student.add(btnNewButton_3_4_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(8, 324, 209, 2);
		Side_Nav_Student.add(separator_1);
		
		JButton btnNewButton_3_4_2 = new JButton("Delete Student Details");
		btnNewButton_3_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Student_Main_Content.removeAll();
				Student_Main_Content.add(Delete_Student);
				Student_Main_Content.repaint();
				Student_Main_Content.revalidate();
			}
		});
		btnNewButton_3_4_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		btnNewButton_3_4_2.setBounds(8, 272, 209, 33);
		Side_Nav_Student.add(btnNewButton_3_4_2);
		Student_Main_Content.setLayout(new CardLayout(0, 0));
		
		 Student_List = new JPanel();
		 Student_List.setBackground(new Color(255, 255, 255));
		Student_Main_Content.add(Student_List, "name_90971198699500");
		
		JSeparator separator_2_2_1_1 = new JSeparator();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"S.NO", "Register Number", "Student Name", "Branch", "Year"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(39);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(84);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_12 = new JLabel("STUDENTS REGISTERED IN THE SYSTEM");
		lblNewLabel_12.setForeground(new Color(0, 0, 0));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		GroupLayout gl_Student_List = new GroupLayout(Student_List);
		gl_Student_List.setHorizontalGroup(
			gl_Student_List.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Student_List.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_Student_List.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_12, GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
						.addComponent(separator_2_2_1_1, GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE))
					.addGap(47))
		);
		gl_Student_List.setVerticalGroup(
			gl_Student_List.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Student_List.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(separator_2_2_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
					.addGap(22))
		);
		Student_List.setLayout(gl_Student_List);
		
		 Student_Profile = new JPanel();
		Student_Main_Content.add(Student_Profile, "name_90981481327700");
		
		Add_Student = new JPanel();
		Add_Student.setBackground(new Color(255, 255, 255));
		Student_Main_Content.add(Add_Student, "name_90986764686100");
		
		JLabel lblNewLabel_11 = new JLabel("Student name");
		lblNewLabel_11.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_23.setColumns(10);
		textField_23.setBorder(null);
		textField_23.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_4 = new JLabel("Admission Type");
		lblNewLabel_11_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setBorder(null);
		
		JLabel lblNewLabel_11_1 = new JLabel("Register Number");
		lblNewLabel_11_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_24.setColumns(10);
		textField_24.setBorder(null);
		textField_24.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Scholar Type");
		lblNewLabel_11_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JComboBox comboBox_4_2 = new JComboBox();
		comboBox_4_2.setBorder(null);
		
		JLabel lblNewLabel_11_2_1 = new JLabel("Branch");
		lblNewLabel_11_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_26.setColumns(10);
		textField_26.setBorder(null);
		textField_26.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_2 = new JLabel("Date Of Birth");
		lblNewLabel_11_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_3 = new JLabel("Gender");
		lblNewLabel_11_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBorder(null);
		
		JLabel lblNewLabel_11_3_1 = new JLabel("Year");
		lblNewLabel_11_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_5 = new JLabel("Mobile Number");
		lblNewLabel_11_5.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_28 = new JTextField();
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_28.setColumns(10);
		textField_28.setBorder(null);
		textField_28.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_1_2 = new JLabel("Email");
		lblNewLabel_11_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_29 = new JTextField();
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_29.setColumns(10);
		textField_29.setBorder(null);
		textField_29.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_2_2 = new JLabel("Class Advisor");
		lblNewLabel_11_2_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_30.setColumns(10);
		textField_30.setBorder(null);
		textField_30.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_3_2 = new JLabel("Blood Group");
		lblNewLabel_11_3_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_4_1 = new JLabel("Father Name");
		lblNewLabel_11_4_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("Father Mobile Number");
		lblNewLabel_11_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_2_1_1 = new JLabel("Mother Name");
		lblNewLabel_11_2_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_31 = new JTextField();
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_31.setColumns(10);
		textField_31.setBorder(null);
		textField_31.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_3_1_1 = new JLabel("Mother Mobile Number");
		lblNewLabel_11_3_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_32 = new JTextField();
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_32.setColumns(10);
		textField_32.setBorder(null);
		textField_32.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_6 = new JLabel("State");
		lblNewLabel_11_6.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_33 = new JTextField();
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_33.setColumns(10);
		textField_33.setBorder(null);
		textField_33.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_1_3 = new JLabel("City");
		lblNewLabel_11_1_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_38 = new JTextField();
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_38.setColumns(10);
		textField_38.setBorder(null);
		textField_38.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_2_3 = new JLabel("Nationality");
		lblNewLabel_11_2_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_39 = new JTextField();
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_39.setColumns(10);
		textField_39.setBorder(null);
		textField_39.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_3_3 = new JLabel("Religion");
		lblNewLabel_11_3_3.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_40 = new JTextField();
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_40.setColumns(10);
		textField_40.setBorder(null);
		textField_40.setBackground(SystemColor.menu);
		
		textField_41 = new JTextField();
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_41.setColumns(10);
		textField_41.setBorder(null);
		textField_41.setBackground(SystemColor.menu);
		
		textField_42 = new JTextField();
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_42.setColumns(10);
		textField_42.setBorder(null);
		textField_42.setBackground(SystemColor.menu);
		
		JComboBox comboBox_4_3 = new JComboBox();
		comboBox_4_3.setBorder(null);
		
		JComboBox comboBox_4_3_1 = new JComboBox();
		comboBox_4_3_1.setBorder(null);
		
		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_25.setColumns(10);
		textField_25.setBorder(null);
		textField_25.setBackground(SystemColor.menu);
		
		JSeparator separator_2 = new JSeparator();
		
		JSeparator separator_2_1 = new JSeparator();
		
		JSeparator separator_2_2 = new JSeparator();
		
		JLabel lblNewLabel_11_7 = new JLabel("Student Details");
		lblNewLabel_11_7.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
		
		JButton btnNewButton_3_4_1_1 = new JButton("Save & Upload");
		btnNewButton_3_4_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		
		JButton btnNewButton_3_4_1_2 = new JButton("Clear All");
		btnNewButton_3_4_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		GroupLayout gl_Add_Student = new GroupLayout(Add_Student);
		gl_Add_Student.setHorizontalGroup(
			gl_Add_Student.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_Add_Student.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_Add_Student.createSequentialGroup()
								.addComponent(lblNewLabel_11_5, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(lblNewLabel_11_1_2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
								.addGap(14)
								.addComponent(lblNewLabel_11_2_2, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(lblNewLabel_11_3_2, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_Add_Student.createSequentialGroup()
								.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addGap(9)
								.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_Add_Student.createSequentialGroup()
								.addComponent(lblNewLabel_11_4_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(lblNewLabel_11_1_1_1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
								.addGap(14)
								.addComponent(lblNewLabel_11_2_1_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(lblNewLabel_11_3_1_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_Add_Student.createSequentialGroup()
								.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addGap(10)
								.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_Add_Student.createSequentialGroup()
								.addComponent(lblNewLabel_11_6, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(lblNewLabel_11_1_3, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
								.addGap(14)
								.addComponent(lblNewLabel_11_2_3, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addGap(8)
								.addComponent(lblNewLabel_11_3_3, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_Add_Student.createParallelGroup(Alignment.TRAILING)
								.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Add_Student.createSequentialGroup()
									.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
									.addGap(8)
									.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
									.addGap(9)
									.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_42, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
									.addComponent(btnNewButton_3_4_1_2, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnNewButton_3_4_1_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_Add_Student.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Add_Student.createSequentialGroup()
									.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_11_1, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
									.addGap(14)
									.addComponent(lblNewLabel_11_2, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_11_3, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
								.addGroup(gl_Add_Student.createSequentialGroup()
									.addComponent(textField_23, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_24, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
									.addGap(9)
									.addComponent(textField_26, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(comboBox_4, 0, 245, Short.MAX_VALUE)
									.addGap(1))
								.addGroup(gl_Add_Student.createSequentialGroup()
									.addComponent(lblNewLabel_11_4, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_11_1_1, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
									.addGap(14)
									.addComponent(lblNewLabel_11_2_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_11_3_1, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
								.addGroup(gl_Add_Student.createSequentialGroup()
									.addComponent(comboBox_4_1, 0, 245, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_4_2, 0, 248, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_4_3, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_4_3_1, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
									.addGap(2))
								.addComponent(separator_2_2, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_11_7, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))))
					.addGap(49))
		);
		gl_Add_Student.setVerticalGroup(
			gl_Add_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Add_Student.createSequentialGroup()
					.addComponent(lblNewLabel_11_7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Add_Student.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBox_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_4_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
							.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_4_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
							.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Add_Student.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Add_Student.createParallelGroup(Alignment.LEADING)
							.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_42, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(separator_2_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_3_4_1_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_3_4_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		Add_Student.setLayout(gl_Add_Student);
		
		Update_Student = new JPanel();
		Update_Student.setBackground(new Color(255, 255, 255));
		Update_Student.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		Student_Main_Content.add(Update_Student, "name_90991626852300");
		
		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_27.setColumns(10);
		textField_27.setBorder(null);
		textField_27.setBackground(SystemColor.menu);
		
		textField_43 = new JTextField();
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_43.setColumns(10);
		textField_43.setBorder(null);
		textField_43.setBackground(SystemColor.menu);
		
		textField_44 = new JTextField();
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_44.setColumns(10);
		textField_44.setBorder(null);
		textField_44.setBackground(SystemColor.menu);
		
		JComboBox comboBox_4_3_2 = new JComboBox();
		comboBox_4_3_2.setBorder(null);
		
		JComboBox comboBox_4_3_1_1 = new JComboBox();
		comboBox_4_3_1_1.setBorder(null);
		
		textField_45 = new JTextField();
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_45.setColumns(10);
		textField_45.setBorder(null);
		textField_45.setBackground(SystemColor.menu);
		
		JSeparator separator_2_3 = new JSeparator();
		
		JSeparator separator_2_1_1 = new JSeparator();
		
		JSeparator separator_2_2_1 = new JSeparator();
		
		JButton btnNewButton_3_4_1_1_1 = new JButton("Save & Upload");
		btnNewButton_3_4_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		
		JButton btnNewButton_3_4_1_2_1 = new JButton("Clear All");
		btnNewButton_3_4_1_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
		
		JLabel lblNewLabel_11_5_1 = new JLabel("Mobile Number");
		lblNewLabel_11_5_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_1_2_1 = new JLabel("Email");
		lblNewLabel_11_1_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_2_2_1 = new JLabel("Class Advisor");
		lblNewLabel_11_2_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_3_2_1 = new JLabel("Blood Group");
		lblNewLabel_11_3_2_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_46 = new JTextField();
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_46.setColumns(10);
		textField_46.setBorder(null);
		textField_46.setBackground(SystemColor.menu);
		
		textField_47 = new JTextField();
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_47.setColumns(10);
		textField_47.setBorder(null);
		textField_47.setBackground(SystemColor.menu);
		
		textField_48 = new JTextField();
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_48.setColumns(10);
		textField_48.setBorder(null);
		textField_48.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_4_1_1 = new JLabel("Father Name");
		lblNewLabel_11_4_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_1_1_1_1 = new JLabel("Father Mobile Number");
		lblNewLabel_11_1_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_2_1_1_1 = new JLabel("Mother Name");
		lblNewLabel_11_2_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_3_1_1_1 = new JLabel("Mother Mobile Number");
		lblNewLabel_11_3_1_1_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_49 = new JTextField();
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_49.setColumns(10);
		textField_49.setBorder(null);
		textField_49.setBackground(SystemColor.menu);
		
		textField_50 = new JTextField();
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_50.setColumns(10);
		textField_50.setBorder(null);
		textField_50.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_6_1 = new JLabel("State");
		lblNewLabel_11_6_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_1_3_1 = new JLabel("City");
		lblNewLabel_11_1_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_2_3_1 = new JLabel("Nationality");
		lblNewLabel_11_2_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_3_3_1 = new JLabel("Religion");
		lblNewLabel_11_3_3_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_51 = new JTextField();
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_51.setColumns(10);
		textField_51.setBorder(null);
		textField_51.setBackground(SystemColor.menu);
		
		textField_52 = new JTextField();
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_52.setColumns(10);
		textField_52.setBorder(null);
		textField_52.setBackground(SystemColor.menu);
		
		textField_53 = new JTextField();
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_53.setColumns(10);
		textField_53.setBorder(null);
		textField_53.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_8 = new JLabel("Student name");
		lblNewLabel_11_8.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_1_4 = new JLabel("Register Number");
		lblNewLabel_11_1_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_2_4 = new JLabel("Date Of Birth");
		lblNewLabel_11_2_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_3_4 = new JLabel("Gender");
		lblNewLabel_11_3_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		textField_54 = new JTextField();
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_54.setColumns(10);
		textField_54.setBorder(null);
		textField_54.setBackground(SystemColor.menu);
		
		textField_55 = new JTextField();
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_55.setColumns(10);
		textField_55.setBorder(null);
		textField_55.setBackground(SystemColor.menu);
		
		textField_56 = new JTextField();
		textField_56.setHorizontalAlignment(SwingConstants.CENTER);
		textField_56.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_56.setColumns(10);
		textField_56.setBorder(null);
		textField_56.setBackground(SystemColor.menu);
		
		JComboBox comboBox_4_4 = new JComboBox();
		comboBox_4_4.setBorder(null);
		
		JLabel lblNewLabel_11_4_2 = new JLabel("Admission Type");
		lblNewLabel_11_4_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_1_1_2 = new JLabel("Scholar Type");
		lblNewLabel_11_1_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_2_1_2 = new JLabel("Branch");
		lblNewLabel_11_2_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JLabel lblNewLabel_11_3_1_2 = new JLabel("Year");
		lblNewLabel_11_3_1_2.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JComboBox comboBox_4_1_1 = new JComboBox();
		comboBox_4_1_1.setBorder(null);
		
		JComboBox comboBox_4_2_1 = new JComboBox();
		comboBox_4_2_1.setBorder(null);
		
		textField_57 = new JTextField();
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setFont(new Font("Segoe UI Variable", Font.PLAIN, 13));
		textField_57.setColumns(10);
		textField_57.setBorder(null);
		textField_57.setBackground(SystemColor.menu);
		
		JLabel lblNewLabel_11_8_1 = new JLabel("Student Register Number");
		lblNewLabel_11_8_1.setFont(new Font("Segoe UI Variable", Font.PLAIN, 15));
		
		JButton btnNewButton_4 = new JButton("Get Details");
		btnNewButton_4.setFont(new Font("Segoe UI Variable", Font.PLAIN, 14));
		GroupLayout gl_Update_Student = new GroupLayout(Update_Student);
		gl_Update_Student.setHorizontalGroup(
			gl_Update_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Update_Student.createSequentialGroup()
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Update_Student.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Update_Student.createSequentialGroup()
									.addGap(519)
									.addComponent(btnNewButton_3_4_1_2_1, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnNewButton_3_4_1_1_1, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Update_Student.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addGap(1)
											.addComponent(textField_54, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(textField_55, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(9)
											.addComponent(textField_56, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(comboBox_4_4, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addGap(1)
											.addComponent(lblNewLabel_11_4_2, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(lblNewLabel_11_1_1_2, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
											.addGap(14)
											.addComponent(lblNewLabel_11_2_1_2, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(lblNewLabel_11_3_1_2, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addGap(1)
											.addComponent(comboBox_4_1_1, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(comboBox_4_2_1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(comboBox_4_3_2, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(comboBox_4_3_1_1, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addComponent(lblNewLabel_11_5_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(lblNewLabel_11_1_2_1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
											.addGap(14)
											.addComponent(lblNewLabel_11_2_2_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(lblNewLabel_11_3_2_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addComponent(textField_46, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(textField_47, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(9)
											.addComponent(textField_48, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(textField_45, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
										.addComponent(separator_2_3, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addComponent(lblNewLabel_11_4_1_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(lblNewLabel_11_1_1_1_1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
											.addGap(14)
											.addComponent(lblNewLabel_11_2_1_1_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(lblNewLabel_11_3_1_1_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addComponent(textField_43, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(textField_49, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(textField_50, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addComponent(lblNewLabel_11_6_1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(lblNewLabel_11_1_3_1, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
											.addGap(14)
											.addComponent(lblNewLabel_11_2_3_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(lblNewLabel_11_3_3_1, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addComponent(textField_51, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(textField_52, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(9)
											.addComponent(textField_53, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(8)
											.addComponent(textField_44, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addGap(3)
											.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Update_Student.createSequentialGroup()
											.addGap(1)
											.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
												.addComponent(separator_2_2_1, GroupLayout.PREFERRED_SIZE, 1006, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_Update_Student.createSequentialGroup()
													.addComponent(lblNewLabel_11_8, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
													.addGap(8)
													.addComponent(lblNewLabel_11_1_4, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE)
													.addGap(14)
													.addComponent(lblNewLabel_11_2_4, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
													.addGap(8)
													.addComponent(lblNewLabel_11_3_4, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))))))))
						.addGroup(gl_Update_Student.createSequentialGroup()
							.addGap(46)
							.addComponent(lblNewLabel_11_8_1, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_57, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_Update_Student.setVerticalGroup(
			gl_Update_Student.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Update_Student.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_57, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
						.addComponent(lblNewLabel_11_8_1, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
						.addComponent(btnNewButton_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(separator_2_2_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_54, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_55, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_56, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_4_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_1_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_1_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_1_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_4_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4_2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4_3_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4_3_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_5_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_46, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_47, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_48, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_45, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(separator_2_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_4_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_1_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_1_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_1_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_43, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_49, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_50, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_11_6_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_1_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_2_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11_3_3_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_51, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_52, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_53, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_44, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(separator_2_1_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(gl_Update_Student.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_3_4_1_1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_4_1_2_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Update_Student.setLayout(gl_Update_Student);
		
		Delete_Student = new JPanel();
		Student_Main_Content.add(Delete_Student, "name_95163670840500");
		
		Add_Profile_Photo = new JPanel();
		Student_Main_Content.add(Add_Profile_Photo, "name_95240060941600");
		AddStudent.setLayout(gl_AddStudent);
		
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
		
		JButton btnNewButton_1 = new JButton("STUDENTS");
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

	
