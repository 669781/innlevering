package innlevering;

import static java.lang.Math.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;

public class OppgaveB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lønn = showInputDialog("Din Lønn");
		int skatt = parseInt(lønn);
		
		DecimalFormat f = new DecimalFormat("##.00"); //Runder ned decimalene til 2 decimaler
		
		if (skatt <= 190349) {
			
			//Nedenfor regner man ut de forskjellige skattetrinnene ettersom hvor mye man tjener
			
			String trinnNull = ("Du betaler 0% skatt og tjener - " + skatt); 
			showMessageDialog(null, trinnNull);
			
		} else if (skatt >= 190350 && skatt <= 267899){
			
			double skatt1 = skatt * (0.983);
			showMessageDialog(null, "Du tjener kr " + f.format(skatt1) + "kr etter skatt");
			
		} else if (skatt >= 267900 && skatt <= 643799) {
			
			double skatt2 = skatt * (0.96);
			showMessageDialog(null, "Du tjener kr " + f.format(skatt2) + "kr etter skatt" );
			
		} else if (skatt >= 643800 && skatt <= 969199) {
			
			double skatt3 = skatt * (0.866);
			showMessageDialog(null, "Du tjener kr " + f.format(skatt3) + "kr etter skatt" );
			
		} else if (skatt >= 969200 && skatt <= 1999999) {
			
			double skatt4 = skatt * (0.836);
			showMessageDialog(null, "Du tjener kr " + f.format(skatt4) + "kr etter skatt" );
			
		} else if (skatt > 2000000) {
			
			double skatt5 = skatt * (0.826);
			showMessageDialog(null, "Du tjener kr " + f.format(skatt5) + "kr etter skatt" );
			
		}
		
	}

}
