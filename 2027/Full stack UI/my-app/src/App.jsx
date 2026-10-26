import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
//import './App.css'
import UserCard from './components/user_card'

import Title from "./components/title"
import Counter from './components/counter'


function App() {

  return (
    <>
      <Counter/>
      <hr />
      <Title/>
      <hr />
      <UserCard/>
      <UserCard/>
      <UserCard/>
      <UserCard/>
      <UserCard/>
    </>
  )
}

export default App
