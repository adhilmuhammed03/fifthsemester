<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank</title>
</head>
<body>
    <form action="bank.php" method="post">
        <input type="text" placeholder="Account Number" name="accno"><br>
        <input type="number" placeholder="Amount" name="amount"><br>
        <label for="deposit">Deposit</label>
        <input type="radio" name="operation" id="deposit" value="deposit">
        <label for="withdrawal">Withdraw</label>
        <input type="radio" name="operation" id="withdrawal" value="withdrawal"><br>
        <input type="submit" value="update">
    </form>

    <?php
    if($_POST) {
        $conn = pg_connect("host=localhost port=5432 user=postgres password=admin dbname=php");
        $accno = $_POST['accno'];
        $amount = $_POST['amount'];
        $operation = $_POST['operation'];
        if($operation == 'deposit'){
            $query = "UPDATE bank SET balance = balance+$amount WHERE accno='$accno'";
            pg_query($conn,$query);
            $balance = pg_query($conn,"SELECT balance FROM bank WHERE accno='$accno'");
            $row = pg_fetch_assoc($balance);
            echo "The updated balance is " . $row['balance'] . "<br>";
        }else if($operation == 'withdrawal'){
            $query = "UPDATE bank SET balance = balance-$amount WHERE accno='$accno'";
            pg_query($conn,$query);
            $balance = pg_query($conn,"SELECT balance FROM bank WHERE accno='$accno'");
            $row = pg_fetch_assoc($balance);
            echo "The updated balance is " . $row['balance'] . "<br>";
        }
    }







    ?>
    
</body>
</html>