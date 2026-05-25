import {pipeline} from 'node:stream/promises';

console.log("Start streaming");

//console.log(process.stdin);
//console.log(process.stdout);

//process.stdin.pipe(process.stdout); // עובד! אבל לא ממתין לשום קלט משתמש ממשי
//await pipeline(process.stdin, process.stdout);




console.log("Finish streaming");