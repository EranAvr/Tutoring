const url = "https://jsonplaceholder.typicode.com/users";

/*async function getData(){
    const response = await fetch(url);
    const data = await response.json();
    console.log(data);
}
getData();*/

// קוד לחילוץ מידע ללא מענה לשגיאות Error
const response = await fetch(url);
console.log(response.status);
if(response.status == 200){
    const data = await response.json();
    console.log(data);
} else{
    console.error("Http error");
}


// קוד לחילוץ מידע עם מענה לשגיאות Error
try{
    const response = await fetch(url);
    console.log(response.status);
    if(response.status == 200){
        const data = await response.json();
        console.log(data);
    } else{
        console.error("Http error");
    }
} catch(err){
    console.error(err)
}
