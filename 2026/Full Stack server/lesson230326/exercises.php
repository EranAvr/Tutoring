<?php
    require 'demo_data.php';
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Exercises</h1>

    <h3>Form dynamic selections:</h3>
    <!-- יצירת רשימה נגללת עם פריטים שנטענים באופן דינאמי -->
    <form action="">
        <select name="color">
            <option value="" disabled hidden selected>-- Select color --</option>
            <?php 
                foreach ($colors as $color){
                    echo "<option value='$color'>$color</option>";
                }
            ?>
        </select>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form>
    
    <hr>
    <h3>Editable book info:</h3>
    <!-- יש להציג פרטי ספר ממערך אסוציאטיבי באופן מסודר -->
    <!-- כשהערכים מופיעים בתוך תגית input הניתנת לעריכה -->
    <form action="">
        <?php 
            foreach ($book as $key => $value){
                echo "<h4 style='display: inline'>$key:</h4>";
                echo "<input name='$key' type='text' value='$value'><br>";
            }
        ?>
        <button type="submit">Save</button>
    </form>
</body>
</html>