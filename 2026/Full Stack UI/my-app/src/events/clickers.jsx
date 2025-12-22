export function Clicker(){

    return(
        <span onClick={(e)=>{
            /*alert("span was clicked")*/
            console.log(e);
            }}>
            click me!
        </span>
    );
}

export function WideClicker(){

    return(
        <div style={{width: "100vw", background: "red"}} onClick={(e)=>{
            //alert(e.screenX);
            console.log(window.innerWidth);
            
            if (e.screenX > 1520/2)
                alert("right");
            else 
                alert("left");
            }}>
            div with click...
        </div>
    );
}

export function MultiClicker(){

    return(
        <div onClick={()=>{alert("div clicked")}} style={{width: "100vw", background: "red"}}>
            <span onClick={(e)=>{
                e.stopPropagation();
                alert("span clicked");
                }} style={{width: "100vw", background: "blue"}}>
                span is here
            </span>
        </div>
    );
}