import { useEffect, useReducer, useState } from "react";

const TODO_OBJECT = {
    id: 0,
    text: "empty text",
    completed: false
}

export default function TodoList(){

    function reducer(state, action){
        switch (action.type) {
            case "ADD":
                return [...state, {id: state.length+1, text: action.value, completed: false}];
            case "UPDATE":
                return state.map(item => {
                    if(item.id===action.id)
                        return {...item, text: action.value};
                    else
                        return item;
                });
            case "DELETE":
                return state.filter((item)=>item.id!==action.id);
            case "COMPLETE":
                return state.map(item => {
                    if(item.id===action.id)
                        return {...item, completed: !item.completed};
                    else
                        return item;
                });
            case "RESET":
                return [];
            default:
                return state;
        }
    }
    // helper state variables:
    const [newTask, setNewTask] = useState("");
    const [editIndex, setEditIndex] = useState(null);
    const [editText, setEditText] = useState(null);

    // main reducer-state variable:
    const [todos, dispatch] = useReducer(reducer, []);

    // print todos on each change on list
    //useEffect(()=>{console.log(todos);}, [todos])

    return(
        <>
            <h1>Todo List</h1>
            <div>
                <input value={newTask} onChange={({target})=>{setNewTask(target.value)}} type="text" placeholder="Enter new task"/>
                <button onClick={()=>{
                    dispatch({type: "ADD", value: newTask});
                    setNewTask("");
                }}>Add</button>
            </div>
            <ul>
                <h3>Tasks:</h3>
                <p>
                    {todos.length} tasks in list
                    <button onClick={()=>{
                        dispatch({type: "RESET", value: newTask});
                    }}>Reset</button>
                </p>
                {
                    todos.map((item, index) => 
                        <div key={index}>
                            {
                            index===editIndex
                            ?
                            <input type="text" value={editText} onChange={({target})=>{setEditText(target.value)}} />
                            :
                            <span onClick={()=>{dispatch({type: "COMPLETE", id: item.id})}}>
                                Text: {item.text}
                                | Completed: {item.completed.toString()}
                            </span>
                            }
                            
                            {
                            index===editIndex
                            ?
                            <button onClick={()=>{
                                dispatch({type: "UPDATE", value: editText, id: item.id});
                                setEditText(null)
                                setEditIndex(null)
                            }}>Save</button>
                            :
                            <button onClick={()=>{
                                setEditText(item.text)
                                setEditIndex(index)
                            }}>Update</button>
                            }
                            <button onClick={()=>{
                                dispatch({type: "DELETE", value: newTask, id: item.id});
                            }}>Delete</button>
                        </div>
                    )
                }
            </ul>
        </>
    );
}