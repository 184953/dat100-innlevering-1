package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		int stud=1;
		while (stud<=10) {
		int poeng = parseInt(showInputDialog("Poeng på prøven: "));
		
		
		if ((poeng<=100) && (poeng>=90)){
			System.out.println("Karakteren er A");
			stud++;
		}
			else if ((poeng<=89) && (poeng>=80)){
			System.out.println("Karakteren er B");
			stud++;
			}
			else if ((poeng<=79) && (poeng>=60)) {
			System.out.println("Karakteren er C");
			stud++;
			}
			else if ((poeng<=59) && (poeng>=50)){
			System.out.println("Karakteren er D");
			stud++;
			}
			else if ((poeng<=49) && (poeng>=40)) {
			System.out.println("Karakteren er E");
			stud++;
			}
			else if ((poeng<=39) && (poeng>=0)) {
			System.out.println("Karakteren er F");
			stud++;
			}
		
		else {
			System.out.println("Poengsummen er ugyldig");
		}
	
		}
	}

}
