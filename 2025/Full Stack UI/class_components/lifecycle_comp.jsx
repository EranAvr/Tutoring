import { Component } from "react";

class LifeCycleComp extends Component{
    constructor(){
        super();
        console.log("Constructor");
    }

    render(){
        console.log("Render");
        return(
            <h1>Life Cycle</h1>
        );
    }

    componentDidUpdate(){
        console.log("Did Update");
    }

    componentWillUnmount(){
        console.log("Will Unmount");
    }
}

export default LifeCycleComp;