<?php
    echo "Target Page 1" . "<br>";
    if (isset($_GET['msg'])){
        echo "Message: " . $_GET['msg'] . "<br>";
    }
    else {
        echo "Message not given" . "<br>";
    }
    
?>