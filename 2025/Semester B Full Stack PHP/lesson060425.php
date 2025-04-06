<?php
    // ------------ Switch ------------
    $dayNum = 2;
    switch ($dayNum) {
        case 1:
            print("Sunday\n");
            break;
        case 2:
            print("Monday\n");
            break;
        case 3:
            print("Tuesday\n");
    }

    $command = "cut";
    switch ($command) {
        case "cut":
            print("do cut...\n");
            break;
        case "copy":
            print("do copy...\n");
            break;
        case "paste":
            print("do paste...\n");
            break;
    }


    // ------------ if-else ------------
    if (false) {
        echo "condition is true\n";
    }
    else {
        echo "condition is false\n";
    }

    $number = 5;
    if ($number < 10) {
        echo "smaller than 10\n";
    }
    if ($number > 0) {
        echo "larger than 0\n";
    }
    if ($number % 2 == 0) {
        echo "even\n";
    }
    else {
        echo "odd\n";
    }


    $color = "red";
    if ($color == "red") {
        echo "make background red\n";
    }
    elseif ($color == "blue") {
        echo "make background blue\n";
    }
    elseif ($color == "green") {
        echo "make background green\n";
    }
    else {
        echo "invalid color\n";
    }


    // ------------ While ------------
    // 1. איתחול
    $x = 1;
    // 2. תנאי
    while ($x <= 10){
        echo $x . " " ;
        // 3. קידום
        $x++;
    }
    echo "\n";

    // ------------ Do While ------------
    $y = 10;    // 1. איתחול
    do {
        echo $y . " ";
        $y += 10;   // 2. קידום
    } while ($y <= 100);    // 3. תנאי
    echo "\n";
    /*
        ההבדל הפרקטי בין לולאת while
        לבין לולאת do-while
        הוא ההחלפה בסדר בין בדיקת תנאי לביצוע קידום
    */

    // ------------ For ------------
    for ($i = 0; $i <= 20; $i += 2) {
        echo $i . " ";
    }
    echo "\n";

    // break and continue
    for ($i=0; $i < 10; $i++) { 
        echo $i . " ";
        if ($i == 5){
            break;
        }
    }
    echo "\n";

    for ($i=0; $i < 10; $i++){
        if ($i % 2 == 0){
            continue;
        }
        echo $i . " ";
    }
    echo "\n";
