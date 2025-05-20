<?php
    /*
        בשמות הקבצים שאנו נותנים ל-fopen
        אנחנו משתמשים בקבוע __DIR__ 
        אשר מחזיק את שם התיקיה הנוכחית של הסקריפט.
        באמצעות הקבוע __DIR__ ניתן לבנות
        בקלות את הכתובת המלאה של הסקריפט במחשב
    */

    // reading file char-by-char
    $myFile = fopen(__DIR__ . "\\test2.txt", "r");

    while( !feof($myFile) )
        echo fgetc($myFile) . "\n";

    fclose($myFile);


    // reading file line-by-line
    $myFile = fopen(__DIR__ . "\\test1.txt", "r");

    $num = 1;
    while( !feof($myFile) ){
        echo "Line $num: " . fgets($myFile);
        $num++;
    }

    fclose($myFile);