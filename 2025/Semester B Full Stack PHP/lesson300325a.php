<?php

// ---------  Simple array  ---------
$arr = [12, 34.67, false, "ccccc"];
echo var_dump($arr);

echo $arr[1] . "\n";
echo $arr[3] . "\n";

// ---------  Associative array  ---------
/*
    מערך אסוציאטיבי הוא מערך ששומר דאטה,
    בצמדים של מפתח-ערך.
    מפתח הוא המילה לחיפוש,
    וערך הוא הדאטה ששמור תחתיו בזיכרון.

    כאשר ניגש אל המערך עפ"י מפתח נקבל חזרה את
    הערך המתאים.
*/
//              key     value
$car = array("brand" => "Mazda");
echo $car["brand"] . "\n";

$employee = [
    "name" => "David",
    "id" => "5011",
    "age"=> 50,
    "remote" => true,
    "salary" => 8976.5,
];
echo var_dump($employee);
echo $employee["id"] . "\n";
echo $employee["remote"] . "\n";

$student = [
    "f_name" => "Jamie",
    "grade" => 90,
    "l_name" => "Bob"
];

echo var_dump($student);

// write values into array
echo $arr[2] . "\n";
$arr[2] = true;
echo $arr[2] . "\n";

echo $student["l_name"] . "\n";
$student["l_name"] = "Jameson";
echo $student["l_name"] . "\n";


// ---------  2D array  ---------
/*
    מערך דו ממדי - מערך של מערכים
    מדובר במערך "רגיל", אבל שכל תא שבו
    מכיל מערך בעצמו.
    בניגוד למערכים הפשוטים שראינו, בהם
    כל תא מכיל ערך פשוט, כמו: מספר, בוליאני וכו

    מערכים דו-ממדיים עוזרים לנו להחזיק דאטה מורכב יותר,
    למשל טבלה של נתונים.
*/

$table = array(
    array(1,2,3),
    array(4,5,6),
    array(7,8,9),
);
echo var_dump($table);

$mixed_table = [
    [1,2,3,4,5],
    [true, 2.17, false, "Hello"],
    ["AAA", "BBB"]
];
echo var_dump($mixed_table);

$assoc_2d = array(
    "k1" => ["a", "b", "c"],
    "n" => [10,20,30,40,50],
    "s" => ["up", "down", "left", "right"]
);
echo var_dump($assoc_2d);

$students = [
    "names" => ["Hen", "Tamar", "Meir"],
    "grades" => [90, 80, 67]
];
echo $students["names"][0] ." ". $students["grades"][0] . "\n";
echo $students["names"][1] ." ". $students["grades"][1] . "\n";
echo $students["names"][2] ." ". $students["grades"][2] . "\n";