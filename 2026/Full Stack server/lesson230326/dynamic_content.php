<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        .comments_container {
            width: 50vw;
            border: 5px solid black;
        }
        .comment{
            width: 50%;
            border: 1px solid blue;
            margin: 5px 0px;
        }
    </style>
</head>
<body>
    <h3>Vegetables list:</h3>
    <ul>
        <?php 
        $veges = ["Carrots", "Tomatoes", "Cucumbers", "Potatoes"];
        for ($i = 0; $i < count($veges); $i++){
            echo "<li>$veges[$i]</li>";
        }
        ?>
    </ul>
    
    <hr>

    <h3>Comments list:</h3>
    <div class="comments_container">
        <?php 
        $comments = [
            "user1" => ["title1", "some text 1"],
            "user2" => ["title2", "some text 2"],
            "user3" => ["title3", "some text 3"],
            "user4" => ["title4", "some text 4"]
            ];
        
        foreach ($comments as $user => $data){
            echo "<div class='comment'> User: $user <hr> Title: $data[0] <br> $data[1] </div>";
        }
        ?>
    </div>

    <hr>

    <h3>Dynamic form:</h3>
    <form action="">
        <input type="text" name="fname" placeholder="Enter first name"><br>
        <input type="text" name="lname" placeholder="Enter last name"><br>
        
        <?php 
            $hobbies = ["Coding", "Sport", "Music", "Traveling", 
            "Talking", "Reading", "Sleeping", "Cooking", "Hiking"];

            foreach ($hobbies as $hob){
                echo "<input type='checkbox' name='hobbies' value='$hob'>$hob";
            }
        ?>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form>
</body>
</html>