import fs from 'node:fs/promises';

const dirName = "C:\\Users\\eran4\\Documents\\Tel Hai Tutoring\\הנדסאים\\קורסים\\FullStack server NodeJS";
let handle;
try {
    let files = [];
    let dirs = [];
    let items = await fs.readdir(dirName);
    items.forEach(async item => {
        
        let stats = await fs.stat(dirName+"\\"+item);
        console.log(stats);
        if (stats.isDirectory())
            dirs.push(item);
        else
            files.push(item);
    });
    console.log("files:", files);
    console.log("directories:", dirs);
    
} catch (err) {
    console.error(err);
} finally {
    handle?.close();
}
