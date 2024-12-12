<?php 
    session_start();
    $_SESSION['rabea'] = "Batheesh";

    setcookie('rabea', "Batheesh");
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Session and Cookies</h1>

    <h2>Session</h2>
    <div>
        <p>
            <span> Data in Session: <?php echo $_SESSION['rabea'] ?> </span> <br>
            <a href="./session.php">go to session page</a>
        </p>
    </div>

    <h2>Cookie</h2>
    <div>
        <span> Data in Cookie: <?php echo $_COOKIE['rabea'] ?> </span> <br>
        <a href="./cookie.php">go to cookie page</a>
    </div>
    
</body>
</html>