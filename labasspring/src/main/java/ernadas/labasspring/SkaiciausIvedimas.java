package ernadas.labasspring;

import java.util.Scanner;

public class SkaiciausIvedimas extends SkaiciuKeitimas {
	
	public SkaiciausIvedimas () {
		
	}
	
	public void Ivedimas () {
		
		int n;
		Scanner nuskaityti = new Scanner (System.in);
		System.out.println ("Iveskite skaiciu konvertavimui");
		//n = nuskaityti.nextInt();
		skaicius_is = Integer.toString (nuskaityti.nextInt());
		
	}

}
