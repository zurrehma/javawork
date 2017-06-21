<?php
$cars= array(  array("volvo","16","13" ),array("sab","16","13" ),array("ferrari","16","13" ) );
echo "carName"."      "."InStock"."    "."Sold"."<br>";
for ($i=0; $i <3 ; $i++) { 
	# code...
	for ($j=0; $j <3 ; $j++) { 
		# code...
		echo $cars[$i][$j]."      ";
	}
	echo "<br>";
}
?>