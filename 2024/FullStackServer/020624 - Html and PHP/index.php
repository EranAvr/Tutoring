<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> <?php echo "PHP Tab title"; ?> </title>

    <style type="text/css">
        body{
    background-color: antiquewhite;
    }
    nav>img, p>img{
        width: 100px;
        height: 100px;
        border-radius: 50%;
    }
    </style>
</head>
<body>
    <?php
        $profileImageAddress = "https://buffer.com/library/content/images/size/w1200/2023/10/free-images.jpg";
    ?>

    <nav>
        <img src=<?php echo($profileImageAddress); ?> alt="profile picture">
    </nav>

    <?php echo("<h1>Dynamic PHP Title</h1>"); ?>

    <?php echo("<p> This is some example text, without html tags.</br>"); ?>
    <?php echo("This is also some text. </p>"); ?>

    <div class="gallery">

        <img src=<?php echo "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwGxx1DUJNuxRai0IV8G04TKWCpkcmRlkRhA&s"; ?> alt="image1">
        </br>
        <img src=<?php echo "https://img.freepik.com/free-photo/colorful-design-with-spiral-design_188544-9588.jpg"; ?> alt="image2">
    
    </div>

    
    <div>
        <h3>User info:</h3>
        <p>
            <img src=<?php echo($profileImageAddress); ?> alt="profile picture">
        </p>
    </div>
    

</body>
</html>