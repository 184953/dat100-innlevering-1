package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O3 {


	public static void main(String[] args) {
		int sum = 1;
		int n = parseInt(showInputDialog("Skriv inn eit heltal: "));
		for (int i = n; i>=1; i--) {
			sum =sum *i;
			
		}
		showMessageDialog(null, "Summen av fakultet av heltallet er: " + sum);
	}
}