import { Link, Outlet } from "react-router-dom";

export default () => <>
          <h1>News Page</h1>
          <nav>
            <Link to='world' >World</Link> |
            <Link to='israel' >Israel</Link>
          </nav>
          <Outlet/>
          </>;