import './App.css'
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Navbar from './my_router/navbar';

function App() {

  return(
    <>
      <BrowserRouter>
        
        <Navbar />

        <Routes>
          <Route path='/' element={<h1>Home Page</h1>}/>
          <Route path='/gallery' element={<h1>Gallery Page</h1>}/>
          <Route path='/about' element={<h1>About Page</h1>}/>

          <Route path='*' element={<h1>Error 404! <br />Page not found</h1>}/>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App
