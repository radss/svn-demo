package cz.csob.cc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	//private static final Logger log = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = {"/", "/index.html"}, method = RequestMethod.GET)
	public ModelAndView showIndex() throws Exception {
		//log.info("Zobrazeni index.html");
		
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", "Hello !");
		return mav;
	}
	
}
