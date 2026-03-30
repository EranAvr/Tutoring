<?php
    $validFlag = true;
    if ( !isset($_POST['username']) || $_POST['username'] === "" ){
        // אם יש תקלה
        /* 
            ביצוע redirect
            ו/או החזרת הודעת שגיאה
            ...
        */
        $validFlag = false;
    }
    if ( !isset($_POST['pass']) || $_POST['pass'] === "" ){
        $validFlag = false;
    }

    /* ביצוע redirect  */
    if (!$validFlag)
        header("Location: http://localhost/server/forms/login_form.html");

    /*
        לאחר שעברנו את כל שלבי הולידציה,
        אפשר להניח - תקין!
        מפה נתפנה לבניית תוכן ה-html
        שחוזר אל המשתמש.
    */
?>




<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Result</title>
</head>
<body>
        <?php 
            if($validFlag){ // הכל תקין
                echo "<h1 style='color: green'>Your'e logged in</h1>";
            }
            else {
                echo "<h2 style='color: red'>Your'e NOT logged in</h2>";
            }
        ?>
</body>
</html>