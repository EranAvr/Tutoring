<?php

    // BAD PRACTICE for share memory:
    //static $state = "memory";

    function decorate(string $str){
        //return "@@@ " . $str . " @@@";
        return "@@@ $str @@@";
    }

