import { Component } from "react";

export class ToolBar extends Component{

    constructor(props){
        super(props);

        this.state = {

        }
    }

    eventHandler = (ev) => {
        console.log(ev.target.getAttribute("id"));
        ev.stopPropagation();
    }
    divEventHandler = () => {
        console.log("div clicked");
    }



    render(){
        return(
            <div onClick={this.divEventHandler} style={{backgroundColor: "blue"}}>
                <button id="b1" onClick={this.eventHandler}>button 1</button>
                <button id="b2" onClick={this.eventHandler}>button 2</button>
            </div>
        );
    }
}