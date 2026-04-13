<?php
    session_start();
    
    session_unset();    // מחיקת מידע מתוך ה-session
    session_destroy();    // מחיקת ה-session כולו

    header("Location: http://localhost/server/lesson130426/index.php");