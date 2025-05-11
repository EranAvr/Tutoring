<?php
    date_default_timezone_set("Asia/Jerusalem");
    setcookie("cur_time", date("H:i:s"));
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cookies test page</title>
</head>
<body>
    <h1>Cookies Example</h1>
    <article>
        <nav>
            <a href="./current_time.php">Current time</a>
            <a href="./write_name.html">Write your name</a>
            <a href="./delete_cookie.php">Delete myName cookie</a>
            <span>
                <?php
                if(isset($_COOKIE['myName'])){
                    echo $_COOKIE['myName'];
                } else {
                    echo "No name was given";
                }
                ?>
            </span>
        </nav>
    </article>
</body>
</html>