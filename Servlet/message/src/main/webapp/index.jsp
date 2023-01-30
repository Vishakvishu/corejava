<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message-servlet</title>
</head>
<body leftmargin="500px" marginheight="120px" style='background-color:white(0,234,343)'>
<h1 style='color:blue'>Sending Details of Favorite Persion</h1>
<form action="msg" method="post">
<pre>
First Name   <input type="text" name="fName"/>
</pre>
<pre>
Last Name    <input type="text" name="lName"/>
</pre>
<pre>
Gender  Male <input type="radio" name="gender" value="Male"/> Female <input type="radio" name="gender" value="Female"/>
</pre>
<pre>
Reason       <textarea rows="4" cols="20" name="reason"></textarea>
</pre>
<pre>
Address      <textarea rows="4" cols="20" name="address"></textarea>
</pre>
<pre>
<input type="submit" value="Send"/>
</pre>
</form>
</body>
</html>