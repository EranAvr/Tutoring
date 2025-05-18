<?php
    session_start();

    if(isset($_POST['username']) && $_POST['username']!=""){
        $_SESSION['username'] = $_POST['username'];
        $_SESSION['login_time'] = time();
    }
    else {
        session_unset();
    }
?>

<!DOCTYPE html>
<html lang="en">
<body>
    <h2>Login Page</h2>
    <a href="./index.php">Home</a>

    <form action="login.php" method="post">
        <input type="text" name="username" required> <br>
        <button type="submit">Submit</button>
    </form>

    <p>
        <?php
            if(isset($_SESSION['username'])){
                echo "Login succeeded!<br>";
            }
        ?>
    </p>
</body>
</html>