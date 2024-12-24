<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fruits</title>
</head>
<body>
    <h5>Select a fruit</h5>

    <form action="fruits.php" method="POST">
        <select name="fruits" id="fruits">
            <option value="apple">Apple</option>
            <option value="banana">banana</option>
            <option value="mango">Mango</option>
            <option value="grapes">Grapes</option>
        </select>
        <input type="submit" value="select">

    </form>

    <?php 
        echo "The selected fruit is " . $_POST['fruits'];
    ?>


    
</body>
</html>