<?php
    if(!isset($_POST['fileName']) || $_POST['fileName']==""){
        echo "File name not given";
        exit();
    }

    $myFile = fopen($_POST['fileName'], "w");
    if(fwrite($myFile, $_POST['fileContent'])){
        echo "Success!<br>";
    } else{
        echo "Failure<br>";
    }
    fclose($myFile);
