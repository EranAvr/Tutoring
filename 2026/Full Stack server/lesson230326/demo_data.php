<?php

/*
    Include in other files:
    <?php include "demo_data.php"; ?>
*/


// 1. Simple numeric array (1D)
$colors = ["red", "green", "blue", "yellow", "purple"];


// 2. Numeric array of numbers
$primeNumbers = [2, 3, 5, 7, 11, 13, 17];


// 3. Associative array (country => capital)
$countries = [
    "Israel" => "Jerusalem",
    "France" => "Paris",
    "Japan" => "Tokyo",
    "Brazil" => "Brasilia"
];


// 4. Associative array (book info)
$book = [
    "title" => "The Hobbit",
    "author" => "J.R.R. Tolkien",
    "year" => 1937,
    "genre" => "Fantasy"
];


// 5. Numeric array of character names
$characters = [
    "Harry Potter",
    "Frodo Baggins",
    "Luke Skywalker",
    "Hermione Granger"
];


// 6. Associative array of student grades
$studentGrades = [
    "Alice" => 95,
    "Bob" => 82,
    "Charlie" => 88,
    "Dana" => 91
];


// 7. Numeric array of associative arrays (complex structure)
$books = [
    [
        "title" => "1984",
        "author" => "George Orwell",
        "year" => 1949
    ],
    [
        "title" => "To Kill a Mockingbird",
        "author" => "Harper Lee",
        "year" => 1960
    ],
    [
        "title" => "Dune",
        "author" => "Frank Herbert",
        "year" => 1965
    ]
];


// 8. Associative array containing arrays (nested data)
$movie = [
    "title" => "Inception",
    "director" => "Christopher Nolan",
    "actors" => ["Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page"],
    "year" => 2010
];


// 9. Array representing products in a store
$products = [
    ["name" => "Laptop", "price" => 1200, "stock" => 5],
    ["name" => "Mouse", "price" => 25, "stock" => 50],
    ["name" => "Keyboard", "price" => 70, "stock" => 20]
];


// 10. Mixed data array (for edge-case demonstrations)
$miscData = [
    "siteName" => "My Demo Site",
    "isOnline" => true,
    "visitorCount" => 1234,
    "tags" => ["php", "html", "education"]
];

