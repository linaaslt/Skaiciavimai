package ernadas.labasspring;

import java.util.Scanner;

public class SkaiciausIvedimasIsKlaviaturos extends SkaiciausIvedimas {
	
	public String message;
	
	public SkaiciausIvedimasIsKlaviaturos () {
		
		this.message = "Iveskite skaiciu konvertavimui";
	}
	
	public SkaiciausIvedimasIsKlaviaturos ( String message ) {
		
		this.message = message;
	}	
	
	public String Ivedimas () {
		
		Scanner nuskaityti = new Scanner (System.in);
		System.out.println ( message );
		//n = nuskaityti.nextInt();
		skaicius_ivestas = nuskaityti.nextLine();
		return skaicius_ivestas;
	}	

}
