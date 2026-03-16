<?php
    echo date("Y/m/d H:i:s\n");
    echo date("Y H:i\n");
    echo date("Y h:i:s a\n");

    echo date_default_timezone_get() . "\n";
    date_default_timezone_set("Asia/Jerusalem");
    echo date_default_timezone_get() . "\n";
    echo date("Y-m-d (H :#: i :#: s)\n");

    // Formatting
    $name = "John";
    $age = 64;
    echo "The person $name is $age years old.\n";

    echo 5 == 5;    // נקבל 1 (אמת)

    // Type checking:
    $a;
    $b = 10;
    $c = 5 > 100;
    echo gettype($a) . "\n";
    echo gettype($b) . "\n";
    echo gettype($c) . "\n";
    echo gettype( gettype($c)) . "\n";

    var_dump($a);
    var_dump($b);
    var_dump("Hello");

    echo is_null($a) . "\n";

    // Casting
    $x = (string)10;
    echo gettype( $x ) . "\n";


    // Strings
    $str = "Hello World!\n";
    $str[5] = '-';
    echo $str;
    $str[100] = '@';    // פנייה אל אינדקס חורג תוסיף תוים למחרוזת
    var_dump($str);

    echo strlen($str) . "\n";

    $str = "Dear World!\n";
    $str = str_replace("World", "Mom", $str);
    echo $str;

    $str = "  \t Word and another word   \t     \n";
    $str = trim($str);
    var_dump($str);

    $arr = explode(" ", $str);
    print_r($arr);  // פונ' להדפסה מסודרת של מערכים
    var_dump($arr); // הדפסה מסודרת. מופעל באופן רקורסיבי


    // Arrays
    $arr = array("Pie", "Fruits", "Cookies");
    print_r($arr);
    $arr = ["Pie", "Fruits", "Cookies"];
    print_r($arr);
    echo $arr[0] . "\n";

    /*$key = "name";    // אפשרי, אך פחות מומלץ
    $user = [$key=>"John Doe", "age"=>80, "role"=>"admin"];*/
    $user = ["name"=>"John Doe", "age"=>80, "role"=>"admin"];
    print_r($user);

    // add multiple:
    array_push($arr, "Donut", "Chicken");
    print_r($arr);
    // merge normal array - array_merge()-
    $arr = array_merge($arr, ["Carrot", "Watermelon"]);
    print_r($arr);
    // merge normal array - concatenate (+= operator)-
    $user += ["last_seen"=>"15:44"];
    print_r($user);

    // count cells in array-
    echo count($arr) . "\n";
    echo count($user) . "\n";

    // keys and values
    print_r(array_keys($user));
    print_r(array_values($user));