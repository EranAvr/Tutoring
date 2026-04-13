<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./themes.css">
</head>
<body class="<?php echo isset($_COOKIE["theme"]) ? $_COOKIE["theme"] : "light"; ?>">
    <?php 
        $title = "Main Page";
        include("./navbar.php");
    ?>

    <h1>Welcome to my website</h1>
</body>
</html>