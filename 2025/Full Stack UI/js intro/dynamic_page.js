// Access and print the 'document' object
console.log(document);

// Select an html-tag from the HTML document
// NOTICE! the parameter to getElementById() is a String !!
let mainHeader = document.getElementById("main_header");

// print the selected HTMLElement:
console.log(mainHeader);

// Edit the text of the 'h1' tag:
mainHeader.innerText += " Example";

let myPTags = document.getElementsByTagName("p");
console.log(myPTags);

for(let i=0; i<myPTags.length; i++){
    myPTags[i].innerText = "Paragraph " + i
}


// Events:
let myImage = document.getElementById("my_image");
function changeSrc(){
    myImage.src = "https://images.panda.org/assets/images/pages/welcome/orangutan_1600x1000_279157.jpg";
};
// Make connection between event-name and its function:
myImage.addEventListener("click", changeSrc);


function greetings(){
    alert("Hello user! page was loaded.");
}

let myContainer = document.getElementById("p1");
function changeBackground(){
    myContainer.style = "background-color: red";
}
myContainer.addEventListener("click", changeBackground);
