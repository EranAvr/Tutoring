<!DOCTYPE html>
<html lang="en">
<body>
    <form action="./ex2.php" method="get">
        <input type="text" name="fileName"> <br>
        <button type="submit">Submit</button>
    </form>

    <hr>

    <div style="border: 1px solid black;">
        <?php
            if(isset($_GET['fileName']) && $_GET['fileName'] != ""){
                // open the requested file-
                $myFile = fopen($_GET['fileName'], "r");

                while(!feof($myFile)){
                    $line = htmlspecialchars( fgets($myFile), encoding: "utf-8" ) ;
                    echo $line . "<br>";
                }

                // closing the file-
                fclose($myFile);
            }
        ?>
    </div>
</body>
</html>