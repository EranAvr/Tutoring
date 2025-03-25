<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Date and Time</title>
</head>
<body>
    <h1>Present Date and Time</h1>
    <p>
        <span>Date is:</span> <?php echo date("d/m/Y"); ?> <br>
        <span>Time is:</span> <?php echo date("H:i:s") ?>  <br>
    </p>
    <hr>
    <h1>Variables</h1>
    <div>
        <?php 
            $myName = "Eran";
            echo $myName;
        ?>
    </div>
    <div>
        <?php 
            $myName = "Eran";
            echo "My name is $myName";
        ?>
    </div>
    <div>
        <?php 
            $myName = "Eran";
            echo "My name is " . $myName;
        ?>
    </div>
    <div>
        <h3>Read variable from another php tag</h3>
        <?php echo "Name from another tag is $myName" ?>
    </div>
</body>
</html>