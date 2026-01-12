(function(){
    alert("Setting up the page...");
})();


/*
    קוד ארוך ומורכב
*/


let arr = [1,2,4,3,5,8,6,9]
let x = 4;
let found = false;
for(let i = 0; i < arr.length ; i++){
    if(arr[i] == x){
        found = true;
    }
}
if(found){
    console.log("Found", x);
}
else {
    console.log("Not found");
    
}

console.log(arr.indexOf(6));
console.log(arr.indexOf(7));


arr = [1,2,3,4,5]
const newArr = arr.map( function(n){return "<h2>"+(n**2)+"</h2>";} );
console.log(newArr);


arr = ["Nimrod", "Elroee", "Ahuva", "Noah", "Dave"]
const filteredList = arr.filter( function(name){return name.toString().length <= 4;} );
console.log(filteredList);


// ---------------------------
/*
const student = ["123456789", "James Brown", 70];
console.log(student[0], student[1], student[2]);
*/


const student = {id:"123456789", name:"James Brown", age:70}
console.log(student.id, student.name, student.age);

console.log(Math.PI);
console.log(Date.now());

const users = [
    {name:"James Brown", isAdmin: true},
    {name:"James Down", isAdmin: false},
    {name:"James Lawn", isAdmin: false},
];
for(let i=0; i<users.length; i++){
    let user = users[i];
    console.log("User name:", user.name, "Admin:", user.isAdmin);
    
}


const keys = Object.keys(student);
for(let i=0; i<keys.length; i++){
    console.log(keys[i], "->", student[ keys[i] ]);
}