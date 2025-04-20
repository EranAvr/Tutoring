<?php

    function divide(int $a, int $b): int{
        if ($b === 0){
            throw new Exception("Big NO NO! Division by zero.");
        }
        return $a / $b;
    }