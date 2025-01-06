import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'



// Communication:
import {MyComButton, RightClickButton} from './communication & events/my_button'
import {MyNavbar, NavbarWithDetails} from './communication & events/my_navbar'

function App() {

  const [user, setUser] = useState(null);

  useEffect(() => {
    setUser({name: "Bobby", email: "rabeaa@email.org"});
  }, []);

  return (
    <>
      <MyNavbar user="User"/>
      <br />
      <NavbarWithDetails user={ user } />
      <br />
      <hr />
      <MyComButton title="click for event:" func={ (a) => {console.log(a)} }/>
      <br />
      <MyComButton title="click for target:" func={ (e) => {console.log(e.target)} }/>
        <br />
      <MyComButton title="click for target's id:" func={ (e) => {console.log(e.target.id)} }/>
        <br />
        <MyComButton title="click for target + nativeEvent:" func={ (e) => {
          console.log(e.target);
          console.log(e.nativeEvent);
          } }/>
      <br />
      <MyComButton title="click for shorten target:" func={ ({target, nativeEvent}) => {
        console.log(target);
        console.log(nativeEvent);
        } }/>
      <br />
      <br />
      <hr />
      <RightClickButton />



    </>
  )
}

export default App
