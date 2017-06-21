<?php
session_start();
if(!isset($_SESSION['username'])){
    header("Location: index.php");
}
?>


<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>FIT DEMO LOGIN REGISTERATION</title>
  <link rel="stylesheet" href="/css/master.css">
</head>
<body>

  <div class="wrap">

    <h2>ADMIN PAGE</h2>

    <h3> <?php echo ("Welcome ". $_SESSION['username']);?> </h3>
    <h3> <?php echo ("Your Email is:  ". $_SESSION['user_email']);?> </h3>
    <div>
      THIS PAGE IS  ONLY VISIBLE TO LOGED IN USER

    </div>

    <h3>Logout <a href="logout.php">Logout</a></h3>


  </div>
</body>

</html>
