<?php
    if(isset($_POST['fName']) && $_POST['fName'] != "" &&
        isset($_POST['lName']) && $_POST['lName'] != "" &&
        isset($_POST['phonenumber']) && $_POST['phonenumber'] != ""){
            
            // קיבלנו את כל הפרטים הרצויים מהטופס
            // ביצוע התחברות אל בסיס הנתונים:
            require("connection.php");
            
            // שמירת הערכים:
            $fn = $_POST['fName'];
            $ln = $_POST['lName'];
            $ph = $_POST['phonenumber'];
            $sql = "INSERT INTO `contacts` (`fName`, `lName`, `phonenumber`) 
                    VALUES ('$fn', '$ln', '$ph')";
            $result = $conn->query($sql);

            
        }
    $_POST = array();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Insert Form</h1>
    <form method="post">
        <label for="fName">Enter first Name: </label>
        <input type="text" name="fName" required> <br>
        <label for="lName">Enter last Name: </label>
        <input type="text" name="lName" required> <br>
        <label for="phonenumber">Enter phone number: </label>
        <input type="text" name="phonenumber" required> <br>
        <button type="submit">Submit</button>
    </form>
</body>
</html>