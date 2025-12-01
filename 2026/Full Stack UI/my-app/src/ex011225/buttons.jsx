import { useState } from "react";

export function Counter(){

    const [count, setCount] = useState(0);

    /*function increment(){
        setCount(count + 1);
    }*/

    return(
        <button onClick={() => {setCount(count + 1)}}>click {count}</button>
    );
}

export function BiDiCounter(){

    const [count, setCount] = useState(0);

    function decrement(){
        if(count > 0)
            setCount(count - 1);
    }
    function increment(){
        setCount(count + 1);
    }

    return(
        <span>
            <button onClick={decrement}>-</button>
            <b> {count} </b>
            <button onClick={increment}>+</button>
        </span>
    );
}


export function EmptyButton(props){

    return(
        <button onClick={props.action}>
            {props.text}
        </button>
    );
}


export function MySlider(){

    const [val, setVal] = useState(null);
    const [volume, setVolume] = useState("mid");

    function handleChange(ev) {
        console.log(ev.target.value);
        setVal(ev.target.value);
        if (ev.target.value == ev.target.min)
            setVolume("mute")
        if (ev.target.value == ev.target.max)
            setVolume("loud")
    }

    return(
        <span>
            {volume}
            <input 
                type="range"
                min={10}
                max={90}
                onChange={handleChange} />
        </span>
        
    );
}
