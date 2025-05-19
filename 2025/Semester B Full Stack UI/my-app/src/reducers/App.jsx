//import './App.css'
import { useReducer } from 'react'
import './contextApp.css'

import Counter from './reducers/counter';
import TodoList from './reducers/todo_list';


function App() {
  console.log("Main page loaded OK");

  return(
    <>
      <Counter />
      <hr />
      <TodoList />
    </>
  );


}

export default App
