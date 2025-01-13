import { useEffect, useState } from "react";

export function SimpleForm(){
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");

    useEffect(()=>{
        console.log(userName);
        console.log(password);
    }, [userName, password]);

    return(
        <form>
            <input onChange={ ({target})=>{setUserName(target.value)}} type="text" placeholder="Enter user name"/>
            <br />
            <input onChange={({target})=>{setPassword(target.value)}} type="password" placeholder="Enter password"/>
            <br />
            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
        </form>
    );
}