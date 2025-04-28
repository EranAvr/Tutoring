import { useRef, useState } from "react";

function StopWatch(){
    const [count, setCount] = useState(0);
    const intervalRef = useRef(0);

    
    function handleStart(){
        if (intervalRef.current == 0){
            intervalRef.current = setInterval(
                () => {setCount( (cnt)=>cnt+1 )}, 1000
            );
        }
    }

    function handleStop(){
        clearInterval(intervalRef.current);
        intervalRef.current = 0;
    }

    return(
        <div>
            <h2>Stopwatch</h2>
            <div>Seconds: {count}</div>
            <div>
                <button onClick={handleStart}>Start</button>
                <button onClick={handleStop}>Stop</button>
            </div>
        </div>
    );
}

export default StopWatch;