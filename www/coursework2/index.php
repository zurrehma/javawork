<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <!-- CSS Styling -->
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

<body>

  <!-- header and couple of buttons -->
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

    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.php">Home</a></li>
        <li class="active"><a href="Menu.php">Menu</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login.php"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>

    </div>
  </nav>

  <!-- Slidder images -->
  <div class="container">
  <div class="row">
  <div class="well" style="background-color: white;">
  <div id="img_slide">  <!-- Images to slide -->
  <div style="max-width:550px;height:500px;">
    <!-- Pictures to display  -->
    <img class="mySlides" src="pics/kitchen.jpg" style="width:1130px;height: 500px;">
    <img class="mySlides" src="pics/chickenkarahi.jpg" style="width:1130px;height: 500px;">
    <img class="mySlides" src="pics/coffee.jpg" style="width:1130px;height: 500px;">
    <img class="mySlides" src="pics/briyani.jpg" style="width:1130px;height: 500px;">
    <img class="mySlides" src="pics/people.jpg" style="width:1130px;height: 500px;">
  </div>

  <script> /*images SlideFunction*/
    var myIndex = 0;
    carousel();

    function carousel() {
      var i;
      var x = document.getElementsByClassName("mySlides");

      for (i = 0; i < x.length; i++) {
          x[i].style.display = "none";
      }
      myIndex++;

      if (myIndex > x.length) {myIndex = 1}
          x[myIndex-1].style.display = "block";
          setTimeout(carousel, 2000); // Change image every 2 seconds
      }
  </script>

  </div>
  <hr>
  <!-- Iframe code -->
  <iframe class=" col-md-90" src="RH.mp4" height="400" width="600">
  </iframe>

  </div>
  </div>
  </div>

  <!-- footer code -->
  <footer class="container-fluid text-center">
    <p>Copyrights</p>
  </footer>

</body>
</html>
