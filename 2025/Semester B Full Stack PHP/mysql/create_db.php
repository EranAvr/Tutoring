<?php
    $servername = "localhost";
    $username = "root";
    $password = "";

    // יצירת חיבור אל בסיס-נתונים
    $conn = mysqli_connect($servername,
                            $username,
                            $password);
    
    $sql = "CREATE DATABASE testDB";
    $result = mysqli_query($conn, $sql);

    if($result === true){
        echo "Database created successfully";
    } else {
        echo "Database was NOT created";
    }