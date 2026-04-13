<?php
    if(count($_POST) > 0){  // יש מידע במערך פוסט
        if(isset($_POST["username"]) && $_POST["username"]!=""){
            setcookie("username", htmlspecialchars($_POST["username"]));
        }
        if(isset($_POST["age"]) && $_POST["age"]!=""){
            setcookie("age", htmlspecialchars($_POST["age"]));
        }
        if(isset($_POST["theme"]) && $_POST["theme"]!=""){
            setcookie("theme", htmlspecialchars($_POST["theme"]));
        }

        // redirect - טעינה מחודשת של הדף עם הנתונים המעודכנים
        header("Location: http://localhost/server/lesson130426/settings.php");
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php include("./navbar.php") ?>

    <h1>Settings Page</h1>
    <form method="post" action="./settings.php">
        Username: <input name="username" type="text" placeholder="Username" value="<?php echo $_COOKIE["username"] ?? "" ?>"> <br>
        Age: <input name="age" type="number" value="<?php echo $_COOKIE["age"] ?? "" ?>"> <br>
        Theme:
        <input type="radio" name="theme" value="light"> Light
        <input type="radio" name="theme" value="dark"> Dark
        <br>

        <button type="submit">Save</button>
    </form>
</body>
</html>