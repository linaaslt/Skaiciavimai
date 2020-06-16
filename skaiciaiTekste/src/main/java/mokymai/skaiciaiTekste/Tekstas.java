package mokymai.skaiciaiTekste;

public class Tekstas {		
	
	public String[] lines;
	public int n = 0;
	public int n_real = 0;
	
	public Tekstas() {
		
		n = 0; 
	}
	
	public Tekstas( String all_lines ) {
		
		lines = new String [ 1 ];
		n = 1;
		lines [ 0 ] = all_lines;
		n_real = 1;
	}
	
	public void makeNlines ( int n_lines ) {
		
		lines = new String [ n_lines ];
		n = n_lines;
	}
	
	public void addLine ( String line ) {
		
		if ( n_real <= n  ) {
			
			lines [ n_real ] = line;
			n_real++;
		}
	}

}
