// Functions
// Empty functions:
function testFunc1(){
    console.log("testFunc1 was called");
}

let testFunc2 = function(){
    console.log("testFunc2 was called");
}

testFunc1();
testFunc2();

// Functions with parameters
function funcWithParam1(x){
    console.log("x = " + x);
}
funcWithParam1(2.17);
funcWithParam1("My name is Bob");
funcWithParam1();
