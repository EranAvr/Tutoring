<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP Exercise</title>

    <?php 
        $daysOfWork = ["Sunday", "Monday", "Wednesday"];
        $carBrands = ["Mazda", "Toyota", "Volvo", "Ford"];
        $bestSeller = ["brand"=>"Ford", "model"=> "Mustang", "engine"=>2000];
        $brandsToModels = [
            "Mazda" => ["6", "3", "2"],
            "Toyota" => ["Yaris", "Land Cruiser"],
            "Volvo" => ["model-1", "model-2"],
            "Ford" => ["Mustang", "Focus"],
        ];
    ?>
</head>
<body>
    <h1>Cars for sale</h1>
    <h3> <?php
        echo "Server timezone: " . date_default_timezone_get() . "<br>";
        date_default_timezone_set("Asia/Jerusalem");
        echo date("d/m/Y H:i:s");
    ?> </h3>

    <h2>Working days:</h2>
    <ul>
        <?php 
            for ($i = 0; $i < count($daysOfWork); $i++) {
                echo "<li> $daysOfWork[$i] </li>";
            }
        ?>
    </ul>
    <h2>Car brands:</h2>
    <ol>
        <?php 
            for ($i = 0; $i < count($carBrands); $i++) {
                echo "<li> $carBrands[$i] </li>";
            }
        ?>
    </ol>
    
    <article>
        <h2>Best seller:</h2>
        <div>
            <?php
            foreach($bestSeller as $key => $value) {
                echo $key .": ". $value ."<br>";
            }
            ?>
        </div>
        <h2>All cars</h2>
        <div>
            <?php
            foreach($brandsToModels as $brand => $carsList) {
                echo "<h3> $brand </h3>";
                print_r($carsList);
                echo "<hr>";
            }
            ?>
        </div>
    </article>
</body>
</html>