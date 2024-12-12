// GET
const GET_RESOURCE_1 = "https://www.anapioficeandfire.com/api/houses";
const GET_RESOURCE_2 = "https://pixlr.com/images/index/ai-image-generator-one.webp";

fetch(GET_RESOURCE_1)
    .then((response) => response.json())
    .then((data) => {
        console.log(Array.isArray(data));
    })
    .catch((er) => console.error(er));

async function dynamicGetRequestForJSON() {
    let response = await fetch(GET_RESOURCE_1);
    let myJson = await response.json();

    for (const obj of myJson) {
        let container = document.createElement("div");
        container.innerText = obj["name"];
        document.getElementById("get_res_1").appendChild(container);
    }
}

async function dynamicGetRequestForBinary() {
    // blob = Binary Large Object

    let response = await fetch(GET_RESOURCE_2);
    let myBlob = await response.blob();

    let image = document.createElement("img");
    let url = URL.createObjectURL(myBlob);
    image.src = url;
    document.getElementById("get_res_2").appendChild(image);
}

// POST:
const POST_RESOURCE_1 = "https://jsonplaceholder.typicode.com/posts";

async function makePostRequest() {
    let userDetailsObj = {
        fname: document.getElementById("fName").value,
        lname: document.getElementById("lName").value,
    };
    let response = await fetch(POST_RESOURCE_1, {
        method: "POST",
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
        body: JSON.stringify(userDetailsObj),
    });
    let jsonData = await response.json();

    document.getElementById("post_res_1").innerText = JSON.stringify(jsonData);
}
