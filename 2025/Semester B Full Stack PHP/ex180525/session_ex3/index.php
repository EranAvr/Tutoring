<?php
    session_start();

    if(isset($_SESSION['login_time']) && time() - $_SESSION['login_time'] > 20){
        session_unset();
        session_destroy();
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Hello To Main Page</h1>
    <a href="./login.php">login</a>

    <?php
        if(isset($_SESSION['username'])){
            echo "<h3>Hello " . $_SESSION['username'] . "</h3>";
            echo "You're logged in for " . (time() - $_SESSION['login_time']) . " seconds<br>";
        }
    ?>
</body>
</html>