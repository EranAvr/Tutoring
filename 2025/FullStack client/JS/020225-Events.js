/*   Events   */
// first way-
function blabla(){
    console.log("blabla() function called");
}
function raiseAlert(){
    alert("Hello button clicker");
}

// second way
/*
    פנינו אל תגית, ודרכה אל המאפיינים שלה
    ניתן לפנות אל אירוע ככל שאר המאפיינים.
    מאפיין-אירוע מצפה לקבל שם של פונקציה להפעלה.

    יתרונות:
    1. הפרדה וריכוזיות בקוד. נוח לרכז ככה את כל פקודות
    ההשמה של האירועים במקום אחד
    2. אפשר לפנות אל אירוע ולשנות אותו תו"כ הקוד
    כפתור יכול לבצע פעולה אחת בהתחלה, ולבצע פעולה
    אחרת בשלב מאוחר יותר
    חסרון:
    לא ניתן להעביר פרמטרים אל הפונקציה,
    וגם לא לקבל ממנה ערך החזרה
*/
const button1 = document.getElementById("btn1");
button1.onclick = blabla;
const button2 = document.getElementById("btn2");
button2.onclick = raiseAlert;

// third way-
/*
    זוהי הדרך העדיפה ביותר!
    אנו פונים אל רישום האירועים של ה-DOM
    ומעדכנים אותו באירוע חדש.
    יתרון:
    1. בדרך זו, נוכל גם להעביר פרמטרים אל הפנקציות
    2. היתרון הגדול של דרך זו הוא שניתן גם
     להסיר אירועים שכבר יצרנו
*/
const button3 = document.getElementById("btn3");
button3.addEventListener("click", blabla);
const button4 = document.getElementById("btn4");
button4.addEventListener("click", raiseAlert);




// --------- Counter button -------
/*
    1. ניצור קישור אל התגית ונוסיף אירוע לחיצה
    2. ניצור משתנה בזיכרון,
    וניתן לפונקציה להגדיל אותו בכל לחיצה
    3. נדפיס את התוצאה אל חלון ה-console
    4. ניצור תגית טקסט באתר, ונכתוב אליה את הערך של count
    חשוב לבצע כתיבה מחדש אל תוכן התגית בכל לחיצה על הכפתור,
    כדי שהתוכן יתעדכן בהתאם ובזמן אמת.
*/
var count = 0;
function makeCount(){
    count++;
    console.log(count);
    document.getElementById("present_count").innerText = count;
}
const counterButton = document.getElementById("count_btn");
counterButton.addEventListener("click", makeCount);



const square = document.getElementById("square");
function paintRed(){
    square.style = "width: 200px; height: 200px; border: 1px solid black; background-color: red;";
}
function paintGreen(){
    square.style = "width: 200px; height: 200px; border: 1px solid black; background-color: green;";
}
square.addEventListener("mouseenter", paintRed);
square.addEventListener("mouseleave", paintGreen);