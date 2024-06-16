<html>
    <body>
        <h1>Welcome</h1>
        <?php
        if(isset($_GET["submit"])) {
            $firstname = $_GET["fname"];
            $lastname = $_GET["lname"];
            echo "<h3>" . $firstname . " - " . $lastname . "</h3>";
        }
        ?>
    </body>
</html>