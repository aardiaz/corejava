package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField unTxt;
	private JPasswordField pswTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("LoginForm");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 534, 383);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(97, 125, 78, 23);
		contentPane.add(lblUsername);
		
		unTxt = new JTextField();
		unTxt.setBounds(202, 117, 185, 38);
		contentPane.add(unTxt);
		unTxt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(97, 197, 62, 23);
		contentPane.add(lblPassword);
		
		pswTxt = new JPasswordField();
		pswTxt.setBounds(202, 189, 185, 38);
		contentPane.add(pswTxt);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//JOptionPane.showMessageDialog(null, "Hello");
				
				if(unTxt.getText().isEmpty()) {
					JOptionPane.showMessageDialog(unTxt, "username required");
					return;
				}
				
				if(pswTxt.getText().isEmpty()) {
					JOptionPane.showMessageDialog(pswTxt, "password  required");
					return;
				}
				
				String un = unTxt.getText();
				String psw = String.valueOf(pswTxt.getPassword()); //pswTxt.getText();
				
				//check user in db
				try {
					
						Class.forName("com.mysql.jdbc.Driver");
						Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db8pm", "root", "1234");
	
						String sql = "select * from user where username = '"+un+"' and password ='"+psw+"'   ";
						Statement  stm = con.createStatement();
						
						ResultSet  rs = stm.executeQuery(sql);
						if(rs.next()) {
							new HomePage().setVisible(true);
							dispose();
						}else {
							JOptionPane.showMessageDialog(null, "login failed");
						}
						
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
//				if(un.equals("ram") && psw.equals("123")) {
//					
//					//JOptionPane.showMessageDialog(null, "login success");
//					new HomePage().setVisible(true);
//					dispose();
//					
//				}else {
//					JOptionPane.showMessageDialog(null, "login failed");
//				}
				
			}
		});
		btnLogin.setBackground(Color.MAGENTA);
		btnLogin.setBounds(238, 247, 115, 38);
		contentPane.add(btnLogin);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setForeground(Color.GREEN);
		lblUserLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblUserLogin.setBounds(146, 31, 268, 67);
		contentPane.add(lblUserLogin);
	}
}
