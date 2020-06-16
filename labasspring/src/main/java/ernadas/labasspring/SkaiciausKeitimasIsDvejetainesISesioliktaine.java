package ernadas.labasspring;


public class SkaiciausKeitimasIsDvejetainesISesioliktaine extends SkaiciuKeitimas {
	

	public SkaiciausKeitimasIsDvejetainesISesioliktaine () {
		
		super();
		
	}
	
	public  String[] getChrsAlowed() {
		
		String[] chrs_alowedx = { "0", "1" };
		return chrs_alowedx;
	}	
	
	public void Keisti () {
		
		if ( ! flag_error )  {
		
		int ivestas_skaicius = Integer.parseInt(skaicius_is);
        int kiekis = 0;
        long rasti_skaiciai = 0;
        String atsakymas ="";
        while ( ivestas_skaicius > 0 )
        {
          rasti_skaiciai = rasti_skaiciai + (long) (Math.pow(2,kiekis) * (long) (ivestas_skaicius %10));
          ivestas_skaicius = ( int ) ivestas_skaicius / 10;
          kiekis++;
        }
        
        while(rasti_skaiciai>0) {
        	
          long skaiciavimas = rasti_skaiciai %16;
          
          if( skaiciavimas == 10 ) {
        	  
        	  atsakymas = "A" + atsakymas;
        	  
          	} else if ( skaiciavimas == 11 ) {
          		
        	  atsakymas = "B" + atsakymas;
        	  
          	} else if( skaiciavimas == 12 ) {
          		
        	  atsakymas = "C" + atsakymas;
        	  
          	} else if( skaiciavimas == 13 ) {
          		
        	  atsakymas = "D" + atsakymas;
        	  
          	} else if( skaiciavimas == 14 ) {
          		
        	  atsakymas = "E" + atsakymas;
        	  
          	} else if( skaiciavimas == 15 ) {
        	  atsakymas = "F" + atsakymas;
        	  
          	} else {
          		
        	  atsakymas = skaiciavimas + atsakymas;
        	  
          	}
          
          rasti_skaiciai = rasti_skaiciai / 16;
        }
        
        skaicius_y =  atsakymas;
		}
	}
}	