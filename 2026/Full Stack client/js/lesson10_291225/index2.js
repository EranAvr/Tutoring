let str = "Shine on you crazy diamond!";

console.log("Bobby Mcgee".length);
console.log(str.length);

console.log(str.charAt(0));
console.log(str.charAt( str.length-1 ));

let midIdx = Math.floor( str.length/2 );
console.log("middle index = ", midIdx);
console.log("middle = ", str[midIdx]);

let letters = "A";
let result = letters.concat("B", "C", "D");
console.log("letters = ", letters);
console.log("result = ", result);

let password = "   @1234@  ";
console.log(password);
console.log(password.trim());



let num1 = parseInt( prompt("Enter number 1:") );
let count = 0;
let num2 = 0;
/*if (num2 == 0){
    console.error("Error! Illegal divisor.");
} else {
    console.log(num1 / num2);
}*/

while (num2 === 0){
    //count++;
    num2 = parseInt( prompt("Enter number 2: (count=" + (++count) + ")") );
}
console.log(num1 / num2);



// EXERCISES

let e1 = prompt("Enter email 1:");
let e2 = prompt("Enter email 2:");
let flag = true;
if (e1.length != e2.length)
    alert("Error! lengths are not matched");
else {  // e1.length == e2.length
    for (let i=0; i<e1.length; i++){
        if(e1[i].toLowerCase() != e2[i].toLowerCase()){
            flag = false;
            alert("Error! unequal chars");
            break;
        }
    }
}
if (flag)
    alert("All is good :-)");
