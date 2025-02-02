// נפנה אל התגית ונשמור את הרפרנס אליה במשתנה
const bodyTag = document.getElementById("body_tag");
// נפנה אל המאפיין class
//  וניתן לו שם מחלקה רצוי מתוך קובץ ה-CSS
bodyTag.className = "night_theme";


// תרגיל
/*
    נרצה למצוא את תגיות פריטי הרשימה,
    לעבור עליהן אחת-אחת
    ולהוסיף לכל פריט מס' סידורי
*/
// find tags array-
const listItemsArray = document.getElementsByTagName("li");
// iterate through array-
for (var i=0; i < listItemsArray.length ; i++){
    const element = listItemsArray[i];
    //console.log( element );
    element.innerText = i + " - " + element.innerText;
}



/*  Creating tags from JS - יצירת תגיות חדשות מתוךף קוד JS  */
const container = document.getElementById("container");

const paragraph = document.createElement("p");  // יצירת אלמנט תגית לפי שם
paragraph.innerText = "Dynamic paragraph";  // פנייה אל מאפיינים של התגית החדשה
container.appendChild(paragraph);   // הוספת התגית החדשה בסוף קונטיינר


const newTitle = document.createElement("h1");
newTitle.innerText = "Dynamic Title";
container.appendChild(newTitle);


const image = document.createElement("img");
image.src = "https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?cs=srgb&dl=pexels-anjana-c-169994-674010.jpg&fm=jpg";
image.width = "500";
container.appendChild(image);

console.log( container.innerHTML );



const userCard = document.createElement("div"); // יוצרים תגית מעטפת

const userTitle = document.createElement("h3");
userTitle.innerText = "Username";
userCard.appendChild(userTitle);    // מוסיפים למעטפת כותרת
const userImage = document.createElement("img");
userImage.src = "https://cdn-icons-png.flaticon.com/512/8792/8792047.png";
userCard.appendChild(userImage);    // מוסיפים למעטפת תמונה

bodyTag.appendChild(userCard);  // לוקחים את כל הקונטיינר שיצרנו ומוסיפים אותו לאתר