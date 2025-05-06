<?php
    session_start();
?>

<!DOCTYPE html>
<html lang="en">
<body>
    <h1>Profile Page</h1>
    <h2><?php if(isset($_SESSION['username']) && $_SESSION['username'] != ""){
            echo $_SESSION['username'];
            } else {
                echo "No user";
            }
    ?></h2>
    <p>
        Some user info and preferences... <br>
    </p>
</body>
</html>