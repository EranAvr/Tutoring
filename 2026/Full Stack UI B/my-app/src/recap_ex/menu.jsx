import { useState } from "react";

const DEMO_ITEMS = [
    {id: "1", name: "Burger", price: 100, image: ""},
    {id: "2", name: "French Fries", price: 50, image: ""},
    {id: "3", name: "Salad", price: 70, image: ""},
]

function ItemComp({item}){
    return(
        <div style={{border: "1px solid black", margin: "20px"}}>
            Item: {item.name} <br />
            Item: {item.price} <br />
            <img src={item.image} alt="" />
        </div>
    );
}

export default function MenuComp(){
    const [items, setItems] = useState(DEMO_ITEMS);
    const [orders, setOrders] = useState([]);

    return(
        <div>
            <h1>Our Menu</h1>
            <div>
                {
                    items.map((itm) => <div onClick={()=>{setOrders([...orders, itm.id])}}>
                        <ItemComp item={itm}/>
                        </div>)
                }
            </div>
            <button onClick={()=>{console.log(orders);
            }}>make order</button>
        </div>
    );
}