<?php
    try{

        if( !isset($_POST['num1']) || $_POST['num1']==""
        || !isset($_POST['num2']) || $_POST['num2']=="" ){
            throw new Exception("Missing value");
        }

        $n1 = $_POST['num1'];
        $opr = $_POST['oper'];
        $n2 = $_POST['num2'];

        $res = 0;
    
        switch ($opr) {
            case '+':
                $res = $n1 + $n2;
                break;
            case '-':
                $res = $n1 - $n2;
                break;
            case '*':
                $res = $n1 * $n2;
                break;
            case '/':
                $res = $n1 / $n2;
                break;

            default:
                $res = "Error! unknown operation.";
                break;
        }
    }
    catch(DivisionByZeroError $dbze){
        $res = "Error! " . $dbze->getMessage();
    }
    catch(Exception $e){
        $res = "Error! " . $e->getMessage();
    }

?>

<!DOCTYPE html>
<html lang="en">

<body>

    <h1>Calculation Result</h1>
    <p>
        <?php
        if(is_string($res)){
            echo "<h3>$res<h3>";
        } else{
            echo "<h3>Result =  $res<h3>";
        }
        ?>
    </p>
</body>

</html>