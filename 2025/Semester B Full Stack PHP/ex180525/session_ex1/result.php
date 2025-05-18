<?php
    session_start();

    if(isset($_POST['username']) && $_POST['username']!=""){
        $_SESSION['username'] = $_POST['username'];
    }
    else {
        session_unset();
    }
?>

<!DOCTYPE html>
<html lang="en">
<body>
    <?php
        if(isset($_SESSION['username'])){
            echo "Login succeeded!<br>";
            echo "Hello " . htmlspecialchars($_SESSION['username']) ;
        }
        else {
            echo "Error in login occurred";
        }
    ?>
</body>
</html>