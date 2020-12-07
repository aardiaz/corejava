package javaswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableTest extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblName;
	private JTextField nameTxt;
	private JLabel lblAddress;
	private JTextField addressTxt;
	private JLabel lblCountry;
	private JComboBox countryCmb;
	private JLabel lblGender;
	private JRadioButton maleRbt;
	private JRadioButton femaleRbt;
	private JCheckBox agreeChk;
	private JButton btnSave;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableTest frame = new TableTest();
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
	public TableTest() {
		setTitle("Table Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnClear());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Input Panel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(10, 11, 572, 144);
			panel.setLayout(null);
			panel.add(getLblName());
			panel.add(getNameTxt());
			panel.add(getLblAddress());
			panel.add(getAddressTxt());
			panel.add(getLblCountry());
			panel.add(getCountryCmb());
			panel.add(getLblGender());
			panel.add(getMaleRbt());
			panel.add(getFemaleRbt());
			panel.add(getAgreeChk());
			panel.add(getBtnSave());
		}
		return panel;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name");
			lblName.setBounds(10, 30, 46, 14);
		}
		return lblName;
	}
	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(58, 27, 86, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(172, 30, 70, 14);
		}
		return lblAddress;
	}
	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setBounds(252, 27, 86, 20);
			addressTxt.setColumns(10);
		}
		return addressTxt;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(350, 30, 52, 14);
		}
		return lblCountry;
	}
	private JComboBox getCountryCmb() {
		if (countryCmb == null) {
			countryCmb = new JComboBox();
			countryCmb.setModel(new DefaultComboBoxModel(new String[] {"----select-----", "Nepal", "China", "India", "US", "Korea", "Japan"}));
			countryCmb.setBounds(429, 27, 105, 20);
		}
		return countryCmb;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(10, 87, 46, 14);
		}
		return lblGender;
	}
	private JRadioButton getMaleRbt() {
		if (maleRbt == null) {
			maleRbt = new JRadioButton("Male");
			buttonGroup.add(maleRbt);
			maleRbt.setBounds(69, 83, 61, 23);
		}
		return maleRbt;
	}
	private JRadioButton getFemaleRbt() {
		if (femaleRbt == null) {
			femaleRbt = new JRadioButton("Female");
			buttonGroup.add(femaleRbt);
			femaleRbt.setBounds(145, 83, 78, 23);
		}
		return femaleRbt;
	}
	private JCheckBox getAgreeChk() {
		if (agreeChk == null) {
			agreeChk = new JCheckBox("Agree");
			agreeChk.setBounds(257, 83, 67, 23);
		}
		return agreeChk;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(nameTxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(nameTxt, "name is required!!");
						return;
					}
					
					String nm = nameTxt.getText();
					String adr = addressTxt.getText();
					String country = countryCmb.getSelectedItem().toString();
					
					String gender;
					
					if(maleRbt.isSelected()) {
						gender = "Male";
					}else {
						gender = "Female";
					}
					
					String agree;
					
					if(agreeChk.isSelected()) {
						agree = "Yes";
					}else {
						agree = "No";
					}
					
					
					//display values in table
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {nm,adr,country,gender,agree});
					
					//clear data from input panel
					nameTxt.setText(null);
					addressTxt.setText(null);
					countryCmb.setSelectedIndex(0);
					buttonGroup.clearSelection();
					agreeChk.setSelected(false);
					
					
				}
			});
			btnSave.setBounds(443, 83, 89, 23);
		}
		return btnSave;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 177, 572, 237);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Address", "Country", "Gender", "Agree"
				}
			));
		}
		return table;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				DefaultTableModel model	= (DefaultTableModel) table.getModel();
					model.setRowCount(0);
				}
			});
			btnClear.setBounds(417, 425, 89, 23);
		}
		return btnClear;
	}
}
