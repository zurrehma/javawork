<?php
  session_start();
  require('dataBase.php');

  // if button was pressed
  if(isset($_POST['signIn'])){
    // if required data fields were filled
    if (isset($_POST['username'])&& (isset($_POST['password']))){

      $username = $_REQUEST['username'];
      $password = $_REQUEST['password'];
      $user = get_user($username,$password);

     // if data were correct
     if($user == "Authenticated"){
       $_SESSION['authenticated']='1';
       header("Location: mon_admin.php");
     }
     // if data fields were not filled, redirect user
     else{
       header("Location: Login.php");
     }

    }
  }
