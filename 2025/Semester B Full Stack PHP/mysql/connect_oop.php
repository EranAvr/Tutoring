<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbName = "myDB";

    // יצירת חיבור אל בסיס-נתונים
    // בתחביר מונחה-עצמים, עם המחלקה
    // mysqli
    $conn = new mysqli($servername,
                            $username,
                            $password,
                            $dbName);

    if($conn->connect_error){
        echo "Connection failed";
        exit();
    } else {
        echo "Connection succeeded<br>";
    }

    // הכנסת רשומה חדשה
    // הגדרת המחרוזת sql להפעלה-
    $sql = "INSERT INTO `contacts` (`ID`, `fName`, `lName`, `phonenumber`) 
            VALUES ('234354', 'a', 'b', 'c')";
    // הפעלת המחרוזת sql על הבסיס-נתונים conn-
    $result = $conn->query($sql);
    if($result === true){
        echo "Sql query executed<br>";
    } else {
        echo "Sql query failed<br>Error: " . $conn->error;
    }


    // פונ' לסגירה ידנית ומבוקרת של החיבור אל בסיס-הנתונים
    // בסיום סקריפט החיבור נסגר אוטומטית ולכן אין הכרח לקרוא לפונ' פה
   $conn->close();