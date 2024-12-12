<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        body{
            background-color: <?php echo($_GET['theme'] == 'dark' ? "black" : "white" ); ?> ;
            color: <?php echo($_GET['theme'] == 'dark' ? "white" : "black" ); ?> ;
        }
        <?php
            if($_GET['theme'] == "dark"){
                echo "#span2{font-size: x-large;}";
            } else {
                echo "#span1{font-size: x-large;}";
            }
        ?>
    </style>
</head>
<body>
    <h1>Some Title</h1>
    <p>
        This page changes themes between light/dark, <br>
        depended on user input from html form. <br>
        <br>

        <hr>
        <span id="span1">For light theme: background is white, text-color is black</span> <br>
        <span id="span2">For dark theme: background is black, text-color is white</span> <br>
    </p>
</body>
</html>