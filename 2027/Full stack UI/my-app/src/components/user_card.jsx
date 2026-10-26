export default function UserCard(){
    return(
        <div style={{width: 300}}>
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2XHmxROgOWcYHKaEW2-hBs09sUbpH-9kZarUft67BeA&s=10" alt="Image couldn't be loaded" width="200"/>
            <div style={{backgroundColor: "blue"}}>
                User Name:<span>{ "Eran" }</span> <br />
                Age: <span> {36} </span>
            </div>
            <p>
                  Lorem ipsum dolor sit amet consectetur adipisicing eli <br />
                t. Fugiat possimus sint sed eius! Veritatis quam adi <br />
                pisci ut laboriosam animi commodi in ea saepe officia <br />
                 corporis, quia expedita dicta maxime id.
            </p>
        </div>
    );
}