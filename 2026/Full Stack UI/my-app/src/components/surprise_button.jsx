import { useEffect, useState } from "react";

export default function SurpriseButton(){

    const [count, setCount] = useState(0);

    function clicked(){
        setCount(count + 1);
    }

    useEffect(
        () => {
            if(count === 10)
                alert("10 million clicks");
        },
        [count]
    );

    return(
        <button onClick={clicked}>click me! {count}</button>
    );
}