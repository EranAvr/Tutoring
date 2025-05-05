import { useContext } from "react";
import ThemeContext from "./theme_context";
import UserContext from "./user_context";

export default function ThemedNavbar(){

    const theme = useContext(ThemeContext);
    const userInfo = useContext(UserContext);

    return(
        <nav className={theme} style={{display: 'flex', justifyContent: 'space-evenly'}}>
            <span>Current theme: {theme}</span>
            <a href="#">about</a>
            <a href="#">settings</a>
            <a href="#">user-info</a>
            <a href="#">my-cart</a>
            <span>
                {
                userInfo.userName
                ?
                userInfo.userName
                :
                "Log-in"}
            </span>
        </nav>
    );
}