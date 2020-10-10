package com.home.cafe.controllers;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafe {
	
	@RequestMapping("cafe")
	public String showIndexPage(Model model) {

		return "cafe-index";
	}
	
	@RequestMapping("foodmenu")
	public String showMenu(Model model) {
		List<Food> foodItems;
		try {
			foodItems = FoodCartDBUtil.getFoodList();
			model.addAttribute("foodItems", foodItems);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "show-food";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest req, Model model) {

		System.out.println(req);
		String userInput = req.getParameter("foodType");
		model.addAttribute("userInput", userInput);
		
		return "process-order";
	}
}
