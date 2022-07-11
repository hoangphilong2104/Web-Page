package com.theplayer.dragon.webpage.footballs;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class WebApplicationIntializr implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		Enumeration<String> names = servletContext.getInitParameterNames();
		String uploadPath = servletContext.getRealPath(servletContext.getInitParameter("uploadPath"));
		System.out.println(uploadPath);
		ServletContextParam env = new ServletContextParam(uploadPath);
		
	}

}
