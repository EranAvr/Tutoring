import { Component } from "react";

class ColorTitle extends Component{
    constructor(props){
        super(props);
        this.state = {
            color: props.color
        }
    }
    
    render(){
        return(
            <h1 style={{color: this.state.color}}> Colored Title </h1>
        );
    }
}

export default ColorTitle;