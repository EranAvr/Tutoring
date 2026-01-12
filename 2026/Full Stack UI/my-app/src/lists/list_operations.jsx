import { use, useState } from "react";

let ID = 1;
const initData = [
        {id: ID++, desc: "Do homework in Data structure", completed: false},
        {id: ID++, desc: "Go to the gym", completed: false},
        {id: ID++, desc: "Fly to another Cyprus", completed: false}
    ]

export default function TodoList(){

    const [todos, setTodos] = useState(initData);
    const [newTaskText, setNewTaskText] = useState("");
    const [updateText, setUpdateText] = useState("");

    const [idToUpdate, setIdToUpdate] = useState(null);

    return(
        <div style={myStyle}>
            <div className="input_fields">
                <input value={newTaskText} type="text" placeholder="Enter new task" 
                    onChange={({target})=>{setNewTaskText(target.value)}}/>
                <button onClick={()=>{
                    setTodos([
                        ...todos,
                        {id: ID++, desc: newTaskText, completed: false}
                    ]);
                    setNewTaskText("");
                }}>Add</button> 
                <br />
                <input value={updateText} type="text" placeholder="Enter new task" 
                    onChange={({target})=>{setUpdateText(target.value)}}/>
                
            </div>
            <hr />
            {
                todos.map((value, index) => 
                    <div key={index}>
                        {
                            idToUpdate === value.id
                            ?
                            <input value={updateText} type="text" placeholder="Enter new task" 
                            onChange={({target})=>{setUpdateText(target.value)}}/>
                            :
                        `#${value.id} Task: ${value.desc} | Completed: ${value.completed ? "V" : "X"}`
                        }
                        
                        {
                            idToUpdate === value.id
                            ?
                            <button onClick={()=>{
                                
                            }}>save</button>
                            :
                            <button onClick={()=>{
                                /*const newList = todos.map((v, i) => {
                                    if (v.id === value.id && updateText !== "")
                                        return {id: v.id, desc: updateText, completed: v.completed}
                                    else
                                        return v
                                });
                                setTodos(newList);
                                setUpdateText("");*/
                                setIdToUpdate(value.id)
                            }}>update</button>
                        }
                        
                        <button onClick={()=>{
                            setTodos(todos.filter(
                                task=>task.id !== value.id
                            ))
                        }}>delete</button>
                    </div>
                )
            }
        </div>
    );
}

const myStyle = {
    border: "5px solid black"
}