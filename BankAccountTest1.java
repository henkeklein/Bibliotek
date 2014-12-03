package Bibliotek;

import javax.swing.JOptionPane;

public class BankAccountTest1 {
	private BaankAccount h = new BaankAccount("", 0);
	
	public static void main (String [] args) {
		
	
		
	}

	public void skrivut() {
		JOptionPane.showMessageDialog(null, "Konto: " + h.getAccountNbr() + "\nHar: " + h.getBalance() + " kronor");
		JOptionPane.showMessageDialog(null, "Tack för ditt ärende, välkommen åter");
		
	}
}