import { Link, Outlet } from "react-router-dom";

export function HomePage(){
    return(
        <>
            <nav className="navbar">
                <Link to='about'>about</Link>
                <Link to='comments'>comments</Link>
                <Link to='ui'>user interface</Link>
            </nav>

            <div className="nav_main_content">
                <Outlet/>
            </div>
            
        </>
        
    );
}

export function About(){
    return(
        <h1>This is About Page</h1>
    );
}

export function Comments(){
    return(
        <h1>This is Comments Page</h1>
    );
}

export function UI(){
    return(
        <div className="ui_page">
            <nav className="sidebar">
                <Link to='about'>about</Link>
            </nav>

            <div className="nav_main_content">
                <Outlet/>
            </div>
        </div>
    );
}