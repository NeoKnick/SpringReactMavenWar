/**
 * 
 */
package com.nikhil.spring.react.maven.war.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nbilgi
 *
 */
@RestController
@RequestMapping(value = "/api/v1")
public class HelloWorldController {

	@GetMapping(value = "/hello")
	public String getHello() {
		return "Hello World";
	}
}
