import { useContext, useState } from "react";
import { CartContext } from "./cart_provider";

export default function PresentCart(){

    const {cartItems, addItem} = useContext(CartContext);
    const [newItem, setNewItem] = useState("");

    return (
        <>
            <h2>Shopping cart</h2>
            <h3>Items in cart: {cartItems.length}</h3>
            <div>
              <h4>Add item</h4>
              <input onChange={({target})=>{setNewItem(target.value)}} value={newItem} type="text" placeholder='Type new item name' />
              <button onClick={()=>{
                if(newItem){
                    addItem(newItem);
                }
              }}>Add</button>
            </div>
            <ol>
                {
                    cartItems.map((item) => <li>{item}</li>)
                }
            </ol>
        </>
    );
}