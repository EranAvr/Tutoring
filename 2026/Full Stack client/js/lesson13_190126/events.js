/*
    הפניה אל תגית ממסמך ה-html
    והתאמה של פונ' לאירוע לחיצה עליה
*/
const btnAlert = document.getElementById("btn_alert");
btnAlert.addEventListener("click", function(){alert("Button was clicked")});


const btnDiv = document.getElementById("btn_div");
btnDiv.addEventListener("click", function(){alert("Div was clicked")});

let time = null;
const btnContext = document.getElementById("btn_context");
btnContext.addEventListener("contextmenu", function(e){
    e.preventDefault();
    /*console.log(e);
    alert("Right click was clicked");*/
    if(time && e.timeStamp - time > 3000)
        alert("More than 3 seconds");

    time = e.timeStamp;
});