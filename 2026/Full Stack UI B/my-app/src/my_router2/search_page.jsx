import { useSearchParams } from "react-router-dom";

export default function SearchPage(){

    const [params, setParams] = useSearchParams();

    function handleSubmit(e){
        /*
            Note: We can either use the default reloading of the page 
            to update the query parameters,
            or we can prevent the default and update the query parameters ourselves,
            using setParams().
        */

        e.preventDefault();

        setParams({q: e.target.q.value});
    }

    return(
        <>
            <h1>Search Page</h1>
            <form method="get" onSubmit={handleSubmit}>
                <input name="q" type="text" placeholder="Enter search words" />
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