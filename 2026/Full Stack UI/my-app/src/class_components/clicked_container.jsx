import { Component } from "react";

class ClickedContainer extends Component{
    constructor(props){
        super(props);
        this.state = {
            border: 5
        }
    }

    handleEvent = (ev) => {
        console.log(ev);
    }
    
    render(){
        return(
            <div onClick={this.handleEvent}
            style={{borderWidth: this.state.border, borderColor: "black", borderStyle: "solid"}}>
                {this.props.children}
            </div>
        );
    }
}

export default ClickedContainer;