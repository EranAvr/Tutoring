console.log("OK");

// Operators examples:

// Math:
console.log("10 + 2 =", 10 + 2);
console.log("10 - 2 =", 10 - 2);
console.log("10 * 2 =", 10 * 2);
console.log("10 / 2 =", 10 / 2);

console.log("10 % 4 =", 10 % 4);
var n = 60;
console.log("n =", n);
console.log("n++ =", ++n);
console.log("n-- =", --n);
console.log("n-- =", --n);

console.log("10 ^ 2 =", 10**2);     // 10 * 10
console.log("10 ^ 3 =", 10**3);     // 10 * 10 * 10
console.log("10 ^ 4 =", 10**4);     // 10 * 10 * 10 * 10
console.log("2 ^ 5 =", 2**5);       // 2 * 2 * 2 * 2 * 2

// Comparison
console.log("5 == 5", 5 == 5);
console.log("6 != 6", 6 != 6);

console.log("5 < 10", 5 < 10);
console.log("5 > 3", 5 > 3);
console.log("100 <= 100", 100 <= 100);
console.log("100 >= 90", 100 >= 90);

console.log(" '11' == 11 ", '11' == 11);
console.log(" 2.0 == 2 ", 2.0 == 2);
console.log(" 1 == true ", 1 == true);
console.log(" 9 == true ", 9 == true);
console.log(" -5 == true ", -5 == true);
console.log(" -5 <= true ", -5 <= true);
console.log(" 0 == true ", 0 == true);

console.log(" '111' === 111 ", '111' === 111);
console.log(" 2.0 === 2 ", 2.0 === 2);
console.log(" 'true' === true ", 'true' === true);
console.log(" '' === false ", '' === false);

console.log(" '1' == true ", '1' == true);
console.log(" '1' === true ", '1' === true);

// Logical
console.log(" false && false ", false && false);
console.log(" false && true ", false && true);
console.log(" true && false ", true && false);
console.log(" true && true ", true && true);
var n1 = 15;
console.log(n1 + " is between 10 AND 20", n1>=10 && n1<=20);

console.log(" false || false ", false || false);
console.log(" false || true ", false || true);
console.log(" true || false ", true || false);
console.log(" true || true ", true || true);
var n2 = 50;
console.log(n2 + " is lower than 0 OR greater than 100", n2<0 || n2>100);

var b1 = true;
console.log(`If b1=${ b1 } then !b1=${ !b1 }`);
b1 = false;
console.log(`Now b1=${ b1 } then !b1=${ !b1 }`);

// Assignment operators:
var x;
console.log(`x = ${x}`);
x = 10;
console.log(`x = ${x}`);
x = x + 5;
console.log(`x = ${x}`);
x += 5; // equal to line 73 in code
console.log(`x = ${x}`);    // now, x=20
x -= 10;
x *= 4;
x /= 5;
console.log(`x = ${x}`);    // now, x=8

// Special operators
// var res = <boolean-expression> ? <result-if-true> : <result-if-false>;

var a = 21;
var res = a%2==0 ? "even" : "odd" ;
console.log(`${a} is ${res}`);


// Typeof command:
var d = 3.14;
console.log("d is " + typeof(d) );   // typeof as function
console.log("d is " +  typeof d );    // typeof as keyword
var z;
console.log("z is " + typeof(z) );
var xyz = null;
console.log("xyz is " + typeof(xyz) );
console.log("console.log is " + typeof(console.log) );


// Casting:
// auto casting:
console.log(20 + " some string " + true + " another part");
console.log("1000 + true =", 1000 + true);
// manual casting:
console.log("'500' + 5 =", '500' + 5);
console.log("Number.parseInt('500') + 5 =", Number.parseInt('500') + 5);

console.log("Math.floor(3.14) =", Math.floor(3.14));





