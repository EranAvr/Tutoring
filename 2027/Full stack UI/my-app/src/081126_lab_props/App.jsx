
//import './App.css'
import ImageLink from "./081126_lab_props/image_link"
import ConditionalGreeting from "./081126_lab_props/conditional_greeting"
import { useState } from "react"
import FirstNavbar from "./081126_lab_props/navbar";
import Title from "./081126_lab_props/title_with_props";

function App() {
  const [isLogged, setIsLogged] = useState(false);

  return (

    <>
    <FirstNavbar status={isLogged} changeLogin={setIsLogged} />
    <Title text={isLogged ? "Logged in" : "Not logged"}/>
    <br />
    <br />
      <ConditionalGreeting />
        <hr />

      <ImageLink href="https://www.google.com/search?sca_esv=ff1aaf1d00a7b0b4&sxsrf=AKL5yDiV4pzJ0aOhLF0p7_LH6TmxDA2TKA:1794151055407&udm=2&fbs=ACAhTvwdifjn2dKXmjtOfBxVFl_koHVe5RLSnJlTH2QYaq_YVWJKALjCNlIJviHEZmQkH1sn-YIO7qUGKgahHUqK1rQegW72r5NeTYPJan702itZhX9Yi9fEktdOhHXQWNNSLLj2hXBPedSUG_08e_p0Uwtyopx29P0LyjDYIvbDyVFFKezsXy10JD7HRV2ZVbLShiqbTOBwFu4rU5KFSOa_T7Ev8f70OQ&q=images&sa=X&ved=2ahUKEwitqtLC1fiXAxVh2AIHHUkTJu4QtKgLegQIFhAB&biw=1707&bih=772&dpr=1.13#sv=CAMSUxoyKhBlLTFIN2Y3TkFtOFNVcmtNMg4xSDdmN05BbThTVXJrTToOTjlwSUNuNHlxZUtwQU0gBCoXCgFzEhBlLTFIN2Y3TkFtOFNVcmtNGAEwAVACGAcg2uvotg1KCBACGAEgAigB" 
        src="https://img.magnific.com/free-photo/closeup-scarlet-macaw-from-side-view-scarlet-macaw-closeup-head_488145-3540.jpg?semt=ais_hybrid&w=740&q=80" 
        alt="image could not load"/>
    </>
  )
}

export default App
