import { Outlet, Link } from "react-router-dom";

export default function NewsPage(){
    return(
        <>
            <h1>Main News Page</h1>
            <nav>
                <Link to='local'>Local</Link>|
                <Link to='world'>World</Link>|
            </nav>
        </>
        
    );
}

export function LocalNewsPage(){
    return(
        <h1>Local News Page</h1>
    );
}

export function WorldNewsPage(){
    return(
        <h1>Worldwide News Page</h1>
    );
}