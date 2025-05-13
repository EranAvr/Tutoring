<?php
    session_start();    // we must call session_start() in order to use $_SESSION
    if( !isset($_SESSION['username']) ){
        // redirect user to the login page-
        header("Location: login_page.html");

        // in case header() failed, then exit from script-
        exit();

        /*
            אם נכנסנו ל-if
            הנוכחי, סימן שהמשתמש לא מחובר.
            בתור התחלה אנחנו מנווטים אותו מחדש אל דף ה-login
            לכל מקרה שהפונ' header() נכשלת
            ולא הצלחנו להפנות אותו אל דף אחר,
            אנחנו קוראים לפונ' exit()
            שסוגרת את הסקריפט באופן מיידי, ולא
            מאפשרת הצגה של המשך הדף.
        */
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
    <h1>Header Page</h1>
    <h2>Page that uses php header()</h2>
    <p>
        דף מוגבל גישה.
        נרצה לייצר דף שרק משתמש מחובר יכול לגשת אליו.
    </p>
</body>
</html>