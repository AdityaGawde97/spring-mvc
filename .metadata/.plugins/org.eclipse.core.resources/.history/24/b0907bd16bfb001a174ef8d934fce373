package com.restful.it.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.it.bean.Greeting;

@RestController
public class HelloController {
	
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();

	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String displayHello(@RequestParam(value="name", defaultValue = "aditya") String name) {
		
		return "Hello "+ name;
	}

	@ResponseBody
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public Greeting greeting(@RequestParam(value="name", defaultValue = "world") String name) {
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
