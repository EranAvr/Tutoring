import { useState, useEffect, useCallback } from "react";

export function GameBoard(){

    const [url, setUrl] = useState("https://i.pinimg.com/736x/37/71/60/37716068933bae2f9b11ff90bc91b015.jpg");
    const [pawn, setPawn] = useState("https://static.vecteezy.com/system/resources/thumbnails/021/975/110/small/pawn-3d-render-icon-illustration-with-transparent-background-chess-game-png.png");
    const [pawnSize, setPawnSize] = useState("50px");
    const [lefty, setLefty] = useState(0);
    const [topy, setTopy] = useState(0);
    
    // Should try wrap the event handler with useCallback() hook
    const handleKeyDown = (e) => {
                    console.log(e);
                    if (e.code == "ArrowDown")
                        setTopy(topy + 50)
                    else if (e.code == "ArrowRight")
                        setLefty(lefty + 50)
                    else if (e.code == "ArrowUp")
                        setTopy(topy - 50)
                    else if (e.code == "ArrowLeft")
                        setLefty(lefty - 50)
                }

    useEffect(() => {
        document.addEventListener('keydown', handleKeyDown);

        return () => {
            document.removeEventListener('keydown', handleKeyDown);
        };
    }, [handleKeyDown]);

    return(
        <>
        {
            /*
                Note,
                If we want the child to be positioned 'absolute' inside
                its parent, we must declare the parent as 'position: relative'.
            */
        }
        <div style={{position: "relative", backgroundImage: `url(${url})`, width: "700px", height: "600px"}}>
            <img src={pawn} alt="could not load" style={{width: pawnSize, height: pawnSize, position: "absolute", top: topy, left: lefty}} 
            />
        </div>
        </>
    );
}