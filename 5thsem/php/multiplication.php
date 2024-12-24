<?php 
    if($_POST){
        $num = intval($_POST['number']);
        $mul = intval($_POST['multiplier']);
        for($i = 0;$i <= $mul;$i++){
            echo "$num x $i = " . ($num * $i ). "<br>";
        }

    }
  
    
    ?>