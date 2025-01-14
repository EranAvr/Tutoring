// BAD EXAMPLE:
/*var ans = confirm("Give me boolean answer:");
console.log(ans);

var i = 1;
while (i <= 10){
    console.log(i);
    i++;
}

//var ans;
ans = confirm("Give me boolean answer:");
console.log(ans);

console.log("Do a lot of calculations");

ans = confirm("Give me boolean answer:");
console.log(ans);*/



// GOOD EXAMPLE
function doSomething(){
    var ans = confirm("Give me some answer:");
    console.log(ans);
}

doSomething();

var i = 1;
while (i <= 10){
    console.log(i);
    i++;
}

doSomething();

console.log("Do a lot of calculations");

doSomething();

