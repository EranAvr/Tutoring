<?php
    if(isset($_POST['myName']) && $_POST['myName'] != ""){
        // נשמור את המידע בתוך עוגיה
        $newValue = $_POST['myName'];
        $duration = time() + 86400 * 7; // 86400 seconds in a day
        //$duration = time() + 10;  // short period of 10 seconds
        
        setcookie("myName", $newValue, $duration);
    }else {
        // נכתוב הודעת שגיאה למסך
        echo "Form data did not arrive...<br>";
    }
?>