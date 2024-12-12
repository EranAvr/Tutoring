import React, { Component, Fragment } from "react";

export class Title extends Component {

    render(){
        return(
            <h1> This is a test title </h1>
        );
    }
}


export class Titles extends Component {
    constructor(){
        // Always start with calling super()-
        super();
        // Setup state variable-
        this.state = {
            h1_title: "This is first title",
            h3_title: "This is secondary title"
        };
    }

    render(){
        return(
            <Fragment>
                <h1> {this.state.h1_title} </h1>
                <h3> {this.state.h3_title} </h3>
            </Fragment>
            
        );
    }
}

export class TitleWithProps extends Component {
    constructor(props){
        // Pass props variable to super()-
        super(props);
        // Setup state variable-
        this.props = props;
        this.state = {
            title_text: props.title,
        };
    }

    render(){
        return(
            <Fragment>
                <h2> {this.state.title_text} </h2>
            </Fragment>
            
        );
    }
}

export class CounterByClass extends Component {
    constructor(){
        super();
        // 'state' objectfor styate-variables- 
        this.state = {
            count: 0,
        };
    }

    render(){
        return(
            <Fragment>
                <h6> My Counter: </h6>
                <button onClick={() => this.setState( {count: this.state.count+1} )} >click me!</button>
                <span> {this.state.count} </span>
            </Fragment>
            
        );
    }
}

export class LifeCycleComp extends Component {
    constructor(){
        super();
        // 'state' objectfor styate-variables- 
        this.state = {
            count: 0,
        };
    }

    componentDidMount(){
        console.log("DidMount");
    }
    
    render(){
        console.log("render");
        return(
            <Fragment>
                <h6> LifeCycle Comp </h6>
                <button onClick={() => this.setState( {count: this.state.count+1} )} >click me!</button>
                <span> {this.state.count} </span>
            </Fragment>
            
        );
    }

    componentDidUpdate(){
        console.log("DidUpdate");
    }
    componentWillUnmount(){
        console.log("WillUnmount");
    }
}
