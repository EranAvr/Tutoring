console.log(window);

console.log(document);

function raiseAlert(){
    alert("Hello World!");
}


const greeting = "Hello User!";

function greetingUser(){
    alert(greeting);
}

function clickP(){
    alert("Paragraph clicked");
}

// Changing image address:
// אנו משתמשים בפונ' המובנית-
// document.getElementById
// על מנת לאתר ולגשת אל תגית html במסמך
// ברגע שאיתרנו אותה, ניתן לגשת אל המאפיינים שלה
// ולשנות אותם כרצוננו
function clickImg(){
    //console.log( document.getElementById("img1") );
    document.getElementById("img1").src = "https://i0.wp.com/picjumbo.com/wp-content/uploads/beautiful-fall-waterfall-free-image.jpeg?w=600&quality=80";
}

function readTitleText(){
    var text = document.getElementById("reading_title").innerText;
    console.log(text);
    
}

function changeTitleTag(){
    // getElementsByTagName מחזיר לנו מערך של תגיות
    // לכן ניתן לפנות לאינדקס הרצוי על אותו מערך
    const titleTag = document.getElementsByTagName("title")[0];
    titleTag.innerText = "New Tab title !!";
}