<?php 
$connection = mysqli_connect('localhost','root','','zahid');

if($connection)
{
	echo 'ok';
}
else
{
	echo 'not ok';
}

/*$sql = "UPDATE data SET id=2 WHERE name='zahid'";
$res = mysqli_query($connection,$sql);
$sql = "INSERT INTO data VALUES (3,'khan')";
$res = mysqli_query($connection,$sql);
$sql = "CREATE DATABASE demo";
$res = mysqli_query($connection,$sql);
if($res)
{
	echo 'run';
}
else{
	echo 'error';
}*/
?>