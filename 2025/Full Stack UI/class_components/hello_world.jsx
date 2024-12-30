import { Component } from "react";

// Simple class component
class HelloWorld extends Component {
    constructor(){
        super();
        /* ... */
    }

    // render function presents content to screen
    render(){
        // return the html (jsx) of the component
        return(
            <h1>Hello World!</h1>
        );
    }
}

export default HelloWorld;