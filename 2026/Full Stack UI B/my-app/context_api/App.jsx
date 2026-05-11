import { useContext, useState } from 'react';
import './App.css'
import { Comp1, Comp2, Comp3, LeafCompTest } from './context_api/demo_comps';
import ThemeContext from './context_api/theme_context';


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

function App() {
  const [theme, setTheme] = useState("light");

  return(
    <>
    <ThemeContext.Provider value={{theme, setTheme}}>
      <Comp1>
        <nav>
          <button onClick={()=>{setTheme(theme==='light' ? 'dark' : 'light')}}>Change theme</button>
        </nav>
        <Comp2>
          <Comp3>

            <LeafCompTest />

          </Comp3>
        </Comp2>
      </Comp1>
    </ThemeContext.Provider>
    </>
  );
}

export default App
