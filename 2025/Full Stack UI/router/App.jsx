import './App.css'

import { BrowserRouter, Routes, Route, Outlet } from 'react-router-dom';
import AboutPage from './router/about';
import SignUpPage from './router/signup';
import DeepPage from './router/deep'
import MainPage from './router/main';
import Error404 from './router/error_404';

import NewsPage, {LocalNewsPage, WorldNewsPage} from './router/news';
import CarsPage, {UsCarsPage, EuropeCarsPage} from './router/cars'

import Navbar from './router/navbar'


function App() {
  console.log("Main page loaded OK")

  return(
      <BrowserRouter>
        <Navbar/>
        
        <Routes>
          <Route index element={ <MainPage/> } />
          <Route path='about' element={ <AboutPage/> } />
          <Route path='signup' element={ <SignUpPage/> } />
          {/*
          <Route path='deep/nested/page' element={ <DeepPage />}/>*/}

          <Route path='news' element={<Outlet />}>
            <Route index element={<NewsPage/>}/>
            <Route path='local' element={<LocalNewsPage/>}/>
            <Route path='world' element={<WorldNewsPage/>}/>
          </Route>

          <Route path='cars' element={<CarsPage/>}>
            <Route path='us' element={<UsCarsPage/>}/>
            <Route path='europe' element={<EuropeCarsPage/>}/>
          </Route>

          <Route path='*' element={ <Error404/> }/>

        </Routes>
      </BrowserRouter>
  )
}

export default App
