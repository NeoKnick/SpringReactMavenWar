package com.nikhil.spring.react.maven.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author nbilgi
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.nikhil.spring.react.maven.war"})
public class SpringReactMavenWar extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactMavenWar.class);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringReactMavenWar.class);
	}
}
