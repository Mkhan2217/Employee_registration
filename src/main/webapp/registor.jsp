<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#1c9973" style="border:#565754; border-width:5px; border-style:solid;"> 
<center>
<form action="saveEmployeeDetials" >
<div >
<h1 >Register</h1>
<p>Please enter the employee Detials for registration</p>
<label for="empname">empName</label><br>
<input type="text" placeholder="Enter your name" name="empName" required> <br>
<label for="email">email</label><br>
<input type="text" placeholder="Enter your email" name="email" required><br>
 <label for="contact">Contact Number</label><br>
 <input type="text" placeholder="Contact Number" name="contactNumber" required> <br>
 <label for="age">age</label><br>
 <input type="text" placeholder="age" name="age" required> <br>
 <label for="address">address</label><br>
 <input type="text" placeholder="address" name="address" required> <br>
<label for="pinCode">pinCode</label><br>
<input type="text" placeholder="pinCode" name="pinCode" required> <br><br>
<input type="submit"> <input type="reset">
</div>
</form>
</center>
</body>
</html>