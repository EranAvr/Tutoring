export default function FirstNavbar(props){

    return(
        <nav style={{backgroundColor: "red"}}>
            <button onClick={()=>{
                props.changeLogin(!props.status)
            }}>login</button>
        </nav>
    );
}