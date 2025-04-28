import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

export default function QueryPage(){
    let urlParams = useParams();
    const [params, setParams] = useState(urlParams);
    console.log(params);
    

    /*useEffect(()=>{
        let params = useParams();
        setParams(params);
    }, []);*/
    

    return(
        <article>
            <h1>Query Page</h1>
            <div>
                {params.request}
            </div>
        </article>
    );
}