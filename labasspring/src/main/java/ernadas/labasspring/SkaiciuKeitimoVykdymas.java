package ernadas.labasspring;

public class SkaiciuKeitimoVykdymas {
	
	public SkaiciuKeitimas skaiciu_keitimas;
	
	public SkaiciuKeitimoVykdymas( SkaiciuKeitimas keitimo_uzduotis ) {
		
		skaiciu_keitimas = keitimo_uzduotis;
	}
	
	public void setSkaiciuKeitimas( SkaiciuKeitimas keitimo_uzduotis ) {
		
		skaiciu_keitimas = keitimo_uzduotis;
	}

	public SkaiciuKeitimas getSkaiciuKeitimas() {
		
		return skaiciu_keitimas;
	}
	
	public void Atlikti( String skaicius_is ) {
		
		skaiciu_keitimas.setSkaicius_is(skaicius_is);
	
		skaiciu_keitimas.Keisti(skaicius_is);
	}
	
}
