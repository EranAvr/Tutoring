import "./themes.css"
import { useState } from "react";

export default function ThemedContainer(props){
    const [theme, setTheme] = useState("light");

    return(
        <div className={theme}>
            <nav>
                <button onClick={()=>{setTheme(theme=="light" ? "dark" : "light")}}>Change theme</button>
            </nav>
            {props.children}
        </div>
    );
}