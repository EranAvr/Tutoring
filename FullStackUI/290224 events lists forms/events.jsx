
export function ComposedComponent(){


    function eventHandlerWithEvent(ev){
        console.log("This callback recieved event as parameter");
        console.log(ev);
    }

    function eventHandlerWithTarget({target}){
        console.log("This callback recieved target as parameter");
        console.log(target);
    }

    function eventHandlerChangeText({target}){
        //console.log("This callback recieved target as parameter");
        if(target.getAttribute("value") === "change text"){
            console.log(target);
            target.setAttribute("value", "new text");
        }
        else {
            console.log(target);
            target.setAttribute("value", "change text");
        }
    }
    function eventHandlerUnified({target}){
        if(target.getAttribute("id") === "b1"){
            console.log("b1 clicked");
            target.setAttribute("style", "background-color: green");
        }
        if(target.getAttribute("id") === "b2") {
            console.log("b2 clicked");
            target.setAttribute("style", "background-color: red");
        }
    }

    return(
        <div>
            <button onClick={eventHandlerWithEvent}>click a</button>
             <button onClick={eventHandlerWithTarget}>click b</button> <br />
             <input type="button" onClick={eventHandlerChangeText} value={"change text"} /> <br />

             <button id="b1" onClick={eventHandlerUnified}>click for green</button>
             <button id="b2" onClick={eventHandlerUnified}>click for red</button>
        </div>
    );
}