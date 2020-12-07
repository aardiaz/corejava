package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class TabbedPaneTest extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblUsername;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JLabel lblUsername_1;
	private JTextField textField_1;
	private JLabel lblPassword_1;
	private JPasswordField passwordField_1;
	private JButton btnSignup;
	private JLabel lblUsername_1_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabbedPaneTest frame = new TabbedPaneTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TabbedPaneTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTabbedPane());
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(10, 11, 631, 417);
			tabbedPane.addTab("Login", null, getPanel(), null);
			tabbedPane.addTab("Signup", null, getPanel_1(), null);
			tabbedPane.addTab("Home", null, getPanel_2(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblUsername());
			panel.add(getTextField());
			panel.add(getLblPassword());
			panel.add(getPasswordField());
			panel.add(getBtnLogin());
			panel.add(getLblNewLabel());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getLblUsername_1());
			panel_1.add(getTextField_1());
			panel_1.add(getLblPassword_1());
			panel_1.add(getPasswordField_1());
			panel_1.add(getBtnSignup());
			panel_1.add(getLblUsername_1_1());
			panel_1.add(getTextField_2());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
		}
		return panel_2;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("UserName");
			lblUsername.setIcon(new ImageIcon(TabbedPaneTest.class.getResource("/javax/swing/plaf/metal/icons/ocean/homeFolder.gif")));
			lblUsername.setBounds(237, 119, 101, 31);
		}
		return lblUsername;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(348, 106, 249, 56);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setIcon(new ImageIcon(TabbedPaneTest.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
			lblPassword.setBounds(237, 214, 86, 22);
		}
		return lblPassword;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(348, 199, 249, 56);
		}
		return passwordField;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.setIcon(new ImageIcon(TabbedPaneTest.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			btnLogin.setBounds(399, 271, 165, 46);
		}
		return btnLogin;
	}
	private JLabel getLblUsername_1() {
		if (lblUsername_1 == null) {
			lblUsername_1 = new JLabel("UserName");
			lblUsername_1.setBounds(88, 156, 101, 31);
		}
		return lblUsername_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(199, 143, 311, 56);
		}
		return textField_1;
	}
	private JLabel getLblPassword_1() {
		if (lblPassword_1 == null) {
			lblPassword_1 = new JLabel("Password");
			lblPassword_1.setBounds(88, 259, 72, 14);
		}
		return lblPassword_1;
	}
	private JPasswordField getPasswordField_1() {
		if (passwordField_1 == null) {
			passwordField_1 = new JPasswordField();
			passwordField_1.setBounds(199, 236, 311, 56);
		}
		return passwordField_1;
	}
	private JButton getBtnSignup() {
		if (btnSignup == null) {
			btnSignup = new JButton("Signup");
			btnSignup.setBounds(289, 318, 165, 46);
		}
		return btnSignup;
	}
	private JLabel getLblUsername_1_1() {
		if (lblUsername_1_1 == null) {
			lblUsername_1_1 = new JLabel("Name");
			lblUsername_1_1.setBounds(88, 78, 101, 31);
		}
		return lblUsername_1_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(199, 65, 311, 56);
		}
		return textField_2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(10, 69, 328, 264);
			lblNewLabel.setIcon(new ImageIcon(new ImageIcon(TabbedPaneTest.class.getResource("/imgs/logo.png")).getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
			
		}
		return lblNewLabel;
	}
}
