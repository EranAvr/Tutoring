import { useParams } from "react-router-dom";

export default function UserDetails(){

    const params = useParams();

    return(
        <>
            <h1>User Details Page</h1>
            <p>
                 <img src="" alt="user image" />
            </p>
            <div>
                {
                params.role === "admin"
                ?
                <div>
                    <h2>You are an admin</h2>
                </div>
                :
                <div>
                    <h2>You are just a user</h2>
                </div>
                }
            </div>
        </>
    );
}