<?php

// ---------  Constants  ---------
const URL = "www.google.com";   // notice, we don't need $
echo URL . "\n";
//URL = "somenewWebsite.com";   // fatal error
//echo "OK";


// ---------  Operators  ---------
echo ((string) 1 == 1) . "\n";
echo ((string) 3 == 6) . "\n";
echo ((string) 5 == "5") . "\n";
echo ((string) 5 === 5.0) . "\n";
// spaceship operator: <=>
// בודק השוואת גודל בין שני ערכים,
// ומחזיר ערך שלילי/0/חיובי בהתאם למי מהם
// קטן יותר
$x = 3;
$y = 4;
echo ((string) $x <=> $y) . "\n";
$y = 3;
echo ((string) $x <=> $y) . "\n";
$y = 2;
echo ((string) $x <=> $y) . "\n";


// ---------  Flow Control  ---------
/*
    מבני בקרה, הם מבנים בשפה
    שנותנים לנו שליטה על ריצת הקוד.
    מבני תנאי עוזרים לקבוע איזה קוד ירוץ ואיזה לא.
    מבני לולאה עוזרים לנו להריץ קוד מס' פעמים,
    ובנוסף לייצר ערכים סדרתיים.
*/

