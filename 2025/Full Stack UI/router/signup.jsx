import { useState } from "react";

export default function SignUpPage(){
    const [username, setUsername] = useState("")
    const [email, setEmail] = useState("")
    const [name, setName] = useState("")

    return(
        <div>
            <h1>Sign up</h1>
            <input type="text" placeholder="Enter username"/> <br />
            <input type="text" placeholder="Enter email"/> <br />
            <input type="text" placeholder="Enter name"/> <br />
            <div>
                <button>Submit</button>
                <button>Reset</button>
            </div>
        </div>
    )
}