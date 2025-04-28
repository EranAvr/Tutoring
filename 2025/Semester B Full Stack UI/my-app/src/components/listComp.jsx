import react from 'assert'
import { useState } from 'react'
import ViteLogo from '/vite.svg'
import ReactLogo from '../assets/react.svg'


const styles = {
    container: {
        width: "500px",
        border: "1px solid black"
    },
    header: {
        backgroundColor: "darkgrey",
        padding: "20px"
    },
    body: {
        backgroundColor: "azure",
    },
    listItem: {
        display: "flex",
        flexDirection: "row",
        justifyContent: "space-between",
        alignItems: "center",
        backgroundColor: "lightgrey",
        borderRadius: "10px",
        paddingLeft: "10px",
        marginBottom: "10px"
    }
}

export default function ListComponent(props){
    const [items, setItems] = useState(["David", "Jason", "Ariel", "Times new Roman"]);

    const [editIndex, setEditIndex] = useState(null);
    const [editText, setEditText] = useState("");

    function handleDelete(idx){
        console.log(idx)
        setItems(items.filter((val, i) => i !== idx))
    }
    function handleUpdate(idx){
        setEditIndex(idx);
        setEditText(items[idx]);
    }
    function handleSave(){
        const updated = [...items];
        updated[editIndex] = editText;
        setItems(updated);
        setEditIndex(null);
    }

    return(
        <div style={styles.container}>
            <div style={styles.header}>
                <img src={ReactLogo} alt="" />
                <h3> {props.title} </h3>
            </div>
            <div style={styles.body}>
                {
                    items.map( (value, index) => 
                    <div key={index} style={styles.listItem}>
                        <div>
                            {editIndex === index
                                ?
                                <input value={editText} onChange={({target})=>{setEditText(target.value)}}/>
                                :
                                value
                            }
                        </div>
                        <div>
                            {editIndex === index
                            ?
                            <button onClick={ () => {handleSave()} } style={{backgroundColor: "green"}}>save</button>
                            :
                            <button onClick={ () => {handleUpdate(index)} } style={{backgroundColor: "yellow"}}>update</button>
                            }
                            <button onClick={ () => {handleDelete(index)} } style={{backgroundColor: "red"}}>delete</button>
                        </div>
                        
                    </div>
                 )
                }
            </div>
        </div>
    )
}