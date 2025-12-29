import { useState } from "react";

export function TodoList(){

    const [todos, setTodos] = useState([
        {id: "1", desc: "Do homework in Data structure", completed: false},
        {id: "2", desc: "Go to the gym", completed: false},
        {id: "3", desc: "Fly to another Cyprus", completed: false}
    ]);

    return(
        <div style={myStyle}>
            {
                todos.map((value, index) => 
                    <div key={index}>
                        Task: {value.desc} | Completed: {value.completed ? "V" : "X"}
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