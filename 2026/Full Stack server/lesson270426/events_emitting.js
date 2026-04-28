const { log } = require('console');
const EventEmitter = require('events');
// אובייקט מנהל אירועים
const ee = new EventEmitter();

// הגדרת אירוע 'start' ושיוך פונ' תגובה
ee.on('start', ()=>{console.log("Program start")});
// הפעלת התגובות לאירוע start
ee.emit('start');

console.log("Program running");
