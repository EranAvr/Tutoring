import { Outlet, Link } from "react-router-dom";

export default function CarsPage(){
    return(
        <>
            <h1>Main Cars Page</h1>
            <nav>
                <Link to='us'>US</Link>|
                <Link to='europe'>Europe</Link>|
            </nav>
            <Outlet />
        </>
        
    );
}

export function UsCarsPage(){
    return(
        <h1>Cars in the US</h1>
    );
}

export function EuropeCarsPage(){
    return(
        <h1>Cars in Europe</h1>
    );
}