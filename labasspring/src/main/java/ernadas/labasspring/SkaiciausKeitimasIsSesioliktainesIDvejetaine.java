package ernadas.labasspring;

import java.math.BigInteger;

public class SkaiciausKeitimasIsSesioliktainesIDvejetaine extends SkaiciuKeitimas {

	public  SkaiciausKeitimasIsSesioliktainesIDvejetaine () {
		super();
	}

	public  String[] getChrsAlowed() {
		
		String[] chrs_alowedx = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
								, "A", "B", "C", "D", "E", "F" };
		return chrs_alowedx;
	}	
	
	public void Keisti () {
		
		if ( ! flag_error )  {
		
		String skaicius = (skaicius_is);
		String rastas_skaicius = new BigInteger(skaicius, 16).toString(2);
		int skaiciavimas = rastas_skaicius.length();
   
		 if (skaiciavimas < 8) {
			 
			 for (int i = 0; i < 8 - skaiciavimas; i++) {
				 rastas_skaicius = "0" + rastas_skaicius;
			 }
		 }
		 
		 skaicius_y =  rastas_skaicius;
		}
	}
}
