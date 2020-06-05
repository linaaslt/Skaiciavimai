package ernadas.labasspring;

import java.util.Scanner;

public class SkaiciausKeitimasIsDesimtaineISesioliktaine extends SkaiciuKeitimas {
	
	public SkaiciausKeitimasIsDesimtaineISesioliktaine () {
	}
		
	public void Keisti () {
										
			int skaicius = Integer.parseInt(skaicius_is);
			String simboliai = "0123456789ABCDEF";	
			String skaiciai = "";
			int daliklis = 16;
			
			
			while ( skaicius > 0 ){
		
				int simb = skaicius % daliklis;
				skaiciai = simboliai.charAt(simb) + skaiciai;
				skaicius = skaicius / daliklis;
			}
			
			skaicius_y = skaiciai;
		
	}

}
