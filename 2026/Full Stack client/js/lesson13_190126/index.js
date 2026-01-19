const bodyElement = document.body;  // reference to body tag
bodyElement.className = "night";
console.log(bodyElement);

const bChildren = bodyElement.children;
console.log(bChildren);

for(let i=0; i<bChildren.length; i++){
    console.log(bChildren[i].tagName);
}

/*
    פנייה אל תגית פנימית (תמונה)
    ומעבר דרכה אל תגית האב (הקונטיינר)
*/
const imgs = document.images;
console.log(imgs);
const post1 = imgs[0].parentElement;
console.log(post1.id);


/*
    יצירת תגית תמונה חדשה
    והוספה שלה למסמך
*/
const newImage = document.createElement("img");
newImage.src = "https://img.freepik.com/free-photo/closeup-scarlet-macaw-from-side-view-scarlet-macaw-closeup-head_488145-3540.jpg?semt=ais_hybrid&w=740&q=80";
newImage.width = 500;
newImage.alt = "Error! Could not load..."

const gallery = document.getElementById("gallery");
gallery.append(newImage);


/*
    פנייה אל טופס שלדי (ריק)
    ומילוי שלו בתגיות קלט
*/
const myForm = document.forms[0];   // פנייה אל הטופס שלנו

const nameInput = document.createElement("input");  // יצירת תגית קלט
nameInput.type = "text";    // הגדרות
nameInput.placeholder = "Enter your name please";
nameInput.width = 200;
nameInput.style.margin = "20px";

myForm.prepend(nameInput);  // הוספת התגית אל ראש הטופס


const data = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

const selectInput = document.createElement("select");   // יצירת תגית קונטיינר select
selectInput.required = true;    // הגדרות

const optDef = document.createElement("option");    // יצירת תגית אופציה דיפולטיבית
optDef.value = "";  // הגדרות
optDef.innerText = "Choose";
selectInput.append(optDef);

for(let i=0; i<data.length; i++){   // סריקה של מערך הערכים
    const optTag = document.createElement("option");    // יצירת תגית אופציה לכל ערך במערך
    optTag.value = data[i]; // הגדרות
    optTag.innerText = data[i];
    selectInput.append(optTag);
}
//myForm.prepend(selectInput);
nameInput.after(selectInput);   // הוספת "סלקט" לטופס אחרי תגית קיימת



// myForm.removeChild(nameInput);

const newTag = document.createElement("span");
newTag.innerText = "|Placeholder span|";
//myForm.replaceChild(newTag, nameInput); // אם התגית החדשה כבר היתה קיימת בדף - היא עוברת מקום