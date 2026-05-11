import { useContext } from "react";
import ThemeContext from "./theme_context";

export function Comp1({children}){
    return(
        <div className={useContext(ThemeContext).theme}>
            <h2>Comp1</h2>
            {children}
        </div>
    );
}

export function Comp2({children}){
    return(
        <>
            <h2>Comp2</h2>
            {children}
        </>
    );
}

export function Comp3({children}){
    return(
        <>
            <h2>Comp3</h2>
            {children}
        </>
    );
}

export function LeafCompTest(){
    return(
        <>
            <h1>Leaf component</h1>
            <h2>ThemeContext.Provider = {useContext(ThemeContext).theme}</h2>
        </>
    );
}