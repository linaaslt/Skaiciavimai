package ernadas.labasspring;

public class SkaiciusKeitimasIsDesimtainesIDvejetaine extends SkaiciuKeitimas {

	public SkaiciusKeitimasIsDesimtainesIDvejetaine () {
		
		super();
		
	}
		
	public  String[] getChrsAlowed() {
		
		String[] chrs_alowedx = { "0", "1", "3", "4", "5", "6", "7", "8", "9" };
		return chrs_alowedx;
	}	
	
	public void Keisti() { 
		
		if ( ! flag_error )  {
		
		int skaicius = Integer.parseInt(skaicius_is);
	    String dvejet_skaiciai = "";
		int skaiciai = 0;
	    skaiciai = skaicius;
	 
			while( skaiciai > 0){
			
				if( skaiciai % 2 == 0){
					
					dvejet_skaiciai = "0" + dvejet_skaiciai;
					
				} else {
					
					dvejet_skaiciai = "1" + dvejet_skaiciai;
				}

				skaiciai = skaiciai / 2;
			}

			skaicius_y = dvejet_skaiciai;

		}
	}
}
