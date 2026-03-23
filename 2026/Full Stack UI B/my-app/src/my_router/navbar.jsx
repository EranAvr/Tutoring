import { Link } from "react-router-dom";

export default function Navbar(){
    return(
        <nav style={style}>
            <Link to='/'>Home</Link>
            <Link to='/gallery'>Gallery</Link>
            <Link to='/about'>About</Link>
        </nav>);
}

const style = {
  width: "100vw",
  display: "flex",
  justifyContent: "space-around"
}