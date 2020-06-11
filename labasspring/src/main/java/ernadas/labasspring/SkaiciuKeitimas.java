package ernadas.labasspring;

public class SkaiciuKeitimas {

	public String skaicius_is;
	public String skaicius_y = "---";
	public String msg_error = "klaidos nėra";
	public boolean flag_error = false;
	
	public SkaiciuKeitimas() {
		super();
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
	}
	
	public String getSkaicius_y() {
		return skaicius_y;
	}
	
	public void setSkaicius_y(String skaicius_y) {
		this.skaicius_y = skaicius_y;
	}
	
}
