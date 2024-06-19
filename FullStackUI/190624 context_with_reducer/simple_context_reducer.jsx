import { Component, createContext, useContext, useReducer } from "react";


function Presenter(){
    const [state, dispatch] = useContext(CounterContext);
    return(
        <span>{state.count}</span>
    );
}
// Counter component:
// This component defines a state variable,
// with the useReducer() hook.
// The component itself is built from CounterContext.Provider conteiner,
// and buttons and a Presenter component which reads the
// state's value from the context.
export function Counter(){
    const initialState = {
        count: 0
    }
    function reducer(state, action){
        switch (action.type) {
            case "dec":
                return {...state, count: state.count - action.val};
            case "inc":
                return {...state, count: state.count + action.val};
            default:
                return state;
        }
    }
    const [state, dispatch] = useReducer(reducer, initialState);

    return(
        <CounterContext.Provider value={[state, dispatch]}>
            <button onClick={() => {dispatch({type: "dec", val: 1});}}>-</button>
            <Presenter />
            <button onClick={() => {dispatch({type: "inc", val: 1});}}>+</button>
        </CounterContext.Provider>
        
    );
}

// A context object, to create a Provider-
export const CounterContext = createContext({});