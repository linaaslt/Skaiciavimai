package mokymai.skaiciaiTekste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.util.ResourceUtils;

public class skaitymas {

	public skaitymas () throws IOException {
		
		File file = ResourceUtils.getFile("classpath:config/tekstas.txt");
				 
				//File is found
				System.out.println("File Fou : " + file.exists());
				 
				//Read File Content
				String content = new String(Files.readAllBytes(file.toPath()));
				System.out.println(content);
	}
	
	
}
