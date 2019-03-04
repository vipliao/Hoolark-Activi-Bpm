package com.hoolark.bpm.activiti.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * @author Administrator
 *
 */
@Configuration
public class Cfg_View implements WebMvcConfigurer {

	//@Override
	/*public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/index.html");
	}*/

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowCredentials(true)
				.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
				.allowedHeaders("x-requested-with,Access-Control,Content-Type").maxAge(3600);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**")
				.addResourceLocations("classpath:/static/")
				.addResourceLocations("classpath:/templates/");
	}

}
