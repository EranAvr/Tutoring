import { Link, Outlet } from "react-router-dom";

export default () => <>
          <h1>Sport Page</h1>
          <nav>
            <Link to='soccer' >Soccer</Link> |
            <Link to='basketball' >Basketball</Link>
          </nav>
          <Outlet/>
          </>;