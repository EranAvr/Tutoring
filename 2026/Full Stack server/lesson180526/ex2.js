import fs from 'node:fs/promises';

const dirName = "C:\\Users\\eran4\\Documents\\Tel Hai Tutoring\\הנדסאים\\תשפו ב\\Full stack server Node\\lesson180526";
let handle;
try {
    let items = await fs.readdir(dirName);  // לקרוא פריטים בתיקיה
    if (items.indexOf("hello.txt") !== -1){
        handle = await fs.open("hello.txt", "a");
        handle.appendFile("\nWorld!");
    }
} catch (err) {
    console.error(err);
    /*
        הערה חשובה!
        בפועל, לרוב נרצה להדפיס מה-catch
        הודעה מסודרת ותמציתית.
        את תוכן השגיאה מהקוד נכתוב אל תוך קובץ log
    */
} finally {
    handle?.close();
}