/*
function sum(a, b){
    if(b == undefined)
        b = 100
    console.log(a, b);

    let x = a + b;
    alert(x);
}

sum(10, 5); // a=10, b=5
sum(1, 1); // a=1, b=1
sum(20); // a=20, b=undefined
*/

/*
function greet(name = "User"){
    alert("Hello " + name);
}

greet();
greet("Adi");
*/

/*
function sum(...numbers){
    let s = 0;  // משתנה עזר
    for(let i=0; i<numbers.length; i++){    // ריצה בלולאה
        s += numbers[i];
    }
    alert("The sum is: " + s);  // שימוש בסכום שחושב
}

sum(1);
sum(2,2,2);
sum(1,2,3,4,5,6,7,8,9,10);
*/

/*
function concat(...words){
    let s = "";
    for(let i=0; i<words.length; i++){
        s += words[i] + " ";
    }
    s = s.trim();
    //console.log(s);
    alert("Sentence is: " + s);
}

concat("Hey", "mom", "and", "dad");
*/


function sum2(a, b){
    let x = a + b;

    return x;
}
let m = sum2(10, 20);

function sumN(...numbers){
    let s = 0;
    for(let i=0; i<numbers.length; i++){
        s += numbers[i];
    }
    return s;
}
let n = sumN(10, 20,30,40,50);


function isEven(n){
    /*if(n%2==0)
        return true;
    else
        return false;*/

    return n%2==0;
}