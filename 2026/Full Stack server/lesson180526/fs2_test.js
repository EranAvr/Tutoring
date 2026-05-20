import fs from 'node:fs/promises';
import {open} from 'node:fs/promises';

let handle; // מומלץ ליצור משתנה גלובלי כדי שיהיה זמין בכל בלוק ובכל הקוד
try {
    handle = await open("handle1.txt", "w");    // פתיחת קובץ בלבד
} catch(err) {
    console.error(err);
} finally{
    handle.close(); // חובה עלינו לסגור קובץ ידנית
}


try {
    const stats = await fs.stat("text.txt");
    console.log(stats);
    console.log(stats.isFIFO());
} catch(err) {
    console.error(err);
}