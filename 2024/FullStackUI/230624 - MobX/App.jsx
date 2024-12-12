import { observer } from 'mobx-react';
import './App.css'

import { count, increment, decrement, setValue } from './countState';
import {default as countStore} from './countStore';
import {default as countClass} from './countClass';
import {default as countClassAuto} from './countClassAuto';

function App() {

  return(
    <>
    <div>
      <h2>countState Example</h2>
      <span>{count.get()}</span> <br />
      <button onClick={() => {increment()}}>+</button>
      <button onClick={() => {decrement()}}>-</button> <br />
      <button onClick={() => {setValue(0)}}>reset</button>
      <hr />
    </div>
    <div>
      <h2>countStore Example</h2>
      <span>{countStore.readFormattedValue}</span> <br />
      <button onClick={() => {countStore.increment = 1}}>+</button>
      <button onClick={() => {countStore.decrement = 1}}>-</button> <br />
      <button onClick={() => {countStore.setValue = 0}}>reset</button>
      <hr />
    </div>
    <div>
      <h2>countClass Example</h2>
      <span>{countClass.readFormattedValue}</span> <br />
      <button onClick={() => {countClass.increment()}}>+</button>
      <button onClick={() => {countClass.decrement()}}>-</button> <br />
      <button onClick={() => {countClass.setValue(0)}}>reset</button>
      <hr />
    </div>
    <div>
      <h2>countClassAuto Example</h2>
      <span>{countClassAuto.count}</span> <br />
      <button onClick={() => {countClassAuto.increment()}}>+</button>
      <button onClick={() => {countClassAuto.decrement()}}>-</button> <br />
      <button onClick={() => {countClassAuto.setValue(0)}}>reset</button>
      <hr />
    </div>
      
    </>
  );
}

export default observer(App)
