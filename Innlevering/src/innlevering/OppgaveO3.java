package innlevering;

import static java.lang.Math.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;


public class OppgaveO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tallTxt = showInputDialog("Gi Heltall");
		int tall = parseInt(tallTxt), i = 1;
		long factorial = 1;
		
		while(i <= tall) {
			
			factorial *= i;
			i++;
		}
		showMessageDialog(null,factorial);
		
	
		
	}
}


