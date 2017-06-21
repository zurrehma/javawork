<?php
session_start();
if(isset($_SESSION['username'])){
    header("Location: admin.php");
}
?>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>FIT DEMO LOGIN REGISTERATION</title>
  <link rel="stylesheet" href="css/master.css">
</head>
<body>

  <div class="wrap">

    <h2>FIT: DEMO</h2>

    <input type='checkbox' id='form-switch'>

    <form id='login-form' action="login.php" method='post'>
      <input type="text" name="username" placeholder="Username" required>
      <input type="password" name= "password" placeholder="Password" required>
      <button type='submit'>Login</button>
      <label for='form-switch'><span>Register</span></label>

    </form>

    <form id='register-form' action="register.php" method='post'>
      <input type="text" name="username" placeholder="Username" required>
      <input type="email" name="email" placeholder="Email" required>
      <input type="password" name="password"  placeholder="Password" required>
      <button type='submit' name="submit" >Register</button>
      <label for='form-switch'>Already Member ? Sign In Now..</label>
    </form>
  </div>
</body>

</html>
