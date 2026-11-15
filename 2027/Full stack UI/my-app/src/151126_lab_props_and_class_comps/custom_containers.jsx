export default function MyContainer(props){

    return(
        <div>
            <h1>{props.title ?? "Title"}</h1>
            {
                props.children
            }
        </div>
    );
}