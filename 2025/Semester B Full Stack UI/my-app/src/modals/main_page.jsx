import { useState } from "react";
import ModalPopup from "./modal_popup";



export default function PresenterPage(){
    const [showPopup, setShowPopup] = useState(false);

    return(
        <div>
            <h1>Some Title</h1>
            <nav>
                <a href="#">link 1</a>
                <a href="#">link 2</a>
                <a href="#">link 3</a>
            </nav>
            <article>
                <h3>More content...</h3>
                <p>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. <br />
                    Esse delectus repellendus harum. <br />
                    Dolor est ipsa eveniet minus delectus maxime deleniti quos tempora! <br />
                    Quod deserunt, facilis reiciendis adipisci incidunt necessitatibus doloribus. <br />
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. <br />
                    Esse delectus repellendus harum. <br />
                    Dolor est ipsa eveniet minus delectus maxime deleniti quos tempora! <br />
                    Quod deserunt, facilis reiciendis adipisci incidunt necessitatibus doloribus. <br />
                </p>
            </article>
            <div>
                <h3>Model button</h3>
                <button onClick={() => {setShowPopup(true)}}>Open modal</button>
            </div>

            {/* Modal content: */}
            {
                showPopup
                &&
                <ModalPopup pop={setShowPopup} />
            }
        </div>
    );
}