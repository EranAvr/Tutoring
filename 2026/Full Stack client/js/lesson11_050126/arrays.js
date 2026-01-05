
const bands = ["Beatles", "Pink Floyd", "Led Zeppelin", "ABBA"];


//////////////  BASIC OPERATIONS   //////////////
/*
console.log(bands);

console.log(bands[ Math.floor(bands.length/2) ])

bands[bands.length - 1] = "Linkin Park";
console.log(bands[bands.length-1]);

bands.push("Radiohead");
bands.push("Metallica", "Kaveret");
console.log(bands);

let b = bands.pop();
bands.pop();

console.log(b);
console.log(bands);

for (let i = 0; i < bands.length; i++) {
    console.log(i, "=>", bands[i]);
    
}
*/



//////////////  The .map() method   //////////////
/*
function doSomething(band){
    return "<h2>" + band + "</h2>";
}

let newBands = bands.map(doSomething);
console.log(newBands);
*/



//////////////  PASS BY REFERENCE   //////////////
/*
function deleteLast(arr){
    arr.pop();
}
const a = [1,2,3];
deleteLast(a);
console.log(a);
*/