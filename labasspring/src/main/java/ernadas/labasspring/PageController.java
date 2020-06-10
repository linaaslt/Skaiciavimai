package ernadas.labasspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping(path="/")
    public /* @ResponseBody */ String bla(@RequestParam(required=false) String sk_is 
			, @RequestParam(required=false) String keitimas
			, @RequestParam(required=false,defaultValue="nekeisk") String keisti
			, Model model ) {
		
		String message="keitimas neatliktas";
		SkaiciuKeitimas sk_keit;
		boolean keitimas_atliktas = false;
		
		if ( keisti.equals( "keisk" ) ) {
			
			message = "<br>atliekamas keitimo parinkimas<br>"; 
			
			if ( keitimas.equals( LstKeitimai.DEST_DVEJ.trump() ) ) {
				
				message += "parinktas keitimas<br>" + sk_is + " " + LstKeitimai.DEST_DVEJ.keitimas() + "<br>";
				sk_keit = new SkaiciusKeitimasIsDesimtainesIDvejetaine();
				sk_keit.setSkaicius_is(sk_is);
				sk_keit.Keisti();
				message += "rezultatas: " + sk_keit.getSkaicius_y() + "<br>";
				keitimas_atliktas = true;
			}
			
			if ( keitimas.equals( LstKeitimai.DEST_SES.trump() ) ) {
			
				message += "parinktas keitimas<br>" + sk_is + " " + LstKeitimai.DEST_SES.keitimas() + "<br>";
				sk_keit = new SkaiciausKeitimasIsDesimtaineISesioliktaine();
				sk_keit.setSkaicius_is(sk_is);
				sk_keit.Keisti();
				message += "rezultatas: " + sk_keit.getSkaicius_y() + "<br>";
				keitimas_atliktas = true;
			}
			
			if ( keitimas.equals( LstKeitimai.DVEJ_DEST.trump() ) ) {
				
				message += "parinktas keitimas<br>" + sk_is + " " + LstKeitimai.DVEJ_DEST.keitimas() + "<br>";
				sk_keit = new SkaiciausKeitimasIsDvejetainesIDesimtaine();
				sk_keit.setSkaicius_is(sk_is);
				sk_keit.Keisti();
				message += "rezultatas: " + sk_keit.getSkaicius_y() + "<br>";
				keitimas_atliktas = true;
			}
			
			if ( keitimas.equals( LstKeitimai.DVEJ_SES.trump() ) ) {
				
				message += "parinktas keitimas<br>" + sk_is + " " + LstKeitimai.DVEJ_SES.keitimas() + "<br>";
				sk_keit = new SkaiciausKeitimasIsDvejetainesISesioliktaine();
				sk_keit.setSkaicius_is(sk_is);
				sk_keit.Keisti();
				message += "rezultatas: " + sk_keit.getSkaicius_y() + "<br>";
				keitimas_atliktas = true;
			}
			
			if ( keitimas.equals( LstKeitimai.SES_DVEJ.trump() ) ) {
				
				message += "parinktas keitimas<br>" + sk_is + " " + LstKeitimai.SES_DVEJ.keitimas() + "<br>";
				sk_keit = new SkaiciausKeitimasIsSesioliktainesIDvejetaine();
				sk_keit.setSkaicius_is(sk_is);
				sk_keit.Keisti();
				message += "rezultatas: " + sk_keit.getSkaicius_y() + "<br>";
				keitimas_atliktas = true;
			}
			
			if ( keitimas.equals( LstKeitimai.SES_DEST.trump() ) ) {
				
				message += "parinktas keitimas<br>" + sk_is + " " + LstKeitimai.SES_DEST.keitimas() + "<br>";
				sk_keit = new SkaiciausKeitimasIsSesioliktainesIDesimtaine();
				sk_keit.setSkaicius_is(sk_is);
				sk_keit.Keisti();
				message += "rezultatas: " + sk_keit.getSkaicius_y() + "<br>";
				keitimas_atliktas = true;
			}
			
			if ( ( ! keitimas_atliktas ) || keitimas.equals( LstKeitimai.NIEKAIP.trump() ) ) {
				
				message += "parinktas keitimas<br>" + sk_is + " " + LstKeitimai.NIEKAIP.keitimas() + "<br>";
				sk_keit = new SkaiciuKeitimas();
				sk_keit.setSkaicius_is(sk_is);
				sk_keit.Keisti();
				message += "rezultatas: " + sk_keit.getSkaicius_y() + "<br>";
			}			
			
			message += "keitimas atliktas";
		}
    	
        model.addAttribute("lst_keitimai", LstKeitimai.values() ); 
        model.addAttribute("message",message);
    	return "index";
    }
 /*   
    @RequestMapping("/error")
    public String error() {
    	
    	return "index";
    	
    }    
*/
}
