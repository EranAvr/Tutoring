import { useState } from 'react'
import './App.css'
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom'
import {About, Comments, HomePage, UI} from './components/pages'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<HomePage/>}>
            <Route path='/about' element={<About/>}/>
            <Route path='/comments' element={<Comments/>}/>
            <Route path='/ui' element={<UI/>}>
              <Route path='/ui/about' element={<About/>}/>
            </Route>

            <Route path='*' element={<h2>404 Error Page</h2>}/>
          </Route>
          
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
