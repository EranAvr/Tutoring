import { useState } from "react";
import { createContext } from "react";

export const CartContext = createContext(null);


export function CartProvider(props){

    const [cartItems, setCartItems] = useState(["item1", "item2", "item3"]);

    function addItem(item){
        setCartItems([...cartItems, item]);
    }

    return(
        <CartContext.Provider value={{cartItems, addItem}}>
            {props.children}
        </CartContext.Provider>
    );
}