<?php
    $var = 3.14;
    $name = "PI";
    echo "The value of $name is $var\n";

    $arr = [1,2,3];
    $assoc_arr = ["fname" => "John", "lname" => "Doe", "age" => 36];
    echo $arr[2] . "\n";
    echo $assoc_arr["age"] . "\n";

    $str = "Hello";
    $str .= " World!";
    echo $str . "\n";

    if ($assoc_arr["age"] > 35)
        echo "You're old...\n";
    else
        echo "You're still young\n";

    $mon = (int) date("m");
    echo $mon . "\n";
    switch ($mon){
        case 1:
            echo "January";
            break;
        case 2:
            echo "February (the best month)";
            break;
        case 3:
            echo "Mars";
            break;
    }

    $veges = ["Carrots", "Tomatoes", "Cucumbers", "Potatoes"];
    for ($i = 0; $i < count($veges); $i++){
        echo $veges[$i] . "\n";
    }