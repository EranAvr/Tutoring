// Loops:

// While:
var counter = 1;    // תנאי התחלה
while (counter <= 5){   // בדיקה
    console.log("While loop: "+counter);
    
    counter++;  // קידום
}

// For:
for (var count = 1; count <= 5; count++){
    console.log("For loop: "+count);
}


// For with jumps:
for (var count = 1; count <= 50; count+=5){
    console.log("Jumping For loop: "+count);
}


// Functions:
// היכולת לתת שם לקטע קוד
// אם יש לו שם, אז אפשר לפנות אליו ולהפעיל אותו

var number = Math.floor(3.14);

function myFloor(param){
    var floory = Math.floor(param);
    return floory;
}

var number2 = myFloor(3.14);

console.log("number = "+number);
console.log("number2 = "+number2);

var number3 = myFloor(2.17);
console.log("number3 = "+number3);


// Arrays:
var shoppingList = [];
// adding items (בסוף המערך):
shoppingList.push("Sugar"); // ["Sugar"]
shoppingList.push("Salt"); // ["Sugar", "Salt"]
shoppingList.push("Carrots"); // ["Sugar", "Salt", "Carrots"]
shoppingList.push("Beers"); // ["Sugar", "Salt", "Carrots", "Beers"]
// take items out (מסוף המערך):
console.log(shoppingList.pop());    // ["Sugar", "Salt", "Carrots"]
var last = shoppingList.pop(); // last="Carrots", ["Sugar", "Salt"]

var names = ["Dave", "Benny", "Arthur", "Sam", "Jennifer"];
//              0       1         2       3         4

// איברים במערכים ממוספרים לפי מספר-סידורי
// הספירה תמיד תתחיל ב-0 לאיבר הראשון
// לכן המספר של האיבר האחרון שווה לאורך המערך פחות 1
// מספר סידורי של איבר נקרא אינדקס
console.log(names.length);
// האופרטור נקודה '.' מאפשר פנייה אל המאפיינים והפונ' של המערך
// הדבר נכון גם לפונ' פנימיות וגם למאפיינים (כמו אורך)
console.log("names[2] = "+names[2]);  // סוגריים מרובעים מאפשרים פנייה אל איבר לפי המקום הסידורי שלו (אינדקס)
console.log("names[3] = "+names[3]);

names[2] = "Bob";   // סוגריים מרובעים משמשים גם לכתיבה, והחלפה של ערך קיים
console.log("names[2] = "+names[2]);  // ["Dave", "Benny", "Bob", "Sam", "Jennifer"]

console.log(names[0]);
console.log(names[1]);
console.log(names[2]);
console.log(names[3]);
console.log(names[4]);

for(var count=0; count<names.length; count++){
    console.log("names from loop: " + names[count]);    // קריאה
    //names[count] = "new value"; // כתיבה
}

// For-Of:
// for-of היא לולאה שרצה ישירות על ערכים במערך
// המשתנה item יקבל כל פעם איבר בודד מהמערך,
// על פי הסדר שבו הם שמורים
// הלולאה תרוץ אוטומטית על כל האיברים מהראשון עד האחרון
for(var item of names){
    console.log("for-of item: "+item);
}
// חסרונות:
// 1. הלולאה היא לקריאה בלבד! אי אפשר לבצע כתיבה
//      אי אפשר לכתוב ערך חדש אל תוך המערך
// 2. לא ניתן לבחור טווח אינדקסים ספציפי
//      הלולאה תרוץ אוטומטית מההתחלה ועד הסוף
// 3. אי אפשר לשנות את כיוון הריצה
//      הלולאה תרוץ מאיבר ראשון ומעלה אל האחרון

// For-In:
// זהה לחלוטין ללולאה הקודמת for-of
for(var item in names){
    console.log("for-of item: "+item);
}