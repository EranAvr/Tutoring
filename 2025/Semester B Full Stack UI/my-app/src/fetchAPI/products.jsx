import { Component, useEffect, useState } from "react";

export function ProductCard(props){
    const [data] = useState(props.data);

    return(
        <div>
            <h3> {data.title} </h3>
            <h4> {data.price} </h4>
            <p> {data.description} </p>
            <img width="300" src={data.image} alt="image could not be loaded" />
            <p>
                <h5> Rated {data.rating.rate} By {data.rating.count} people </h5>
            </p>
            <h4> {data.category} </h4>
        </div>
    );
}

{/*
    export function ProductsPage() {
    const [products, setProducts] = useState([]);

    useEffect(
        () => {
            // enter fetch() logic here
        },
        []
    );
}
    */}

export default class ProductsPage extends Component{
    
    constructor(props) {
        super(props);
        this.state = {
            url: props.url,
            products: []
        }
    }

    componentDidMount(){
        if (!this.state.url){
            return;
        }

        fetch(this.state.url)
            .then(response => response.json())
            .then(arr => this.setState({products: arr}))
            .catch(err => console.log(err));
    }

    render(){
        const products = this.state.products;
        return(
            <>
                {this.props.title ? <h1> {this.props.title} </h1> : ""}

                <div>
                    {
                        products.map(
                            (prod)=> <ProductCard data={prod}/> 
                        )
                    }
                </div>
            </>
        );
    }
}
