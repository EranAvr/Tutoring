//import './App.css'
import { useReducer } from 'react'
import './contextApp.css'
import { observer } from 'mobx-react';

import { CounterButtonSingleton } from './mobx/counter_singleton';
import { CounterButtonNormal } from './mobx/counter_normal';
import themeStore from './mobx/theme';
import {ThemeButton} from './mobx/theme_button';
import UserDetails from './mobx/user_details';
import LanguageButton from './mobx/lang_button';

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
      <h3>Singleton counters:</h3>
        <CounterButtonSingleton />
        <CounterButtonSingleton />
      <hr />
      <h3>Normal counters:</h3>
        <CounterButtonNormal/>
        <CounterButtonNormal/>
      <hr />
      <UserDetails />
      <hr />
      <LanguageButton />
    </>
  );


}

export default observer(App)
