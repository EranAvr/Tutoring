<?php

    function getValue(int $x){
        echo "$x was received\n";
    }

    /* Main code... */
    $a = 10;
    $b = 0;
    try {
        echo "$a / $b = " . ($a / $b) . "\n";
        getValue("abc");
    }
    catch(TypeError $e){
        echo "Type-Error occurred!\n";
    }
    catch(Error $e) {
        echo "Error occurred!\n";
    }


    echo "End of program...\n";
    echo "Bye bye\n";