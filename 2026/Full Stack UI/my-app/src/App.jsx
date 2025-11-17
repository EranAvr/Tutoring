import './App.css'

import MyTitle from './components/my_title'
import MyList from './components/my_list'
import Button from './components/button'
import { useState } from 'react'
import UpdaterButton from './components/updater'

function App() {

  const [count, setCount] = useState(0);
  function increment(){
    setCount(count + 1);
  }

  const [log, setLog] = useState("Off");
  function logging(){
    log === "Off" ? setLog("On") : setLog("Off");
  }

  return (
    <>
      {/*<MyTitle text="My Title Component" color={"red"}/>
      <Button/>*/}
      <nav>
        User is: {log} <br />
        <UpdaterButton text="logging" action={logging}/>
      </nav>






      <hr />








      <div>
        <h3>Your count: {count}</h3>
        <UpdaterButton text="update" action={increment}/>
      </div>
    </>
  )
}

export default App
