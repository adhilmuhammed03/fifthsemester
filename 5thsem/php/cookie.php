<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookie</title>
</head>
<body>
    <h4>this webpage was last visited on </h4>

    <?php 
        $cookie_name = "date";
        if(!isset($_COOKIE['date'])){
            echo "Not visited yet";
            $cookie_value = date("G:i:s - m/d/y");
            setcookie($cookie_name, $cookie_value,time() + (86400));
        }
        else{
            echo $_COOKIE['date'];
            $cookie_name = "date";
            $cookie_value = date("G:i:s - m/d/y");
            setcookie($cookie_name, $cookie_value,time() + (86400));
        }
    
    ?>
    
</body>
</html>