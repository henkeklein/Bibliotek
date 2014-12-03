package Bibliotek;

import java.awt.*;
import javax.swing.*;

public class Interface extends JPanel {
	
	private JPanel labelpanel = new JPanel (new GridLayout(1, 1));
	private JPanel inputpanel = new JPanel (new GridLayout(1, 1));
	
	
	private JTextField tfTitel = new JTextField ();
	private JTextField tfYear = new JTextField ();
	private JTextField tfName = new JTextField ();
	
	private JLabel lbltitel = new JLabel ("Titel:");
	private JLabel lblyear = new JLabel ("År:");
	private JLabel lblname = new JLabel ("Skriven av:");
	
	public Interface () {
		Font nummer1 = new Font ("Meny", Font.BOLD, 12);
		setLayout (new BorderLayout());
		setPreferredSize (new Dimension(400, 100));
		
		labelpanel.setPreferredSize(new Dimension (100, 0));
		lbltitel.setFont(nummer1);
		lblyear.setFont(nummer1);
		lblname.setFont(nummer1);
		
		labelpanel.add(lbltitel);
		labelpanel.add(lblyear);
		labelpanel.add(lblname);
		
		inputpanel.add (tfTitel);
		inputpanel.add (tfYear);
		inputpanel.add (tfName);
		
		add (labelpanel, BorderLayout.CENTER);
		add (inputpanel, BorderLayout.SOUTH);
		
		
	}
	
	public String getTitel () {
		return tfTitel.getText();
	}
	
	public String getYear () {
		return tfYear.getText();
	}
	
	public String getName () {
		return tfName.getText();
	}
	
}
