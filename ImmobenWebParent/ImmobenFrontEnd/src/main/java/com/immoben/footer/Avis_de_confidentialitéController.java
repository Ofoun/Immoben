package com.immoben.footer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Avis_de_confidentialitÃ©Controller {
	
	@GetMapping("/avisDeConfidentialitÃ©")
	public String showAvisDeConfidentialiteForm() {
		
		return "footer/avis_de_confidentialitÃ©";		
	}

}
