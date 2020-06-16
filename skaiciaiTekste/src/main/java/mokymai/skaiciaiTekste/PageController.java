package mokymai.skaiciaiTekste;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;



@Controller
public class PageController {
	
	@RequestMapping(path="/")
    public /* @ResponseBody */ String bla(@RequestParam(required=false) String content
    		, @RequestParam(required=false) String pav_failo
    		, @RequestParam(required=false) String srv_failas
    		, Model model ) throws IOException {
		
		String txt_content = "neturim teksto :(";
		String msg_error = "";
		
		if ( srv_failas != null ) {
			
			System.out.println ( " -- " + srv_failas );
		}
		
		if ( content != null ) {
			
			if ( pav_failo != null ) {
			
				File failas = new File( pav_failo );
				
				if ( failas.createNewFile() ) {
				  
					System.out.println("File created: " + failas.getName());
				
				} else {
				  
					System.out.println("File already exists.");
				
				}
			 
				FileWriter myWriter = new FileWriter( failas );
				
				myWriter.write(content);
				
				myWriter.close();
			}
			
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
		
		FailuDirektorijosRodymas lst_failu_dir = new FailuDirektorijosRodymas();
	        		
		model.addAttribute( "txt_content", txt_content );
		model.addAttribute( "msg_error" , msg_error );
		model.addAttribute( "failu_dir", lst_failu_dir.getFailai() );
		
		return "index";
    }
 
}