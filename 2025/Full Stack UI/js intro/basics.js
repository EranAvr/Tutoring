// Variables
let myInt = 1000;
var myDec = 3.14;
console.log(typeof(myInt));
console.log(typeof(myInt.toString()));

var myString = "myInt = " + myInt + " myDec = " + myDec;
console.log(myString);
console.log(myString.length);
console.log(myString.toUpperCase());
console.log(myString.split(' '));

// Operators
console.log("2**3 = " + 2**3);
console.log("3 == 3 = " + (3 == 3) );
console.log("3 == '3' = " + (3 == '3') );
console.log("3 === '3' = " + (3 === '3') );
let boolRes = screen.width > 700 ? "res is true" : "Totally false" ;
console.log(boolRes);

// Control Flow
let x = '10';
switch(x){
    case 10:
        console.log("equal to 10");
        break;
    case 5:
        console.log("equal to 5");
        break;
    default:
        console.log("value not found");
}

let y = 3.14;
if (y < 3.14){
    console.log(y + " is smaller than PI");
}
else if (y == 3.14){
    console.log(y + " is equal to PI");
}
else {
    console.log(y + " is bigger than PI");
}

let w = 5;
do{
    console.log("w = " + w);
    w++;
} while (w < 10);

let arr = [1, 2, '3', "4", "some text", true];
for (let i = 0; i<arr.length; i++){
    console.log(arr[i]);
}
console.log(i); // i is not defined outside for-loop. This will crush the script.
console.log("Check if script is still running");