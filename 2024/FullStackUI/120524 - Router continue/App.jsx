import { useState } from 'react'
import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import {About, Comments, HomePage, UI, MyInfo, ManageUsers} from './components/pages'
import Login from './components/login_card'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<HomePage/>}>
            <Route path='/login' element={<Login/>}/>
            <Route path='/about' element={<About/>}/>
            <Route path='/comments' element={<Comments/>}/>
            <Route path='/ui' element={<UI user="admin"/>}>
              <Route path='/ui/info' element={<MyInfo/>}/>
              <Route path='/ui/manage' element={<ManageUsers/>}/>
            </Route>

            <Route path='*' element={<h2>404 Error Page</h2>}/>
          </Route>
          
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
