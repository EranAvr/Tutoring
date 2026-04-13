<?php
    session_start();

    $validFlag = true;
    if(count($_POST) > 0){
        if(!isset($_POST["username"]) || $_POST["username"]==""){
            $validFlag = false;
        }
        if(!isset($_POST["password"]) || $_POST["password"]==""){
            $validFlag = false;
        }
        /*
            פה נכניס עוד צעדי ולידציה
            כרצוננו.
            אימות זהות על סיסמא וכו'...
        */
    }

    if($validFlag && count($_POST) > 0){ // אם הכל תקין
        /*
            פה נבצע התחברות מלאה של המשתמש,
            .ושמירת פרטים הכרחיים היכן שנרצה
            כמו בסיס-נתונים, זיכרון session וכו'
        */
        $_SESSION["user"] = htmlspecialchars($_POST["username"]);
        header("Location: http://localhost/server/lesson130426/index.php");
    }
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <form method="post" action="./login.php">
        <input name="username" type="text" placeholder="Enter username"> <br>
        <input name="password" type="password" placeholder="Enter password"> <br>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form>
    <div>
        <?php
        
        ?>
    </div>
</body>
</html>