<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbName = "myDB";

    // יצירת חיבור אל בסיס-נתונים
    $conn = mysqli_connect($servername,
                            $username,
                            $password,
                            $dbName);

    if($conn){
        echo "Connection succeeded";
    } else {
        echo "Connection failed";
        exit();
    }

    // הכנסת רשומה חדשה
    // הגדרת המחרוזת sql להפעלה-
    $sql = "INSERT INTO `contacts` (`ID`, `fName`, `lName`, `phonenumber`) 
            VALUES ('234354', 'a', 'b', 'c')";
    // הפעלת המחרוזת sql על הבסיס-נתונים conn-
    mysqli_query($conn, $sql);


    // פונ' לסגירה ידנית ומבוקרת של החיבור אל בסיס-הנתונים
    // בסיום סקריפט החיבור נסגר אוטומטית ולכן אין הכרח לקרוא לפונ' פה
    mysqli_close($conn);