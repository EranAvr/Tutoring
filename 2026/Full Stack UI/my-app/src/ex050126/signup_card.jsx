import { useState } from "react";

export default function SignupCard(){
    const [user, setUser] = useState("");
    const [email1, setEmail1] = useState("");
    const [email2, setEmail2] = useState("");
    const [gender, setGender] = useState("");
    const [lang, setLang] = useState("");

    function handleSubmit(e){
        // שליחת המידע
        e.preventDefault(); // מניעה מרענון הדף ואיבוד המידע

        const dataObj = {   // יצירת אובייקט מעטפת לכל המידע שנשלח
            'user': user,
            'email1': email1,
            'email2': email2,
            'gender': gender,
            'language': lang
        }

        console.log(dataObj);   // ממלא מקום לפעולת קצה על הדאטה

        // איפוס ה-state
    }

    return(
        <form onSubmit={handleSubmit}>
            <h1>Signup Form</h1>
            <input value={user} type="text" placeholder="Enter username" onChange={({target})=>{setUser(target.value)}}/> <br />
            <input value={email1} type="email" placeholder="Enter email 1"  onChange={({target})=>{setEmail1(target.value)}}/> <br />
            <input value={email2} type="email" placeholder="Enter email 2"  onChange={({target})=>{setEmail2(target.value)}}/> <br />
            
            <hr />

            Gender:
            <input name="gender" type="radio" value="Male" onChange={({target})=>{setGender(target.value)}} />Male
            <input name="gender" type="radio" value="Female" onChange={({target})=>{setGender(target.value)}} />Female
            <br />
            Favorite Language:
            <select onChange={({target})=>{setLang(target.value)}} required>
                <option value={null}>Choose language</option>
                <option value="python">Python</option>
                <option value="php">Php</option>
                <option value="c">C</option>
                <option value="javascript">Javascript</option>
            </select>

            <button type="submit">Submit</button>
            <button type="reset">Reset</button>

        </form>
    );
}