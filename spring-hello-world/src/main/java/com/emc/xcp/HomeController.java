package com.emc.xcp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/home","/","/index"}, method = RequestMethod.GET)
	public String hello() {
		return "home";
	}
	
	@RequestMapping(value = "/hi", method=RequestMethod.GET)
	public String hi( @RequestParam("name") String name, @RequestParam("company") String company, Model model){
		String message = "Hi "+ name + "!"+ ". Hope you are enjoying your work at "+company ;
		model.addAttribute("message",message);
		return "hi" ;
	}
	
	@RequestMapping(value = "/go", method=RequestMethod.GET)
	public String go(){
		return "saygo" ;
	}
	
	@RequestMapping(value = "/damnyou", method=RequestMethod.GET)
	public String damnYou(){
		return "saydamnyou" ;
	}
	
	@RequestMapping(value = "/bye", method=RequestMethod.GET)
	public String bye(){
		return "saybye" ;
	}
	
	@RequestMapping(value = "/helloworld", method=RequestMethod.GET)
	public String helloWorld(){
		return "sayhelloworld" ;
	}
	@RequestMapping(value = "/jule", method=RequestMethod.GET)
	public String jule(){
		return "sayjule" ;
	}
	
	@RequestMapping(value="/misc", method=RequestMethod.GET)
	public String misc(){
		return "misc";
	}

}
