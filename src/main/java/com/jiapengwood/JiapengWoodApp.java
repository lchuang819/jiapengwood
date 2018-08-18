package com.jiapengwood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.jiapengwood" })
@SpringBootApplication
public class JiapengWoodApp extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JiapengWoodApp.class);
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(JiapengWoodApp.class, args);
	}
}
