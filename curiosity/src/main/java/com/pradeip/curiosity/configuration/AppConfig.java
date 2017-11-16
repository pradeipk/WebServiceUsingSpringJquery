package com.pradeip.curiosity.configuration;

import java.util.Properties;
import java.util.Timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.pradeip.curiosity.*")
// @Import(SecurityConfig.class)
public class AppConfig extends WebMvcConfigurerAdapter {
	// @Autowired
	// SprintConfiguration sprintConfiguration;
	// @Autowired
	// SprintMasterService sprintMasterService;

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//registry.addViewController("/home").setViewName("home");
		//registry.addViewController("/").setViewName("home");
		//registry.addViewController("/login").setViewName("login");
		//registry.addViewController("/403").setViewName("403");
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		//viewResolver.setPrefix("/WEB-INF/views/");
		//viewResolver.setSuffix(".jsp");
		//viewResolver.setOrder(2);
		//viewResolver.setExposeContextBeansAsAttributes(true);
		//viewResolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
		return viewResolver;
	}

	@Bean
	public ResourceBundleViewResolver resourceBundleViewResolver() {
		ResourceBundleViewResolver resolver = new ResourceBundleViewResolver();
		//resolver.setBasename("pages");
		//resolver.setOrder(1);
		return resolver;
	}

	@Bean(name = "multipartResolver")
	public StandardServletMultipartResolver resolver() {
		return new StandardServletMultipartResolver();
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}

	@Bean
	public SimpleMappingExceptionResolver createSimpleMappingExceptionResolver() {
		SimpleMappingExceptionResolver r = new SimpleMappingExceptionResolver();

		Properties mappings = new Properties();
		mappings.setProperty("DatabaseException", "databaseError");
		mappings.setProperty("Exception", "oops");

		r.setExceptionMappings(mappings); // None by default
		r.setDefaultErrorView("error"); // No default
		r.setExceptionAttribute("ex"); // Default is "exception"
		r.setWarnLogCategory("example.MvcLogger"); // No default
		return r;
	}

	@Override
	// Static Content handling
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
