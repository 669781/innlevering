package innlevering;

import static java.lang.Math.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

public class OppgaveB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		for (int i=0; i<10; i++) {		//For løkke som kjører programmet 10 ganger
		
			String karakter = showInputDialog("Poeng");
			int karakterVerdi = parseInt(karakter);
			
			//Program som gir ut karakter basert på verdi bruker mater in
			
		if (karakterVerdi <= 100 && karakterVerdi >=90) {
			
			showMessageDialog(null, "Du får karakteren A");
			
		} else if (karakterVerdi >= 80 && karakterVerdi <= 89) {
			
			showMessageDialog(null, "Du får karakteren B");
			
		} else if (karakterVerdi >= 60 && karakterVerdi <= 79) {
			
			showMessageDialog(null, "Du får karakteren C");
			
		} else if (karakterVerdi >= 50 && karakterVerdi <= 59) {
			
			showMessageDialog(null, "Du får karakteren D");
			
		} else if (karakterVerdi >= 40 && karakterVerdi <= 49) {
			
			showMessageDialog(null, "Du får karakteren E");
			
		} else if (karakterVerdi >= 0 && karakterVerdi <= 39) {
			
			showMessageDialog(null, "Du får karakteren F");
			
		} else {
			
			showMessageDialog(null, "Ugyldig verdi");
			i = i - 1; //Resetter forløkken en gang om du gir ugyldig verdi
			
		}
		
		}
	
		
	}



}
