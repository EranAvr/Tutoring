<?php
    function sayHey(){  // הגדרה
        $a = 5;
        echo "Hey You!\n";
    }
    sayHey();   // קריאה (הפעלה)

    /* Global variables  */
    $globA = 10;
    function readGlobal(){
        global $globA;  // פנייה אל משתנה גלובלי - דרך ראשונה
        echo "globA: $globA\n";
        $globA *= 2;
        echo "globA: $globA\n";
    }
    readGlobal();

    function readGlobal2(){
        $GLOBALS['globA'] *= $GLOBALS['globA']; // פנייה אל משתנה גלובלי - דרך שניה
        echo $GLOBALS['globA'] . "\n";
    }
    readGlobal2();


    /* Static variables  */
    function printStatic(){
        static $statA = 1;
        echo "$statA\n";
        $statA++;
    }
    printStatic();
    printStatic();
    printStatic();

    function getNextTurnTicket(){   // בכל קריאה, נקבל את ערך מספרי עוקב
        static $TURN = 1;
        return $TURN++;
    }
    
    function registerNewUser(){
        static $ID = 1;
        return ["id"=>$ID++, "name"=>"John Doe", "age"=>"70"];
    }
    print_r( registerNewUser() );
    print_r( registerNewUser() );



    /* Function parameters  */
    /*function registerUserWithParams($name, $age){
        static $ID = 1;
        //return ["id"=>$ID++, "name"=>"John Doe", "age"=>"70"];
        return ["id"=>$ID++, "name"=>$name, "age"=>$age];
    }
    print_r( registerNewUser("John Doe", 70) );*/

    function divide(int $a, int $b) : float{
        return $a / $b;
    }
    echo divide(1, 2) . "\n";
    /*
        הטיפוס המוחזר גם גורר המרת טיפוס!
        אם הטיפוס המוחזר בחילוק הוא float נקבל תוצאה עשרונית.
        אם הטיפוס המוחזר הוא int אז ערך התוצאה יעוגל לאפס
        בהתאם לחוקי מספרים שלמים
    */
    function registerUserWithParams(string $name, int $age) : array{
        static $ID = 1;
        return ["id"=>$ID++, "name"=>$name, "age"=>$age];
    }
    print_r( registerUserWithParams("Johnny B Good", "70") );

    /* Nullable parameters  */
    function detectNull(?int $num){
        if (is_null($num)){
            echo "Bad value\n";
        }
        else {
            echo "Numeric value: $num\n";
        }
    }
    detectNull(null);
    detectNull(3.14);

    /* Pass by-reference  */
    $a = 3;
    $b = 5;
    function swap(&$x, &$y){
        $temp = $x;
        $x = $y;
        $y = $temp;
    }
    echo "a=$a, b=$b\n";
    swap($a, $b);
    echo "a=$a, b=$b\n";

    /* Default-values + Variadic function */
    function makeCoffee($type = "Cappuccino"){
        echo "Type: $type\n";
    }
    makeCoffee();
    makeCoffee("Late");
    function makeCoffee2($type, ...$extras){
        echo "Type: $type\n";
        echo "Extras:\n";
        print_r($extras);
    }
    makeCoffee2("Cappuccino");
    makeCoffee2("Late", "Sugar", "Extra cream");