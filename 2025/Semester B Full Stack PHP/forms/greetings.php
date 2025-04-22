<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3> <?php
        if(isset($_GET['myName']) && $_GET['myName'] != ""){
            echo "Hello dear " . $_GET['myName'];
        } else {
            echo "Name not given via form";
        }
    ?> </h3>
    
    
</body>
</html>