//import './App.css'
import { useReducer } from 'react'
import './contextApp.css'
import { observer } from 'mobx-react';

import { CounterButton } from './mobx/counter';
import themeStore from './mobx/theme';
import {ThemeButton} from './mobx/theme_button';
import UserDetails from './mobx/user_details';

function App() {
  console.log("Main page loaded OK");

  return(
    <>
      <nav>
        <ThemeButton />
        <br />
        <span>{themeStore.readTheme}</span>
      </nav>
      <hr />
      <CounterButton />
      <CounterButton />
      <hr />
      <UserDetails />
    </>
  );


}

export default observer(App)
