import { Component } from "react";

export class MyComButton extends Component {

    constructor(props) {
        super(props);

        if ( !props.title ){
            //throw "Error";
            console.error("Title was not provided!")
        }
        this.props = props;
    }

    render(){
        return(
            <div style={{border: "1px red dashed"}}>
                <h3> {this.props.title} </h3>
                <button id="btn" className="clickable" onClick={this.props.func} >Click Me!</button>
            </div>
        );
    }
}

export function RightClickButton(){
    return(
        <button onContextMenu={() => {
            console.log("Right click!");
        }}>right click</button>
    );
}

export function OnOffButton(){
    return(
        <button onOnline={()=>{console.log("online");
        }}>On Off</button>
    );
}