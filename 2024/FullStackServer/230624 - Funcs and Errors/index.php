<?php declare(strict_types=1); ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Functions Test</title>
    <?php 
        // Config
        function getUserNameFromServer(){
            return "Alin";
        }
        function getUserIconFromServer(){
            return "https://images.ctfassets.net/hrltx12pl8hq/01rJn4TormMsGQs1ZRIpzX/16a1cae2440420d0fd0a7a9a006f2dcb/Artboard_Copy_231.jpg?fit=fill&w=600&h=600";
        }
        function multTwoNumbers(int $a, int $b): int{
            return $a * $b;
        }
        function multTwoNumbersWithError(int $a, int $b): int{
            return "abc";
        }
        function sumMyNumbers(...$numbers){
            $sum = 0;
            foreach($numbers as $num){
                $sum += $num;
            }
            return $sum;
        }
        function canReceiveNullValue(?int $param){
            if(is_null($param)){
                // do whatever you want,
                // possibly some default action.
            }
            else{
                // Some operations on parameter '$param'
            }
        }

        $outVar = 1;
        function localGlobal(){
            $inVar = 2;
        }
    ?>
</head>
<body>
    <h1>Some Title</h1>
    <nav>
        <img src=<?php echo getUserIconFromServer(); ?> alt="">
        <h4>User Name: <?php echo getUserNameFromServer(); ?> </h4>
    </nav>
    
    <hr>

    <p>
        <?php echo "<h3>" . getUserNameFromServer() . "</h3>"; ?>
    </p>
    <div>
        <h2>Multiplications</h2>
        <div>
            3 * 5 = <?php echo multTwoNumbers(3, 5) ?> <br>
        </div>
        <hr>
        <div>
            3 * 5 = <?php //echo multTwoNumbers(3.14, 5) ?> <br>
        </div>
        <hr>
        <div>
            3 * 5 = <?php //echo multTwoNumbersWithError(3, 5) ?> <br>
        </div>
    </div>

    <div>
        <h2>Multiplications</h2>
        <div>
            1 + 2 + 3 = <?php echo sumMyNumbers(1, 2, 3); ?>
        </div>
        <div>
            1 + 2 + 3 + 4 + 5 = <?php echo sumMyNumbers(1, 2, 3, 4, 5); ?>
        </div>
    </div>
</body>
</html>