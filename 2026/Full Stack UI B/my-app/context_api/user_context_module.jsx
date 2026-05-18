import { createContext, useContext, useState } from "react";

// 1) create context object
const UserContext = createContext();


// 2) our custom Provider component
export function UserProvider({children}){
    const [user, setUser] = useState(null);

    const toggleUser = () => {
        setUser(user ? null : "seddgfbfd");
    }

    return(
        <UserContext.Provider value={{user, toggleUser}}>
            <div>
                {children}
            </div>
        </UserContext.Provider>
    );
}

// 3) our custom hook for useContext
export const useUser = () => useContext(UserContext);