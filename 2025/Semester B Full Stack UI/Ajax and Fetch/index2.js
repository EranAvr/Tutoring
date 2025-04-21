const student = {
    name: "Jamie",
    id: "123456"
}

student.age = 20;
console.log(student.name);
console.log(student);


let myJson = '{"id": 1, "text": "some post of user"}';
console.log(myJson);

let myParsed = JSON.parse(myJson);
console.log(myParsed);

let backToString = JSON.stringify(myParsed);
console.log(backToString);

function makeGetReq(){
    /*let response = fetch('https://jsonplaceholder.typicode.com/todos/');
    console.log(response);*/
    fetch('https://jsonplaceholder.typicode.com/todos/')
        .then(response => response.json())
        .then(jsonArr => jsonArr[0])
        .then(jsonObj => {
            let element = document.getElementById('get_todo_1');
            element.innerHTML += `<li> ${jsonObj.title} - ${jsonObj.completed}</li>`;
            console.log(jsonObj)
        });
    
}

function makeSpecificGetReq(){
    fetch('https://jsonplaceholder.typicode.com/posts/1')
        .then(response => response.json())
        .then(jsonObj => {
            let element = document.getElementById('get_post_1');
            element.innerHTML += `<span> userId: ${jsonObj['userId']}</span><br>`;
            element.innerHTML += `<span> Id: ${jsonObj['id']}</span><br>`;
            element.innerHTML += `<span> Title: ${jsonObj['title']}</span><br>`;
            element.innerHTML += `<span> Text: ${jsonObj['body']}</span><br>`;
        });

}

function makeImageGetReq(){
    fetch('https://cdn.pixabay.com/photo/2024/05/26/10/15/bird-8788491_1280.jpg')
        .then(response => response.blob())
        .then(myBlob => {
            const myUrl = URL.createObjectURL(myBlob);
            document.getElementById('get_image').src = myUrl;
        });
}


function makeGetReqWithError(){
    fetch('https://jsonplaceholder.typicode.com/todoss/')
        .then(response => response.json())
        .then(jsonArr => console.log(jsonArr))
        .catch(err => {
            console.log(err);
            let element = document.getElementById('present_error');
            element.innerHTML = `<span> Action failed! </span>`;
        });
}

function makeDedicatedError(){
    fetch('https://jsonplaceholder.typicode.com/todoss/')
        .then(response => {
            if(!response.ok){

                if (response.status >= 400 && response.status < 500) {
                    throw new Error("Client error");
                }
                else if (response.status >= 500) {
                    throw new Error("Server error");
                }
                else {
                    throw new Error("General error");
                }
            }

            return response.json()
        })
        .then(jsonArr => console.log(jsonArr))
        .catch(err => {
            let element = document.getElementById('dedicated_error');
            element.innerHTML = `<span> Action failed! ${err.message} </span>`;
        });
    
}



async function makeImageGetReqAsyncAwait(){
    let response = await fetch('https://cdn.pixabay.com/photo/2024/05/26/10/15/bird-8788491_1280.jpg')
    let myBlob = await response.blob();

    const myUrl = URL.createObjectURL(myBlob);
    document.getElementById('get_image_2').src = myUrl;
}

async function makeDedicatedErrorAsyncAwait(){
    
    try{
        let response = await fetch('https://jsonplaceholder.typicode.com/todoss/')

        if (!response.ok){
            if (response.status >= 400 && response.status < 500) {
                throw new Error("Client error " + response.status);
            }
            else if (response.status >= 500) {
                throw new Error("Server error " + response.status);
            }
            else {
                throw new Error("General error");
            }
        }

        let jsonArr = await response.json();
        console.log(jsonArr);
    } catch (err) {
        let element = document.getElementById('dedicated_error2');
        element.innerHTML = `<span> ${err.message} </span>`;
    }
}