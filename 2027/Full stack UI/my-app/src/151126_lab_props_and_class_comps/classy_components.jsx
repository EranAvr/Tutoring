import { Component } from "react";

class User extends Component {

    constructor(props){
        super();
        this.state = {
            isLogged: true,
            isVip: false,
            userName: props.username,
            email: props.email
        }
    }

    render(){
        return(
            <>
                <h1>{this.state.userName}</h1>
                <button onClick={
                    () => {
                        this.setState({
                            isLogged: true,
                            isVip: true,
                            userName: "New username"
                        });
                    }
                }></button>
            </>
        );
    }
}