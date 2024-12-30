import { Component } from "react";

class MyCounter extends Component{

    constructor(){
        super();

        this.state = {
            count: 0
        };
    }

    inc = () => {
        this.setState( {count: this.state.count + 1} );
    }
    dec = () => {
        let current = this.state.count - 1;
        this.setState( {count: current<0 ? 0 : current} );
    }

    render(){
        return(
            <>
                <h3>Count: {this.state.count}</h3>
                <button onClick={this.inc}>Increment</button>
                <button onClick={this.dec}>Decrement</button>
            </>
        );
    }

    
}

export default MyCounter;