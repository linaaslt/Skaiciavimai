package mokymai.skaiciaiTekste;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Arrays;



@Controller
public class PageController {
	
	@RequestMapping(path="/")
    public /* @ResponseBody */ String bla(@RequestParam(required=false) String content
			, Model model ) {
		
		String txt_content = "neturim teksto :(";
		String msg_error = "";
		
		if ( content != null ) {
			
			txt_content =  content.replaceAll( "\\r?\\n", "<br>");
			
			Tekstas txt = new Tekstas(); 
			
			txt.lines = content.split ( "\\r?\\n" );
			txt.n = txt.lines.length;
			txt.n_real = txt.n;
			
		} else {
			
			TekstoSkaitymasIsFailo txt_is_failo = new TekstoSkaitymasIsFailo ( "tekstas.txt" );
			
			if ( txt_is_failo.msg_error.equals( "" ) ) {
			
				List<String> list = Arrays.asList( txt_is_failo.tekstas.lines );
			
				txt_content = String.join( "<br>", list );
				
			} else {
				
				msg_error = txt_is_failo.msg_error;
			}
		}
		
		
		model.addAttribute( "txt_content", txt_content );
		model.addAttribute( "msg_error" , msg_error );
		
		return "index";
    }
 
}