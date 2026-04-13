import './App.css'
import { BrowserRouter, Routes, Route, Link, Outlet } from 'react-router-dom';
import NewsPage from './my_router2/news_page';
import SportPage from './my_router2/sport_page';
import UserDetails from './my_router2/user_details';
import SearchPage from './my_router2/search_page';

import ProtectedRoute from './my_router2/protected_route';
import { useState } from 'react';


/*

אנחנו רוצים ךבנות ראוטר עבור אתר חדשות.
הנתיבים השונים שנרצה ליצור הם:
/ (עבור דף הבית)
/news/world
/news/israel
/sport/Soccer
/sport/basketball
* (עבור נתיבים לא מוגדרים)

*/
function App() {

  const [user, setUser] = useState(null);

  return(
    <>
      <BrowserRouter>

        <nav>
          <Link to='/news' >News</Link> |
          <Link to='/sport' >Sport</Link> |
          <Link to='/user/guest' >User</Link> |
          <Link to='/search' >Search</Link> |
          <Link to='/settings' >Settings</Link> |
          <button onClick={() => setUser("My Name")}>Login</button>
          <button onClick={() => setUser(null)}>Logout</button>
          <span>User: {user}</span>
        </nav>

        <Routes>
          <Route index element={<h1>Home page</h1>}/>
          {/* Nested routes: */}
          <Route path='/news' element={<NewsPage/>}>
            <Route index element={<h2>This is the news category page !!!</h2>}/>
            <Route path='world' element={<h2>News of the World</h2>}/>
            <Route path='israel' element={<h2>News of Israel</h2>}/>
          </Route>
          <Route path='/sport' element={<SportPage/>}>
            <Route index element={<h2>This is the sport category page !!!</h2>}/>
            <Route path='soccer' element={<h2>Sport - Soccer</h2>}/>
            <Route path='basketball' element={<h2>Sport - Basketball</h2>}/>
          </Route>

          {/* URL parameters */}
          <Route path='/user/:role' element={<UserDetails/>}/>

          {/* Query parameters */}
          <Route path='/search' element={<SearchPage/>}/>

          {/* Protected route */}
          <Route path='/settings' element={<ProtectedRoute user={user}>
            <h2>Settings page - only for logged in users</h2>
          </ProtectedRoute>}/>
          
          <Route path='*' element={<h1>Error 404!</h1>}/>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App
