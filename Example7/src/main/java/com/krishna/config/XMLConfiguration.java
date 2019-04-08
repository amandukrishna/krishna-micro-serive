package com.krishna.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.krishna.training.interceptor.WelcomeInterceptor;
import com.krishna.training.service.EmployeeService;

@Configuration
@EnableWebMvc
public class XMLConfiguration {

	@Bean(name = "employeeService")
	public EmployeeService getEmployee() {

		EmployeeService e = new EmployeeService();
		e.setName("Raju");
		return e;
	}// similar to <bean id="employeeService" class=".*EmployeeService"/>

	public void addInterceptors(InterceptorRegistry registry) { 
		registry.addInterceptor(new WelcomeInterceptor());
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

}
