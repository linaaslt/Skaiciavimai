package ernadas.labasspring;

public class SkaiciausKeitimasIsSesioliktainesIDesimtaine extends SkaiciuKeitimas {

	public SkaiciausKeitimasIsSesioliktainesIDesimtaine () {
		
		super();
	}
	
	public  String[] getChrsAlowed() {
		
		String[] chrs_alowedx = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
								, "A", "B", "C", "D", "E", "F" };
		return chrs_alowedx;
	}	
	
	public void Keisti () {
		
		if ( ! flag_error )  {
		
		String skaicius = skaicius_is;
		int atsakymas = Integer.parseInt(skaicius,16);
		
		 skaicius_y =  Integer.toString(atsakymas);
		}
	}
}
