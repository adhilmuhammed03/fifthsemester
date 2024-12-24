<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bio Data</title>

    
</head>
<body>
    <h1>Enter your personal information</h1>

    <form action="biodata.php" method="post">
        <label for="Name">Enter your name : </label>
        <input type="text" id="Name" name="Name" required>
        <br>
        <label for="age">Age : </label>
        <input type="text" id="age" name="age" required>
        <br>
        <label for="mobile">Mobile number</label>
        <input type="text" id="mobile" name="mobile" required>
        <br>

        <label for="address">Address : </label>
        <textarea name="address" id="address"></textarea>
        <br>
        <input type="submit" value="Display">

    </form>

    <?php 
    if($_POST){
        echo "<h1>Bio Data</h1>";
        echo "<h4>" . "Name : " .  $_POST['Name'] . "</h4>"  . "<br>";
        echo "<h4>" . "Age : "  . $_POST['age'] . "</h4>"  . "<br>";
        echo "<h4>" . "Mobile : " . $_POST['mobile'] . "</h4>" . "<br>";
        echo "<h4>" . "Address : " . $_POST['address'] . "</h4>" . "<br>";
    }

?>
</body>
</html>