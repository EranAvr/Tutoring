import { useState } from "react";

export default function LoginCard(){
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");


    function handleSubmit(e){
        // שליחת המידע
        e.preventDefault(); // מניעה מרענון הדף ואיבוד המידע

        const dataObj = {   // יצירת אובייקט מעטפת לכל המידע שנשלח
            user: username,
            pass: password
        }

        console.log(dataObj);   // ממלא מקום לפעולת קצה על הדאטה

        // איפוס ה-state
        resetFields();
    }

    function handleReset(){
        if( confirm("Are you sure to delete?") ){
            resetFields();
        }
    }

    function resetFields(){
        setUsername("");
        setPassword("");
    }

    return(
        <form onSubmit={handleSubmit} onReset={handleReset}>
            <h1>My Form</h1>
            <input type="text" value={username} onChange={({target})=>{setUsername(target.value)}} /> <br />
            <input type="password" value={password} onChange={({target})=>{setPassword(target.value)}} /> <br />
            <hr />
            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
        </form>
    );
}