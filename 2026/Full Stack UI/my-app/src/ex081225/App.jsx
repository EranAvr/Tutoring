import './App.css'

import ConTitle from './conditional_rendering/con_title'
import {LoginButton, LoginPerUser} from './conditional_rendering/log_btn'
import ConHeader from './conditional_rendering/con_header'
import { ChangingMenu } from './ex081225/ex'

function App() {

  return (
    <>
      <ConHeader logged={true}/>
      <ConTitle state="come" />
      <ConTitle />
      <br />
      <LoginButton username="Bobby" />
      <LoginButton />
      <br />
      <LoginPerUser type="admin" />
      <LoginPerUser />
      <br />
      <ChangingMenu user="admin"/>
    </>
  )
}

export default App
