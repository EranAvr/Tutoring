import { Component } from "react";


export class CountersContainer extends Component{
    constructor(props){
        super(props);
        this.state = {
            counters: [1, 2, 3],
        }
    }

    deleteCounter = (i) => {
        this.setState({
            counters: this.state.counters.filter((num) => num != i)
        });
    }

    render(){
        return(
            <div style={{backgroundColor: "green"}}>
                <h1>My Counters</h1>
                {
                    this.state.counters.map((num) => <Counter id={num} deleteFunc={this.deleteCounter}/>)
                }
            </div>
        );
    }
}


export class Counter extends Component{
    constructor(props){
        super(props);
        this.state = {
            id: props.id,
            count: 0,
        }
    }

    countHandler = () => {
        this.setState({
            count: this.state.count + 1,
        });
    }

    render(){
        return(
        <div>
            <button onClick={this.countHandler}>increment</button>
            <button onClick={() => this.props.deleteFunc(this.state.id)}>delete</button>
            <span> {this.state.count} </span>
        </div>
        );
    }
    
 }