import { useState } from "react";

export default function ColorfulDiv(props){
    const [bgColor, setBgColor] = useState(props.bg ?? "white");

    return(
        <div style={{backgroundColor: bgColor}}>
            <div>
                <button onClick={()=>{setBgColor("yellow")}}>yellow</button>
                <button onClick={()=>{setBgColor("red")}}>red</button>
            </div>
            Lorem ipsum, dolor sit amet consectetur adipisicing elit. <br />
             Tenetur minima maiores esse doloremque repellendus at <br />
              cum quae. Corporis porro ullam fugiat distinctio <br />
              officia rem sed beatae necessitatibus architecto. <br />
              Eveniet, asperiores.<br />
        </div>
    );
}