package javaswing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormTest {
	
	public static void main(String[] args) {
		
		JFrame  jf = new JFrame();
		
		jf.setSize(600, 600);
		jf.setTitle("Test Form");
		
		
		
		
		jf.setLayout(null);
		
		
		//Jlabel 
		JLabel  jl = new JLabel("Welcome");
		jl.setBounds(100, 50, 90, 20);
		jf.add(jl);
		
		
		
        		
		
		jf.setVisible(true);
		
	}

}
