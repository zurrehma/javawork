<?php
session_start();
if(isset($_SESSION['authenticated'])){
    header("Location: mon_admin.php");
}

?>
  <!DOCTYPE html>
  <html lang="en">
  <head>
    <title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

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
      margin-top: 2%;
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
    <!-- Navigation bar starts -->
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
    <!-- Navigation bar ends -->

    <!-- form for entering username and password -->
    <div id="container">
      <div class="row">
        <div class="well">
          <h1 style="margin-left: 20%;">Sign In</h1>
          <hr><hr><hr>
          <form class="form-horizontal" action="loginData.php" method='post'>
            <div class="form-group">
              <label class="control-label col-sm-2" for="pwd">User Name :</label>
              <div class="col-sm-4">
                <input type="text" class="form-control" id="pwd" name="username" placeholder="Enter Username">
              </div>
            </div>
            <hr><hr>
            <div class="form-group">
              <label class="control-label col-sm-2" for="pwd">Password :</label>
              <div class="col-sm-4">
                <input type="Password" class="form-control" id="pwd" name="password" placeholder="Enter Password">
              </div>
            </div>
            <button type="submit" class="btn btn-primary" name="signIn" style="margin-left: 20%;">Sign In</button>
          </form>
          <hr><hr>
          <!-- form ends -->
        </div>
      </div>
    </div>

    <!-- footer -->
    <footer class="container-fluid text-center">
      <p>Copyrights</p>
    </footer>
  </body>
</html>
