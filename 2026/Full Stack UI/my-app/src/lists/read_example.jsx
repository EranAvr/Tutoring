import { useState } from "react";

export function SideMenu(){

    const [links, setLinks] = useState(["Home", "Gallery", "Settings", "About", "Profile"]);

    return(
        <ul style={myStyle}>
            {
                links.map((value, idx)=>{return <li key={idx}>{value}</li>})
            }
        </ul>
    );
}

export function VideoList(){

    const [links, setLinks] = useState([
        {title: "View", desc: "A man on a rock", src: "https://images.unsplash.com/photo-1526779259212-939e64788e3c?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZnJlZSUyMGltYWdlc3xlbnwwfHwwfHx8MA%3D%3D"},
        {title: "Photographer", desc: "A woman with a camera", src: "https://images.unsplash.com/photo-1575936123452-b67c3203c357?fm=jpg&q=60&w=3000&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D"},
        {title: "Elephant", desc: "An elephant in the safari", src: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1AKF7LelsXtbK8YAYYdiPrDMZdFd74ZTgkQ&s"},
    ]);

    return(
        <div style={myStyle}>
            {
                links.map((value, idx) => 
                    <MyListItem key={idx} value={value}/>
                )
            }
        </div>
    );
}
function MyListItem(props){

    const {title, desc, src} = props.value;

    return(
        <div style={{display: "flex", width: "300px", margin: "10px"}}>
                        <img src={src} alt="" style={{width: "50%"}}/>
                        <div>
                            <h3 style={{textAlign: "center"}}>{title}</h3>
                            <p style={{textAlign: "center"}}>{desc}</p>
                        </div>
                    </div>
    );
}

const myStyle = {
    border: "5px solid black"
}
