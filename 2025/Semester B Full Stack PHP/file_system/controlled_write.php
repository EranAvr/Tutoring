<?php
    // writing to a new file
    $myFile = fopen("test3.txt", "w");

    fwrite($myFile, "New file line 1\n");
    fwrite($myFile, "New file line 2\n");

    fclose($myFile);



    // appending to an existing file
    $myFile = fopen("test3.txt", "a");

    fwrite($myFile, "Appending file line 1\n");
    fwrite($myFile, "Appending file line 2\n");

    fclose($myFile);

    