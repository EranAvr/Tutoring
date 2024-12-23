import { useState } from "react";

function MyButton(props){

    // component inner state-
    const [count, setCount] = useState(0);

    function increment(){
        setCount(count + 1);
    }

    return(
        <button onClick={increment}> {props.btnText} count is {count} </button>
    );

}

export default MyButton;