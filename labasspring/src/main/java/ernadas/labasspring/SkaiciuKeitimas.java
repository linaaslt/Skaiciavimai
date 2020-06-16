package ernadas.labasspring;

import java.util.Arrays;
import java.util.List;

public class SkaiciuKeitimas {

	public String skaicius_is;
	public String skaicius_y = "---";
	public String msg_error = "klaidos nėra";
	public boolean flag_error = false;
	public String[] chrs_alowed = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"  };
	List<String> list;
	
	public SkaiciuKeitimas() {
		super();
		list = Arrays.asList ( getChrsAlowed() );
	}
	
	public  String[] getChrsAlowed() {
		
		return chrs_alowed;
	}
	
	public SkaiciuKeitimas(String skaicius_is) {
		super();
		this.skaicius_is = skaicius_is;
	}
	
	public void Keisti( ) {
		
		if ( ! flag_error )  {
		
			skaicius_y = skaicius_is;
		}
	}
	
	public String getSkaicius_is() {
		return skaicius_is;
	}
	
	public void setSkaicius_is(String skaicius_is) {
		
		this.skaicius_is = skaicius_is.trim();
		this.checkSkaiciusIs();
	}
	
	public void checkSkaiciusIs() {
		
		if ( this.skaicius_is.equals("") ) {
			
			msg_error = "neįvestas skaičius";
			flag_error = true;			
		}
		
		String negalimi_skaitmenys = "";
		
		for( int i = 0 ; i < skaicius_is.length(); i++ ) {
					
			String skaitmuo = skaicius_is.substring( i, i + 1 );
			
			if ( list.indexOf ( skaitmuo ) < 0  ) {
				
				negalimi_skaitmenys += skaitmuo;				
				
				flag_error = true;					
			}		
		}
		
		if ( negalimi_skaitmenys.length() > 0 ) {
			
			msg_error = "negalimi skaitmenys - " + negalimi_skaitmenys;
		}
	}
	
	public String getSkaicius_y() {
		
		return skaicius_y;
	}
	
	public void setSkaicius_y(String skaicius_y) {
		
		this.skaicius_y = skaicius_y;
	}
	
}
