<?php
	session_start();
?>

<!DOCTYPE html>
	<html lang="en">
		<head>
			<title>Add</title>
			<meta charset="utf-8">
  		<meta name="viewport" content="width=device-width, initial-scale=1">
	  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

		<!-- css styling -->
  	<style>
    	.navbar {
      	margin-bottom: 0;
      	border-radius: 0;
    	}
    	.row.content {height: 550px}

    	footer {
      	background-color: #555;
      	color: white;
      	padding: 35px;
    	}

    	@media screen and (max-width: 767px) {
      	.sidenav {
        	height: auto;
        	padding: 15px;
      	}
      	.row.content {height:auto;}
			}

    	#img_slide{
      	width: 100%;
      	background-color: yellow;
      	height: 500px;
    	}
  	</style>
	</head>

	<!-- HTML starts -->
	<body>
		<!-- Navigation Bar -->
		<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="#">Mess Managment System</a>
	    </div>

			<!-- buttons on navigation bar -->
	    <div class="collapse navbar-collapse" id="myNavbar">
	      <ul class="nav navbar-nav">
	        <li class="active"><a href="index.php">Home</a></li>
	        <li class="active"><a href="mon_admin.php">Menu</a></li>
	      </ul>
	      <ul class="nav navbar-nav navbar-right">
	        <li><a href="out.php"><span class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
	      </ul>
	    </div>
	  </div>
	</nav>

	<div class="container">
	<div class="row">
	<div class="well">
	<h1>Add Dish</h1>

		<!-- drop down for dishes -->
		<form action="Dish.php" method="post">
			<input style="margin-left:30%" list="Day" name="Day" placeholder="Day">
				<datalist id="Day">
					<option value="Monday">
					<option value="Tuesday">
					<option value="Wednesday">
					<option value="Thursday">
					<option value="Friday">
					<option value="Saturday">
					<option value="Sunday">
				</datalist>
			</input>
			<br><br>

	<!-- Dropdown for meal -->
		<input style="margin-left:30%" list="Meal" name="Meal" placeholder="Meal">
			<datalist id="Meal">
				<option value="Breakfast">
				<option value="Lunch">
				<option value="Dinner">
			</datalist>
		</input>
		<br><br>

		<input style="margin-left:30%"  type="text" name="DishName" placeholder="Enter Dish">
		<br><br>
		<input style="margin-left:30%"  type="text" name="fullPrice" placeholder="Enter Full Price">
		<br><br>
		<input style="margin-left:30%"  type="text" name="halfPrice" placeholder="Enter Half Price">
		<br><br>
		<button style="margin-left:35%" type="submit" class="form-group btn btn-success" name="Add"><b>Add</b></button>
	</form>

	</div>
	</div>
	</div>

		<!-- footer at end of form -->
		<footer class="container-fluid text-center">
	  <p>Copyrights</p>
	</footer>
</body>
</html>
