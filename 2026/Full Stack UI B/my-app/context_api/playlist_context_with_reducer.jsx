import { createContext, useContext, useReducer, useState } from "react";


// 1) create context
const PlaylistContext = createContext(null);


// 2) custom provider
export function PlaylistProvider({children}){
    /*
        בעבודה הפשוטה עם context,
        נצטרך להעביר אובייקט דרך ה-Provider
        שמכיל את כל פונ' העדכון השונות שיצרנו.
        יכולות להיות הרבה!!
    */
    /*const [playlist, setPlaylist] = useState([]);

    function addItem(song){
        setPlaylist([...playlist, song]);
    }
    function deleteItem(song){
        setPlaylist(
            playlist.filter(s => s !== song)
        )
    }*/

    
    // a) implement the update function (reducerFunc)
    const reducerFunc = (state, action) => {
        switch (action.type) {
            case "ADD":
                return [...state, action.song];
            case "DELETE":
                return state.filter(s => s !== action.song)
            case "UPDATE":
                
                break;
            case "SORT":
                
                break;
            case "SEARCH":
                
                break;
        }
    }
    // b) create state with useReducer
    const [playlist, dispatch] = useReducer(reducerFunc, []);

    return(
        <PlaylistContext.Provider value={{playlist, dispatch}}>
            {children}
        </PlaylistContext.Provider>
    );
}


// 3)
export const usePlaylist = () => useContext(PlaylistContext);