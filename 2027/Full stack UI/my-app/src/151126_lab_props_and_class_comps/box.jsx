

export default function Box(props){

    const styles = {
        backgroundColor: props.color,
        width: "100px",
        height: "100px"
    }

    return(
        <div style={styles}>
            <button onClick={props.changeColor}>press me</button>
        </div>
    );
}