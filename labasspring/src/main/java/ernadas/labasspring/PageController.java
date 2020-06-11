package ernadas.labasspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
			
			ApplicationContext context = new ClassPathXmlApplicationContext( "file:src/beans.xml" );
			
			for ( LstKeitimai lk : LstKeitimai.values() ) {
				
				if ( keitimas.equals( lk.trump() ) ) {
					
					message += "Įvestas skaičius konvertavimui<br>" + sk_is + " <br> " + lk.keitimas() + "<br>";
					sk_keit = (SkaiciuKeitimas) context.getBean( keitimas );
					sk_keit.setSkaicius_is(sk_is);
					sk_keit.Keisti();
					message += "rezultatas: " + sk_keit.getSkaicius_y() + "<br>";
					keitimas_atliktas = true;
					break;
				}				
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
