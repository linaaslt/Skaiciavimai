package ernadas.labasspring;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LabasspringApplication {

	public static void main(String[] args) {
				
		SpringApplication.run(LabasspringApplication.class, args);
		 
		System.out.println( "Labas Spring" );
		SkaiciausIvedimas skaicius = new SkaiciausIvedimas ();
		skaicius.Ivedimas();
		
		/**
		 * kaip atrodo  be beans'u
		 * 
		SkaiciusKeitimasIsDesimtainesIDvejetaine sk_dest_dvej = new SkaiciusKeitimasIsDesimtainesIDvejetaine();
		
		SkaiciuKeitimoVykdymas sk_keit_run = new SkaiciuKeitimoVykdymas ( sk_dest_dvej );
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
		SkaiciuKeitimoVykdymas sk_keit_run = (SkaiciuKeitimoVykdymas) context.getBean( "mainspring" );		
		
		sk_keit_run.Atlikti("349");
		
		System.out.println (sk_keit_run.getSkaiciuKeitimas().getSkaicius_y());
	}
}
