package it.gianluca.ES1_spring;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class TabellaController {
	private Messaggio messaggio = new Messaggio();
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		model.put("Tabella", this.messaggio);
			
		
		return "tabella";
	}
}