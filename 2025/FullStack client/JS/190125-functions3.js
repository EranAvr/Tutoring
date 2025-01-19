// function declaration:
function funcWithReturn(){
    /*
        some long code
    */
    return "Hello World!";
}

result = undefined
console.log(result);

result = funcWithReturn();
console.log(result);


function add2Numbers(a1, a2){
    b = a1 + a2;
    return b;
}


// Main code:
add1 = add2Numbers(1, 2);
add2 = add2Numbers(25, 15);
add3 = add2Numbers(100, 200);

console.log(add1 + add2 + add3);


// Example: Quadratic formula-
function mathDelta(a, b, c){
    /*delta = b**2 - 4*a*c;
    return delta;*/
    return b**2 - 4*a*c;
}


// Main code
// input from user:
var A = 1
var B = 1
var C = -1
// calculate roots:
delta = mathDelta(A, B, C);
x1 = ( -B + (delta) ** 0.5 ) / ( 2 * A )    // ()**0.5 == math.sqrt()
x2 = ( -B - (delta) ** 0.5 ) / ( 2 * A )
console.log(x1);
console.log(x2);



// ex:
//  כתבו פונקציה אשר מקפיצה חלון prompt
// לבקשת טמפ' בפרנהייט
// הפונ' תחשב את הטמפ' המתאימה בצלזיוס ותציג אותה למסך
// באמצעות חלון alert
function fernToCels(tF){
    return (5/9) * (tF - 32);
}

function presentTemp(){
    var tempFern = prompt("Enter temperature in Fahrenheit:");  // input
    var tempCels = fernToCels(tempFern); // calculate
    alert("Temp in celsius: " + tempCels);  // output
}
presentTemp();


function presentTempWithDeco(){
    var tempFern = prompt("Enter temperature in Fahrenheit:");  // input
    var tempCels = fernToCels(tempFern); // calculate
    alert("@@#$ " + tempCels + " $#@@");  // output
}
presentTempWithDeco();



// ex: רשמו פונ' המקבלת 2 מספרים
// הפונ' תחשב סכום של המספרים ותחזיר אותו למשתמש
function add2Nums(a, b){
    var y = a + b;
    return y;
    // return a + b;
}
var sum = add2Nums(5, 8);
console.log(sum);
var sum2 = add2Nums(1);
console.log(sum2);

// Default values:
/*
    פרמטרים יכולים לקבל ערך ברירת-מחדל
    נעשה זאת ע"י השמה (=) בשורת הפרמטרים
    בהגדרה של הפונקציה
 */
function add2NumsWithDefault(a=0, b=0){
    var y = a + b;
    return y;
    // return a + b;
}
var sum3 = add2NumsWithDefault(1);
console.log(sum3);

function add3Nums(a, b, c){}
function add4Nums(a, b, c, d){}


// Rest operator (...) :
function restOperator(...args){
    console.log( typeof(args) );
    console.log(args);
}

restOperator(1, 2, 3);
restOperator(1, 2, 3, 4, 5);
restOperator(10, 20, 30, 40, 50, '#', '@', "Bobby");

function generalSum(...numbers){
    var mySum = 0;
    for (var i=0; i<numbers.length; i++){
        console.log( numbers[i] );
        mySum += numbers[i];
    }

    return mySum;
}

var sammy = generalSum(100, 200, 300);
console.log("sammy = " + sammy);
sammy = generalSum(20, 40, 60, 80);
console.log("sammy = " + sammy);
sammy = generalSum(1000, 2000);
console.log("sammy = " + sammy);

