import { useReducer } from "react";

export default function Counter(){
    const ACTIONS = {
        INC: "INC",
        DEC: "DEC",
        RESET: "RESET"
    }

    const reducer = (state, action) => {
        switch (action.type) {
            case ACTIONS.INC:
                return state + 1;
            case ACTIONS.DEC:
                return state - 1 < 0 ? 0 : state - 1;
            case ACTIONS.RESET:
                return 0;
            default:
                return state;
        }
    }

    const [count, dispatch] = useReducer(reducer, 0);

    return(
        <div>
            <h4>Counter</h4>
            <span> {count} </span> <br />
            <button onClick={()=>{dispatch({type: ACTIONS.INC})}}>Increment</button>
            <button onClick={()=>{dispatch({type: ACTIONS.DEC})}}>Decrement</button>
            <button onClick={()=>{dispatch({type: ACTIONS.RESET})}}>Reset</button>
        </div>
    );
}