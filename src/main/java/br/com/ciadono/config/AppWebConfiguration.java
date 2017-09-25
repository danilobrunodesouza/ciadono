package br.com.ciadono.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.ciadono.controller.ColaboradoresController;
import br.com.ciadono.controller.EspetaculoController;
import br.com.ciadono.controller.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class, EspetaculoController.class, ColaboradoresController.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
	  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	  resolver.setPrefix("/WEB-INF/views/");
	  resolver.setSuffix(".jsp");
	  return resolver;
	}
	
}
