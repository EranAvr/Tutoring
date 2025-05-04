<?php

    $successFlag = true;

    try{
        if( !isset($_POST['username']) || $_POST['username']==""
            || !isset($_POST['password']) || $_POST['password']==""
            || !isset($_POST['email']) || $_POST['email']=="" )
            {
                $successFlag = false;
                throw new Exception("Some value is missing...");
        }
    }
    catch(Exception $e){
        echo $e->getMessage() . "<br>";
    }

    if($successFlag){
        echo "<h2> Registration succeeded! </h2>";
    } else {
        echo "<h3> Oh no! problem occurred </h3>";
    }