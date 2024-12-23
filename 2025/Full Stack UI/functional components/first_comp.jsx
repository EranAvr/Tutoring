import { useEffect, useState } from "react";

function FirstComp(){

    // const [a,b] = [1,2];
    const [title, setTitle] = useState("");

    function writeToConsole(){
        console.log("component loaded");
    }
    // create an event that triggers writeToConsole() function
    // empty array [] means run the function only once
    useEffect(writeToConsole, []);

    function titleWasUpdated(){
        console.log("title was updated!");
    }
    // array [title] means run the function when 'title' state-variable updated-
    useEffect(titleWasUpdated, [title])
    
    return(
        <>
            <h1> {title} </h1>
            <ul>
                <li>item 1</li>
                <li>item 2</li>
                <li>item 3</li>
            </ul>
        </>
        
    );
}

export default FirstComp;