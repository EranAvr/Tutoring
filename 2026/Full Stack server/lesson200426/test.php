<?php
    /*
        Test script
        סקריפט לבדיקת תקשורת עם בסיס נתונים
        מסוג MySQL.
    */

    $serverName = "localhost";
    $dbName = "fsserver";
    $userName = "root";
    $password = "";

    try {
        // Make a connection:
        $conn = new PDO("mysql:host=$serverName;dbname=$dbName", $userName, $password);
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        echo "Connection succeeded\n";


        // Make query (insert new entity into DB):
        $sql = "INSERT INTO users (email, password) VALUES ('testmail123@mail.com', '0000')";
        $conn->query($sql);
        echo "Insertion succeeded\n";


        // Make query (fetch data from DB)
        $sql = "SELECT * FROM users";
        $res = $conn->query($sql);
        $data = $res->fetchAll(PDO::FETCH_ASSOC);
        //print_r($data);
        echo "Data fetching succeeded\n";


        // Make query (update entity in DB)
        $sql = "UPDATE users SET email='testmail@mail.com' WHERE id=3";
        $conn->query($sql);
        echo "Update succeeded\n";


        // Make query (delete entity from DB)
        $sql = "DELETE FROM users WHERE id=4";
        $conn->query($sql);
        echo "After delete res=$res\n";
        echo "Deletion succeeded\n";
    } catch(PDOException $e) {
        echo "Connection failed! " . $e->getMessage();
    }    


    // Close connection - PDO style:
    $conn = null;
    echo "All OK!";