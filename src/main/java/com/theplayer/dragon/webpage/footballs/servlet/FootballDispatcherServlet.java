package com.theplayer.dragon.webpage.footballs.servlet;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
//author: Hung
public class FootballDispatcherServlet extends DispatcherServlet{

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void initStrategies(ApplicationContext context) {
		super.initStrategies(context);
	}

	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HomeController:doService");
		try {
			System.out.println("WebPath---");
			WebApplicationContext webContext = new XmlWebApplicationContext();
			XmlWebApplicationContext webXmlContext = (XmlWebApplicationContext)webContext;
			Arrays.stream(webXmlContext.getConfigLocations()).forEach(s->System.out.println(s));
	
			WebApplicationContext webappContext = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
			XmlWebApplicationContext webappXmlContext = (XmlWebApplicationContext)webappContext;
			Arrays.stream(webappXmlContext.getConfigLocations()).forEach(s->System.out.println(s));
			Arrays.stream(webappXmlContext.getBeanDefinitionNames()).forEach(s->System.out.println(s));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		super.doService(request, response);
	}

}
