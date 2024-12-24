<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student</title>
</head>
<body>
    <form action="student.php" method="post">
    <label for="roll">Enter your register number : </label> 
    <input type="text" name="roll" id="roll">
    <input type="submit" value="fetch">
    </form>

    <?php 
    
    if($_SERVER['REQUEST_METHOD'] == 'POST'){
        $conn = pg_connect("host=localhost port=5432 user=postgres password=mamo dbname=student");
        $roll_number = $_POST['roll'];
        $result = pg_query($conn , "select * from student where roll_no='$roll_number'") ;
        
        if ($result && pg_num_rows($result) > 0) {
            $student = pg_fetch_assoc($result);
            echo "Roll no : " . $student["roll_no"] . "<br>";
            echo "Name : " . $student["name"] . "<br>";
            echo "Marks : " . $student["mark"] . "<br>";
            echo "Grade : " . $student["grade"] . "<br>";
            
        } else {
            echo "Invalid register number ";
        }
    
    }
    ?>
   
</body>
</html>