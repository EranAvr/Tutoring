// Constants:
const RES1 = "https://www.anapioficeandfire.com/api/books";

// Get:

fetch(RES1).then( (response) => response.json() )
    .then( (jsonData) => {
    for(const obj of jsonData){
        console.log(obj);
    }
    })
    .catch((er) => console.error(er));

// init once:
document.getElementById('input_field').value = RES1;

async function dynamicGetRequest(){
    const requestURL = document.getElementById('input_field').value;
    let response = await fetch(requestURL);
    let myJson = await response.json();

    document.getElementById("present_info").innerHTML = ""; // clean results div
    for(const obj of myJson){
        let listItem = document.createElement("li");
        listItem.innerText = obj["name"];
        document.getElementById("present_info").appendChild(listItem);
    }
}