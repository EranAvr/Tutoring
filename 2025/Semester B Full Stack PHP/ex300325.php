<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Exercise</title>
</head>
<body>
    <h1>Arrays Exercises</h1>
    <div>
        <h2>Present simple array</h2>
        <ul>
            <?php
                $arr = array(10, 11, 67, 34, -7);
                echo "<li> $arr[0] </li>";
                echo "<li> $arr[1] </li>";
                echo "<li> $arr[2] </li>";
                echo "<li> $arr[3] </li>";
                echo "<li> $arr[4] </li>";
            ?>
        </ul>
    </div>
    <hr>
    <div>
    <h2>Present associative array</h2>
        <ul>
            <?php 
                $assoc = [
                    "brand" => "Mazda",
                    "model" => "Rx8",
                    "motor" => "2000",
                ];
                $b = "brand";
                echo "<li> Brand: $assoc[$b] </li>";
                $mod = "model";
                echo "<li> Model: $assoc[$mod] </li>";
                $mot = "motor";
                echo "<li> Motor: $assoc[$mot] </li>";
            ?>
        </ul>
    </div>
</body>
</html>