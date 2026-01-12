import { useState } from "react";

let ID = 4;

export default function ArtistsList(){

    const [artists, setArtists] = useState([
        {id: 1, artist: "Bob Dylan"},
        {id: 2, artist: "Michael Jackson"},
        {id: 3, artist: "Eminem"}
    ]);
    const [newText, setNewText] = useState("");
    const [updateText, setUpdateText] = useState("");

    return(
        <div style={myStyle}>
            <div>
                <input value={newText} onChange={({target})=>{setNewText(target.value)}} type="text" placeholder="Enter new artists"/>
                <button onClick={()=>{
                    console.log(ID);
                    setArtists([
                        ...artists,
                        {id: ID++, artist: newText}
                    ]);
                    setNewText("");
                    }}>Add</button>
            </div>
            <div>
                <input value={updateText} onChange={({target})=>{setUpdateText(target.value)}} 
                type="text" placeholder="Enter update text"/>
            </div>
            <hr />
            {
                artists.map((value, index) => 
                    <div key={index}>
                        {value.id} - {value.artist}

                        <button onClick={()=>{
                            setArtists(artists.filter(
                                a=>a.id !== value.id
                            ))
                        }}>delete</button>

                        <button onClick={()=>{
                            const newList = artists.map((v, i) => {
                                if(v.id === value.id && updateText !== ""){
                                    return {id: v.id, artist: updateText}
                                }
                                else {
                                    return v;
                                }
                            });
                            setArtists(newList);
                            setUpdateText("");
                        }}>Update</button>
                    </div>
                )
            }
        </div>
    );
}

const myStyle = {
    border: "5px solid black"
}