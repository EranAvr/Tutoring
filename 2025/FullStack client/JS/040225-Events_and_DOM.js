// ---------------- Counter ---------------------
var count = 0;
function counter(){
    count++;
    //console.log(count);
    document.getElementById("count_value").innerText = count;
}
const countBtn = document.getElementById("count_click");
countBtn.addEventListener("click", counter);


// ---------------- Color Theme ---------------------
var theme = "night";
function changeTheme(){
    if (theme == "day"){
        document.getElementById("body_tag").className = "day_theme";
        theme = "night";
    } else {
        document.getElementById("body_tag").className = "night_theme";
        theme = "day";
    }
    document.getElementById("next_theme").innerText = theme;
}
const changer = document.getElementById("themeChanger");
changer.addEventListener("click", changeTheme);


// ---------------- Mouse Movement ---------------------
const myBox = document.getElementById("boxy");
function mouseEntered(){
    console.log("mouse in box");
    myBox.style.backgroundColor = "rgb(127, 255, 168)";
    myBox.style.fontWeight = "bolder";
    myBox.innerText = "Hovered";
}
function mouseLeft(){
    console.log("mouse out of the box");
    myBox.style.backgroundColor = "white";
    myBox.innerText = "Not hovered";
    myBox.style.fontWeight = "normal";
}

myBox.addEventListener("mouseenter", mouseEntered);
myBox.addEventListener("mouseleave", mouseLeft);


// ---------------- Keyboard Pressing ---------------------
const keysBox = document.getElementById("keys_box");
function detectPress(event){
    console.log(event);
    if (event.code === "Enter"){    // זיהינו לחיצה על מקש אנטר
        keysBox.style.backgroundColor = "red";
    }
    if (event.code === "Escape"){   // זיהינו לחיצה על מקש אסקייפ
        keysBox.style.backgroundColor = "";
    }
}
window.addEventListener("keydown", detectPress);



// ---------------- Comments Wall ---------------------

const addButton = document.getElementById("add_btn");
function addNewComment(){
    var comm = document.getElementById("user_input").value; // קוראים ערך מתוך שדה-קלט
    console.log(comm);

    document.getElementById("comments_container").innerHTML += "<div class='comment'>" + comm + "</div>";    // הוספת טקסט חדש אל תוכן הקונטיינר
    document.getElementById("user_input").value = "";   // מאפסים את שדה הקלט כדי לרוקן אותו
    document.getElementById("user_input").focus();
}
addButton.addEventListener("click", addNewComment);