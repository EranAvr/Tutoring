<?php

    /*
        נבצע פעולות בקוד PHP
        על השרת.
        כמו: בדיקת מידע (קיים/חוקי...), שמירת מידע,
        חישובים וכו'
    */


    echo "<h1>Form Digest Result</h1>";
    echo "<br>GET[]:";
    print_r($_GET);

    echo "<br>POST[]:";
    print_r($_POST);

    echo "<br>SERVER[]:";
    print_r($_SERVER);