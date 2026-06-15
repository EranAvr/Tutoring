import fs from 'node:fs/promises';



async function FileLogger(req, res, next){

    //process.cwd();
    await fs.appendFile("./log.txt", ">> " + (new Date()) + " | " + JSON.stringify(req.body) + "\n", "utf-8");

    next();
}

export default FileLogger;