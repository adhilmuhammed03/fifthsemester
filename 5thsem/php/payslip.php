<html>
    <head>
        <title>Pay Slip</title>
    </head>
        <form action="payslip.php" method="post">
        <center><h1>Payslip Generator</h1></center>
        <input type="text" placeholder="Enter your Name : " name="name" id="name">
        <input type="number" placeholder="Enter your Basic Salary : " name="salary" id="salary">
        <p>Choose your Designation : </p>
        <select name="designation" id="designation">
            <option value="manager">Manager</option>
            <option value="supervisor">Supervisor</option>
            <option value="clerk">Clerk</option>
            <option value="peon">Peon</option>
        </select>
        <input type="submit" value="Generate">

        </form>

        <?php 
            if($_POST){
                $name = $_POST['name'];
                $salary = $_POST['salary'];
                $designation = $_POST['designation'];
                if($designation == "manager"){
                    $conveyance = 1000;
                    $extra = 500;
                }elseif($designation == "supervisor"){
                    $conveyance = 750;
                    $extra = 200;
                }elseif($designation == "clerk"){
                    $conveyance = 500;
                    $extra = 100;
                }elseif($designation == "peon") {
                    $conveyance = 250;
                    $extra = 0;
                }
                $hra = 0.25 * $salary;
                $gross = $salary + $hra + $conveyance + $extra;

                if ($gross <= 2500) {
                    $tax = 0;
                } elseif ($gross <= 4000) {
                    $tax = 0.03 * $gross;
                } elseif ($gross <= 5000) {
                    $tax = 0.05 * $gross;
                } else {
                    $tax = 0.08 * $gross;
                }
                $net = $gross - $tax;

                echo "<center><h1>Payment Slip</h1></center>";
                echo "<h5>Name : " . $name . "</h5>";
                echo "<h5>Basic Salary : " . $salary . "</h5>";
                echo "<h5>Designation : " . $designation . "</h5>";
                echo "<h5>Conveyance Allowance : " . $conveyance . "</h5>";
                echo "<h5>Extra Allowance : " . $extra . "</h5>";
                echo "<h5>HRA : " . $hra . "</h5>";
                echo "<h5>Income Tax : " . $tax . "</h5>";
                echo "<h5>Gross Salaray : " . $gross. "</h5>";
                echo "<h5>Net Salaray : " . $net. "</h5>";
                

            }
        
        
        ?>
        
    </body>
</html>