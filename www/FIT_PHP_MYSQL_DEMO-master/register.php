<?php
require('db.php');

if (isset($_POST['submit']) ){
  $username = $_POST['username'];
  $password = $_POST['password'];
  $email = $_POST['email'];
  register_user($username, $password, $email);


}else{
  echo ("No Data posted here");
}
