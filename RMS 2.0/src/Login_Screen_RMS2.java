import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Window.Type;

public class Login_Screen_RMS2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

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
					Login_Screen_RMS2 window = new Login_Screen_RMS2();
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
	public Login_Screen_RMS2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setVisible(true);
		frame.setBounds(100, 100, 841, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 0, 841, 93);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("PPG INSTITUTE OF TECHNOLOGY");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblNewLabel_8.setBounds(146, 0, 525, 36);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Approved by AICTE , New Delhi , Affiliated to Anna University , Chennai");
		lblNewLabel_8_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_8_1.setBounds(146, 26, 525, 36);
		panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Recognized by UGC & Accredited by NAAC , IS0 9001:2015 Certified Institution");
		lblNewLabel_8_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_8_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 14));
		lblNewLabel_8_1_1.setBounds(146, 57, 525, 20);
		panel.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Login_Screen_RMS2.class.getResource("/images/new_logo-removebg-preview.png")));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setBounds(46, 0, 99, 93);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(new ImageIcon(Login_Screen_RMS2.class.getResource("/images/grp-removebg-preview.png")));
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1.setBounds(686, 0, 94, 93);
		panel.add(lblNewLabel_9_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 95, 827, 376);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\VEKGADESH\\Downloads\\user_1077114.png"));
		lblNewLabel.setBounds(217, 63, 35, 38);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\VEKGADESH\\Downloads\\key_807292.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(217, 162, 35, 38);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(217, 111, 369, 41);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(49, 328, 311, 38);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(508, 328, 311, 38);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\VEKGADESH\\Downloads\\customer-behavior_2051896 (1).png"));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(86, 188, 35, 38);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("USER NMAE");
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		lblNewLabel_2.setBounds(260, 63, 198, 41);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("USER NMAE");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(260, 162, 198, 41);
		panel_1.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 210, 369, 41);
		panel_1.add(textField_1);
	}
}
