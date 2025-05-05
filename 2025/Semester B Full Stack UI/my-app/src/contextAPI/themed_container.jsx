import { useContext } from "react";
import ThemeContext from "./theme_context";

export default function ThemedContainer(props){

    const theme = useContext(ThemeContext);

    return(
        <div className={theme}>
            {props.children}
        </div>
    );
}