// מדמה תוכנית ראשית שבה נייבא קוד ממודול אחר

import { DB_NAME, MAIN_FOLDER/*, NON_EXPORTED*/ } from "./export_constants.mjs";
console.log(DB_NAME);
//console.log(NON_EXPORTED);    // תקלה


import { greet } from "./export_functions.mjs";
import func from "./export_functions.mjs";
greet("Joe");

greet(func("Chandler"));


import ClassForMongo from "./export_classes.mjs";

const obj = new ClassForMongo();