package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.event.InputEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setTitle("Index");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 495);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new LoginForm().setVisible(true);
			}
		});
		mnFile.add(mntmOpen);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmSearch = new JMenuItem("Search");
		mnHelp.add(mntmSearch);
		
		JMenuItem mntmInstall = new JMenuItem("Install");
		mnHelp.add(mntmInstall);
		
		JMenuItem mntmMarketplace = new JMenuItem("Marketplace");
		mnHelp.add(mntmMarketplace);
		
		JMenu mnDrinks = new JMenu("Drinks");
		menuBar.add(mnDrinks);
		
		JMenu mnHardDrinks = new JMenu("Hard Drinks");
		mnDrinks.add(mnHardDrinks);
		
		JMenuItem mntmVodka = new JMenuItem("Vodka");
		mnHardDrinks.add(mntmVodka);
		
		JMenuItem mntmRedlabel = new JMenuItem("RedLabel");
		mnHardDrinks.add(mntmRedlabel);
		
		JMenuItem mntmBlacklabel = new JMenuItem("BlackLabel");
		mnHardDrinks.add(mntmBlacklabel);
		
		JMenuItem mntmJd = new JMenuItem("JD");
		mnHardDrinks.add(mntmJd);
		
		JMenuItem mntmLocal = new JMenuItem("Local");
		mnHardDrinks.add(mntmLocal);
		
		JMenu mnSoftDrinks = new JMenu("Soft Drinks");
		mnDrinks.add(mnSoftDrinks);
		
		JMenuItem mntmBeer = new JMenuItem("Beer");
		mnSoftDrinks.add(mntmBeer);
		
		JMenuItem mntmWine = new JMenuItem("wine");
		mnSoftDrinks.add(mntmWine);
		
		JMenuItem mntmCoke = new JMenuItem("Coke");
		mnSoftDrinks.add(mntmCoke);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                                        photo  ");
		lblNewLabel.setBounds(131, 123, 269, 243);
		//lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\az\\Pictures\\Saved Pictures\\009.jpg").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
		lblNewLabel.setBorder(new LineBorder(Color.GREEN));
		
		contentPane.add(lblNewLabel);
		
		JButton btnUpload = new JButton("upload ");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser  jf  = new JFileChooser();
				jf.showOpenDialog(null);
				
				File  img = jf.getSelectedFile();
				lblNewLabel.setIcon(new ImageIcon(new ImageIcon(img.getAbsolutePath()).getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_DEFAULT)));
				
			}
		});
		btnUpload.setBounds(285, 74, 89, 23);
		contentPane.add(btnUpload);
	}
}
