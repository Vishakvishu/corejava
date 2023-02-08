package com.xworkz.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public WebInit() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Runnong in getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Runnong in getServletConfigClasses ");
		Class[] ref = { BakeryConfiguration.class };
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Runnong in getServletMappings ");
		String[] ref = { "/" };
		return ref;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Created " + this.getClass().getSimpleName());
		configurer.enable();
	}

}
