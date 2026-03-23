import './App.css'
import PresentVideos from './fallback_ui/suspense_example';
import UsersList from './fallback_ui/error_boundary';
import Timer from './reference/timer';


function TestError(props){
  
  if(true){
    throw new Error("Demo error");
  }
  return(
    <li onClick={handleClick}>{props.name}</li>
  );
}

function App() {

  return(
    <>
      <Timer />
      <UsersList>
        <TestError name={"John Doe"}/>
        <TestError name={"Sally James"}/>
      </UsersList>
    </>
  );
}

export default App
