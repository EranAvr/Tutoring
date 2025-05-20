<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>File Content:</h1>
    <div style="border: 1px solid black">
        <?php
            if( isset($_GET['fileName']) && $_GET['fileName'] != "" )
                echo readfile($_GET['fileName']);
            else
                echo "No file name was given";
        ?>
    </div>
</body>
</html>