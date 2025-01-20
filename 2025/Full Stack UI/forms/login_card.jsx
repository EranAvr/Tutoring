import { useState } from "react";

const styleObj = {
    border: "1px black solid",
    borderRadius: "15px",
    backgroundColor: "lightblue"
}

function LoginCard(){
    const [userName, setUserName] = useState("");
    const [password, setPassword] = useState("");

    const handleLogin = () => {
        console.log("Username: "+userName);
        console.log("Password: "+password);
    }

    return(
        <div style={styleObj}>
            <h3>Login Card</h3>
            <input onChange={ ({target}) => {setUserName(target.value);} } type="text" placeholder="enter username" /> <br />
            <input onChange={ ({target}) => {setPassword(target.value);} } type="password" placeholder="enter password"/> <br />
            <br />
            <button onClick={handleLogin}>login</button>
        </div>
    );
}

export default LoginCard;