(() => {
    console.log("printed from IIFE");

    document.getElementById("window_size").innerText = "W:"+window.innerWidth+", H:"+window.innerHeight;
})()