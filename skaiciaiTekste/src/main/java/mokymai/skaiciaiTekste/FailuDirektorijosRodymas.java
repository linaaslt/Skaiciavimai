package mokymai.skaiciaiTekste;

import java.io.File;

public class FailuDirektorijosRodymas {
	
	String[] failai;	

	public FailuDirektorijosRodymas () {
	    // Creates a new File instance by converting the given pathname string
	    // into an abstract pathname
	    File f = new File("C:/Users/Namai/Desktop/javas/Skaiciavimai/skaiciaiTekste");
	
	    // Populates the array with names of files and directories
	    failai = f.list();
	
	    // For each pathname in the pathnames array
	    for (String failu_dir : failai) {
	        // Print the names of files and directories
	        System.out.println(failu_dir);
	    }    
	}
	
	public String[] getFailai() {
		
		int texts = 0;
		
		int len_file = 0;

		for ( String failas : failai ) {
			
			len_file = failas.length();
			
			if ( ( len_file > 4 ) && failas.substring( len_file - 4 ).equals ( ".txt" ) ) {
				
				texts++;
			}
		}
		
		String[] tekstai = new String [ texts ];
		 
		int i = 0; 
		len_file = 0;

		for ( String failas : failai ) {
			
			len_file = failas.length();
			
			if ( ( len_file > 4 ) && failas.substring( len_file - 4 ).equals ( ".txt" ) ) {
				
				tekstai [ i ] = failas;
				i++;				
			}
		}	
		
		for( i = 0; i < tekstai.length; i++ ) {
			
			System.out.println( tekstai [ i ] );
		}
		
		return tekstai;
	}
}
