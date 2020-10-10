<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Food Cart</title>
	
	</head>
	<body>
		<div>
			<h1 align="center">Welcome to My Cafe</h1>
			<hr/>
			<h2 align="center">Menu</h2>
			<table border="2" cellpadding="10" align="center" bordercolor="lightgray">
				<tr>
					<th>Food Id</th>
					<th>Food Item</th>
					<th>Price</th>
				</tr>
				
				<c:forEach var="items" items="${foodItems}">
					<tr>
						<td>${items.id}</td><td>${items.item}</td><td>${items.price}</td>
					</tr>	
				</c:forEach>
			</table><br/><hr/><br/>
			<div align="center">
				<form action="processOrder">
					<label for="itemName">Item name: </label>
					<input type="text" name="foodType" id="itamName" placeholder="Enter food name" />
					<input type="submit" value="Order Now"  />
				</form>
			</div>
		</div>
	</body>
</html>