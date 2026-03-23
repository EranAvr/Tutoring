import { useState } from "react";

export default function MyForm(){
    const [name, setName] = useState("");

    function handleSubmit(e){
        e.preventDefault();
        // נעשה כל מה שנרצה...
        alert(name);
        setName("");
    }

    return(
        <form onSubmit={handleSubmit}>
            <h2>My form</h2>
            <input value={name} onChange={({target})=>{setName(target.value)}} type="text" placeholder="Enter your name"/>
            <br />
            <button type="submit">Submit</button>
        </form>
    );
}