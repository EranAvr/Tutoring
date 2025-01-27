import { useEffect, useState } from "react";

export default function SimpleComp(){
    const [count, setCount] = useState(0);

    useEffect(() => {
        console.log(count);
    }, [count]);

    const handleKeyDown = (event) => {
        console.log(event);
    }
    useEffect( () => {
        // add event listener to DOM:
        window.addEventListener("keydown",  handleKeyDown);
        
        // return a cleanup-function that removes the event listener:
        return () => {
            window.removeEventListener("keydown", handleKeyDown);
        }
    }, []);

    return(
        <>
            <h3>{count}</h3>
            <button onClick={()=>{setCount(count+1)}}>click me</button>
        </>
    );
}