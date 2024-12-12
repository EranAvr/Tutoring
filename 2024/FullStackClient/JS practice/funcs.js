
// Declaration
function shemhafunctzia(){
    console.log("this is from within th function");
}

shemhafunctzia();

// Expression
let someFunc = function something(){
    console.log('this is a function expression');
}

someFunc();

function manyArgs(...args){
    console.log(args);
}
manyArgs(1);
manyArgs(1, 2, 3);
manyArgs(1, "345", 234.23);


function exec(f){
    f();
}
function toRun(){
    console.log("some function to run");
}
exec(toRun);
exec(function(){console.log("this is an inline function");});
exec(() => {
    console.log("this is an inline function");
});
let funcInAVar = () => {null;};

( () => {
    function innerIIFE(){
        console.log("This function is inside IIFE function");
    }

    innerIIFE();
}
)()

alert("This is an alert window");
let p = prompt("Prompt message");
console.log(p);
let c = confirm("Confirm message");
console.log(c);
