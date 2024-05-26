<?php
    // This is an open-tag php code.


    // Variables:
    $pi = 3.14;
    $myVariable;
    $myVariable = "Some string";

    echo "My string is: $myVariable\n";
    $result = "PI value is $pi\n";
    print($result);

    echo print($result);
    # echo print($resultt);
    echo "\n";


    // Types- gettype():
    $booly = TRUE;
    echo gettype($booly);
    echo "\n";
    $integer = 100;
    echo gettype($integer);
    echo "\n";
    $floaty = 56.89;
    echo gettype($floaty);
    echo "\n";

    $str;
    echo gettype($str);
    echo "\n";
    $str = "hello";
    echo gettype($str);
    echo "\n";

    // Types- var_dump():
    echo var_dump($booly);
    echo var_dump($floaty);
    echo var_dump($str);
    echo "\n";


    // Casting:
    $b = TRUE;
    $i = 100;
    $f = 56.89;
    $s = "hello";

    echo gettype($i);
    echo "\n";
    echo gettype((string)$i); // up casting
    echo "\n";

    echo var_dump($b);
    echo var_dump((int)$b); // up casting
    echo "\n";

    echo var_dump($f);
    echo var_dump((int)$f); // down casting
    echo "\n";

    /* bad practice-
    echo var_dump($s);
    echo var_dump((int)$s); // down casting
    echo "\n";*/


    // String methods:
    print("------------------------\n");
    $myStr = "Hello World\n";
    $myStr2 = "HeLlO\n";
    echo strlen($myStr);
    echo "\n";
    echo strlen($myStr2);
    echo "\n";
    echo strtoupper($myStr2);
    echo strtolower($myStr2);
