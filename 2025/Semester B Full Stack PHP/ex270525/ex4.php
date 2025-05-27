<!DOCTYPE html>
<html lang="en">
<body>
    <form action="./ex4.php" method="post">
        <input type="text" name="log"> <br>
        <button type="submit">Submit</button>
    </form>

    <hr>

    <div>
        <?php
            if(!isset($_POST['log']) || $_POST['log'] == ""){
                echo "No log was given";
            }
            else {
                $fileName = "logging.txt";

                $myFile = fopen($fileName, "a");

                date_default_timezone_set("Asia/Jerusalem");
                $logText = date("d/m/Y - H:i:s") . "\t" . $_POST['log'] . "\n";
                fwrite($myFile, $logText);

                fclose($myFile);

            }
        ?>
    </div>
</body>
</html>