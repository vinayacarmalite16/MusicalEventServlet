<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

<link rel="stylesheet"href="css/music.css">

</head>


<body>

<form action="Home" method="post">
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Musical Event</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="HomePage.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Events.jsp">Events</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Tickets.jsp">Tickets</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="Contact.jsp">Contact Us</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Login.jsp"><u>Login</u></a>
        </li>
       <li class="nav-item">
          <a class="nav-link" href="RegPage.jsp"><u>Sign Up</u></a>
        </li>
          
      </ul>
    </div>
  </div>
</nav>

 <div class="img">
   <img src="images/music1.jpeg" alt="Background Image" class="img">
        <div class="imgtxt">
            <h1>Live the music...</h1>
   
        </div>
    </div>

</form>

</body>

</html>