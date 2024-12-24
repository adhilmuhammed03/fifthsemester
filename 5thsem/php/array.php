<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Array</title>
</head>
<body>
    <?php 
        // Initial array
        $names = array('rahil','rahil','jaseel','afeef','ansil','ashique','ijas','fadil','dhanush','shemil');

        // Display the original array
        echo "The elements in the array are:<br>";
        foreach($names as $x) {
            echo "$x <br>";
        }

        // Sort the array
        echo "<br>The array in sorted order is:<br>";
        $sorted_array = $names; // Copy original array to preserve it
        sort($sorted_array);
        foreach($sorted_array as $x) {
            echo "$x <br>";
        }

        // Remove duplicates
        echo "<br>The array without duplicates is:<br>";
        $unq_names = array_unique($names);
        foreach($unq_names as $x) {
            echo "$x <br>";
        }

        // Remove the last element
        echo "<br>The array without the last element is:<br>";
        $array_2 = $names; // Modify the array in-place
        array_pop($array_2);
        foreach($array_2 as $x) {
            echo "$x <br>";
        }

        // Reverse the array
        echo "<br>The array in reverse order is:<br>";
        $reversed = array_reverse($unq_names,true);
        foreach($reversed as $x) {
            echo "$x <br>";
        }

        // Search for a specific name
        echo "<br>Searching for the name 'jaseel' in the array:<br>";
        $key = 'jaseel';
        $search_result = array_search($key, $names, true); // Returns index or false
        if ($search_result !== false) {
            echo "'$key' found at index $search_result.<br>";
        } else {
            echo "'$key' not found.<br>";
        }
    ?>
</body>
</html>
