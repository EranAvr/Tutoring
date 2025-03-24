import { useRef, useState } from "react";

export default function StopWatch(){
    const [count, setCount] = useState(0);
    const intervalRef = useRef(0);

    
    function handleStartBtn(){
        if (intervalRef.current == 0){
            intervalRef.current = setInterval(
                () => {setCount( (cnt)=>cnt+1 ); console.log(count);
                }, 1000
            );
        }
    }

    function handleStopBtn(){
        clearInterval(intervalRef.current);
        intervalRef.current = 0;
    }

    return(
        <div>
            <h2>Stopwatch</h2>
            <div>Seconds: {count}</div>
            <div>
                <button onClick={handleStartBtn}>Start</button>
                <button onClick={handleStopBtn}>Stop</button>
            </div>
        </div>
    );
}