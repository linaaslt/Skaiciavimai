package ernadas.labasspring;

import java.math.BigInteger;

public class SkaiciausKeitimasIsSesioliktainesIDvejetaine extends SkaiciuKeitimas {

	public  SkaiciausKeitimasIsSesioliktainesIDvejetaine () {
		
	}
	
	public void Keisti () {
		
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
