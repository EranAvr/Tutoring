import {writeFile} from 'node:fs/promises';

try{
    await writeFile("myFile.txt", "Testing writing into file", "utf8");
} catch(err){
    console.log(err.message);
}

console.log("End of code")