

function makePostReq(){
    const demoPost = {
        userId: 1,
        id: 1,
        title: "New title",
        body: "Post text\nSome long text..."
      }

    const url = "https://jsonplaceholder.typicode.com/posts";
    const options = {
        method: "POST",
        headers: {
            'Content-type': 'application/json; charset=UTF-8'
        },
        body: JSON.stringify(demoPost)
    }

    fetch(url, options)
        .then(response => {
            console.log(response);
            if (response.ok){
                document.getElementById('response1').innerText = "Posting succeeded"
            }
        })
}


async function makePostReqWithError(){
    const url = "https://jsonplaceholder.typicode.com/posts";
    const options = {
        method: "POST",
        headers: {
            'Content-type': 'application/json; charset=UTF-8'
        },
        body: "text"
    }

    try {
        let response = await fetch(url, options);
        console.log(response);

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

        document.getElementById('response2').innerText = "Posting succeeded"
    } catch(err) {
        document.getElementById('response2').innerText = "Error: " + err.message;
    }
}