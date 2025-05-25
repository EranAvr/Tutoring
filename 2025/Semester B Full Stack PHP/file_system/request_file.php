<!DOCTYPE html>
<html lang="en">
<body>
    <h2>Choose your file</h2>
    <form action="./present_my_file.php" method="get">
        <select name="fileName" >
            <?php
                $arr = scandir(__DIR__);
                for($i = 0; $i < count($arr); $i++){
                    // אם השם הנתון הוא תיקיה
                    // נדלג אל האיטרציה הבאה והשם הבא
                    if (is_dir($arr[$i]))
                        continue;
                    // אחרת, אם השם שייך לקובץ
                    // נכתוב אותו אל תוך הדף
                    echo "<option value=$arr[$i]>" . $arr[$i] . "</option>";
                }
            ?>
        </select>
        <button type="submit">Submit</button>
    </form>
</body>
</html>