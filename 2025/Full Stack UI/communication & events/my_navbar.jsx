import { Component } from "react";

export function MyNavbar(props) {

    return(
        <nav style={{backgroundColor: "red"}}>
            <h3>Navbar</h3>
            <div style={{display: "flex", justifyContent: "end"}}>
                {
                    props.user
                    ?
                    <img style={{width: "2em", margin: "1em"}} src="https://cdn-icons-png.flaticon.com/512/9131/9131478.png" alt="user icon"/>
                    :
                    <a href="#">login</a>
                }
            </div>
        </nav>
    );
}


export class NavbarWithDetails extends Component {
    constructor(props){
        super(props);
    }

    render(){
        return(
            <nav style={{backgroundColor: "greenyellow", border: "1px black solid"}}>
                <h3>Navbar With User Details</h3>
                <div>
                    {
                        this.props.user
                        ?
                        <div>
                            <h4>User name: {this.props.user.name}</h4>
                            <h4>Email: {this.props.user.email}</h4>
                        </div>
                        :
                        <p>
                            <a href="#">Login</a> / 
                            <a href="#">Signup</a>
                        </p>
                        
                    }
                </div>
            </nav>
        );
    }
}