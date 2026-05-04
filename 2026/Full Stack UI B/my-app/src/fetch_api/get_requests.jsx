import { useEffect, useState } from "react";

export function PresentUsers(){

    const [users, setUsers] = useState(null);

    // then-catch version:
    /*useEffect(()=>{
        fetch("https://jsonplaceholder.typicode.com/users")
            .then(response => response.json())
            .then(myJson => {
                console.log(typeof(myJson[0])); // בדיקה עבורנו לראות את טיפוס האובייקט
                setUsers(myJson)
            })
            .catch(error => console.error(error));
    }, []);*/

    // async-await version:
    async function fetchUsers(){
        try{
            let response = await fetch("https://jsonplaceholder.typicode.com/users");
            let myJson = await response.json();
            setUsers(myJson);
        }
        catch(err){
            console.error(err);
        }
        
    }
    useEffect(
        ()=>{fetchUsers()}
        , []);

    return(
        <div>
            <h2>Users</h2>
            <div>
                {
                    users && users.map(
                        user => <p key={user.id}>#{user.id} | {user.name} {user.username} {user.email}</p>
                    )
                }
            </div>
        </div>
    );
}

export function ImageContainer(){
    const [src, setSrc] = useState(null);
    const [size, setSize] = useState(200);

    useEffect(
        () => {
            fetch("https://picsum.photos/"+size)
                .then(response => response.blob())
                .then(myBlob => URL.createObjectURL(myBlob))
                .then(url => setSrc(url))
                .catch(error => console.error(error));
        },
        [size]
    );

    return(
        <div>
            <input value={size} type="number" onChange={({target}) => {setSize(target.value)}} /> <br />
            <img src={src} alt="image could not load" />
        </div>
    );
}