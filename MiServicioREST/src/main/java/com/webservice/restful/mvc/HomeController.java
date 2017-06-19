package com.webservice.restful.mvc;

import java.util.Date;
import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;

import com.webservice.restful.entities.Persona;

import java.text.DateFormat;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String home(Locale locale, Model model){
		logger.info("Welcome",locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime",formattedDate);
		
		return "home";
	}
	
	
	@RequestMapping(value = "/persona", method=RequestMethod.GET)
	public @ResponseBody Persona obtenerPersona(@RequestParam(value="id",required=true) int id){
		// Logica para obtener los datos de la persona
		Persona p = new Persona();
		p.setNombre("Angel");
		p.setApellido("Martinez");
		p.setEdad(21);
		return p;
	}
	
	
	
}
