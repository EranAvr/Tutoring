<?php
if (session_status() === PHP_SESSION_NONE) {
    session_start();
}
?>

<header>
    <nav>
        <a href="./index.php">Home</a> |
        <a href="./gallery.php">Gallery</a> |
        <a href="./order.php">Orders</a> |
        <a href="./settings.php">Settings</a> |
        <a href="./files.php">Files</a> |
        <a href="./login.php">Login</a> |
        <a href="./logout.php">Logout</a> |
        <h3> <?php 
            if(isset($title)){
                echo $title;
            }
        ?> </h3>
        <div>
            <?php
                if(isset($_SESSION["user"])){
                    echo $_SESSION["user"];
                } else {
                    echo "Guest";
                }
            ?>
        </div>
        <img src="" alt="profile icon">
    </nav>
</header>