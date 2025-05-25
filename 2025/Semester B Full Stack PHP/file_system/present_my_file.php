<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>File Content:</h1>
    <div style="border: 1px solid black">
        <?php
        try{
            if (!isset($_GET['fileName']) || $_GET['fileName'] == ""){
                throw new Exception("Error: File name not given");
            }
            if (!file_exists($_GET['fileName'])){
                throw new Exception("Error: file doesn't exist in memory");
            }
            // הדפסת תוכן קובץ פשטנית ומוגבלת
            //echo readfile($_GET['fileName']);

            // קריאת הקובץ הרצוי שורה-אחר-שורה
            // והדפסה שלו אל הדף עם שרשור <br>
            // בסוף כל שורה
            $myFile = fopen($_GET['fileName'], "r");
            while(!feof($myFile)){
                // אנו כותבים תוכן מתוך קובץ אל תוך דף האינטרנט שלנו
                // חובה עלינו (!!) לעטוף אותו עם הפונקציה htmlspecialchars
                // כדי להמנע מהרצת קוד ע"י הדפדפן והתקפת XSS
                $line = htmlspecialchars(fgets($myFile), ENT_QUOTES, 'UTF-8');
                echo "$line <br>";
            }
            fclose($myFile);
        } catch(Exception $e){
            echo $e->getMessage();
        }
        ?>
    </div>
</body>
</html>