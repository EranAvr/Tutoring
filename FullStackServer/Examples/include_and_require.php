<?php
    const file = 'import_me.php';
    // Valid import:
    include_once file;
    include_once file;   // this line won't include (and execute) the module file

    echo "printed from main program\n";

    include file;    //re-import

    // Errors:
    include('notFoundLibrary.php');
    require('notFoundLibrary.php');
?>