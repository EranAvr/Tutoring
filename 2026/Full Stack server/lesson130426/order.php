<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php include("./navbar.php") ?>

    <h1>Order Page</h1>
    <form method="post" action="./order.php">
        <input name="full_name" type="text" placeholder="Enter full name"> <br>
        <input name="address" type="text" placeholder="Enter your address"> <br>
        <input name="q" type="number"> <br>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form>
    <hr>
    <div>
        <?php
            if(count($_POST) > 0){
                echo "Full name: " . htmlspecialchars($_POST["full_name"]) . "<br>";
                echo "Address: " . htmlspecialchars($_POST["address"]) . "<br>";
                echo "Quantity: " . htmlspecialchars($_POST["q"]) . "<br>";
            }
        ?>
    </div>
</body>
</html>