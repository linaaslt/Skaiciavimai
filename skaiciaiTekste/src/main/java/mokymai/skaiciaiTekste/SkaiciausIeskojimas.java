package mokymai.skaiciaiTekste;

public class SkaiciausIeskojimas {

	
	public SkaiciausIeskojimas () {
		
	}
	

	public static boolean yraSkaitmuo ( String simbolis ) {
		
		String[] skaitmenys = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		
		boolean yra_skaitmuo = false;
		
		for (int i = 0; i < 10; i++ ) {
		
			if ( simbolis.equals ( skaitmenys [ i ] ) ) {
			
				yra_skaitmuo = true;
				
			}
		}
		
	return yra_skaitmuo;
	
	}
	
	
}
