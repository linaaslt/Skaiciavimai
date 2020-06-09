package ernadas.labasspring;
//import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LabasspringApplication {

	public static void main(String[] args) {
				
		SpringApplication.run(LabasspringApplication.class, args);
		 
		// System.out.println( "Labas Spring" );
		// SkaiciausIvedimas skaicius = new SkaiciausIvedimas ();
		// skaicius.Ivedimas();
		
		/**
		 * kaip atrodo  be beans'u
		 * 
		SkaiciusKeitimasIsDesimtainesIDvejetaine sk_dest_dvej = new SkaiciusKeitimasIsDesimtainesIDvejetaine();
		
		SkaiciuKeitimoVykdymas sk_keit_run = new SkaiciuKeitimoVykdymas ( sk_dest_dvej );
		*/
		// String[] keitimai = { "sk_dest_dvej", "sk_dest_ses","sk_dvej_desimt", "sk_niekaip" };
		// String keitimas = "";
/*		
		MeniuIsKlaviaturos meniu = new MeniuIsKlaviaturos();
		
		Integer num_meniu_item = 0;
		
		try {
		
			num_meniu_item = Integer.parseInt( meniu.Ivedimas() );
	
			if ( num_meniu_item <= keitimai.length ) {
				
				keitimas = keitimai [ num_meniu_item - 1 ];
			}
		
		} catch( Exception e ) {
			
			System.out.println ( "nieko nepasirinkote? :( .." );
			
		}

		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		SkaiciuKeitimoVykdymas sk_keit_run = (SkaiciuKeitimoVykdymas) context.getBean( "mainspring" );		
		
		if ( ! keitimas.equals ( "" ) ) {
			
			sk_keit_run.setContext ( context );
			sk_keit_run.setKeitimoUzduotis( keitimas );
			sk_keit_run.Atlikti();
		
			System.out.println (sk_keit_run.getSkaiciuKeitimas().getSkaicius_y());
		}
		System.out.println ( "ate :)" );
	*/	
	}
}
