package br.com.ciadono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(){
		System.out.println("Teste");
		return "login";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("testando");
		return "login";
	}
}
