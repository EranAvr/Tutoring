import { Component } from "react";

const DATA = [
    {id: "1", text: "go to shopping"},
    {id: "2", text: "clean the house"},
]
const DATA2 = [
    "go to shopping",
    "clean the house",
]

class ToDoList extends Component{
    constructor(){
        super();
        this.state = {
            items: DATA,
            newTodo: ""
        }
    }

    handleAdd = () => {
        //console.log(this.state.newTodo);
        if (this.state.newTodo != ""){
            let newId = this.state.items.length + 1;
            this.setState(
                {items: [
                ...this.state.items,
                {id: newId, text: this.state.newTodo}
            ],
            newTodo: "", 
            updateTodo: ""}
        );
        }
    }
    handleRemove = (id) => {
        this.setState({
            items: this.state.items.filter(
                item => item.id !== id
            )
        });
    }
    handleUpdate = (id) => {
        this.setState({
            items: this.state.items.map((itm, i)=>{
                if (id === itm.id && this.state.updateTodo){
                    return {id: itm.id, text: this.state.updateTodo}
                } else {
                    return itm;
                }
            })
        });
    }

    render(){
        const items = this.state.items;
        return(
            <div>
                <input onChange={
                    ({target}) => {this.setState({newTodo: target.value})}
                    } type="text" placeholder="enter assignment" />
                <button onClick={this.handleAdd}>add</button> <br />
                <input onChange={
                    ({target}) => {this.setState({updateTodo: target.value})}
                    } type="text" placeholder="enter update" />
                <hr />
                <ul>
                    {
                        items.map( (item) => 
                            <li key={Math.random().toString()}>
                                #{item.id} - {item.text}
                            <button onClick={() => {this.handleRemove(item.id)}}>remove</button>
                            <button onClick={() => {this.handleUpdate(item.id)}}>update</button>
                        </li>)
                    }
                </ul>
            </div>
            
        );
    }

}

export default ToDoList;