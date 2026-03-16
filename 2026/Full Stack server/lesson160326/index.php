<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>About Page</h1>
    <p>
        <h3>User: <?php echo "Username" /*Take username from server*/ ?></h3>
    </p>
    <div>
        <img src="<?php echo "..." ?>" alt="">
    </div>
    <hr>
    <ul>
        <?php echo "<li> ... </li>" ?>
    </ul>
</body>
</html>