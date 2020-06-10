package ernadas.labasspring;

public class SkaiciausKeitimasIsSesioliktainesIDesimtaine extends SkaiciuKeitimas {

	public SkaiciausKeitimasIsSesioliktainesIDesimtaine () {
		
	}
	
	public void Keisti () {
		
		String skaicius = skaicius_is;
		int atsakymas = Integer.parseInt(skaicius,16);
		
		 skaicius_y =  Integer.toString(atsakymas);
	}
}
