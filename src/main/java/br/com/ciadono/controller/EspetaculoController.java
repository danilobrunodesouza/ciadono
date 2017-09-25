package br.com.ciadono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EspetaculoController {

	@RequestMapping("/espetaculo")
	public String espetaculo() {
		return "espetaculo";
	
	}
}
