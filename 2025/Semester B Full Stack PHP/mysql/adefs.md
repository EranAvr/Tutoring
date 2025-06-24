<?php
session_start();
require 'db.php';

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = trim($_POST["username"]);
    $email = trim($_POST["email"]);
    $password = $_POST["password"];
    $confirm = $_POST["confirm"];

    if ($password !== $confirm) {
        echo "Passwords do not match.";
        exit;
    }

    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        echo "Invalid email.";
        exit;
    }

    $email = mysqli_real_escape_string($conn, $email);
    $username = mysqli_real_escape_string($conn, $username);
    $hash = password_hash($password, PASSWORD_DEFAULT);

    $check = mysqli_query($conn, "SELECT id FROM users WHERE email = '$email'");
    if (mysqli_num_rows($check) > 0) {
        echo "Email already registered.";
        exit;
    }

    $query = "INSERT INTO users (email, username, password_hash) VALUES ('$email', '$username', '$hash')";
    if (mysqli_query($conn, $query)) {
        echo "Signup successful. <a href='login.php'>Login</a>";
    } else {
        echo "Signup failed.";
    }
}
?>

<form method="POST">
    Username: <input name="username" required><br>
    Email: <input name="email" type="email" required><br>
    Password: <input name="password" type="password" required><br>
    Confirm: <input name="confirm" type="password" required><br>
    <button type="submit">Register</button>
</form>
