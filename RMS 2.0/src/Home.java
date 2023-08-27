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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class Home {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
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
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_30;
	private JTextField textField_28;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_29;

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
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		lblNewLabel_9.setIcon(new ImageIcon("D:\\Apps\\Eclipse\\Java programs\\RMS 2.0\\images\\new_logo-removebg-preview.png"));
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(new ImageIcon("C:\\Users\\VEKGADESH\\Documents\\Allegorithmic\\grp-removebg-preview.png"));
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
							.addComponent(lblNewLabel_3_2_1, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_5_1.createSequentialGroup()
							.addGroup(gl_panel_5_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(lblNewLabel_6_4, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(7)
									.addComponent(lblNewLabel_6_1_3, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3_1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2_1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(textField_16, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_17, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_18, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_19, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(lblNewLabel_6_2_2, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(7)
									.addComponent(lblNewLabel_6_1_1_2, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3_2_2, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2_2_2, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(textField_20, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_21, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_22, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_23, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(lblNewLabel_6_2_1_1, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(7)
									.addComponent(lblNewLabel_6_1_1_1_1, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
									.addGap(40)
									.addComponent(lblNewLabel_6_3_2_1_1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(lblNewLabel_6_1_2_2_1_1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
								.addGroup(gl_panel_5_1.createSequentialGroup()
									.addComponent(textField_24, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_25, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
									.addGap(39)
									.addComponent(textField_26, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
									.addGap(8)
									.addComponent(textField_27, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
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
					.addGap(17)
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
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
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
		
		JLabel lblNewLabel_6_3_2_1 = new JLabel("3");
		lblNewLabel_6_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_6_3_2_1.setBorder(new LineBorder(new Color(220, 220, 220), 1, true));
		
		JLabel lblNewLabel_6_1_2_2_1 = new JLabel("4");
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
				layeredPane.add(StaffProfile);
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
		Year currentYear = Year.now();
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
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

	