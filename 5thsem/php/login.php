<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <form action="login.php" method="post">
        <label for="username">Enter your username : </label>
        <input type="text" name="username" id="username">
        <label for="password">Enter your password : </label>
        <input type="text" name="password" id="password">
        <input type="submit" value="login">
    </form>

<?php
if($_SERVER['REQUEST_METHOD'] == 'POST'){
$conn = pg_connect("host=localhost port=5432 user=postgres password=admin dbname=php");
$username = $_POST['username'];
$password = $_POST['password'];
$result = pg_query($conn , "select * from users where username='$username' and password='$password'") ;
if ($result && pg_num_rows($result) > 0) {
    echo "Login successful!";
} else {
    echo "Login failed. Please check your username and password.";
}

}

?>
    
</body>
</html>