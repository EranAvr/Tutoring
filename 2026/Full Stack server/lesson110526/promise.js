
const url = "https://jsonplaceholder.typicode.com/users";
const result = fetch(url);
console.log(result);

result
    .then((value)=>value.json())
    .then(data => console.log(data)
    )
    .catch((err)=>{
        console.error(err);
    } );


console.log("End of code");
