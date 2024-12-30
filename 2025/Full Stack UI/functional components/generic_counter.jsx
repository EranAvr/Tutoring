import { useState } from "react";

function GenericCounter(props){
    const [count, setCount] = useState(0);
    const [num, setNum] = useState(props.num ? props.num : 1);

    function addNum(){
        setCount(count + num);
    }

    return(
        <>
            <h3>Counter adds {num}</h3>
            <button onClick={addNum}>Count: {count}</button>
        </>
    );
}

export default GenericCounter;