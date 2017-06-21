<?php
  //prerequiste
  require('config.php');

  //establishing connection
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

  /* Disconnect function */
  function disconnect($db_conn){
    /* CLOSE CONNECTION */
    mysqli_close($db_conn);
  }

  //Function to validate the entered user
  function get_user($username, $password){
    $db_conn = connect();
    //trimming the input
    $username= mysqli_real_escape_string($db_conn, $username);
    $password= mysqli_real_escape_string($db_conn,$password);

    //query to find details against entered username
    $query = "SELECT userName, email, password FROM `admin` WHERE userName='".$username."'";
    //executing query and saving results in a variable
    $result = mysqli_query($db_conn, $query);

    if ($result){  //Now check if password matches
      $user = mysqli_fetch_assoc($result);
       if (mysqli_affected_rows($db_conn) > 0){
      //if entered password matches database
      if ($password==$user['password']) {
        return "Authenticated";
      }
      else{
          return "Incorrect Password";
      }
    }
    }
    //if user entered was not in database
    else{
        return "No Result Found";
    }

    /* free result set */
    mysqli_free_result($result);
    disconnect($db_conn);
  }

  //function to delete a dish
  function delete_dish($DishName, $Meal , $Day){
    $db_conn = connect();
    //trimming the inputs
    $DishName= mysqli_real_escape_string($db_conn, $DishName);
    $Meal= mysqli_real_escape_string($db_conn,$Meal);
    $Day= mysqli_real_escape_string($db_conn,$Day);

   //generating query to select all details of entered dish
    $query = "SELECT * FROM `$Day` WHERE Meal='".$Meal."' && Items ='".$DishName."' ";
   //saving results after executation
    $result = mysqli_query($db_conn, $query);

    if ($result){
      //query to delete the dish
      $query = "DELETE FROM `$Day` WHERE Meal='".$Meal."' && Items ='".$DishName."' ";
      mysqli_query($db_conn, $query);
      //redirecting to show updated results
      header("Location: mon_admin.php");
    }
    //if the dish didn't existed
    else{
      header("Location: delete.php");
    }

    /* free result set */
    mysqli_free_result($result);
    disconnect($db_conn);
  }

  //function to add a dish
  function Add_dish($DishName, $Meal , $Day,$Time,$fullPrice,$halfPrice){
   $db_conn = connect();
   //trimming th inputs
   $DishName= mysqli_real_escape_string($db_conn, $DishName);
   $Meal= mysqli_real_escape_string($db_conn,$Meal);
   $Day= mysqli_real_escape_string($db_conn,$Day);
   $Time= mysqli_real_escape_string($db_conn,$Time);
   $fullPrice= mysqli_real_escape_string($db_conn,$fullPrice);
   $halfPrice= mysqli_real_escape_string($db_conn,$halfPrice);

   //query to find item
   echo "above query";
   $query = "SELECT * FROM `$Day` WHERE Meal='".$Meal."' && Items ='".$DishName."' ";
   $result = mysqli_query($db_conn, $query);

   if ($result){  //Now check if password matches
     if (mysqli_affected_rows($db_conn) > 0){
        header("Location: add.php");
     }
     else{
      //  Query to add the item

        $query = "INSERT INTO `$Day`(`Meal`, `Items`, `fullPrice`, `halfPrice`, `startTime`, `endTime`)
        VALUES ('".$Meal."','".$DishName."','".$fullPrice."','".$halfPrice."','".$Time."','".$Time."')";
      // Execution of query
        mysqli_query($db_conn, $query);
      // Redirecting to see to updated result
        header("Location: mon_admin.php");

      }


   }

    /* free result set */
    mysqli_free_result($result);
    disconnect($db_conn);
  }

  // function to edit existing menu
  function Edit_dish($DishName, $Meal , $Day, $fullPrice,$halfPrice){
    $db_conn = connect();
    //trimming th inputs
    $DishName= mysqli_real_escape_string($db_conn, $DishName);
    $Meal= mysqli_real_escape_string($db_conn,$Meal);
    $Day= mysqli_real_escape_string($db_conn,$Day);
    //$Time= mysqli_real_escape_string($db_conn,$Time);
    $fullPrice= mysqli_real_escape_string($db_conn,$fullPrice);
    $halfPrice= mysqli_real_escape_string($db_conn,$halfPrice);

    //query to select data
    $query = "SELECT * FROM `$Day` WHERE Meal='".$Meal."' && Items ='".$DishName."' ";
    //query execution
    $result = mysqli_query($db_conn, $query);

    if ($result){
      //query to update the list
      if (mysqli_affected_rows($db_conn) > 0){


      $query = "UPDATE `$Day` SET `Meal`='$Meal',`Items`='$DishName',`fullPrice`='$fullPrice',`halfPrice`='$halfPrice',`starttime`='' ,`endTime`=''
      WHERE `Meal`='$Meal' && `Items`='$DishName'";

      //execution of the query
      mysqli_query($db_conn, $query);
      //redirect to updated page
      header("Location: mon_admin.php");
    }
      // if their was no result
    }
    else{
      header("Location: edit.php");
    }

    /* free result set */
    //  header("Location: delete.php");
    mysqli_free_result($result);
    disconnect($db_conn);
  }
