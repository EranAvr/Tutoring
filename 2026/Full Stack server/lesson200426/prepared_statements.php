<?php

    $serverName = "localhost";
    $dbName = "fsserver";
    $userName = "root";
    $password = "";

    try {
        // Make a connection:
        $conn = new PDO("mysql:host=$serverName;dbname=$dbName", $userName, $password);
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        echo "Connection succeeded\n";


        $stmt = $conn->prepare("INSERT INTO users (email, password) VALUES (:mail, :pass)");

        // Insert first user:
        $m = "somemail555@maily.com";
        $p = "1111";
        $stmt->bindParam(':mail', $m);
        $stmt->bindParam(':pass', $p);
        $stmt->execute();

        // Insert second user:
        $m = "somemail888@maily.com";
        $p = "8888";
        $stmt->bindParam(':mail', $m);
        $stmt->bindParam(':pass', $p);
        $stmt->execute();


    } catch(PDOException $e) {
        echo "Connection failed! " . $e->getMessage();
    }    


    // Close connection - PDO style:
    $conn = null;
    echo "All OK!";