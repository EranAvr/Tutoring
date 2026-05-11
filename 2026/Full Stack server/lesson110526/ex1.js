import {readFile} from 'node:fs/promises';

try{
    const data = await readFile("demo.txt", 'utf8');
    console.log(data);
} catch(err){
    console.log(err.message);
}

console.log("End of code")