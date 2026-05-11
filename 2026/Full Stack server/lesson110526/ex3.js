import {writeFile} from 'node:fs/promises';

const url = "https://jsonplaceholder.typicode.com/users";

try{
    const response = await fetch(url);
    const data = await response.json();

    const jsonData = JSON.stringify(data);
    await writeFile("downloaded.json", jsonData, "utf8");
} catch(err){
    console.error(err)
}
