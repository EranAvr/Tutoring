import { Link, Outlet } from "react-router-dom";

export function HomePage(){
    return(
        <>
            <nav className="navbar">
                <Link to='about'>about</Link>
                <Link to='comments'>comments</Link>
                <Link to='ui'>user interface</Link>
                <Link to='login'>log in</Link>
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

export function MyInfo(){
    return(
        <h1>This is user-info Page</h1>
    );
}

export function ManageUsers(){
    return(
        <h1>This is users managing Page</h1>
    );
}

export function UI(props){
    return(
        <div className="ui_page">
            {
                sessionStorage.getItem("type") == "admin"
                ?
                <AdminUI />
                :
                <UserUI />
            }

            <div className="nav_main_content">
                <Outlet/>
            </div>
        </div>
    );
}

function AdminUI(){
    return(
        <nav className="sidebar">
                <Link to='info'>user info</Link>
                <Link to='manage'>manage users</Link>
            </nav>
    );
}

function UserUI(){
    return(
        <nav className="sidebar">
                <Link to='info'>user info</Link>
                
            </nav>
    );
}