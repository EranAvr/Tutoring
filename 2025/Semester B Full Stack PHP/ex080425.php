<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Exercise</title>

    <?php 
        $colors = ["red", "green", "blue", "yellow"];
        $namesToGrades = ["Avi"=> 90, "Dani" => 80, "Bob" => 100];
        
    ?>
</head>
<body>
    <h1>Foreach loop</h1>
    <div>
        <h2>Normal loop</h2>
        <div>
            <?php 
                for($i=0; $i<count($colors); $i++){
                    echo "<span>". ($i+1).". ".$colors[$i]."</span><br>";
                }
            ?>
        </div>
        <h2>Simple foreach loop</h2>
        <ol>
            <?php 
                foreach($colors as $x){ // לכל x מתוך המערך colors
                    echo "<li>".$x."</li>";
                }
            ?>
        </ol>
        <h2>Associative foreach loop</h2>
        <div>
            <?php
                foreach($namesToGrades as $k => $v){
                    echo "Name: ".$k." grade: ".$v."<br>";
                }
            ?>
        </div>
    </div>
    
</body>
</html>