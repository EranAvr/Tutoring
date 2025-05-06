<?php
    session_start();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Session Example</title>
    <link rel="stylesheet" href="./index.css">
</head>
<body>
    <header>
        <h1>Our Session Website</h1>
    </header>
    <nav>
        <a href="./index.php">Home</a>
        <a href="./profile.php">My profile</a>
        <a href="#">About</a>
        <a href="./make_disconnect.php">Disconnect</a>
        <span> <?php 
        if(isset($_SESSION['username']) && $_SESSION['username'] != ""){
            echo $_SESSION['username'];
        } else {
            echo '<a href="./login_page.html">Login</a>';
        }
        ?> </span>
    </nav>
    <article>
        <p>
            Main content of website
        </p>
        <p>
            Lorem, ipsum dolor sit amet consectetur <br>
             adipisicing elit. Impedit similique tenetur <br>
             cum eius rerum quibusdam veniam at nulla <br>
              exercitationem numquam, vero consequuntur <br>
               voluptatibus soluta praesentium laudantium <br>
                tempora deleniti earum beatae? <br>
        </p>
    </article>
</body>
</html>