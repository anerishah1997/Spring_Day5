package com.lti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // @SpringBootApplication will scan all packages under com.lti.....why bcz this annotation is used in Main and main is in com.lti.
@RequestMapping(path="HelloApp")
public class HelloController {
	
	// http://localhost:9090/HelloApp/hello
	@RequestMapping(path="hello", method=RequestMethod.GET)
	public String hello(){
		return "Hello From SpringRest";
	}

}
