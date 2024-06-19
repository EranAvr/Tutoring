import { createContext, useContext, useState } from "react";
import { useReducer } from "react";

import { initState, reducer } from "./user_reducer";

/*
    This file contains:
    1) ReadUser comp - for displaying state.
    2) UpdateUser comp - for updating state using dispatch.
    3) UserCustomProvider comp - custom container that sets a state variable.
    4) UserContext - a context object.

    Combine Context and Reducer:
        The key point of combining these two APIs,
        is to pass the pair <state, dispatch> down the tree
        using context provider.
            Example: <UserContext.Provider value={{user, dispatch}}>

        We can pass them packed together, either in an array or an object.
        Then, get them anywhere using useContext() hook, and unpack them
        into local variables.
            Example: const {user, dispatch} = useContext(UserContext);
*/


// Helper comp for displaying state-variable (user) content-
export function ReadUser(){
    const {user, dispatch} = useContext(UserContext);
    return(
        <p>
            {user.userName} <br />
            {user.email}
        </p>
    );
}

// Helper comp for updating state-variable with dispatch-
export function UpdateUser(){
    const [input1, setInput1] = useState("");
    const [input2, setInput2] = useState("");

    const {user, dispatch} = useContext(UserContext);

    return(
        <>
            <div>
                <input type="text" placeholder="enter new username" 
                onChange={({target}) => {
                    setInput1(target.value);
                    }} />
                <button onClick={()=>{
                    dispatch({type: "username", userName: input1});
                    }}>update</button>
            </div>
            <div>
                <input type="text" placeholder="enter new email" 
                onChange={({target}) => {
                    setInput2(target.value);
                    }} />
                <button onClick={()=>{
                    dispatch({type: "email", email: input2});
                    }}>update</button>
            </div>
        </>
    );
}

export function UserCustomProvider(props){
    // This component is our custom provider-container,
    // Which creates a subtree in our components tree.
    // We create a state-variable for this subtree,
    // and pass it on with the UserContext.Provider comp.
    const [user, dispatch] = useReducer(reducer, initState);

    // By passing 'props.children' into the rendered zone,
    // we make this component a container.
    return(
        <UserContext.Provider value={{user, dispatch}}>
            {props.children}
        </UserContext.Provider>
    );
}

export const UserContext = createContext({});