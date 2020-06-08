package ernadas.labasspring;

public class SkaiciausKeitimasIsDvejetainesIDesimtaine extends SkaiciuKeitimas {


	public SkaiciausKeitimasIsDvejetainesIDesimtaine () {
		
	}
	
	public void Keisti () {
		
		int skaicius = Integer.parseInt(skaicius_is);
	    long rasti_skaiciai = 0;
		long skaiciai = 0;
	    int daliklis = 10;
		int kiekis = 0;
	 
			while( skaicius > 0){
			
				skaiciai = skaicius % daliklis;
			
				if( skaiciai == 0 || skaiciai == 1){
					
					rasti_skaiciai = (long) (rasti_skaiciai + skaiciai * Math.pow(2, kiekis));
					skaicius  = skaicius / daliklis;
				
				} else {
				
					System.out.println ("Neteisingai ivestas skaicius ");
					break;			
				}

				kiekis++;
			}
			skaicius_y = rasti_skaiciai;
	}
}