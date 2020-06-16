package ernadas.labasspring;


public class SkaiciausKeitimasIsDesimtaineISesioliktaine extends SkaiciuKeitimas {
		
	
	public SkaiciausKeitimasIsDesimtaineISesioliktaine () {
		
		super();
	}
	
	public  String[] getChrsAlowed() {
		
		String[] chrs_alowedx = { "0", "1", "3", "4", "5", "6", "7", "8", "9" };
		return chrs_alowedx;
	}	
	
	public void Keisti () {
		
		if ( ! flag_error )  {	
			
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

}
