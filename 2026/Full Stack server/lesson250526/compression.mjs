import fs from 'node:fs';
import {createGzip} from 'node:zlib';
import { pipeline } from 'node:stream/promises';
import { error } from 'node:console';



try {
    await pipeline(
        fs.createReadStream("./sky_wizard.jpg"),
        createGzip(),
        fs.createWriteStream("./sky_wizard.jpg.gz")
    );
} catch (err) {
    console.error(err);
}

console.log("Compressed!");
