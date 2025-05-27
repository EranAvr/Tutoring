<!DOCTYPE html>
<html lang="en">
<body>
    <form action="./ex3.php" method="post">
        <input type="text" name="title"> <br>
        <textarea name="text" >Default starter text...
        </textarea> <br>
        <button type="submit">Submit</button>
    </form>

    <hr>

    <div>
        <?php
            if(!isset($_POST['title']) || $_POST['title'] == ""){
                echo "No title was given";
            }
            elseif(!isset($_POST['text']) || $_POST['text'] == ""){
                echo "No text was given";
            } else {
                // All is good
                // save content into file
                $fileName = "texty.txt";

                $myFile = fopen($fileName, "w");
                fwrite($myFile, $_POST['title'] . "\n");
                fwrite($myFile, $_POST['text']);
                fclose($myFile);
            }
        ?>
    </div>
</body>
</html>