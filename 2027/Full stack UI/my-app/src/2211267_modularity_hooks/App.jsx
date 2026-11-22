
//import './App.css'
import { add, exponent } from "./2211267_modularity_hooks/math";
import Calc from "./2211267_modularity_hooks/math";
import ThemedContainer from "./2211267_modularity_hooks/themed_container";


function App() {
  
  console.log(add(5, 15));
  console.log(exponent(2, 10));

  return (

    <>
      <ThemedContainer>
        <h1>My Container with Theme</h1>
        <p>
          bla bla bla <br />
          And another bla <br />
        </p>
      </ThemedContainer>
    </>
  )
}

export default App
