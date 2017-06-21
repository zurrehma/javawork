<?php
  require('dataBase.php');
  //start session
  session_start();

  //if submit button to delet a dish was pressed
  if(isset($_POST['Submit'])){ //Delete Dish ka submit
    if (isset($_POST['DishName']) && (isset($_POST['Meal'])) && (isset($_POST['Day']))){

      $DishName = $_REQUEST['DishName'];
      $Meal = $_REQUEST['Meal'];
      $Day = $_REQUEST['Day'];
      delete_dish($DishName, $Meal, $Day);
    }
  }

  //if the button to add a dish was pressed
  else if(isset($_POST['Add'])){
    if (isset($_POST['DishName']) && (isset($_POST['Meal'])) && (isset($_POST['Day']))){

      $DishName = $_REQUEST['DishName'];
      $Meal = $_REQUEST['Meal'];
      $Day = $_REQUEST['Day'];
      $Time=$_REQUEST['Time'];
      $fullPrice=$_REQUEST['fullPrice'];
      $halfPrice=$_REQUEST['halfPrice'];
      Add_dish($DishName, $Meal, $Day,$Time,$fullPrice,$halfPrice);
      header("Location: mon_admin.php");

    }
  }

  //if admin intended to edit a dish
  else if(isset($_POST['Edit'])){
    if (isset($_POST['DishName']) && (isset($_POST['Meal'])) && (isset($_POST['Day']))){

      $DishName = $_REQUEST['DishName'];
      $Meal = $_REQUEST['Meal'];
      $Day = $_REQUEST['Day'];
      $fullPrice=$_REQUEST['fullPrice'];
      $halfPrice=$_REQUEST['halfPrice'];
      Edit_dish($DishName, $Meal, $Day,$fullPrice,$halfPrice);

      header("Location: mon_admin.php");
    }
  }
