import { useReducer } from "react";

export function Counter(){
    // state variable declaration-
    const [count, dispatch] = useReducer(reducer, 0);

    // reducer declaration-
    function reducer(state, action){
        /*
            action = JS object, which contains the property 'type'.
        */
        console.log(`Current value: ${state}`);
        switch (action.type) {
            case "inc":
                return state+1;
            case "dec":
                return state-1
            default:
                return state;
        }
    }

    return(
        <div>
            <button onClick={() => dispatch({type: "inc"})}>increment</button>
            <button onClick={() => dispatch({type: "dec"})}>decrement</button>
            <span>{count}</span>
        </div>
        
    );
}