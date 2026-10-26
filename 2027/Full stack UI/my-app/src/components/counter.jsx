import { useState } from "react";

export default function Counter(){
    // בגוף הפונ' נכניס קוד JS
    const [count, setCount] = useState(0);


    // בפקודת החזרה נכניס קוד html
    return(
        <>
            <span> {count} </span>
            <button onClick={ ()=>{setCount(count+1)} }>+</button>
        </>
    );
}