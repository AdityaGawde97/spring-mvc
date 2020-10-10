package com.adicode.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer //implements WebApplicationInitializer 
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
//		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
//		webApplicationContext.setConfigLocation("classpath:application-config.xml");
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/love/*");
		
	}

}
