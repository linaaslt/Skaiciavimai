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
		
		if ( keisti.equals( "keisk" ) ) {
			
			message="keitimas atliktas";
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
