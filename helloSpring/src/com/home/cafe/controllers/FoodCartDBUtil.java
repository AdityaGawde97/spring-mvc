package com.home.cafe.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDBUtil {

	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306/foodcart";
		String user = "root";
		String pass = "root";
		
		ArrayList<Food> food = new ArrayList<>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from foodMenu");
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String item = rs.getString(2);
			double price = rs.getDouble(3);
			Food f = new Food(id, item, price);
			food.add(f);
		}
		
		return food;
	}
	
}
