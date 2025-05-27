<!DOCTYPE html>
<html lang="en">
<body>
    <form action="./ex1.php" method="get">
        <input type="text" name="fileName"> <br>
        <button type="submit">Submit</button>
    </form>

    <hr>

    <div style="border: 1px solid black;">
        <?php
            if(isset($_GET['fileName']) && $_GET['fileName'] != ""){
                readfile($_GET['fileName']);
            }
        ?>
    </div>
</body>
</html>