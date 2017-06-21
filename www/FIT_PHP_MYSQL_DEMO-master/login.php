<?php
require('db.php');

session_start();

if (isset($_POST['username'])&& (isset($_POST['password']))){

  $username = $_REQUEST['username'];
  $password = $_REQUEST['password'];
  $user = get_user($username,$password);


 // Redirect user to admin.php
  header("Location: admin.php");

}
