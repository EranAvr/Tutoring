<?php

    function sendEmail($sendTo, $title, $text): void{
        // 1. check @
        $foundAt = false;   // משתנה דגל לזכרון האם נמצא @
        for ($i = 0; $i < strlen($sendTo); $i++){    // ריצה על כל תווי המחרוזת
            if ($sendTo[$i] == '@'){
                $foundAt = true;    // אם נמצא @ נחליף ל-true
            }
        }
        if ($foundAt == false){ // אם אין @, כלומר תקלה - נזרוק חריגה
            throw new Exception("Error: @ sign not found");
        }

        // 2. Title starts with capital letter
        if ($title[0] < 'A' || $title[0] > 'Z'){
            throw new Exception("Error: Title does not start with capital letter");
        }

        // 3. Text isn't longer than 100 chars
        if (strlen($text) > 100){
            throw new Exception("Error: Text is too long. Maximum 100 chars");
        }

        // ולידציה הושלמה בהצלחה!
        // ניתן כעת לבצע שליחה את המייל
    }