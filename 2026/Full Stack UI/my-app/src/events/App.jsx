import './App.css'

import { Clicker, WideClicker, MultiClicker } from './events/clickers'
import { ContextMenuEvent, DisappearingCube, WheelComp, CubeChangeByMouse } from './events/mouse_events'
import { GameBoard } from './events/keyboard_events'
import { CopiedImage } from './events/clipboard'

function App() {

  return (
    <>
      <Clicker />
      <WideClicker />
      <hr />
      <MultiClicker />
      <br />
      <hr />
      <br />
      <ContextMenuEvent />
      <DisappearingCube />
      <p>Some paragraph after box</p>
      <WheelComp />
      <CubeChangeByMouse />
      <br />
      <hr />
      <br />
      <GameBoard />
      <br />
      <hr />
      <br />
      <CopiedImage />
    </>
  )
}

export default App
