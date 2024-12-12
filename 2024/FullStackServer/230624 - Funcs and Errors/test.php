<?php

// Use the 'global' keyword to re-declare global
// variables inside a function (or any inner scope),
// and then we can use them.
$outVar = 1;
function localGlobal(){
    global $outVar;
    $inVar = 2;
    echo $outVar . "\n";
}
localGlobal();

// Static variable save their value between function calls.
// So, by calling 'incStaticVar()' 3 times, we see
// the normal variables are being reset,
// BUT static variables remember their last value from previous calls.
function incStaticVar(){
    static $statVar = 10;
    $normalVar = 10;
    echo "$statVar \t $normalVar\n";

    $statVar++;
    $normalVar++;
}

incStaticVar();
incStaticVar();
incStaticVar();