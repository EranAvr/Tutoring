import { useContext, useState } from 'react';
import './App.css'
import { Comp1, Comp2, Comp3, LeafCompTest } from './context_api/demo_comps';
import ThemeContext from './context_api/theme_context';

import { useUser, UserProvider } from './context_api/user_context_module';
import { PlaylistManager } from './context_api/playlist_comps';
import { PlaylistProvider } from './context_api/playlist_context_with_reducer';


const styles = {
  light: {
    color: "black",
    backgroundColor: "aliceblue"
  },
  dark: {
    color: "aquamarine",
    backgroundColor: "rgb(14, 0, 52)"
  }
}


function MyNavbar(){
  const curUser = useUser();

  return(
    <nav>
      { console.log(useUser()) }
      <button onClick={curUser.toggleUser}> {curUser.user ?? "disconnected"} </button>
    </nav>
  );
}

function App() {
  const [theme, setTheme] = useState("light");

  return(
    <>
    <ThemeContext.Provider value={{theme, setTheme}}>
      <UserProvider>

        <Comp1>
          <nav>
            <button onClick={()=>{setTheme(theme==='light' ? 'dark' : 'light')}}>Change theme</button>
          </nav>
          <MyNavbar />
          <Comp2>
            <Comp3>

              <LeafCompTest />

            </Comp3>
          </Comp2>
        </Comp1>

        <hr />
        <PlaylistProvider>

          <PlaylistManager />
          
        </PlaylistProvider>

      </UserProvider>
    </ThemeContext.Provider>
    </>
  );
}

export default App
