<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/music.css">
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<!--<body background="images/regi.jpeg"style="background-repeat:no-repeat;background-size:cover;">-->
<body background="images/reg.jpeg"style="background-repeat:no-repeat;background-size:cover;">
<div class="regpage">
<form action="Registration"  method="post">
<h1>Registration</h1>
User name:<input type="text" name="username"><br><br>
Date of Birth:<input type="date" name="dob"><br><br>
Gender:<select name="dropdown">
<option value="male" name="gender">Male</option>
<option value="female" name="gender">Female</option>
</select><br><br>
Email id:<input type="text" name="email"><br><br>
Phone number:<input type="text" name="phoneno"><br><br>
Password:<input type="text" name="password"><br><br>
<input type="submit"value="Login"name="login">
</form>
</div>
</body>
</html>