import './App.css'
import { PresentUsers, ImageContainer } from './fetch_api/get_requests';
import { LoginCard } from './fetch_api/post_requests';

function App() {

  return(
    <>
      <PresentUsers />
      <ImageContainer />

      <hr />

      <LoginCard />
    </>
  );
}

export default App
