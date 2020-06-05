package ernadas.labasspring;

public class MeniuIsKlaviaturos extends SkaiciausIvedimasIsKlaviaturos {
	
	public MeniuIsKlaviaturos() {
		
		super( "Pasirinkite meniu punktą" );
	}

	public String Ivedimas () {
		
		String meniu="";
		
		System.out.println ( "0. Pabaiga" );
		System.out.println ( "1. Iš Desimtainės į dvejetainę" );
		System.out.println ( "2. Iš Desimtainės į šešioliktainę" );		
		System.out.println ( "3. Palikti nekeistą" );	
		
		meniu=super.Ivedimas();
		
		return meniu;
		
	}

}
