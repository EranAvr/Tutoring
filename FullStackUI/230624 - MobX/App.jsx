import { observer } from 'mobx-react';
import './App.css'

import { count, increment, decrement, setValue } from './mobx2/countState';

// Notice!
// The components that use mobx store, i.e. watching the
// store state variable, must be declared as an Observer object.
// In line 23 we export App component as an observer().

function App() {

  return(
    <>
      <span>{count.get()}</span> <br />
      <button onClick={() => {increment()}}>+</button>
      <button onClick={() => {decrement()}}>-</button> <br />
      <button onClick={() => {setValue(0)}}>reset</button>
    </>
  );
}

export default observer(App)
