import {pipeline} from 'node:stream/promises';
import fs from 'node:fs'

// reading from file and print to terminal
//await pipeline(fs.createReadStream('demo.txt'), process.stdout);

// reading from terminal and print to file
await pipeline(process.stdin, fs.createWriteStream("out.txt"));


async function readValue() {
    
}

console.log("Finished!");
