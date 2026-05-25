import {pipeline} from 'node:stream/promises';
import {Transform} from 'node:stream';
import fs from 'node:fs';


//////////////   toUppercase transform   ///////////////
/*
const upperCaseTransform = new Transform({
    transform(chunk, encoding, callback){
        callback(null, chunk.toString().toUpperCase());
    }
});

// שימוש בtry-catch כדי להתמודד עם שגיאות
try{
    // נריץ את צינור הזרמת המידע
    await pipeline(
        fs.createReadStream("demo.txt"),
        upperCaseTransform,
        fs.createWriteStream("DEMO2.txt")
    );
} catch(err){
    console.error(err.message);
    
} finally {
    console.log("Finished!");
}
*/



//////////////  logger transform   ///////////////
/*
const loggerTransform = new Transform({
    transform(chunk, encoding, callback){
        // נשים לב שבעבור המקור שאנו משתמשים
        // גודל chunk הוא 64KB
        console.log(">>", chunk.toString());
        
        callback(null, chunk);
    }
});

try{
    await pipeline(
        fs.createReadStream("demo.txt"),
        loggerTransform,
        fs.createWriteStream("DEMO3.txt")
    );
} catch(err){
    console.error(err.message);
    
} finally {
    console.log("Finished!");
}*/



//////////////  file-logger transform   ///////////////
/*let fileHandle; // הכרזה על משתנה גלובלי

try{

    fileHandle = await fs.promises.open("log.txt", "a");

    const fileLoggerTransform = new Transform({
        transform(chunk, encoding, callback){
            // כתיבת לוג אל קובץ שלישי ונפרד (לא קשור לתהליך הסטרימינג)
            const words = chunk.toString().split("/[\s\n\r]/");
            for(let w of words){
                fileHandle.appendFile((new Date()) +  " | " + w + "\n");
            }
            
            callback(null, chunk);  // הדאטה המקורי מועבר אל קובץ היעד כמו שהוא
        }
    });

    await pipeline(
        fs.createReadStream("demo.txt"),
        fileLoggerTransform,
        fs.createWriteStream("DEMO4.txt")
    );
} catch(err){
    console.error(err.message);
    
} finally {
    console.log("Finished!");
    fileHandle.close()
}*/






const caesarTransform = new Transform({
    transform(chunk, encoding, callback){
        let res = "";
        for(let c of chunk.toString()){
            res += String.fromCharCode( c.charCodeAt(0) + 1 )
        }
        callback(null, res);
    }
});

// שימוש בtry-catch כדי להתמודד עם שגיאות
/*try{
    // נריץ את צינור הזרמת המידע
    await pipeline(
        fs.createReadStream("demo.txt"),
        caesarTransform,
        process.stdout
    );
} catch(err){
    console.error(err.message);
    
} finally {
    console.log("Finished!");
}*/









const decodeCaesarTransform = new Transform({
    transform(chunk, encoding, callback){
        let res = "";
        for(let c of chunk.toString()){
            res += String.fromCharCode( c.charCodeAt(0) - 1 )
        }
        callback(null, res);
    }
});

try{
    // נריץ את צינור הזרמת המידע
    fs.createReadStream("demo.txt")
        .pipe(caesarTransform)
        .pipe(decodeCaesarTransform)
        .pipe(process.stdout);
} catch(err){
    console.error(err.message);
    
} finally {
    console.log("Finished!");
}