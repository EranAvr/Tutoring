import { Component } from "react";


class Signup extends Component {

    constructor(props){
        super(props);
        this.state = {
            email: "",
            password: "",
            username: "",
            age: 0
        }
    }

    handleSubmit = (e) => {
        e.preventDefault();
        console.log(this.state);
    }
    handleReset = () => {
        this.setState({
        email: "",
        password: "",
        username: "",
        age: 0
    })}

    render(){
        return(
            <form onSubmit={this.handleSubmit} onReset={this.handleReset}>
                <h1>{this.props.title}</h1>
                <input value={this.state.email} onChange={({target}) => {this.setState({email: target.value})}} type="email" placeholder="Enter email"/> <br />
                <input value={this.state.password} onChange={({target}) => {this.setState({password: target.value})}} type="password" placeholder="Enter password" /> <br />
                <input value={this.state.username} onChange={({target}) => {this.setState({username: target.value})}} type="text" placeholder="Enter username" /> <br />
                <input value={this.state.age} onChange={({target}) => {this.setState({age: parseInt(target.value)})}} type="number" placeholder="Enter age" /> <br />
                <br />
                <button type="submit">Submit</button>
                <button type="reset">Reset</button>
            </form>
        )
    }
}

export default Signup;