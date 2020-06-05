package ernadas.labasspring;

import org.springframework.context.ApplicationContext;

public class SkaiciuKeitimoVykdymas {
	
	public String keitimo_uzduotis;
	public SkaiciuKeitimas skaiciu_keitimas;
	public SkaiciausIvedimas skaiciaus_ivedimas;
	public ApplicationContext context;
	
	public SkaiciuKeitimoVykdymas( SkaiciausIvedimas skaiciaus_ivedimas ) {
		
		this.keitimo_uzduotis = keitimo_uzduotis;
		this.skaiciaus_ivedimas = skaiciaus_ivedimas;		
	}
	
	public void setSkaiciuKeitimas( SkaiciuKeitimas keitimo_uzduotis ) {
		
		skaiciu_keitimas = keitimo_uzduotis;
	}

	public SkaiciuKeitimas getSkaiciuKeitimas() {
		
		return skaiciu_keitimas;
	}
	

	public SkaiciausIvedimas getSkaiciausIvedimas() {
		
		return skaiciaus_ivedimas;
	}

	public void setSkaiciausIvedimas( SkaiciausIvedimas skaiciaus_ivedimas ) {
		
		this.skaiciaus_ivedimas = skaiciaus_ivedimas;
	}
	
	
	
	public String getKeitimoUzduotis() {
		
		return keitimo_uzduotis;
	}

	public void setKeitimoUzduotis ( String keitimo_uzduotis ) {
		
		this.keitimo_uzduotis = keitimo_uzduotis;
	}

	public ApplicationContext getContext() {
		
		return context;
	}

	public void setContext(ApplicationContext context) {
		
		this.context = context;
	}

	public void Atlikti() {
		
		skaiciu_keitimas = ( SkaiciuKeitimas ) context.getBean( keitimo_uzduotis );
		
		skaiciu_keitimas.setSkaicius_is( skaiciaus_ivedimas.Ivedimas() );
	
		skaiciu_keitimas.Keisti();
	}
	
}
