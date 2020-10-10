package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KitchenController {

	@ResponseBody
	@RequestMapping("/sugar")
	private String giveSugar() {
		
		return "Here.. take your sugar";
	}
	
}
