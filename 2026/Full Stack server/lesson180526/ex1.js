import {open} from 'node:fs/promises';


let handle;
try {
    handle = await open("animals.txt", "w");

    await handle.appendFile("Lion\n");
    await handle.appendFile("Elephant\n");
    await handle.appendFile("Giraffe\n");
} catch (err) {
    console.error(err);
} finally {
    handle?.close();
}