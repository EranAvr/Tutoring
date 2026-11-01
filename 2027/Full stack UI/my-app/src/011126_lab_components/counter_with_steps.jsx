import { useState } from "react";

export default function CounterWithSteps(props){

    const [count, setCount] = useState(0);

    return(
        <>
            <span>{count}</span>
            <button onClick={()=>{setCount(count+props.step)}}>+</button>
        </>
        
    );
}