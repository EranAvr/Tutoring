console.log("OK!");

/* Flow Control Structures */

// If-Else:
var currentHour = 21;
var greeting = "Hello user";

// decide on proper greeting,
// and print to screen the text: "!!! <greeting> !!!"

if (currentHour < 12) {
  //console.log("Good Morning");
  greeting = "Good Morning!";
} else if (currentHour < 19) {
  //console.log("Good afternoon");
  greeting = "Good afternoon";
}
/*else {
    //console.log("Good night");
    greeting = "Good night";
}*/

console.log("!!! " + greeting + " !!!");

var currentMonth = 15;
// for each month-number,
// print the name of the month.

if (currentMonth == 1) {
  console.log("January");
} else if (currentMonth == 2) {
  console.log("February");
} else if (currentMonth == 3) {
  console.log("March");
}
/*
........ a lot of comparisons..
Better use Switch!
*/


// Switch:
switch (currentMonth) {
  case 1:
    console.log("January");
    break;
  case 2:
    console.log("February");
    break;
  case 3:
    console.log("March");
    break;
  case 4:
    console.log("April");
    break;
  case 5:
    console.log("May");
    break;
  /*
.... and on and on..
 */
  default:
    console.log("Illegal month number");
}
var dayToday = "Thursday";
switch(dayToday){
    case "Sunday":
        console.log("Have a nice week");
        break;
    case "Thursday":
        console.log("Happy weekend!");
        break;
    default:
        console.log("Good day");  
}



// While loop:
// 1. create variable
var x = 1;
while ( x <= 10 ) { // 2. boolean condition on variable
    console.log(x);
    // 3. update variable
    x = x + 1;  // this line can be 'x++' instead
}
console.log("End of while loop");

// For loop:
/*
    for ( <create variable> ; <boolean condition> ; <update variable> ){
        block of code for execution...
    }
*/
for (var i=1 ; i<=10 ; i++){
    //console.log(i);
    console.log(`i = ${i}`);
}
console.log("End of for loop");
