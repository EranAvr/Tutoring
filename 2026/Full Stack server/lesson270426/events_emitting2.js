const { log } = require('console');
const EventEmitter = require('events');
// אובייקט מנהל אירועים
const ee = new EventEmitter();

// הגדרת אירוע 'start' ושיוך פונ' תגובה
ee.on('greet', (name)=>{console.log(`Hello ${name}!`)});
// הפעלת התגובות לאירוע start
ee.emit('greet', "Bobby");
ee.emit('greet', "Bobby");


// מאזין חד פעמי
ee.once('single', ()=>{console.log("This will happen only once!")});
ee.emit('single');
ee.emit('single');  // שורה זו לא תפעיל דבר
