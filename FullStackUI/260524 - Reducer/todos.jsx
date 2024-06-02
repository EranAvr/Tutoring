import { useEffect, useReducer, useState } from "react";

const initialTodos = [
    {
        id: 1,
        title: "Todo 1",
        complete: false,
    },
    {
        id: 2,
        title: "Todo 2",
        complete: false,
    },
];

export function TodoList() {
    const [todos, dispatch] = useReducer(reducer, initialTodos);
    const inputTitles = {};

    function reducer(state, action) {
        switch (action.type) {
            case "complete":
                return state.map((td) => {
                    if (td.id === action.id) {
                        td.complete = true;
                    }
                    return td;
                });
            case "delete":
                return state.filter((td) => td.id !== action.id);
            case "update":
                return state.map((td) => {
                    if (td.id === action.id) {
                        td.title = action.newTitle;
                    }
                    return td;
                });
            default:
                return state;
        }
    }

    useEffect(() => {
        console.log(todos);
    }, []);
    useEffect(() => {
        console.log(inputTitles);
    });

    return (
        <ul>
            {todos.map((td) => (
                <li key={Math.random()}>
                    {`ID=${td.id}; Title=${td.title}; complete=${td.complete}`}
                    <button
                        onClick={() => {
                            dispatch({ type: "complete", id: td.id });
                        }}
                    >
                        mark complete
                    </button>
                    <button
                        onClick={() => {
                            dispatch({ type: "delete", id: td.id });
                        }}
                    >
                        delete item
                    </button>

                    <span>
                        <input id={td.id} type="text" onChange={({target})=>{inputTitles[td.id] = target.value; console.log(inputTitles)}}  />
                        <button onClick={() => {
                            dispatch({ type: "update", id: td.id, newTitle: inputTitles[td.id] });
                        }}>update item</button>
                    </span>
                </li>
            ))}
        </ul>
    );
}
