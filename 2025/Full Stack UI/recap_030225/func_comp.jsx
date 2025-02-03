import { Component, useEffect, useState } from "react"


/*
    1. build html representation
    2. add css code (as JS-object or external file)
    3. add state with JS code
*/
const styles = {
    container: {
        display: "inline-flex",
        flexDirection: "column",
        justifyContent: "space-around",
        border: "1px solid black",
        borderRadius: "15px",
        width: "200px",
        height: "300px",
        textAlign: "center"
    },
    image: {
        width: "100%",
    },
    counter: {
        display: "flex",
        flexDirection: "row",
        justifyContent: "space-evenly",
        fontWeight: "bolder",
    },

    arrowButton: {
        width: "1.5em",
        height: "1.5em",
        backgroundColor: "aquamarine",
        borderRadius: "50%",
        lineHeight: "1.5em",
        fontWeight: "bold",
    }
}

export function ItemCard(props){
    const [imgAddress] = useState(props.imgAddress);
    const [description] = useState(props.description);
    const [count, setCount] = useState(0);

    /*
        useEffect() creates an event that listens to state
        אנו יוצרים אירוע המפעיל פונקציה כתגובה
        לשינוי של משתנה ב-state
     */
    useEffect(()=>{
        console.log("State was changed!");
    }, [count]);

    return(
        <div style={styles.container}>
            <img style={styles.image} src={imgAddress} alt="" />
            <p>
                {description}
            </p>
            <div style={styles.counter}>
                <button onClick={()=>{setCount(count>0 ? count-1 : count)}}>-</button>
                <span >{count}</span>
                <button onClick={()=>{setCount(count+1)}}>+</button>
            </div>
        </div>
    )
}


export function ItemCardLoop(props){
    const [imgAddress, setImgAddress] = useState(props.imagesArr[0]);
    const [description] = useState(props.description);
    const [count, setCount] = useState(0);

    function handleArrowClick(step){
        let idx = props.imagesArr.indexOf(imgAddress);
        let newIdx = idx+step<0 ? props.imagesArr.length-1 : (idx+step)%props.imagesArr.length;
        setImgAddress(props.imagesArr[newIdx]);
    }

    return(
        <div style={styles.container}>
            <div>
                <div onClick={()=>{handleArrowClick(-1)}} style={styles.arrowButton}>
                    {"<"}
                </div>
                <img style={styles.image} src={imgAddress} alt="" />
                <div onClick={()=>{handleArrowClick(1)}} style={styles.arrowButton}>
                    {">"}
                </div>
            </div>
            <p>
                {description}
            </p>
            <div style={styles.counter}>
                <button onClick={()=>{setCount(count>0 ? count-1 : count)}}>-</button>
                <span >{count}</span>
                <button onClick={()=>{setCount(count+1)}}>+</button>
            </div>
        </div>
    )
}


export class ShoppingCart extends Component {
    constructor(props){
        super(props);

        this.state = {
            data: [
                {img: "https://www.shutterstock.com/image-photo/fresh-dairy-products-milk-cottage-600nw-2480370209.jpg", desc: "Cheese plate"},
                {img: "https://www.shutterstock.com/image-photo/composition-variety-organic-food-products-260nw-475024762.jpg", desc: "Fruits plate"},
                {img: "https://media.istockphoto.com/id/1306102673/photo/set-of-female-skin-care-products.jpg?s=612x612&w=0&k=20&c=juD5QYdv7C0clKIBZd4QITTsOfromb7JJl-IW5oGxNA=", desc: "Oil plate"},
            ],
            imageText: "",
            descriptionText: "",
        }
    }

    componentDidUpdate(prevProps, prevState){
        console.log(this.state.data);
    }
    

    render(){
        const state = this.state;
        return(
            <>
            <div>
                <input onChange={ ({target})=>{this.setState({imageText: target.value})} } type="text" placeholder="Enter image url" /> <br />
                <input onChange={ ({target})=>{this.setState({descriptionText: target.value})} } type="text" placeholder="Enter description" /> <br />
                <button onClick={() => {
                    this.setState({data: [...state.data, {img: state.imageText, desc: state.descriptionText}]});
                }}>Add new item</button>
            </div>
            <hr />
            <div>
                {this.state.data.map((element, index) => {
                    const uniqueKey = index;
                    return <ItemCard key={uniqueKey} imgAddress={element.img} description={element.desc}/>;
                })}
            </div>
            </>
        );
    }
}