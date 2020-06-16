package mokymai.skaiciaiTekste;

import java.io.BufferedReader;
import java.io.FileReader;

public class TekstoSkaitymasIsFailo {
	
	public Tekstas tekstas;
	
	public String msg_error = "";
	
	public TekstoSkaitymasIsFailo( String vardas_failo ) {
		
		String thisLine = null;
		int n_lines = 0;
		
		try {
		
			BufferedReader br = new BufferedReader( new FileReader( vardas_failo ) );
			
			
			while ( ( thisLine = br.readLine() ) != null ) {
				
				n_lines++;
			}
			
			br.close();
			
			tekstas = new Tekstas();
			tekstas.makeNlines( n_lines );
			
			br = new BufferedReader( new FileReader( vardas_failo ) );
			
			while ( ( thisLine = br.readLine() ) != null ) {	
				
				tekstas.addLine( thisLine );
			}
			
			br.close();
		
		} catch ( Exception e ) {
			
			msg_error = e.getMessage();
		}
		
	}
}
