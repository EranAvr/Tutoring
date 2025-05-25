<?php
    // כתבו פונקציה המקבלת שם קובץ וטקסט לכתיבה
    // ומבצעת עבורנו את כל תהליך הפתיחה-כתיבה-סגירה על אותו קובץ
    function shorten_write($fileName, $text){
        $myFile = fopen($fileName, "w");
        fwrite($myFile, $text);
        fclose($myFile);
    }

    // כתבו פונקציה המקבלת שם קובץ 
    // ומבצעת עבורנו את כל תהליך
    //  הפתיחה-קריאה-סגירה על אותו קובץ
    function shorten_read($fileName){
        $myFile = fopen($fileName, "r");
        //fread($myFile, 64);
        $text = fgets($myFile);
        fclose($myFile);

        return $text;
    }
  