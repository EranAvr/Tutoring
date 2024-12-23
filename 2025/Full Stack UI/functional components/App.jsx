import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

import FirstComp from './components/first_comp'
import MyTitle from './components/title_comp'
import MyButton from './components/button_comp'

function App() {

  return (
    <>
      <MyTitle titleText="Test Title" />
      <MyButton btnText="button 1"/>
    </>
  )
}

export default App
