<?php
    // Date
    echo date("Y\n");
    echo date("m\n");
    echo date("d\n");
    echo date("d/m/Y\n");
    echo date("Y -- m -- d\n");
    
    // Time
    echo date("H\n");
    echo date("ha\n");
    echo date("i\n");
    echo date("s\n");
    echo date("H:i:s\n");

    // Date and Time
    echo date("d/m/Y H:i:s\n");

    // Calib timezone
    echo date_default_timezone_get();
    echo date_default_timezone_set("Asia/Jerusalem");
    echo date("d/m/Y H:i:s\n");

    // Variables
    $x = 10;
    echo $x;
    echo "\n";  // bad practice
    $pi = 3.14;
    echo "PI is $pi\n"; // (formatting ) good practice
    $name = "Jameson" . "\n";   // (concatenation) good practice
    echo $name;
    $success = date_default_timezone_set("Asia/Jerusalem");
    echo "success = " . $success . "\n";

    // Data Types
    // String:
    $str1 = "A lion in the savanna";
    $str2 = 'Hello World!';
    // Integer:
    $n = 890;
    // Float:
    $f = 2.17;
    // Boolean
    $b = false;

    // gettype()
    echo gettype($str1) . "\n";
    echo gettype($str2) . "\n";
    echo gettype($n) . "\n";
    echo gettype($f) . "\n";
    echo gettype($b) . "\n";

    // var_dump
    echo var_dump($str1);
    echo var_dump($str2);
    echo var_dump($n);
    echo var_dump($f);
    echo var_dump($b);

    // is_type() ??
    echo is_string($str1) . "\n";
    echo is_string($str2) . "\n";
    echo is_int($n) . "\n";
    echo is_double($f) . "\n";
    echo is_bool($b) . "\n";

    // Casting
    $m = -10;
    $str_m = $m;
    echo var_dump($str_m);
    $str_m = (string) $m;   // cast $m into string type
    echo var_dump($str_m);

    $bool_m = (bool) $m;   // cast $m into boolean type
    echo var_dump($bool_m);

    $arr_m = (array) $m;
    echo var_dump($arr_m);

    // Arrays
    // create array with array() function:
    $arr_integers = array(1,2,3,4);
    echo var_dump($arr_integers);

    $arr_strings = array("Hello", "Goodbye", "See you soon");
    echo var_dump($arr_strings);

    $arr_mix = array(10, 5.6, true, 'Bla bla', "Tuesday");
    echo var_dump($arr_mix);

    // short way for creating an array:
    $arr_shorthand = [12, 34.67, false, "ccccc"];
    echo var_dump($arr_shorthand);

