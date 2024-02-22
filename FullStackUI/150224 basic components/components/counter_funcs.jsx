import { useEffect, useState } from "react";

export function Counter(){
    const [count, setCount] = useState(0);

    function add(){
        setCount(count+1);
    }

    return(
        <div>
            <h6>Just Counter</h6>
            <button onClick={add}>click me</button> 
            <span> {count} </span>
        </div>
    );
 }

export function BiDiCounter(){
    const [count, setCount] = useState(0);

    const add = () => {
        setCount(count+1);
    }
    const subtract = () => {
        setCount(count-1);
    }

    return(
        <div>
            <h6>BiDi Counter</h6>
            <button onClick={add}>+</button>
            <button onClick={subtract}>-</button>
            <span> {count} </span>
        </div>
    );
 }

 export function SmarterBiDiCounter(){
    const [count, setCount] = useState(0);

    const changeCount = (num) => {
        setCount(count+num);
    }

    return(
        <div>
            <h6>Smarter Counter</h6>
            <button onClick={() => changeCount(1)}>+</button>
            <button onClick={() => changeCount(-1)}>-</button>
            <span> {count} </span>
        </div>
    );
 }

 export function SuperCounter(){
    const [count, setCount] = useState(0);

    return(
        <div>
            <h6>Super Counter</h6>
            <button onClick={() => setCount(count+1)}>+</button>
            <button onClick={() => setCount(count-1)}>-</button>
            <span> {count} </span>
        </div>
    );
 }

 export function CounterWithEffect(){
    const [count, setCount] = useState(0);

    // Run only in first loading
    useEffect(
        () => console.log("Only once!")
        , []
        );

    // Run in every re-rendering
    useEffect(() => console.log("render"));

    // Run, but with condition
    useEffect(() => {
        if (count % 5 === 0)
            console.log(count + " divided by 5")
    });

    return(
        <div>
            <h6>Counter With Effect</h6>
            <button onClick={() => setCount(count+1)}>+</button>
            <span> {count} </span>
        </div>
    );
 }

 export function CompWithProps(props){

    useEffect(props.func);

    return(
        <div>
            <h1> {props.name} </h1>
        </div>
    );
 }

 export function UpdaterButton(props){

    return(
        <div>
            <button onClick={props.add}>click me</button> 
        </div>
    );
 }

 export function UpdatedComp(){

    const [count, setCount] = useState(0);

    function add(){
        setCount(count+1);
    }

    return(
        <div>
            <h6>Just Counter</h6>
            <UpdaterButton add={add}/>
            <span> {count} </span>
        </div>
    );
 }
