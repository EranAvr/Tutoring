import { useState } from "react";

export default function MyComp(props){
    const [text, setText] = useState("My Test Component");

    return(
        <>
            <h1>{text}</h1>
            <ul>
                {props.list.map((value) => <li>{value}</li>)}
            </ul>
        </>
    );
}