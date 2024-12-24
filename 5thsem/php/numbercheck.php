<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Number check</title>
</head>
<body>
    <h1>Perfect abundant or deficient</h1>
    <form action="numbercheck.php" method="post">
        <label for="number">Enter a number</label>
        <input type="number" id="number" name="number" required>
        <input type="submit" value="Check">
    </form>

    <?php 
        if($_POST){
            $number = $_POST['number'];
            $sum = 0 ;
            for($i = 1 ; $i <= $number/2; $i++){
                if($number % $i == 0){
                    $sum += $i;
                }
            }
            if($sum == $number){
                echo "The number is perfect";
            }else if ($sum > $number){
                echo "The number is abundant";
            }else {
                echo "The number is deficient";
            }
        }
    ?>
    
</body>
</html>