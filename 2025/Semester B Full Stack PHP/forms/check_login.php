<?php
    // פה נבצע ולידציה על פרטי המשתמש המתקבלים
    $valid = true;
    if (!isset($_POST['username'])){
        $valid = false;
    }
    elseif ($_POST['username'] == ""){
        $valid = false;
    }
    elseif (!isset($_POST['pass'])){
        $valid = false;
    }
    elseif ($_POST['pass'] == ""){
        $valid = false;
    }
    // פה נבצע גישה אל בסיס נתונים ובדיקה שהפרטים קיימים
    // ותואמים זה את זה

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        if ($valid){
            echo "<h1> Login Confirmed </h1>";
            echo "Welcome " . htmlspecialchars($_POST['username'])  . "<br>"; 
        }
        else
        {
            echo "Wrong login details!";
        }
        
    ?>
    
</body>
</html>