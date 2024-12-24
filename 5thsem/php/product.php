<?php

$conn = pg_connect("host=localhost port=5432 user=postgres password=admin dbname=php");
$query ="INSERT INTO product VALUES ('123','pen',5),('124','book',30),('125','water bottle',80),('126','eraser',5),('127','charger',25)" ;
pg_query($conn , $query) ;
$result = pg_query($conn,"select * from product");

if ($result && pg_num_rows($result) > 0) {
    echo "<table border=1>";
    echo "<tr>";
    for($i = 0; $i < 3; $i++){
        $filed_name = pg_field_name($result,$i);
        echo "<th>" . $filed_name . "</th>";
    }
    echo "</tr>";
    while($row = pg_fetch_assoc($result)){
        echo "<tr>";
        foreach($row as $cell){
            echo "<td>" . $cell . "</td>";
        }
        echo "</tr>";
    }
    echo "</table>";
} else {
    echo "No data found";
}



?>