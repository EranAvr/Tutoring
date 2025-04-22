<!DOCTYPE html>
<html lang="en">
<body>
    <img src="<?php 
        if( isset($_GET['imgURL']) && $_GET['imgURL'] != "" ){
            echo $_GET['imgURL'];
        }
    ?>" alt="No image source">
</body>
</html>