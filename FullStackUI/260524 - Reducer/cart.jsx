import { useReducer } from "react";
/*
// JS-Object vs JSON:
// Similar syntax, but-
// 1. In Json, both key and value are strings.
// 2. Json can't have methods as fields.

const obj = {   // Object
    name: "Eran",
    func: () => {console.log("i am func")}
}
const jso = {   // Json
    "name": "Eran",
}
*/

// Global variable-
var ID = 0;

const initialProducts = [
    {id: ID++, name: "T-shirt", size: "L", color: "red"},
    {id: ID++, name: "Shoes", size: "M", color: "blue"}
];

export function ShoppingCart(){
    const [products, dispatch] = useReducer(reducer, initialProducts);

    function reducer(state, action) {
        switch (action.type) {
            case "remove":
                return state.filter(item => item.id !== action.id);
            case "dup":
                return [...state, action.dupItem];
            default:
                break;
        }
    }
    
    
    return(
        <ol>
            {
                products.map((prod) => <li key={Math.random()}>
                    {`Id: ${prod.id}\t Product: ${prod.name}\t Size:${prod.size}\t Color:${prod.color}`}
                    <button onClick={ () => {
                        let clone = {...prod, id: ID++};    // creating the new duplicate here will prevent it from double-creation inside the reducer.
                        dispatch({type: "dup", dupItem: clone})}    // pass duplicate to reducer
                    }>duplicate</button>
                    <button onClick={ () => {
                        dispatch({type: "remove", id: prod.id})}
                    }>delete</button>
                </li>)
            }
        </ol>
    );
}