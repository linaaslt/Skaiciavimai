package ernadas.labasspring;

public class SkaiciausKeitimasIsSesioliktainesIDesimtaine extends SkaiciuKeitimas {

	public SkaiciausKeitimasIsSesioliktainesIDesimtaine () {
		
	}
	
	public void Keisti () {
		
		if ( ! flag_error )  {
		
		String skaicius = skaicius_is;
		int atsakymas = Integer.parseInt(skaicius,16);
		
		 skaicius_y =  Integer.toString(atsakymas);
		}
	}
}
