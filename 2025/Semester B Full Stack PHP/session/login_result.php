<?php
    session_start();

    try{
        if( !isset($_POST['username']) || $_POST['username']==="" ){
            throw new Exception("Username not given");
        }
        if( !isset($_POST['password']) || $_POST['password']==="" ){
            throw new Exception("Password not given");
        }

        // Here we connect to database and 
        // check username with password...

        // All is good! user is valid
        $newUser = $_POST['username'];
        $_SESSION['username'] = $newUser;
        echo "<h2>Login succeeded!</h2>";
        echo '<a href="./index.php">Home</a>';
    } 
    catch(Exception $e){
        echo "Error! " . $e->getMessage() . "<br>";
    }