import { useState } from "react";

/* 4 operations calculator */
export function SimpleCalculator(){
    const [A, setA] = useState(0);
    const [B, setB] = useState(0);
    const [oper, setOper] = useState("");
    const [res, setRes] = useState("");

    function handleResult(){
        console.log(A, B, oper);

        // because we prevent empty-string as input
        // in the onChange event, we don't really
        // need to check for empty strings in here.
        if (A==="" || B===""){
            setRes("Error: Empty input field");
            return;
        }
        if (oper==="/" && B==0){
            //alert("Error: Division by zero!");
            setRes("Error: Division by zero!");
            return;
        }

        switch (oper){
            case "+":
                setRes(A + B);
                break;
            case "-":
                setRes(A - B);
                break;
            case "*":
                setRes(A * B);
                break;
            case "/":
                setRes(A / B);
                break;
        }
    }

    return(
        <div>
            <section className="input_fields">
                <input value={A} onChange={ ({target})=>{
                    if (target.value==""){
                        setA(0);
                    } else {
                        setA(Number.parseFloat(target.value))
                    }
                    } } type="number" placeholder="Enter first number"/>
                <input value={B} onChange={ ({target})=>{
                    if (target.value==""){
                        setB(0);
                    } else {
                        setB(Number.parseFloat(target.value))
                    }
                    } } type="number" placeholder="Enter second number"/>
            </section>
            <section className="buttons">
                <button onClick={()=>{setOper("+")}}>+</button>
                <button onClick={()=>{setOper("-")}}>-</button>
                <button onClick={()=>{setOper("*")}}>*</button>
                <button onClick={()=>{setOper("/")}}>/</button>
            </section>
            <section className="result">
                <button onClick={handleResult}>=</button>
                <h3>{res}</h3>
            </section>
        </div>
    );
}