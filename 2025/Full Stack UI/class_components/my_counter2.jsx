import { Component } from "react";

class MyGenericCounter extends Component{

    constructor(props){
        super();

        this.state = {
            count: 0,
            step: props.step ? props.step : 1
        };
    }

    inc = () => {
        this.setState( {count: this.state.count + this.state.step} );
    }
    dec = () => {
        let current = this.state.count - this.state.step;
        this.setState( {count: current<0 ? 0 : current} );
    }

    render(){
        return(
            <>
                <h3>Count: {this.state.count}</h3>
                <button onClick={this.inc}> Increment {this.state.step} </button>
                <button onClick={this.dec}> Decrement {this.state.step} </button>
            </>
        );
    }

    componentDidUpdate(){
        console.log("Update count to: " + this.state.count);
    }
}

export default MyGenericCounter;