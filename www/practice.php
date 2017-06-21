<!DOCTYPE html>
<?php
$_SERVER['SCRIPT_NAME']='Google';
echo $_SERVER['SCRIPT_NAME'];
echo "<br>";
echo $_SERVER['SERVER_NAME'];
echo "<br>";
echo $_SERVER['HTTP_HOST'];
echo "<br>";
echo $_SERVER['HTTP_REFERER'];
echo "<br>";
echo $_SERVER['HTTP_USER_AGENT'];
echo "<br>";
echo $_SERVER['SERVER_ADDR'];
function setHeight($minheight = 50) {
    echo "The height is : $minheight <br>";
    if ($minheight<60) {
    	echo "yes <br>";
    }
}


?>
<html>
<body>


<div style="width: 200px;height: 200px;background-color: red">
<form>
	<textarea><?php setHeight(250); ?></textarea>
</form>

</div>
 <?php



setHeight();
setHeight(135);
setHeight(80);
?>

</body>
</html>