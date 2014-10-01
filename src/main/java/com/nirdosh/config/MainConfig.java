package com.nirdosh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@EnableWebMvc
@ComponentScan(basePackages={"com.nirdosh"})
public class MainConfig  extends WebMvcConfigurerAdapter{
		@Bean
		public InternalResourceViewResolver getInternalResourceViewResolver(){
			InternalResourceViewResolver resolver = new InternalResourceViewResolver();
			resolver.setPrefix("/WEB-INF/views/");
			resolver.setSuffix(".jsp");
			return resolver;
		}
		
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {		
			registry.addResourceHandler("/scripts/**").addResourceLocations("/WEB-INF/resources/scripts/");
			registry.addResourceHandler("/jquery/**").addResourceLocations("/WEB-INF/resources/scripts/jquery/");
			registry.addResourceHandler("/styles/**").addResourceLocations("/WEB-INF/resources/css/");	
			registry.addResourceHandler("/bootstrap/**").addResourceLocations("/WEB-INF/resources/bootstrap/");	
		}
		
		@Bean
		public ReloadableResourceBundleMessageSource messageSource() {
			
			ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
			messageSource.setBasename("classpath:messages/messages");
			messageSource.setDefaultEncoding("UTF-8");
			
			return messageSource;
		}

}
