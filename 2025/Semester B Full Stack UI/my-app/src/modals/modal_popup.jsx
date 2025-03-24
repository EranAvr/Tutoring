import { useState } from "react";

const styles = {
    modalWindow: {
        backgroundColor: "#70707068",
        width: "100vw",
        height: "100vh",
        position: "fixed",
        top: "0px",
        left: "0px",
        zIndex: "1000",
        display: "flex",
        justifyContent: "center",
        alignItems: "center"
    },
    modalContent: {
        backgroundColor: "white",
        padding: "20px",
        border: "3px solid black",
        borderRadius: "15px"
    }
}

export default function ModalPopup(props) {
    const [inputText, setInputText] = useState("");

    return (
        <div style={styles.modalWindow}>
            <div style={styles.modalContent}>
                <p>
                    Some paragraph with message to user. <br />
                    Do you agree?
                </p>
                <div>
                    <input onChange={({target})=>{setInputText(target.value)}} type="text" placeholder="Enter your answer"/>
                </div>
                <div>
                        <button>button 1</button>
                    <button
                        onClick={() => {
                            props.pop(false);
                        }}
                    >
                        close
                    </button>
                </div>
                
            </div>
        </div>
    );
}
