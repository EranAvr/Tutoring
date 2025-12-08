export function ReadText({length}){

    return(
        <>
        {
            length < 200
            ?
            <input type="text"/>
            :
            <textarea></textarea>
        }
        </>
    );
}


export function InputCard({sign}){

    return(
        <div>
            <input type="text" placeholder="Enter username" /> <br />
            <input type="password" placeholder="Enter password" /> <br />
            {
                sign === "in"
                ?
                <button onClick={()=>{alert("Signing in")}}>Sign in</button>
                :
                <button onClick={()=>{alert("Signing up")}}>Sign up</button>

            }
        </div>
    );
}


export function ChangingMenu({user}){

    let content;
    if(user === "admin"){
        content = <ul>
            <li>admin 1</li>
            <li>admin 2</li>
        </ul>
    }
    else if(user === "guest"){
        content = <ul>
            <li>guest 1</li>
            <li>guest 2</li>
        </ul>
    }
    else
        content = <p>No user is connected</p>

    return(
        <div>
            <h3>Menu</h3>
            <hr />
            {content}
        </div>
    );
}