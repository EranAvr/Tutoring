// Example JS code

/*
    This file demonstrate
    the use of Javascript with web.
*/

// הדפסה רגילה אל חלון הקונסול
console.log("Hello World");

// הדפסת שגיאה אל חלון הקונסול
//console.error("Error! Something bad happened...");

// הדפסת ערכים מורכבים (אובייקטים) אל חלון הקונסול
/*
    שפת ג'אווה-סקריפט מכילה כמה
    אובייקטים מובנים בתוך השפה, הנותנים
    גישה אל חלון הדפדפן, הטאב הנוכחי,
    תוכן האתר וכו'...
*/
//console.log(console); // הדפסת האובייקט 'קונסול' עצמו
console.log(window);    // הדפסת האובייקט 'חלון' המקושר לטאב בדפדפן

//window.alert("A popup window with a message");
/*
alert("A popup window with a message");
console.log("Alert was executed");
*/

//confirm("Do you agree?")

//console.log( confirm("Choose something:") )

/*var x = prompt("Write text in textbox:");
console.log(x);*/


// OPERATORS
let a = 3;
console.log(3**2);  // 3^2
console.log(--a);
console.log(++a);

console.log("3" == 3);  // true (same values)
console.log("3" === 3); // false (String and Number)
console.log(3 === 3);   // true (Number)
console.log(3.0 === 3); // true (Number)

let b = 4;
console.log("b = ", b); // b=4
b = b<<2;   // left-shift on bits of number. 2 jumps equal to multiply by 4.
console.log("b = ", b); // b=16

/*
let age = prompt("Enter your age");
console.log(typeof age);

let result = age>16 ? "You can drive" : "You can't";
console.log("result = ", result);
age > 16 ? alert("You can drive") : alert("Go home")
*/

console.log( typeof("text...") );   // 'string'
console.log( typeof(age) );
console.log( typeof 3.14, typeof "123" );   // 'number' 'string'


let num1 = parseInt( prompt("Enter number 1:") );
let num2 = parseInt( prompt("Enter number 2:") );
/*num1 = parseInt(num1);
num2 = parseInt(num2);*/
alert(num1 + num2);
