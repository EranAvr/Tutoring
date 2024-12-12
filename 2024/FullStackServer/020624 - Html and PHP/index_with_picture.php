<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ramzi Page</title>
</head>
<body>
    <?php 
        $imgSrc = "https://letsenhance.io/static/8f5e523ee6b2479e26ecc91b9c25261e/1015f/MainAfter.jpg";
    ?>
    <h1>Text Website</h1>
    
    <p>
        <?php
            // this is a php block
            echo("<h3>Some text added dynamically</h3>");
        ?>
    </p>
    <div>
        <img src=<?php echo($imgSrc); ?> alt="image failed">
    </div>
</body>
</html>