// BAD PRACTICE
var manu1 = "Saab";
var manu2 = "Volvo";
var manu3 = "BMW";

/* Arrays */
// 1. מבנה המכיל תאי אחסון רבים תחת שם משתנה יחיד
// 2. פנייה אל התאים נעשית בקלות ע"י אינדקס מספרי
// 3. האופרטור [ ] מאפשר לנו פנייה ישירה אל כל תא ותא, בעזרת האינדקס שלו
// 4. מערכים הם גמישים! אפשר בכל שלב בקוד להוסיף להם ערכים, או להוריד
// 5. חשוב! מערכים שומרים על הסדר היחסי בין האיברים

// GOOD PRACTICE:
// אנו משתמשים באופרטור [ ] ליצירת מערך חדש
// בתוך ה [ ] נרשום את הערכים שישמרו במערך
// למעשה, יצרנו רשימה של הרבה ערכים כשהפנייה אליה
// נעשית ע"י שם אחד ויחיד - carsArray
var carsArray = ["Saab", "Volvo", "BMW"];
carsArray[1];   // זה יחזיר לנו את האיבר השני Volvo


// ניתן לחלופין ליצור מערך ריק, ולמלא אותו בערכים
// בשורות הבאות אחריו.
var otherCars = []
// פנייה אל תא מסויים במערך, נעשית בעזרת אופרטור [ ] וציון
// המספר הסידורי (אינדקס)
otherCars[0] = "Mazda";
otherCars[1] = "Toyota";
otherCars[2] = "Mitsubishi";

// האופרטור [ ] משמש גם לקריאת ערך מתוך המערך
// גם כאן, נשתמש במספר הסידורי (אינדקס) כדי לציין
// איזה איבר נרצה לקרוא
console.log(otherCars[0]);  // קריאה של תא ראשון
console.log(otherCars[2]);  // קריאה של תא שלישי
console.log(otherCars.length);  // קריאה של אורך המערך (כמות האיברים)
console.log(otherCars[ otherCars.length-1 ]);   // פנייה אל תא אחרון כתלות במאפיין length

// Print an entire Array to console.log
console.log(otherCars);




// Array built-in methods (functions)
var cities = ["Tel Aviv"];
cities[1] = "Jerusalem";
// push() - הוספת ערך חדש אל סוף המערך
cities.push("Ashdod");
cities.push("Haifa");
console.log(cities);
// pop() - הורדת הערך האחרון במערך (והחזרה שלו)
cities.pop();
console.log(cities);

var x = cities.pop();
console.log("x = "+x);
console.log(cities);    // cities = ["Tel Aviv", "Jerusalem"]

// Add item to a non-exsisting cell
cities[5] = "Kfar Yuval";
console.log(cities);





// Traversing - סריקת המערך
var names = ["Dani", "Bob", "James", "Jenni", "Arthur", "Bobby"];
// traversing with While-loop
var i = 0;
while(i < names.length){
    console.log(names[i]);
    
    i++;
}
// traversing with For-loop
for (var i=0; i < names.length; i++){
    console.log(names[i]);
}

