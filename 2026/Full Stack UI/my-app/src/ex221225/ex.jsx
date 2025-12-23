import { useEffect, useState } from "react";

export function Shortcut1(){

    const handleKeyDown = (e) => {
        //console.log(e);
        if (e.ctrlKey && e.code == "KeyZ")
            alert("Ctrl + Z was pressed!");
    }

    useEffect(()=>{
        document.addEventListener('keydown', handleKeyDown);

        return ()=>{
            document.removeEventListener('keydown', handleKeyDown);
        }
    }, [handleKeyDown]);

    return(
        <h1>Short cut 1</h1>
    );
}

export function Shortcut2(){

    const [pressed, setPressed] = useState(false);
    const [timing, setTiming] = useState(null);

    const handleKeyDown = (e) => {
        //console.log(e);
        if (e.code == "Space"){
            setPressed(true);
            setTiming(e.timeStamp);
        }
        if (pressed && e.code == "KeyD" && timing < e.timeStamp)
            alert("Space + D was pressed!");
    }
    const handleKeyUp = (e) => {
        if (e.code == "Space"){
            console.log(e);
            setPressed(false);
        }
            
    }

    useEffect(()=>{
        document.addEventListener('keydown', handleKeyDown);
        document.addEventListener('keyup', handleKeyUp);

        return ()=>{
            document.removeEventListener('keydown', handleKeyDown);
            document.removeEventListener('keyup', handleKeyUp);
        }
    }, [handleKeyDown, handleKeyUp]);

    return(
        <h1>Short cut 2</h1>
    );
}
