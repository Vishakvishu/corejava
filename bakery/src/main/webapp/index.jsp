<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Home Page</a>
		</div>
	</nav>
	
			<form action="bakeryinfo" method="get">
		Bakery name	<input type="text" value=""  name="bakeryName"/><br>
Bakery owner name<input type="text" value=""  name="bakeryOwnerName"/><br>
Bakery owner wifeName<input type="text" value=""  name="bakeryOwnerWifeName"/><br>
Bakery owner married
yes<input type="radio" value="yes"  name="bakeryOwnerMarride"/>
		            no<input type="radio" value="no" name="bakeryOwnerMarride"/><br>
Bakery Famous for<textarea rows="5" cols="25"  name="bakeryFamousFor"></textarea><br> 
Bakery since<input type="number" value=""  name="bakerySince"/><br>
		<button type="submit" class="btn btn-success">SAVE</button> <br> 
		<h5>Display Bakery details: </h5>
				<label>Bakery name: ${bdto.bakeryName}</label><br>
		<label>Bakery owner name: ${bdto.bakeryOwnerName}</label><br> 
		<label>Bakery owner wifeName: ${bdto.bakeryOwnerWifeName}</label><br>
		<label>Bakery owner married: ${bdto.bakeryOwnerMarride}</label><br> 
		<label>Bakery Famous for : ${bdto.bakeryFamousFor}</label><br>
		<label>Bakery since : ${bdto.bakerySince}</label><br>
	</form>
</body>
</html>