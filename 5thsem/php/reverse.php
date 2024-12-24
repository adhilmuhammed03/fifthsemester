<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>String Reverse</title>
</head>
<body>
    <form action="reverse.php" method="POST">
        <label for="string">Enter a string : </label>
        <input type="text" id="string" name="string" required>
        <input type="submit" value="Reverse">
    </form>

    <?php 
        if($_POST){
            $string = $_POST['string'];
            echo strrev($string);
        }
    ?>
   
    
</body>
</html>