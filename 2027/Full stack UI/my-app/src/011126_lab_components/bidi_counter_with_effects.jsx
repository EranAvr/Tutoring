import { useState, useEffect } from "react";

export default function BidiCounter(){
    /* State business */
    const [count, setCount] = useState(0);

    function decrement(){
        if (count > 0)
            setCount(count - 1);
    }

    /* Effects */
    useEffect(() => {alert("Init Effect was affected")}, []);
    useEffect(() => {alert("'Count' Effect was affected")}, [count]);
    useEffect(() => {
        if (count>10) 
            alert("Large count")
        }, [count]);

    return(
        <>
            <button onClick={decrement}>-</button>
            <span>{count}</span>
            <button onClick={() => {setCount(count+1)}}>+</button>
        </>
    );
}