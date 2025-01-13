import { useState } from "react";

export function FirstList(){
    const [list, setList] = useState([1, 2, 3]);

    return(
        <div>
            {list}
        </div>
    );
}

export function PowerList(){
    const [list, setList] = useState([1, 2, 3]);

    return(
        <div>
            {
                list.map( value => value**2 )
            }
        </div>
    );
}

export function FormattedList(){
    const [list, setList] = useState([10, 20, 30]);

    return(
        <div>
            {
                list.map( (value, index) => {
                    let str = "index="+index+" value="+value+", ";
                    return str;
                })
            }
        </div>
    );
}

export function ListComponent(){
    //const [list, setList] = useState();
    // if setList is useless, we can catch only 'list' variable-
    const [list] = useState([
        "Wajde",
        "Asaf",
        "Rabeaa"
    ]);

    return(
        <ol>
            {list.map( 
                value => <li> {value} </li>
            )}
        </ol>
    );
}

export function StyledList(){
    const [seasons] = useState(
        ["Summer", "Autumn", "Winter", "Spring"]
    );

    return(
        <div style={{textAlign: "start"}}>
            <h3>Seasons</h3>
            <ul>
                {
                    seasons.map( value => <li> {value} </li>)
                }
            </ul>
        </div>
        
    );
}


// This is the most correct way to build list:
export function ListWithKeys(){
    const [seasons] = useState(
        ["Summer", "Autumn", "Winter", "Spring"]
    );

    return(
        <div style={{textAlign: "start"}}>
            <h3>Seasons with Keys</h3>
            <ul>
                {/* key can be ANY string you want, as long as it's unique */}
                {
                    seasons.map( 
                        (value, index) => <li key={`#${value}-${index}`}> {value} </li>
                )}
            </ul>
        </div>
        
    );
}