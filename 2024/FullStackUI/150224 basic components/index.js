import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
// import { Counter, BiDiCounter, SmarterBiDiCounter, SuperCounter, CounterWithEffect, CompWithProps, UpdatedComp } from './component/counter_funcs';
import { Title, Titles, TitleWithProps, CounterByClass, LifeCycleComp } from './components/counter_class';

const root = ReactDOM.createRoot(document.getElementById('root'));
/*
root.render(
  <React.StrictMode>
    <Counter />
    <BiDiCounter />
    <SmarterBiDiCounter />
    <SuperCounter />
    <CounterWithEffect />
    <CompWithProps name={"Eran"} func={() => console.log("print")} />

    <UpdatedComp />
  </React.StrictMode>
);
*/
root.render(
  <React.StrictMode>
    <Title />
    <hr></hr>
    <Titles />
    <hr></hr>
    <TitleWithProps title="This is a title from props"/>
    <TitleWithProps title="This is also a title from props"/>
    <hr></hr>
    <CounterByClass />
    <hr></hr>
    <LifeCycleComp />
  </React.StrictMode>
);


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
