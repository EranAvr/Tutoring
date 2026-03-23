
export function Button1(props){
    // props.func - פונ' להפעלה ע"י הכפתור
    return(
        <button onClick={props.func}>click me</button>
    );
}

export function Button2(props){
    return(
        <button  onClick={props.func}>click him</button>
    );
}