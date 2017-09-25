package br.com.ciadono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColaboradoresController {

	@RequestMapping("/colaboradores")
	public String teste() {
		return "paga-colaboradores";
	}
	
}
