import { useState } from "react";

const styleObj = {
    display: "flex",
    flexDirection: "column",
    padding: "20px",

    border: "1px black solid",
    borderRadius: "15px",
}

function OrderForm(){
    const [email, setEmail] = useState("");
    const [address, setAddress] = useState("");
    const [orderType, setOrderType] = useState("");
    const [color, setColor] = useState("#ff0000");
    const [selection, setSelection] = useState("");

    function handleSubmit(e){
        e.preventDefault(); // must be the first command in callback
        console.log(email, address, orderType, color, selection);
    }
    function handleReset(){
        setEmail("");
        setAddress("");
        setOrderType("");
        setColor("#ff0000");
        setSelection("");
    }

    return(
        <>
            <h3>Make an Order</h3>
            <form style={styleObj} onSubmit={handleSubmit} onReset={handleReset}>
                <div>
                    <input onChange={ ({target}) => {setEmail(target.value)}} type="text" placeholder="your email"/>
                    <br />
                    <input onChange={ ({target}) => {setAddress(target.value)}} type="text" placeholder="your address"/>
                </div>
                
                <div>
                    <input onChange={ ({target}) => {setOrderType(target.value)}} type="radio" value="regular" name="orderingType"/>
                    <label htmlFor="orderingType">Regualr order</label>
                    <input  onChange={ ({target}) => {setOrderType(target.value)}} type="radio" value="fast" name="orderingType" />
                    <label htmlFor="orderingType">Fast order</label>
                </div>
                
                <div>
                    <label htmlFor="color">Color</label>
                    <input defaultValue="#ff0000" onChange={ ({target}) => {setColor(target.value)}} type="color" name="color" />
                </div>
                
                <div>
                    <select defaultValue="" onChange={({target}) => {setSelection(target.value)}} name="selection">
                        <option value="">select</option>
                        <option value="item_1">item 1</option>
                        <option value="item_2">item 2</option>
                        <option value="item_3">item 3</option>
                    </select>
                </div>
                
                <div>
                    <button type="submit">Submit</button>
                    <button type="reset">Reset</button>
                </div>
                
                
            </form>
        </>
        
    );
}

export default OrderForm;