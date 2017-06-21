<?php
	//Requiring DataBases File
	require("dataBase.php");
?>

<!-- //HTML Starts -->
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Menu</title>
		<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

		<!-- //CSS Styling -->
		<style>
		#button {
    /*background-color: skyblue; /* Green */*/
    border: none;
    color: white;
    /*padding: 15px 32px;*/
    text-align: center;
    text-decoration: none;
    display: inline-block;
    /*font-size: 16px;*/
    /*margin: 4px 2px;*/
    cursor: pointer;
		margin-left:2%
		}
		#button:hover {
			background-color: skyblue; /* Green */
			border: none;
			color: white;
			/*padding: 15px 32px;*/
			text-align: center;
			text-decoration: none;
			display: inline-block;
			cursor: pointer;
			margin-left:2%

		}

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
		#blackbutton{
			/*background-color: #555;*/
			margin-left:2%
		}
	</style>
	<!-- //CSS Styling Ends -->
</head>

<!-- //Body Tag -->
<body>

	<!-- //Upper-footer with styling and couple of buttons -->
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="index.php">Mess Managment System</a>
  </div>
	<!-- Buttons -->
  <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
      <li class="active"><a href="index.php">Home</a></li>
      <li class="active"><a href="Menu.php">Menu</a></li>
    </ul>

    <ul class="nav navbar-nav navbar-right">
			<li ><a href="out.php"><span class="glyphicon glyphicon-log-in"></span> LogOut</a></li>
    </ul>
  </div>
  </div>
	</nav>

	<!-- //HTML code to show contents -->
	<div class="container">
	<div class="row">
	<div class="well">
		<ul class="nav nav-pills nav-justified">

			<!-- //Buttons for selecting a day -->
			<form action="mon_admin.php" method="post">
				<button id="button" style="margin-left:17%" class="btn btn-primary" type="submit" value="Submit" name="Monday">Monday</button>
				<button  id="button"  class="btn btn-primary" type="submit" value="Submit" name="Tuesday">Tuesday</button>
				<button id="button"  class="btn btn-primary" type="submit" value="Submit" name="Wednesday">Wednesday</button>
				<button id="button"  class="btn btn-primary" type="submit" value="Submit" name="Thursday">Thursday</button>
				<button id="button"  class="btn btn-primary" type="submit" value="Submit" name="Friday">Friday</button>
				<button id="button"  class="btn btn-primary" type="submit" value="Submit" name="Saturday">Saturday</button>
				<button id="button"  class="btn btn-primary" type="submit" value="Submit" name="Sunday">Sunday</button>
			</form>
		</ul>

		<!-- //Manuplating content -->
		<div class="tab-content">
  	<div class="tab-pane fade in active">

		<!-- //Showing Breakfast Menu of the selected day -->
  	<hr>
		<!-- Showing breakfast menu-->
    <h1>Breakfast(7:00am-9:00am)</h1>
    <table class="table table-striped">
      <thead>
        <tr bgcolor='skyblue'>
          <td>Items</td>
          <td>Half Price</td>
          <td>Full Price</td>
        </tr>
      </thead>

		<tbody>
			<!-- fetching data from database -->
      <?php
				//if user wants to see breakfast menu of monday
				if(isset($_POST['Monday'])){
					$db_conn = connect();
					echo "<h3 style=\"float:right\";><i>Monday's Menu</i></h3>";
          $sql = "SELECT Items, fullPrice, halfPrice From Monday WHERE Meal='Breakfast'";
          $result = mysqli_query($db_conn, $sql);

					//if their were results to show
          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				//if user wants to see breakfast menu of tuesday
				else if(isset($_POST['Tuesday'])){
					$db_conn = connect();
					echo "<h3 style=\"float:right\";><i>Tuesday's Menu</i></h3>";
          $sql = "SELECT Items, halfPrice, fullPrice From Tuesday WHERE Meal='Breakfast'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				//if user wants to see breakfast menu of wednesday
				else if(isset($_POST['Wednesday'])){
					$db_conn = connect();
					echo "<h3 style=\"float:right\";><i>Wednesday's Menu</i></h3>";
          $sql = "SELECT Items, halfPrice, fullPrice From Wednesday WHERE Meal='Breakfast'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				//if user wants to see breakfast menu of thursday
				else if(isset($_POST['Thursday'])){
					$db_conn = connect();
					echo "<h3 style=\"float:right\";><i>Thursday's Menu</i></h3>";
          $sql = "SELECT Items, halfPrice, fullPrice From Thursday WHERE Meal='Breakfast'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				//if user wants to see breakfast menu of friday
				else if(isset($_POST['Friday'])){
					$db_conn = connect();
					echo "<h3 style=\"float:right\";><i>Friday's Menu</i></h3>";
          $sql = "SELECT Items, halfPrice, fullPrice From Friday WHERE Meal='Breakfast'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				//if user wants to see breakfast menu of saturday
				else if(isset($_POST['Saturday'])){
					$db_conn = connect();
					echo "<h3 style=\"float:right\";><i>Saturday's Menu</i></h3>";
          $sql = "SELECT Items, halfPrice, fullPrice From Saturday WHERE Meal='Breakfast'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				//if user wants to see breakfast menu of sunday
				else if(isset($_POST['Sunday'])){
					$db_conn = connect();
					echo "<h3 style=\"float:right\";><i>Sunday's Menu</i></h3>";
          $sql = "SELECT Items, halfPrice, fullPrice From Sunday WHERE Meal='Breakfast'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}
				//TO SHOW THE MENU OF CURRENT DAY AUTOMATICALLY
				else{
					//WILL READ USER'S CALENDER FOR CURRENT DAY
					$calender = date("l");
					echo "<h3 style=\"float:right\";><i>$calender's Menu</i></h3>";
					$db_conn = connect();
					$sql = "SELECT Items, halfPrice, fullPrice From $calender WHERE Meal='Breakfast'";
					$result = mysqli_query($db_conn, $sql);

					//if their were results to show
					if(mysqli_num_rows($result) > 0){
						while($row = mysqli_fetch_assoc($result)){
							echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
						}
					}
				}
			?>
    </tbody>
		</table>

		<!-- //same code to show contents of lunch menu from databases -->
		<hr>
    <h1>Lunch(1:00am-2:00am)</h1>
    <table class="table table-striped">
      <thead>
        <tr bgcolor='skyblue'>
          <td>Items</td>
          <td>Half Price</td>
          <td>Full Price</td>
        </tr>
      </thead>

		<tbody>
      <?php
			//if user enter any day its particular lunch menu will appear
				if(isset($_POST['Monday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Monday WHERE Meal='Lunch'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Tuesday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Tuesday WHERE Meal='Lunch'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Wednesday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Wednesday WHERE Meal='Lunch'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Thursday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Thursday WHERE Meal='Lunch'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Friday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Friday WHERE Meal='Lunch'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Saturday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Saturday WHERE Meal='Lunch'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Sunday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Sunday WHERE Meal='Lunch'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}
				//WILL SHOW CURRENT DAY MENU AUTOMATICALLY
				else {
					$calender = date("l");
					$db_conn = connect();
					$sql = "SELECT Items, halfPrice, fullPrice From $calender WHERE Meal='Lunch'";
					$result = mysqli_query($db_conn, $sql);

					//if their were results to show
					if(mysqli_num_rows($result) > 0){
						while($row = mysqli_fetch_assoc($result)){
							echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
						}
					}
				}
			?>
    </tbody>
		</table>

		<!-- //same to code, as used above, but this time to show Menu contents of Dinner -->
		<hr>
    <h1>Dinner(8:00am-9:00am)</h1>
    <table class="table table-striped">
      <thead>
        <tr bgcolor='skyblue'>
          <td>Items</td>
          <td>Half Price</td>
          <td>Full Price</td>
        </tr>
      </thead>

		<tbody>
      <?php

			//if user enter any day its particular dinner menu will appear
				if(isset($_POST['Monday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Monday WHERE Meal='Dinner'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Tuesday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Tuesday WHERE Meal='Dinner'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Wednesday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Wednesday WHERE Meal='Dinner'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Thursday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Thursday WHERE Meal='Dinner'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Friday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Friday WHERE Meal='Dinner'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Saturday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Saturday WHERE Meal='Dinner'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}

				else if(isset($_POST['Sunday'])){
					$db_conn = connect();
          $sql = "SELECT Items, halfPrice, fullPrice From Sunday WHERE Meal='Dinner'";
          $result = mysqli_query($db_conn, $sql);

          if(mysqli_num_rows($result) > 0){
            while($row = mysqli_fetch_assoc($result)){
              echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
            }
          }
				}
				else {
					$calender = date("l");
					$db_conn = connect();
					$sql = "SELECT Items, halfPrice, fullPrice From $calender WHERE Meal='Dinner'";
					$result = mysqli_query($db_conn, $sql);

					//if their were results to show
					if(mysqli_num_rows($result) > 0){
						while($row = mysqli_fetch_assoc($result)){
							echo "<tr bgcolor='gainsboro'><td><b>".$row["Items"]."</b></td><td><b>".$row["halfPrice"]."</b></td><td><b>".$row["fullPrice"]."</b></td></tr>";
						}
					}
				}
			?>
    </tbody>
		</table>

	<!-- //table styling ends -->
  </div>
  </div>
	<a href="add.php" class="btn btn-primary btn-lg">Add</a>
	<a href="delete.php" class="btn btn-danger btn-lg" style="margin-left: 3%;">Delete</a>
	<a href="edit.php" class="btn btn-primary btn-lg" style="margin-left: 3%;">Edit</a>

	<!-- //table divisions ends -->
	</div>
	</div>
	</div>


	<!-- //footer code -->
	<footer class="container-fluid text-center">
		<p>Copyrights</p>
	</footer>

<!-- //closing ends -->
</body>
</html>
