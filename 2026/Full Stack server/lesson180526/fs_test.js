/*import fs from 'node:fs/promises'
console.log(fs);
fs.readFile()*/


import { readFile, writeFile, appendFile } from 'node:fs/promises';
try{
    let content = await readFile("text.txt", "utf8");
    console.log(content);
} catch(err) {
    console.error( err );
}

try{
    await writeFile("demo.txt", "This is a demo file\nFor testing 'fs' module", "utf8");
} catch(err) {
    console.error( err );
}


try{
    await writeFile("writeTest.txt", "This is a demo file\nFor testing 'fs' module", "utf8");
    await writeFile("writeTest.txt", "Second write", "utf8");
} catch(err) {
    console.error( err );
}

try{
    await appendFile("appendTest.txt", "Firs appending", "utf8");
    await appendFile("appendTest.txt", "Second appending", "utf8");
} catch(err) {
    console.error( err );
}



import fs from 'node:fs/promises';
try{
    await fs.rm("demo.txt");
    console.log("The deed is done");
    
} catch(err){
    console.error(err);
}



console.log("End of program..");
