import { useState } from "react";

export default function SignupCard(){
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [age, setAge] = useState(0);
    const [msg, setMsg] = useState("");

    function resetForm(){
        setUsername("");
        setPassword("");
        setAge(0);
    }

    async function submitForm(){
        const url = "https://jsonplaceholder.typicode.com/posts";
        const options = {
            method: "POST",
            headers: {
                'Content-type': 'application/json; charset=UTF-8'
            },
            body: JSON.stringify(
                {
                    username: username,
                    password: password,
                    age: age
                }
            )
        }

        let response = await fetch(url, options);
        if (response.ok){
            setMsg("Sign up succeeded! :)");
        }
        else{
            console.log(response.status);
            if (response.status >= 400 && response.status < 500){
                setMsg("Client side error occurred");
            }
            else if (response.status >= 500 && response.status < 600){
                setMsg("Server side error occurred");
            }
        }
    }

    return(
        <>
            <div>
                <input value={username} onChange={({target})=>{setUsername(target.value)}} placeholder="Enter username" type="text" /> <br />
                <input value={password} onChange={({target})=>{setPassword(target.value)}} placeholder="Enter password" type="password" /> <br />
                <input value={age} onChange={({target})=>{setAge(target.value)}} placeholder="Enter your age" type="number" /> <br />
                <button onClick={submitForm}>Submit</button>
                <button onClick={resetForm}>Reset</button>
            </div>
            <div>
                {msg}
            </div>
        </>
        
    );
}