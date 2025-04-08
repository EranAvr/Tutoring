<?php
    // ------------ Functions ------------
    function greeting(){
        echo "Hello User!\n";
    }
    greeting();

    // Global scope:
    // משתנה המוגדר מחוץ לפונקציה
    $x = 10;
    $x = 100;   // same $x is in line 8
    if ($x > 5) {
        echo "$x is bigger than 5\n";
    }

    // Local scope:
    // משתנה המוגדר בתוך הפונ'
    function printX(){
        global $x;
        echo "global x = $x\n";
    }

    // Local + Global scopes:
    // ניתן לפנות בתוך פונ' גם למשתנה הגלובלי,
    //  וגם למשתנה הלוקאלי בשם $x
    // הכל תלוי בפנייה אל המילה global
    function printVar(){
        // הכרזה על משתנה בשם $x תיצור משתנה מקומי
        $x = 1;
        echo "1. x = $x\n";

        // מרגע הפניה אל global אנו מתייחסים למשתנה הגלובלי
        global $x;
        echo "2. x = $x\n";
    }
    printVar();

    function createSomeVar(){
        $var = "vari";
    }
    createSomeVar();
    echo $vari;

    // $GLOBALS array
    // מערך אסוציאטיבי מובנה לפנייה אל מתשנים גלובאלים
    $m = 1;
    $n = 2;
    function getGLOBALS(){
        echo "m = " . $GLOBALS['m'] . "\n";
        echo "n = " . $GLOBALS['n'] . "\n";
        $GLOBALS['n'] = $GLOBALS['n'] + $GLOBALS['m'];
        echo "n = " . $GLOBALS['n'] . "\n";
    }
    getGLOBALS();

    // Static variable:
    function printInc(){
        $a = 1;
        echo "a = $a\n";
        $a++;
    }
    printInc();
    printInc();
    printInc();

    function printStaticInc(){
        static $a = 1;
        echo "a = $a\n";
        $a++;
    }
    printStaticInc();
    printStaticInc();
    printStaticInc();

    // Function with parameters
    function printValue($value){
        echo "given value = " . $value ."\n";
    }
    printValue(11);
    printValue(3.14);
    printValue("Sammy");

    /*function printValues($v1, $v2){
        echo "v1 = " . $v1 . " v2 = " . $v2 . "\n";
    }
    printValues(0);*/

    function addNumbers(int $n1, int $n2){
        echo "addition: " . ($n1 + $n2) ."\n";
    }
    addNumbers(1,2);
    //addNumbers("Bobby","McGee"); // שורה זו תעלה שגיאה קריטית וקריסה של התוכנית

    // Fully defined function
    function calcAdd(float $n1, float $n2): float{
        return $n1 + $n2;
    }
    $res1 = calcAdd(1,2);
    echo "res1 = " . $res1 ."\n";
    $res2 = calcAdd(1.5,3.5);
    echo "res2 = " . $res2 ."\n";
    $res3 = calcAdd(1.5,5);
    echo "res3 = " . $res3 ."\n";

    // Null parameters
    function doSomething($n1, $n2, ?string $oper) {
        if (is_null($oper)){
            return $n1;
        }
        elseif ($oper == "+"){
            return $n1 + $n2;
        }
        elseif ($oper == "-"){
            return $n1 - $n2;
        }
        else {
            return 0;
        }
    }
    echo doSomething(10, 20, "+") . "\n";
    echo doSomething(10, 20, "-") . "\n";
    echo doSomething(10, 20, null) . "\n";

    // Pass-by-value:
    function increment(int $x): void  {
        $x++;
    }

    $number = 5;
    increment($number);
    echo "number = ". $number ."\n";
    
    // Pass-by-reference:
    function incrementByRef(int &$x): void  {
        $x++;
    }
    incrementByRef($number);
    echo "number = ". $number ."\n";

    // Functions with arrays:
    function printArray(array $arr): void {
        foreach ($arr as $num){
            echo $num ." ";
        }
        echo "\n";
    }

    $arr = [1,2,3,4,5];
    printArray($arr);

    function sqrArray(array &$arr): void {
        for ($i=0; $i<count($arr); $i++){
            $arr[$i] *= $arr[$i];
        }
    }
    sqrArray(arr: $arr); // שינוי על המערך
    printArray($arr);   // הדפסה לאחר שינוי


    // Default values:
    function calculator($n1, $n2, $oper = "+"): float{
        switch ($oper) {
            case '+':
                return $n1 + $n2;
            case '-':
                return $n1 - $n2;
            case '*':
                return $n1 * $n2;
            case '/':
                return $n1 / $n2;
        }
    }
    echo "calc1: " . calculator(20, 50, "*") . "\n";
    echo "calc2: " . calculator(50, 20, "/") . "\n";
    echo "calc3: " . calculator(50, 20) . "\n";

    
    // Variadic functions:
    // פונ' המקבלת מספר משתנה של משתנים
    // בעזרת האופרטור '...' נהפוך את הפרמטר למערך

    function mySum(...$numbers): int{
        $sum = 0;
        foreach ($numbers as $num) {
            $sum += $num;
        }
        return $sum;
    }
    echo "Sum: " . mySum(1,3,5,7,9) . "\n";

    function buildSentence(...$words): string{
        $sentence = "";
        foreach ($words as $word) {
            $sentence .= $word . " ";
        }
        return $sentence;
    }
    echo "Sentence: " . buildSentence("Fox", "run", "in", "the", "field") . "\n";