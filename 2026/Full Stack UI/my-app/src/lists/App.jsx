import './App.css'

import {SideMenu, VideoList} from './lists/read_example'
import { TodoList } from './lists/list_operations'


function App() {

  return (
    <>
      <SideMenu />
      <hr />
      <VideoList />
      <hr />
      <TodoList />
    </>
  )
}

export default App
