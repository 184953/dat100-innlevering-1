package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		double inntekt = parseInt(showInputDialog("Årsinntekt i kr: "));
		
		//Gjer endring av parametre og skatt lettere dersom det endres året etter
		int utskatt = 208050;
		
		int trinntopp1 = 292850;
		int trinnbunn1 = 208051;
		double skatt1 = 1.7/100;
				
		int trinntopp2 = 670000;
		int trinnbunn2 = 292851;
		double skatt2 = 4.0/100;
				
		int trinntopp3 = 937900;
		int trinnbunn3 = 670001;
		double skatt3 = 13.6/100;
				
		int trinntopp4 = 1350000;
		int trinnbunn4 = 937901;
		double skatt4 = 16.6/100;
		
		int trinnbunn5 = 1350001;
		double skatt5 = 17.6/100;
		
		//Skattetrinn
		double trinn1 = (trinntopp1-trinnbunn1+1)*skatt1;
		double trinn2 = (trinntopp2-trinnbunn2+1)*skatt2;
		double trinn3 = (trinntopp3-trinnbunn3+1)*skatt3;
		double trinn4 = (trinntopp4-trinnbunn4+1)*skatt4;

		
		if (inntekt>=trinnbunn5){
			double intskatt = (inntekt-trinntopp4)*skatt5;
			double skattkr = trinn1+trinn2+trinn3+trinn4+intskatt;
			String skatt = String.format("%,.2f",  skattkr );
			showMessageDialog(null, "Trinnskatten din er 17.6% og du skal betale " + skatt + " kr i skatt.");
		}
			else if ((inntekt<=trinntopp4) && (inntekt>=trinnbunn4)) {
				double intskatt = (inntekt-trinntopp3)*skatt4;
				double skattkr = trinn1+trinn2+trinn3+intskatt;
				String skatt = String.format("%,.2f",  skattkr );
				showMessageDialog(null, "Trinnskatten din er 16.6% og du skal betale " + skatt + " kr i skatt.");
			}
			else if ((inntekt<=trinntopp3) && (inntekt>=trinnbunn3)){
				double intskatt = (inntekt-trinntopp2)*skatt3;
				double skattkr = trinn1+trinn2+intskatt;
				String skatt = String.format("%,.2f",  skattkr );
				showMessageDialog(null, "Trinnskatten din er 13.6% og du skal betale " + skatt + " kr i skatt.");
			}
			else if ((inntekt<=trinntopp2) && (inntekt>=trinnbunn2)) {
				double intskatt = (inntekt-trinntopp1)*skatt2;
				double skattkr = trinn1+trinn2+intskatt;
				String skatt = String.format("%,.2f",  skattkr );
				showMessageDialog(null, "Trinnskatten din er 4.0% og du skal betale " + skatt + " kr i skatt.");
			}
			else if ((inntekt<=trinntopp1) && (inntekt>=trinnbunn1)) {
				double intskatt = (inntekt-utskatt)*skatt1;
				double skattkr = intskatt;
				String skatt = String.format("%,.2f",  skattkr );
				showMessageDialog(null, "Trinnskatten din er 1.7% og du skal betale " + skatt + " kr i skatt.");
			}
			else {
			showMessageDialog(null, "Du betaler ingen trinnskatt");
		}

	}

}
