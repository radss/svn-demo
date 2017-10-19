package cz.csob.cc.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Ve web.xml namapovano na URL /old stejne jako demo servlet, ale bylo by mozne mapovat i /* aj.
 * Bylo by take mozne pouzit i anotaci
 */
public class PrdiciFilter implements Filter {

	//private static final Logger log = LoggerFactory.getLogger(PrdiciFilter.class);
	
	public void init(FilterConfig arg0) throws ServletException {
		//log.info("Ted se inicializuje PrdiciFilter");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
		//log.info("pred dalsim zpracovanim");
		
		// tohle se fakt musi zavolat pro dalsi zpracovani
		arg2.doFilter(arg0, arg1);
		
		//log.info("po zpracovani");
	}
	
	public void destroy() {
		//log.info("Ted se likviduje PrdiciFilter");
	}

}
