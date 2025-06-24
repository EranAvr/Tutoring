<?php
    require("connection.php");

    $sql = "SELECT ID, fName, lName, phonenumber FROM contacts";
    $result = $conn->query($sql);
    if($result === false){
        echo "Retrieving data failed!";
        exit();
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
    <table>
        <tr>
            <th>ID</th>
            <th>First name</th>
            <th>Last name</th>
            <th>Phone number</th>
        </tr>
        <?php
            while ($row = $result->fetch_row()){
                $temp_row = "";
                for ($i=0; $i < count($row); $i++) { 
                    $temp_row .= "<td>" . $row[$i] . "</td>";
                }
                echo "<tr>" . $temp_row . "<tr>";
            }
        ?>
    </table>
</body>
</html>