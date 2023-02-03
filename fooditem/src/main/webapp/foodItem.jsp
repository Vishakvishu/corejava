<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>



<nav  class="navbar bg-dark" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt=" " width="80" height="44">
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
   <a class="btn btn-outline-warning" href="foodItem.jsp">Home</a>
     
    </div>
   </nav>
<h1>Page to send Food Item</h1>
<form action="home" method="post">


<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" name="name" placeholder="enter food item name">
  </div>
  
  <div>
  <label for="customRange2" class="form-label">Quantity</label>
<input type="range" class="form-range" min="0" name="quantity" max="5" id="customRange2">
</div>

<div>
<select class="form-select" aria-label="select food type" name="type">
  <option selected>Open this select menu</option>
  <option value="Veg">Veg</option>
  <option value="Non-Veg">Non-Veg</option>
  <option value="Both">Both</option>
</select>
</div>

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Price</label>
  <input type="text" class="form-control" name="price" id="exampleFormControlInput1" placeholder="enter food item price">
  </div>


<input type="submit" class="btn btn-warning"  value="send">

</form>
</body>
</html>