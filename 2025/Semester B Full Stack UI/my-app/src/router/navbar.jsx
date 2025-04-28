import { Link } from "react-router-dom";

export default function Navbar(){
    return(
        <nav>
            <Link to='/about'>About</Link>|
            <Link to='/signup'>Signup</Link>|
            <Link to='/deep/nested/page'>Deep</Link>|
            <Link to='/news'>News</Link>|
            <Link to='/cars'>Cars</Link>|
            <Link to="/query/:request=data">Query</Link>
            {/*<Link to={{
                        pathname: "/some/path",
                        search: "?query=string",
                        hash: "#hash",
                    }}
                    >Query</Link>*/}
        </nav>
    );
}