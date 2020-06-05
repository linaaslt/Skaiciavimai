package ernadas.labasspring;

import java.util.Scanner;

public class SkaiciausIvedimas {
	
	public String skaicius_ivestas;
	
	public SkaiciausIvedimas () {
		
	}
	
	public SkaiciausIvedimas ( String skaicius_nurodytas) {

		skaicius_ivestas = skaicius_nurodytas;
	}	
	
	public String Ivedimas () {
		
		return skaicius_ivestas;
	}
}
