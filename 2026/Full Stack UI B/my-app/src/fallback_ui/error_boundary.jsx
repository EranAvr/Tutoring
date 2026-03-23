import { Component } from "react";

export default class UsersList extends Component{
    // מימוש בנאי על כל שלביו
    // יצירת משתנה-מצב דגל לסימון האם יש שגיאות
    constructor(props){
        super(props);
        this.state = {
            hasError: false
        };
    }

    // מימוש מתודות מיוחדות
    // אלה המתודות שמסמנות את הרכיב בתור Error-Boundary
    static getDerivedStateFromError(error){
        return {hasError: true};
    }
    componentDidCatch(error, errorInfo){
        console.log(error);
        console.log(errorInfo);
    }

    render(){
        if(this.state.hasError){
            return <h3>Error occurred! <br />Check log window...</h3>
        }

        return <ul>{this.props.children}</ul>;
    }
}