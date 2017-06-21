<?php
require('config.php');

function connect(){
  $db_conn = mysqli_connect(DB_HOST,DB_USER,DB_PASS,DB_NAME);

  /* check connection */
  if (mysqli_connect_errno()) {
    printf("Connect failed: %s\n", mysqli_connect_error());
    exit();
  }
  /* change character set to utf8 */
  if (!mysqli_set_charset($db_conn, "utf8"))
    printf("Error loading character set utf8: %s\n", mysqli_error($db_conn));


  return $db_conn;

}

function disconnect($db_conn){
  /* CLOSE CONNECTION */
  mysqli_close($db_conn);
}

 function get_user($username, $password, $email){
  $db_conn = connect();
  $username= mysqli_real_escape_string($db_conn, $username);
  $password= mysqli_real_escape_string($db_conn,$password);

  $query = "SELECT username, email, password FROM `users` WHERE username='".$username."'";

  $result = mysqli_query($db_conn, $query);

  if ($result){  //Now check if password matches
        if (mysqli_affected_rows($db_conn) > 0){

          $user = mysqli_fetch_assoc($result);
          if (password_verify($password, $user['password'])) {
            $_SESSION['username'] = $user['username'];
            $_SESSION['user_email'] = $user['email'];
            $_SESSION['user_login_status'] = 1;
             // Redirect user to admin.php
              header("Location: admin.php");
        }else{
          echo ("Incorrect Password");
          header("Location: index.php");
        }
      }else{
        echo ("User not found");
      }
    }
    else{
      echo "DatabaseError: fetching data for User";
    }
  /* free result set */
  mysqli_free_result($result);
  disconnect($db_conn);
}


function register_user($username, $password, $email){
    $db_conn = connect();

    $username = mysqli_real_escape_string($db_conn,$username);
    $password = mysqli_real_escape_string($db_conn,$password);
    $password = password_hash($password, PASSWORD_DEFAULT); //encrypt the password

    $email    = mysqli_real_escape_string($db_conn,$email);

    //check if user or email address already exists
       $query = "SELECT * FROM users WHERE username = '" . $user_name . "' OR email = '" . $email . "';";
       $q_user_check = mysqli_query($db_conn, $query);
       if ($q_user_check){
         if (mysqli_affected_rows($db_conn) > 0){
           echo ("<h2>Sorry, that username / email address is already taken.</h2>");
           echo ("<h3> <a href='index.php'>try again</a> </h3>");
         }
         else {
           $query = "INSERT INTO users (username, password, email) VALUES ('".$username."', '".$password."', '".$email."')";
           $result = mysqli_query($db_conn, $query);
           if ($result){
             if (mysqli_affected_rows($db_conn) > 0){
               echo ("<h2>User Registered Succssfully</h2>");
               echo ("<h3> <a href='index.php'>Click here to login</a> </h3>");
             }
             else {
               echo ("Database Error");
             }
           }
         }
       }

     disconnect($db_conn);
}
