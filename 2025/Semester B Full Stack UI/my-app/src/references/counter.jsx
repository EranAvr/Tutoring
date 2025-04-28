import { useRef } from "react";

const styles = {
    navbar: {
        width: "100vw",
        display: "flex",
        justifyContent: "space-evenly",
        backgroundColor: "bisque"
    }
}

export function Counter(){
    const countRef = useRef(0);

    function handleCount(){
        countRef.current = countRef.current + 1;
        console.log(`Button clicked ${countRef.current} times`);
    }

    return(
        <button onClick={handleCount}>Click me</button>
    );
}

export function CounterBothSides(){
    const countRef = useRef(0);

    function handleCount(val){
        countRef.current = countRef.current + val;
        console.log(`Clicked up ${countRef.current} times`);
    }


    return(
        <div>
            <button onClick={() => {handleCount(1)}}>Count up</button>
            <button onClick={() => {handleCount(-1)}}>Count down</button>
        </div>
    );
}

export function NavbarCounter(){

    const countRef = useRef({countHome: 0, countGallery: 0, countAbout: 0});

    function handleCount(key){
        switch (key) {
            case 0:
                countRef.current.countHome = countRef.current.countHome + 1; 
                break;
            case 1:
                countRef.current.countGallery = countRef.current.countGallery + 1;
                break;
            case 2:
                countRef.current.countAbout = countRef.current.countAbout + 1;
                break;
            default:
                break;
        }
        console.log(countRef.current);
    }

    return(
        <nav style={styles.navbar}>
            <a onClick={()=>{handleCount(0)}} href="#">Home</a>
            <a onClick={()=>{handleCount(1)}} href="#">Gallery</a>
            <a onClick={()=>{handleCount(2)}} href="#">About</a>
        </nav>
    );
}
