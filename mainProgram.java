package Bibliotek;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class mainProgram extends JPanel implements ActionListener {
	
	private JButton uppdatera = new JButton ("Spara Bok");
	private JTextArea textarea = new JTextArea ();
	private Interface interface1 = new Interface();
	
	
	public mainProgram () {
		setLayout (new BorderLayout());
		textarea.setPreferredSize(new Dimension(300, 100));
		textarea.setEditable(false);
		uppdatera.addActionListener(this);
		add (interface1, BorderLayout.NORTH);
		add (textarea, BorderLayout.CENTER);
		add (uppdatera, BorderLayout.SOUTH);
	}
	
	public void actionPerformed (ActionEvent e ) {
		textarea.setText("Titel: " + interface1.getTitel() + "\nUtgivningsår: " + interface1.getYear() + "\nFörfattare: " + interface1.getName());
	}
	
	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new mainProgram());
		frame.pack();
		frame.setVisible(true);
		}
		});
		BankAccountTest1 A = new BankAccountTest1();
		A.skrivut();
		JFrame frame1 = new JFrame();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
