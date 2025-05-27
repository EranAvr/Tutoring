<?php
    if( !file_exists("uploads/") ){
        mkdir("uploads/");
    }


    if(isset($_FILES['myFile'])){
        $target_dir = "uploads/";
        $target_file = $target_dir . basename($_FILES['myFile']['name']);

        print_r($_FILES['myFile']);

        if(move_uploaded_file($_FILES['myFile']['tmp_name'], $target_file)){
            echo "Uploading succeeded!";
        } else {
            echo "Uploading failed...";
        }
    }