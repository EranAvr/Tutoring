// Object:
const user1 = {
    email: "EranE@l.telhai.tech",
    password: "12345678",
    // let's add a function-
    changeEmail: function(newEmail) {   // only a function-declaration can  access the 'this' keyword
        this.email = newEmail;
    },
    print: () => { console.log("this line printed from within an arrow function")}  // arrow-function can't access 'this'
};
console.log(user1);
// Reading-
console.log(user1.email);   // dot operator
console.log(user1["password"]);   // [ ] operator
// Writing-
user1.password = "87654321";
console.log(user1.password);

// calling methods defined inside object-
user1.print();
console.log("Old Email: " + user1.email);
user1.changeEmail("newEmail@blabla.org");
console.log("New Email: " + user1.email);


const user2 = {};
console.log(user2);
// adding properties dynamically-
user2.email = "mail@srfxgv.com";
user2["password"] = "0000";
console.log(user2);

// Traversing-
console.log(Object.keys(user2));    // this method returns array of keys
for(let k of Object.keys(user2)){   // traversing the keys and extract matching values
    console.log(user2[k]);
}
console.log(Object.values(user2));  // this method returns array of values
console.log(Object.entries(user2)); // this method returns array of pairs of key-value


console.log("----------------------");
// DOM:
let divElement = document.getElementById("first_div");  // getElementById gives us a reference to a HTMLElement
console.log(divElement);
divElement.className = "some_other_class";  // access attributes of the HTMLElement, and change them
console.log(divElement);

console.log(divElement.innerText)
divElement.innerText = "this is a new text";    // innerText is a built-in property of HTMLElement
console.log(divElement.innerText);

// create new element-
let image = document.createElement("img");
// edit element attributes-
image.src = "https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500";
// add new element to parent container-
divElement.appendChild(image);
// removing the same element from the parent container-
divElement.removeChild(image);


// Events:
// creating a callback function, to respond our 'onclick' event:
function clicking(){
    // (1) get reference to parent tag (div)-
    let secondDivElement = document.getElementById("second_div");
    // (2) create new HTMLElement of an image-
    let image = document.createElement("img");
    // (3) build the img tag by editing its attributes-
    image.src = "https://images.pexels.com/photos/268533/pexels-photo-268533.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500";
    // (4) finally, add our new html element to the document, under the container element-
    secondDivElement.appendChild(image);
}
// creating a callback function, to respond our 'onmouseenter' event:
function hovering(){
    // (1) get reference-
    let thirdDivElement = document.getElementById("third_div");
    // (2) + (3) create and edit-
    let diving = document.createElement("div");
    diving.innerText = "I am an inner text";
    // (4) add to document-
    thirdDivElement.appendChild(diving);
}