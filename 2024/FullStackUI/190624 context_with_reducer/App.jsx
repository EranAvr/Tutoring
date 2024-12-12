
import {UserCustomProvider, ReadUser, UpdateUser} from './context_with_reducer/user_context'

function App() {

  return(
    <UserCustomProvider>
      <ReadUser />
      <hr />
      <UpdateUser />
    </UserCustomProvider>
  );
}

export default App
