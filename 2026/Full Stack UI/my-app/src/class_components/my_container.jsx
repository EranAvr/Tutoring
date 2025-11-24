import { Component } from "react";

class MyContainer extends Component{
    constructor(props){
        super(props);
        this.state = {
            border: 5
        }
    }
    
    render(){
        return(
            <div style={{borderWidth: this.state.border, borderColor: "black", borderStyle: "solid"}}>
                <h3>Here are the children:</h3>
                {this.props.children}
            </div>
        );
    }
}

export default MyContainer;