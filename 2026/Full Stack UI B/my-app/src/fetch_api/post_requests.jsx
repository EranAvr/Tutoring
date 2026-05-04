import { useState } from "react";

export function LoginCard(){
    const [userName, setUserName] = useState("");
    const [userPass, setUserPass] = useState("");
    const [res, setRes] = useState("");
    const options = {
        method: "POST",
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
        body: JSON.stringify({username: userName, password: userPass})
    }

    function handleSubmit(e){
        e.preventDefault();

        fetch("https://jsonplaceholder.typicode.com/posts", options)
            .then(response => {
                console.log(response);
                if(response.ok){
                    setRes("Success!");
                } else {
                    switch (response.status) {
                        case 400:
                            setRes("Failed!");
                            break;
                        case 404:
                            setRes("Url could not be found!");
                            break;
                        default:
                            setRes("Other error!");
                            break;
                    }
                }
                return response.json();
            })
            .then(myJson => console.log(myJson))
            .catch(error => console.error(error))
    }

    return(
        <div>
            <form onSubmit={handleSubmit}>
                <h2>Login</h2>
                <input type="text" value={userName} onChange={({target})=>{setUserName(target.value)}} placeholder="Enter username"/> <br />
                <input type="text" value={userPass} onChange={({target})=>{setUserPass(target.value)}} placeholder="Enter password"/> <br />
                <button type="submit">Submit</button>
                <button type="reset">Reset</button>
            </form>
        <div className="response_container">
            {res}
        </div>
        </div>
    );
}