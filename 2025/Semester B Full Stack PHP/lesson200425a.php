<?php

    function divide(int $a, int $b): int{
        return $a / $b;
    }
    function checkIfEqual($a, $b){
        assert(assertion: $a == $b);
    }

    $x = 10;
    echo $y . "\n";

    echo $x . "\n";

    // הקוד הבא יגרום לקריסת התוכנית
    // מכיוון שהוא זורק חריגה אבל לא מספק בלוק תגובה
    /*$divider = 0;
    echo divide($x, $divider) . "\n";*/

    // התמודדות עם חריגה בעזרת בלוק תגובה מוגדר
    /* דוגנמא ראשונה */
    try {
        checkIfEqual(1, 1);
        checkIfEqual(2, 5);
    } catch (AssertionError $assEr){
        echo "Assertion error accord!\n";
    } 
    catch (Error $e){
        echo "A very bad error accord!\n";
    }

    /* דוגנמא שניה */
    try {
        $divider = 0;
        echo divide($x, $divider) . "\n";
    }
    catch (DivisionByZeroError $dbze){
        echo "Your divider was zero. This is an illegal operation!\n";
    }
    catch (Error $e){
        echo "Error accord\n";
        echo "Message: " . $e->getMessage() . "\n";
        echo "Problematic file: " . $e->getFile() . "\n";
    }
    


    echo "All OK\n";