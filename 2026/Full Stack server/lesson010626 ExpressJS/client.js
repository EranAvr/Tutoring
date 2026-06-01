fetch("http://localhost:3000/")
    .then(
        (res) => res.text()
    )
    .then(
        (text) => {
            console.log("Text from client:", text);
            
        }
    )
    .catch(
        (err)=>console.error(err)
    );