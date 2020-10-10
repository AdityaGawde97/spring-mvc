package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SportController {

	@ResponseBody
	@RequestMapping("/bat")
	private String giveCricketBat() {
		
		return "Hi, hete take your cricket bat";
	}
	
	@RequestMapping("/cricketpage")
	private String getCricketJspt() {
		
		return "CricketView";
	}
	
}
