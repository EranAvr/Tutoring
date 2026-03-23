import { useRef, useState } from "react";

export default function Timer(){
    const [secs, setSecs] = useState(0);
    const intervalId = useRef(0);

    const handleStart = () => {
        if(intervalId.current == 0){    // אין טיימרים בריצה
            intervalId.current = setInterval(()=>{setSecs((s)=>s+1)}, 1000);
        }
    }
    const handleStop = () => {
        clearInterval(intervalId.current);  // עוצר טיימר
        intervalId.current = 0; // סימון על טיימר שלא פועל
    }

    return(
        <div>
            <button onClick={handleStart}>Start</button>
            Seconds: {secs}
            <button onClick={handleStop}>Stop</button>
        </div>
    );
}