
//import './App.css'
import { useState } from "react";
import Box from "./151126_lab_props_and_class_comps/box";
import MyContainer from "./151126_lab_props_and_class_comps/custom_containers";


function App() {
  const [color1, setColor1] = useState("lightBlue");
  function changer1(){
    if (color1 == "lightBlue")
      setColor1("red");
    else
      setColor1("lightBlue");
  }

  const [color2, setColor2] = useState("lightBlue");
  function changer2(){
    if (color2 == "lightBlue")
      setColor2("red");
    else
      setColor2("lightBlue");
  }

  return (

    <>
      <Box color={color1} changeColor={changer2} />
      <Box color={color2} changeColor={changer1} />
      <hr />
      <MyContainer>
        jwrngljsnrfrgsrfg <br />
        wsrgsrgfsd aae qefjn wolef <br />
        <hr />
        ooujuwrbrgwgr <br />
        Something something...
        <button>press me</button>

      </MyContainer>
    </>
  )
}

export default App
