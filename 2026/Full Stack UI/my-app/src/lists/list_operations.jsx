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

    const [finished, setFinished] = useState([]);

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
                
            </div>
            <hr />
            <div>
            {
                todos.map((value, index) => 
                    <div key={index}>
                        {
                            idToUpdate === value.id
                            ?
                            <input value={updateText} type="text" placeholder="Enter new task"
                            onChange={({target})=>{setUpdateText(target.value)}}/>
                            :
                            <>
                                {`#${value.id} Task: ${value.desc} | Completed:`}
                                <span onClick={()=>{
                                    const newTodos = todos.map(v => {
                                        if (v.id === value.id){
                                            return {...v, completed: !value.completed}
                                        } else {
                                            return v;
                                        }
                                    });
                                    setTodos(newTodos);

                                    setFinished(
                                        [...finished, value]
                                    );
                                }}>{value.completed ? '✅' : '❌'}</span>
                            </>
                            
                        }
                        
                        {
                            idToUpdate === value.id
                            ?
                            <button onClick={()=>{
                                const newTodos = todos.map(v => {
                                    if (v.id === idToUpdate){
                                        //return {id: v.id, desc: updateText, completed: v.completed}
                                        return {...v, desc: updateText}
                                    } else {
                                        return v;
                                    }
                                });
                                setTodos(newTodos);
                                setIdToUpdate(null);
                                setUpdateText("");
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
                                setIdToUpdate(value.id);
                                setUpdateText(value.desc);
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
            <hr />
            <div>
                {
                    finished.map((value, index) => 
                        <div key={index}>
                            {`#${value.id} Task: ${value.desc} | Completed: ${value.completed}`}
                        </div>
                    )
                }
            </div>
        </div>
    );
}

const myStyle = {
    border: "5px solid black"
}