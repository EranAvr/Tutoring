import { useSearchParams } from "react-router-dom";

export default function SearchPage(){

    const [params, setParams] = useSearchParams();

    function handleSubmit(e){
        //e.preventDefault()
    }

    return(
        <>
            <h1>Search Page</h1>
            <form method="get" onSubmit={handleSubmit}>
                <input type="text" placeholder="Enter search words" />
                <button type="submit">Submit</button>
            </form>
            {
            params.get('q') && <div>
                <h2>Results</h2>
                {params.get('q')}
            </div>
            }
            
        </>
    );
}