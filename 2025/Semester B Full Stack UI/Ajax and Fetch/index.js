
const xhttp = new XMLHttpRequest();

const simpleCallback = () => {
    // locate container-
    const myDiv = document.getElementById("simple");
    // get and parse response-
    const array = JSON.parse(xhttp.response);   // xhttp.response returns array as ArrayBuffer object
    // add dynamic content-
    array.forEach(
        obj => {
            myDiv.innerHTML += `<span>${obj.id}: ${obj.title} </span><br>`;
        }
    );
    alert("OK");
}
xhttp.onload = simpleCallback;

xhttp.open("GET", "https://my-json-server.typicode.com/typicode/demo/posts");
xhttp.send();