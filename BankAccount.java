package Bibliotek;
import javax.swing.*;
public class BankAccount {

	private String AccountNbr;
	private double balance;
	private double insättning = 0;
	private double uttag = 0;
	public BankAccount (String AccountNbr, double balance) {
		setAccountNbr();
		sättintaut();
	}
	
	public String getAccountNbr () {
		return AccountNbr;
	}
	
	public double getBalance () {
		
		return balance;
	}
	public void checkAcc () {
		AccountNbr = JOptionPane.showInputDialog ("Ange ditt kontonummer, mer än 5 siffror");
		while (AccountNbr.length() < 5) {
			JOptionPane.showMessageDialog(null, "Fel kontonummer");	
			AccountNbr = JOptionPane.showInputDialog ("Ange ditt kontonummer, mer än 5 siffror");
		} 
		if (AccountNbr.length() >= 5) {
			JOptionPane.showMessageDialog(null, "Välkommen " + AccountNbr);	
		}
		
		
	}
	
	public void checkCash () {
		insättning =  Double.parseDouble(JOptionPane.showInputDialog( "Ange hur mycket du vill sätta in"));
		while (insättning <= 0) {
			JOptionPane.showMessageDialog(null, "Ange en större summa");
			insättning =  Double.parseDouble(JOptionPane.showInputDialog( "Ange hur mycket du vill sätta in"));
		}
		if (insättning > 0) {
			balance = balance + insättning;
		}
	}
	public void checkCash1 () {
		uttag =  Double.parseDouble(JOptionPane.showInputDialog( "Ange hur mycket du vill ta ut"));
		while (balance < uttag) {
			JOptionPane.showMessageDialog(null, "Ditt uttag är större än saldot");
			uttag =  Double.parseDouble(JOptionPane.showInputDialog( "Ange hur mycket du vill ta ut"));
		}
		if (insättning >= uttag){
			balance = balance - uttag;
		}
		
	}
	public void setAccountNbr () {
		checkAcc();
	}
	public void checkSaldo (){
		JOptionPane.showMessageDialog(null, "Ditt saldo är: " + balance);
	}

	public void sättintaut () {
		
			
		String val = "MENYVAL:\n\n" + "" +
                "1. Sätt in pengar. \n2. Ta ut pengar. \n3. Checka saldo \n \n \nVid annat ärende gå till manuell disk \n" +
                "-----------------------\n" +
                "0. Avsluta";
		
		int user = Integer.parseInt(JOptionPane.showInputDialog(val));
		while (user != 0){
		switch (user) {
		case 1: 
			checkCash();
			
			break;
		case 2: 
			checkCash1();
			break;
		case 3:
			checkSaldo();
		}
		user = Integer.parseInt(JOptionPane.showInputDialog(val));
	}
		
	}
	
	
	
}

§ git config --global user.name "YOUR NAME"