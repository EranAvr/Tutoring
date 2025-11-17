import { useEffect, useState } from "react";

export default function Button(){
    const [count, setCount] = useState(0);

    function increment(){
        setCount(count + 1);
    }

    function firstMessage(){
        alert("Button loaded!");
    }
    function message(){
        if (count != 0 && count % 2 == 0)
            alert("even number of clicks!");
    }

    useEffect(firstMessage, []);
    useEffect(message, [count]);

    return(<button onClick={increment}> Click! {count} </button>);
}