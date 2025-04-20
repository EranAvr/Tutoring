<?php
    include 'module_math.php';
    require 'module_email.php';


    echo divide(10, 2) . "\n";

    try{
        echo divide(10, 0) . "\n";
    } catch(Exception $e){
        echo $e->getMessage() . "\n";
    }


    try{
        sendEmail("eran@mail.com", "titly", "Some text...");
    } catch(Exception $e){
        echo $e->getMessage() . "\n";
    } finally {     // תמיד ירוץ, לא משנה מה
        echo "Finally block executed!\n";
    }
    
    
    
    echo "All OK\n";