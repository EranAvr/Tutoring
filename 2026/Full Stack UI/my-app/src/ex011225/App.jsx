import './App.css'

import { Counter, BiDiCounter, EmptyButton, MySlider } from './ex011225/buttons'

function App() {

  function changeTheme(){
    alert("Theme has changed.")
  }

  return (
    <>
      <Counter />
      <br />
      <BiDiCounter />
      <br />
      <EmptyButton text="click me" action={()=>{alert("inline function!")}} />
      <EmptyButton text="do something" action={changeTheme} />
      <br />
      <MySlider />
    </>
  )
}

export default App
