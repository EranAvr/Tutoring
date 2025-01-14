console.log("OK");

var myVariable;
myVariable = 100;
console.log(myVariable);

console.log(10 * 2); // multiply
console.log(10 ** 2); // power

var loggedIn = false;
if (loggedIn == true) {
  console.log("Hello User!");
} else {
  console.log("You need to log in..");
}

// For each day number- print its name
var dayNumber = 30;
switch (dayNumber) {
  case 1:
    console.log("Sunday");
    break;
  case 2:
    console.log("Monday");
    break;
  case 3:
    console.log("Tuesday");
    break;
  case 4:
    console.log("Wednesday");
    break;
  default:
    console.log("Day does not exist");
}

var myNumber = 2;
switch (myNumber) {
  case 1:
    console.log("Number 1");
  case 2:
    console.log("Number 2");
  case 3:
    console.log("Number 3");
  case 4:
    console.log("Number 4");
}


// Loops:
/*console.log("Hello World!");
console.log("Hello World!");
console.log("Hello World!");
console.log("Hello World!");
console.log("Hello World!");*/

var i = 1;
while (i <= 5){ // include i==5
    console.log("First while loop");
    i++;
}

/* This is the better way: */
var i = 0;
while (i < 5){  // exclude i==5
    console.log("Second while loop");
    i++;
}

// print to console, all the numbers 0-9 (include 9):
var x = 0;
while (x < 10){
    console.log(x);
    x++;
}
// print to console the numbers 10-1 (include 10 and 1):
var x = 10;
while (x >= 1){
    console.log(x);
    x--;
}
// print to console the numbers between 1 to 50
// with steps of 5
// הדפיסו למסך את המספרים 1-50 בקפיצות של 5
var n = 1;
while (n < 51) {
    console.log(n);

    //n = n + 5
    n += 5
}

// הדפיסו למסך את המספרים 0-50 בקפיצות של 10
var n = 0;
while(n < 51){
    console.log(n);
    
    n += 10;
}


