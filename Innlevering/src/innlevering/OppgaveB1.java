package innlevering;


import static java.lang.Math.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

public class OppgaveB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nedre = showInputDialog("Nedre grense");
		String ovre = showInputDialog("Øvre Grense");
		
		int nedreGrense = parseInt(nedre);
		int ovreGrense = parseInt(ovre);
		
		for (int i = nedreGrense; i <= ovreGrense; i++) {
			
			 int oddetall = nedreGrense % 2;
			 int partall = nedreGrense / 2;
			 
			 if (oddetall != partall) {
			
			
			showMessageDialog(null,"Oddetall: " + oddetall);
			
			 }
		
			}
		
		}
	}
