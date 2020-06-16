package ernadas.labasspring;

public class SkaiciausKeitimasIsDvejetainesIDesimtaine extends SkaiciuKeitimas {


	public SkaiciausKeitimasIsDvejetainesIDesimtaine () {
		
		super();
		
	}
	
	public  String[] getChrsAlowed() {
			
			String[] chrs_alowedx = { "0", "1" };
			return chrs_alowedx;
		}		
	
	public void Keisti () {
		
		if ( ! flag_error )  {
		
		int skaicius = Integer.parseInt(skaicius_is);
	    int rasti_skaiciai = 0;
		long skaiciai = 0;
	    int daliklis = 10;
		int kiekis = 0;
	 
			while ( skaicius > 0) {
			
				skaiciai = skaicius % daliklis;
			
				if( skaiciai == 0 || skaiciai == 1){
					
					rasti_skaiciai = (int) (rasti_skaiciai + skaiciai * Math.pow(2, kiekis));
					skaicius  = skaicius / daliklis;
				
				} else {
				
					System.out.println ("Neteisingai ivestas skaicius ");
					break;			
				}

				kiekis++;
			}
			skaicius_y = Integer.toString( rasti_skaiciai );
		}
	}
}