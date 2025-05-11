
<!DOCTYPE html>
<html lang="en">
<body>
    <h2>Present current time</h2>
    <p>
        <?php 
        if (isset($_COOKIE['cur_time'])){
            echo "Last time visited: " . $_COOKIE['cur_time'];
        } else {
            echo "Cookie 'cur_time' doesn't exist!";
        }
        
        ?>
    </p>
</body>
</html>