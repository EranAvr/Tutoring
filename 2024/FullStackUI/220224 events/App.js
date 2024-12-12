import { Counter, CountersContainer } from './components/counter';
import {ToolBar} from './components/toolbar';
import './App.css';

function App() {
  return (
    <div className="App">
      <ToolBar />
      <CountersContainer />
    </div>
  );
}

export default App;
