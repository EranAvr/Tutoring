/*
    תוכנית דוגמא לשימוש ב-
    command-line arguments
*/
// arguments: degree rad/deg
//              2       3

if(process.argv.length > 2){
    let numDegree = Number.parseFloat(process.argv[2]);
    if(process.argv[3] == "deg"){ // הזוית במעלות
        numDegree = (numDegree * Math.PI) / 180;
        console.log( Math.sin(numDegree) );
    }
    else {  // הזוית ברדיאנים
        console.log( Math.sin(numDegree) );
    }
}
else {
    console.log("No parameters were given...");
    
}