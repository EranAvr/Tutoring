import PropTypes from "prop-types";
import { Component } from "react";

export class Greeting extends Component {
    render(){
        return(
            <h2>Hello, {this.props.name}</h2>
        );
    }
}
Greeting.propTypes = {
    name: PropTypes.string
}

export class ConcatenateAttr extends Component {

    render(){
        return(
            <h2>
                {this.props.str1 + this.props.str2}
            </h2>
        );
    }
}
ConcatenateAttr.propTypes = {
    str1: PropTypes.string.isRequired,
    str2: PropTypes.string.isRequired
}