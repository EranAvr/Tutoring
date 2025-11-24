import { Component } from "react";

class MyTitle extends Component{
    constructor(){
        super();
        this.state = {
            text: "Title Text",
            color: "red",
            isCentered: true
        }
    }

    changeTitle = () => {
        if (this.state.text != "New Text"){
            this.setState({
                text: "New Text"
            });
        }
    }
    
    render(){
        console.log("render() was called");
        
        return(
            <h1 onClick={this.changeTitle}> {this.state.text} </h1>
        );
    }
}

export default MyTitle;