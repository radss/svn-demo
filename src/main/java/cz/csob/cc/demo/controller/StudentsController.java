package cz.csob.cc.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cz.csob.cc.demo.businessobject.Students;
import cz.csob.cc.demo.service.SomeService;

@Controller
public class StudentsController {

	@Autowired
	private SomeService someService;
	
	//private static final Logger log = LoggerFactory.getLogger(PornController.class);
	
	@RequestMapping(value = "showStudents")
	public ModelAndView showPornstart() throws Exception {
		List<Students> students = someService.getAllStudents(); // volam si z autowirovana sluzby aby mi "z databaze" podala pornoherecky
		
		ModelAndView mav = new ModelAndView("demo1");
		mav.addObject("students", students);
		return mav;
	}
	
	@RequestMapping(value = "searchStudents")
	public ModelAndView searchPornstar(@RequestParam("klic") String klic) throws Exception {
		ModelAndView mav = new ModelAndView("demo2");
		mav.addObject("klic", klic);
		return mav;
	}
	
	@RequestMapping(value = "demo3")
	public void demo3(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// jen ukazka ze zde by slo pracovat s HttpServletRequest a HttpServletResponse => lze si autoriwovat cokoliv
	}
	
	@RequestMapping(value = "demo4", method = RequestMethod.POST)
	public void demo4() throws Exception {
		// jen ukazka ze lze omezit jen na POST metody
	}
	
}
