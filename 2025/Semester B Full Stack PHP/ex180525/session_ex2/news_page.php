<?php
    session_start();

    if(isset($_SESSION['counter'])){    // not our first time in here...
        $_SESSION['counter']++;
    } else {    // first time arriving to this page
        $_SESSION['counter'] = 1;
    }

    if (isset($_SESSION['counter']) && $_SESSION['counter'] > 10){
        header("Location: index.html");
    }
?>

<!DOCTYPE html>
<html lang="en">
<body>
    <h1>News Page</h1>
    <p>
        Counter: <?php echo $_SESSION['counter']; ?>
    </p>
    <p>
        <?php 
            if($_SESSION['counter'] === 1){
                echo "<h3>Hello for the first time!</h3>";
            } else if($_SESSION['counter'] === 10){
                echo "<h2>This is your last visit in News Page.</h2>";
            }
            else {
                echo "<h2>We see you visited here before. Welcome back.</h2>";
            }
        ?>
    </p>
</body>
</html>