import { useState } from "react";

export default function Login(){
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");

    function checkUserDetails(){
        /*
            Contact the server, to validate user info..
        */
        //console.log(userName + " " + password);
        sessionStorage.setItem("username", userName);
        sessionStorage.setItem("pass", password);
        sessionStorage.setItem("type", "admin");
    }

    return(
        <div className="login_card">
            <h1></h1>
            <div>
                <label htmlFor="">User name: </label>
                <input type="text" onChange={({target}) => setUserName(target.value)}/>
            </div>
            <div>
                <label htmlFor="">Password</label>
                <input type="text"  onChange={({target}) => setPassword(target.value)}/>
            </div>
            <div>
                <button onClick={checkUserDetails}>submit</button>
            </div>
            
        </div>
    );
}