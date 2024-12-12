
// Example of an iife - a function that runs at the start, only a single time:
( function iife(){
    alert("All is good");
} )();
iife();


// Example of prompt-input and parsing String to Number:

let fNum = Number.parseInt( prompt("Enter first number:") );
let sNum = Number.parseInt( prompt("Enter second number:") );
console.log(fNum + sNum);



// Example of prompt-input and calculating power. no parsing needed, because of the operators and the type of 'res':

let base = prompt("Enter base number:");
let expo = prompt("Enter exponent number:");
let res = 1;
for (let index = 0; index < expo; index++) {
    // res = res * base
    res *= base;
}
console.log(res);



// Example shows a function that receive varying amount of variables:

function sum(...args){
    let mySum = 0;
    for(let element of args){
        mySum += element;
    }
    return mySum;
}
console.log( sum(1,2,3,4,5) );
console.log( sum(1,2,3,4,5,6,7,8,9,3,45,45,24) );



// Example of sending a function as parameter:
// We can send any function as a parameter to a function that expect to receive a function.

function exec(func){
    func();
}
function execMath(func){
    console.log( func(1,4,70,3,9,8) );
}

function imBeingPassed(){
    console.log("inner body of passed func");
}
exec(imBeingPassed);

const someFunc = function(){
    console.log("inner body of some func");
}
exec(someFunc);

exec( () => { console.log("This is an arrow function"); } );

execMath(Math.max);
