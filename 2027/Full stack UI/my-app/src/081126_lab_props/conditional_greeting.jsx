import { useState } from "react";

export default function ConditionalGreeting(){

    const [isMember, setIsMember] = useState(false);

    let greet;
    if(isMember){
        greet = "Hello dear member";
    } else {
        greet = "Hello guest";
    }

    return(
        <div>
            {
                isMember
                ?
                <h3>Hello dear member</h3>
                :
                <h3>Hello guest</h3>
            }
        </div>
    );
}