// Functions:

// 1. Definition - הגדרה
function func(){
    console.log("Hello World!");
}
// 2. Function call - שימוש בפונקציה
func();


// Examples
// simple function:
function print1to5(){
    var i = 1;
    while(i <= 5){
        console.log(i);
        i++;
    }
}
print1to5();
/* some long code */
print1to5();

// function with param:
function printValue(value){
    console.log("@@ " + value + " @@");
}
printValue(10);
printValue("Bobby")
printValue();


function print1toN(num){
    var j = 1;
    while(j < num){
        console.log(j);
        j++;
    }
}
print1toN(10);
print1toN(13);


// BAD CODE-
/*console.log(1 + 2 + 3);
console.log(10 + 20 + 30);
console.log(5 + 15 + 50);*/

// GOOD CODE-
function add3numbers(n1, n2, n3)
{
    console.log(n1 + n2 + n3);  //  print sum of 3 numbers
}
add3numbers(1, 2, 3);
add3numbers(10, 20, 30);
add3numbers(5, 15, 50);