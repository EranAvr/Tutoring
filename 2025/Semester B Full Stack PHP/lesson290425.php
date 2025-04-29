<?php

/*      BASICS       */

// ex1
$x = 2;
$y = 4;
/*echo ($x + $y) . "\n";
echo ($x - $y) . "\n";
echo ($x * $y) . "\n";
echo ($x / $y) . "\n";
echo ($x ** $y) . "\n";*/
$oper = '**';
switch ($oper) {
    case '+':
        echo ($x + $y) . "\n";
        break;
    case '-':
        echo ($x - $y) . "\n";
        break;
    case '*':
        echo ($x * $y) . "\n";
        break;
    case '/':
        echo ($x / $y) . "\n";
        break;
    case '**':
        echo ($x ** $y) . "\n";
        break;
    default:
        echo "Invalid operator\n";
        break;
}

// ex2
$cel = 25;
$fer = $cel * 9/5 + 32;
echo "Fahrenheit: $fer\n";

$fer2 = 78;
$cel2 = ($fer2 - 32) / (9/5);
echo "Celsius: $cel2\n";

// ex4
$score = 89;
if ($score > 91){
    echo "Grade: A\n";
}
elseif ($score >=81 && $score < 91){
    echo "Grade: B\n";
}
else {
    echo "Grade: C\n";
}

// ex5
$a = 10;
$b = 30;
$c = 20;

if ($a > $b){   // a is larger
    if ($a > $c){
        echo "a = $a\n";
    }
    else {
        echo "c = $c\n";
    }
}
else {  // b is larger
    if ($b > $c){
        echo "b = $b\n";
    }
    else {
        echo "c = $c\n";
    }
}

// ex6
function greetings($name): string {
    return "Hello, $name!";
}

// ex7
function calc($x, $y, $oper){
    switch ($oper) {
        case '+':
            return ($x + $y);
        case '-':
            return ($x - $y);
        case '*':
            return ($x * $y);
        case '/':
            return ($x / $y);
        case '**':
            return ($x ** $y);
        default:
            throw new Exception("Illegal math operator");
    }
}

try {
    echo calc(2, 3, '<') . "\n";
}
catch (Exception $e){
    echo $e->getMessage() . "\n";
}

// ex8
function divide($a, $b){
    return $a / $b;
}

try {
    echo divide(4, 0);
} catch (DivisionByZeroError $dbze) {
    echo $dbze->getMessage() . "\n";
}

// ex9
function validateStringLength($str){
    if (strlen($str) < 10){
        throw new Exception("String '$str' is too short");
    }
}

try{
    $myString = "hello";
    validateStringLength($myString);
} catch(Exception $e){
    echo $e->getMessage() . "\n";
}