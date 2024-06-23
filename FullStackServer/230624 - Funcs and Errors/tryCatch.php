<?php
function divide($a, $b){    // example function that throws error when dividing by 0.
    return $a / $b;
}


try {
    echo "10 / 5 = " . divide(10, 5) . "\n";    // this will run fine
    echo "all was good\n"; // this line will run also
} catch(Exception $e){}


try {
    echo "10 / 0 = " . divide(10, 0) . "\n";    // this line raise an error
    echo "all was good\n";  // this line won't run
} catch(Exception $e) {
    echo "Exception was caught\n";
}
catch(Error $e) {
    echo "Error was caught\n";
}

echo "Program is still running\n";  // just to show that the rest of the code continue to run