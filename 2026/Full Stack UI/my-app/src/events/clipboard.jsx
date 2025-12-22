import { useState } from "react";

export function CopiedImage(){

    const [source, setSource] = useState("https://img.freepik.com/free-photo/closeup-shot-beautiful-butterfly-with-interesting-textures-orange-petaled-flower_181624-7640.jpg?semt=ais_hybrid&w=740&q=80");

    const copyHandler = (e) => {
        console.log(e.clipboardData);
        e.clipboardData.setData("text/plain", source);
        e.preventDefault();
    }
    const pasteHandler = (e) => {
        let url = e.clipboardData.getData("text/plain");
        setSource(url);
        e.preventDefault();
    }

    return(
        <img onPaste={pasteHandler} onCopy={copyHandler} src={source} alt="" style={{border: "5px dashed black"}} />
    );
}