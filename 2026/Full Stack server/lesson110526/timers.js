function test(){
    console.log("Test function");
}

/*setTimeout(test, 3000);
setTimeout( ()=>{console.log("Arrow function test");
}, 2000)*/

let count = 1;
setInterval(()=>{console.log(`#${count++} Intervals testing`)}, 1000)

console.log("End of code");
