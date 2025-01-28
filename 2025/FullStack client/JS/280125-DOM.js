const h1Title = document.getElementById("main_title");

console.log(h1Title.innerText); // קריאה
h1Title.innerText = "Main Title";   // כתיבה
console.log(h1Title.innerText);

const image = document.getElementById("first_image");
// change source of image-
image.src = "https://media.springernature.com/lw703/springer-static/image/art%3A10.1038%2F528452a/MediaObjects/41586_2015_Article_BF528452a_Figg_HTML.jpg";
// change source again-
image.src = "https://cdn.imago-images.com/Images/header/hello-we-are-imago_03-2023.jpg";
// change height of image-
image.height = "500";

const parag = document.getElementById("theme_container");
parag.style = "background-color: black; color: azure;"; // תצוגת לילה
parag.style = "background-color: azure; color: black;"; // תצוגת יום