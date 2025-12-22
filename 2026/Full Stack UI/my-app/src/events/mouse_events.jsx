import { useState } from "react";

export function ContextMenuEvent(){

    return(
        <span onContextMenu={
            (e) => {
                e.preventDefault();
                alert("right click was used");
            }
        }>
            click with right click
        </span>
    );
}

export function DisappearingCube(){

    const [myDis, setMyDis] = useState("block");

    return(
        <div style={{display: myDis, width: "100px", height: "100px", backgroundColor: "red"}}
            onDoubleClick={()=>{
                //alert("double click detected")
                setMyDis("none");
            }}>

        </div>
    );
}

export function WheelComp(){

    return(
        <span onWheel={
            (e) => {
                e.preventDefault();
                console.log(e);
                
            }
        }>
            use mouse wheel on me.
        </span>
    );
}

export function CubeChangeByMouse(){

    const [color, setColor] = useState("green");
    const [count, setCount] = useState(0);

    return(
        <div style={{width: "100px", height: "100px", backgroundColor: color, fontSize: "50px"}}
            onMouseEnter={()=>{setColor("red")}}
            onMouseLeave={()=>{setColor("green")}}
            onMouseMove={()=>{setCount(count+1)}}
            >
                {count}
        </div>
    );
}