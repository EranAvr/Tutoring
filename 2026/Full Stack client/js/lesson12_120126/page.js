// An IIFE function that ask to select day/night theme:
(function(){
    let theme = confirm("Choose day theme?");
    if (theme){ // day
        document.body.style.backgroundColor = "white";
        document.body.style.color = "lightblue";
    } else {    // night
        document.body.style.backgroundColor = "black";
        document.body.style.color = "orange";
    }
})();


// manipulate the tab's title:
document.title = "New Title";

// manipulate tags content:
const element = document.getElementById("main_title");
console.log(element);
element.innerText = "My Glorious Webpage";


// multiply tag's content:
const elementP = document.getElementById("first_p");
let text = elementP.innerText;
for (let i = 0; i < 10; i++) {
    elementP.innerHTML += "<br>" + text;
    // Notice! We must use innerHtml so html tags
    // would be parsed properly.
}


// select all images in the page:
const images = document.getElementsByTagName("img");
console.log(images);

// change images size dynamically:
let size = prompt("Enter images size");
for(let i=0; i<images.length; i++){
    images[i].width = size;
}

// use CSS selectors to fetch  html tag:
const image = document.querySelector("img:last-child");
console.log(image);
image.width = 1000;



/*
const cubes = document.getElementById("cubes");
let x = 500;
for (let i = 0; i < 5; i++) {
    cubes.innerHTML += `<div style="width: ${x}; height: ${x}; background-color: brown;"></div>`;
    x -= 100;
}
*/


// Generate links dynamically:
const domain = "https://www.w3schools.com/";
const pages = ["html/default.asp", "css/default.asp", "js/default.asp", "sql/default.asp"];

const navi = document.getElementById("nav_id");
navi.style.backgroundColor = "red";
for (let i = 0; i < pages.length; i++) {
    // build the new tag with strings (Not most recommended, but it works):
    let newTag = '<a href="' + (domain+pages[i]) + '">' + pages[i] + '</a><br>';
    // add tag to web page:
    navi.innerHTML += newTag;
}