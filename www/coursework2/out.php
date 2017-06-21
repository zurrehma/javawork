<?php

  session_start();
  //check whether user was already logged-in
  if(isset($_SESSION['authenticated'])){
    unset($_SESSION['authenticated']);
    header("Location:login.php");
  }
?>
