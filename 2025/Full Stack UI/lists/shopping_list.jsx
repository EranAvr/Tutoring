import { Component } from "react";


const data = [
    {id: 1, name: "TV", desc: "Low quality tv", price: 100},
    {id: 2, name: "TV", desc: "High quality tv", price: 500},
    {id: 3, name: "Radio", desc: "A very nice radio", price: 80}
];
const itemStyle = {
    border: "1px solid black",
    display: "flex",
    flexDirection: "column",
    margin: "10px 20px"
}


class ShoppingList extends Component{
    constructor(){
        super();

        this.state ={
            items: data
        }
    }

    handleAddItem = () => {
        this.setState({
            items: [
                ...this.state.items,
                {id: 4, name: "Product", desc: "Some description", price: 10}
            ]
        });
    }

    render(){
        return(
        <div>
        <p>
            <button onClick={this.handleAddItem}>Add</button>
        </p>
        <ul>
            { this.state.items.map(
                (val, idx) => 
                <div style={itemStyle} key={val.id + "" + idx}>
                    <h3> Item # {val["id"]}</h3>
                    <div style={{textAlign: "start"}}>
                        <div>Item is {val.name}</div>
                        <div>Description: {val.desc}</div>
                        <div>Price is {val.price}</div>
                    </div>
                </div>
            ) }
        </ul>
        </div>
        )
            
    }
}

export default ShoppingList;