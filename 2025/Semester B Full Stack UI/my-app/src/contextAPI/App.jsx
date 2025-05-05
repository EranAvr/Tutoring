//import './App.css'
import './contextApp.css'

import ThemeContext from './contextAPI/theme_context'
import ThemedNavbar from './contextAPI/ThemedNavbar'
import ThemedContainer from './contextAPI/themed_container'

import UserContext from './contextAPI/user_context'

import { CartContext, CartProvider } from './contextAPI/cart_provider'
import PresentCart from './contextAPI/present_cart'

import { useContext, useState } from 'react'

function App() {
  console.log("Main page loaded OK")

  const [myTheme, setMyTheme] = useState('light');
  const [username, setUsername] = useState(""); // variable to track login form field
  const [authInfo, setAuthinfo] = useState({}); // state variable to save logged-in user

  return(
    <ThemeContext.Provider value={myTheme}>
      <UserContext.Provider value={authInfo}>

      <ThemedContainer>
        <main>
          <header>
            <h1>Context API Example</h1>
            <ThemedNavbar/>
          </header>
          <article>
          <button onClick={() => {setMyTheme(myTheme=='light'?'dark':'light')}}>Change theme</button>
            <div>
              <h3>Login card</h3>
              <input onChange={({target})=>{setUsername(target.value)}} value={username} type="text" placeholder='Enter username' />
              <button onClick={()=>{setAuthinfo(
                {userName: username, imgUrl: 'https://cdn.iconscout.com/icon/free/png-256/free-laptop-user-icon-download-in-svg-png-gif-file-formats--workplace-office-employee-businessman-flat-business-icons-1-pack-1179329.png'}
                )}}>Log in</button>
            </div>
            <p>
              Body of document
            </p>
            <p>
              Lorem ipsum dolor sit amet, <br />
              consectetur adipisicing elit. <br />
              Neque aliquid voluptatem, <br />
              ratione quos vitae expedita nulla laborum <br />
              error nostrum dolor numquam ea natus eaque ad <br />
              molestiae mollitia asperiores unde aut? <br />
            </p>
          </article>
          <CartProvider>
            <PresentCart/>
          </CartProvider>
        </main>
      </ThemedContainer>
      
      </UserContext.Provider>
    </ThemeContext.Provider>
      
  )
}

export default App
