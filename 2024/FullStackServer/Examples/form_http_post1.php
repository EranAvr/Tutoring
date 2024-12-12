<?php
echo "<h1>Response Page</h1>";
echo "Notice, that this time the URL doesn't contain <br>any values and data.<br><br>";
echo "If the two passwords match, the user data will be presented.<br>";
echo "Else, an appropriate message will appear.<br><br><hr>";
echo "Server side validation:<br>";

if($_POST['password1'] == $_POST['password2']){ // validation is good
    echo "Email entered: " . $_POST['email'] . "<br>";
    echo "Password entered: " . $_POST['password1'] . "<br>";
} else {     // invalid passwords
    echo "The passwords you entered don't match.<br> <b>Please try again!</b>";
}