<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>File content</h1>

    <h2>The readfile() function:</h2>
    <div style="border: 1px solid black;">
        <?php 
            // הפונ' הבאה קוראת תוכן קובץ ומדפיסה אותו לדף
            readfile("test.txt");
        ?>
    </div>

    <h2>Formatted reading:</h2>
    <div style="border: 1px solid black;">
        <?php 
            $file = fopen("test.txt", "r");
            while( !feof($file) ){
                echo fgets($file) . "<br>";
            }
            fclose($file);
        ?>
    </div>
</body>
</html>