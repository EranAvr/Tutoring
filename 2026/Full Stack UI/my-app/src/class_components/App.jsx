import './App.css'

import MyTitle from './class_components/my_title'
import ColorTitle from './class_components/color_title'
import MyContainer from './class_components/my_container'
import ClickedContainer from './class_components/clicked_container'

function App() {

  return (
    <>
      <MyTitle />
      <ColorTitle color="red" />
      <ColorTitle color="green" />
      <ColorTitle color="purple" />

<hr />

      <MyContainer>
              <ColorTitle color="red" />
              <p>Some long text...</p>
              <img src="" alt="no photo" />
      </MyContainer>

<hr />

      <ClickedContainer>
        <br />
        <br />
        <br />
        <br />
        <br />
        <br />
      </ClickedContainer>
    </>
  )
}

export default App
