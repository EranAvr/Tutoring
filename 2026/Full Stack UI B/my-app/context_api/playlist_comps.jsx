import { useState } from "react";
import { usePlaylist } from "./playlist_context_with_reducer";


export function AddSongComp(){
    const [sName, setSName] = useState("");
    const playlistObj = usePlaylist();

    return(
        <div>
            <input value={sName} type="text" onChange={({target}) => setSName(target.value)}/>
            <button onClick={() => {
                playlistObj.dispatch({type: "ADD", song: sName});
                setSName("");
                }} >add</button>
        </div>
    );
}

export function PlaylistManager(){

    const playlistObj = usePlaylist();

    return(
        <div>
            <h2>My Playlist Manager</h2>
            
            <AddSongComp />

            <ol>
                {playlistObj && playlistObj.playlist.map(
                    song => <li key={playlistObj.playlist.indexOf(song)}> {song} </li>
                )}
            </ol>
        </div>
    );
}