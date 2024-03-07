import { Component, useEffect, useState } from "react";

export class SignupForm extends Component {
  constructor() {
    super();

    this.state = {
      txtInput: "",
      selectInput: "",
    };
  }

  submitHandler = (ev) => {
    console.log(this.state);
    ev.preventDefault();
  };

  textInputHandler = (ev) => {
    this.setState({ txtInput: ev.target.value });
  };

  render() {
    return (
      <div>
        <form onSubmit={this.submitHandler}>
          <input
            type="text"
            placeholder="enter your name"
            onChange={this.textInputHandler}
          />{" "}
          <br />
          <select
            onChange={({ target }) => {
              this.setState({ selectInput: target.value });
            }}
          >
            <option value="">select</option>
            <option value="opt1">option 1</option>
            <option value="opt2">option 2</option>
            <option value="opt3">option 3</option>
          </select>{" "}
          <br />
          <button type="submit">submit</button>
          <button type="reset">reset</button>
        </form>
      </div>
    );
  }
}

// Ternary expression: (boolean condition) ? < do if true > : < do if false > ;
export function ConditionalComp() {
  const [toggle, setToggle] = useState(true);

  return (
    <div>
      <button
        onClick={() => {
          setToggle(!toggle);
        }}
      >
        change '{String(toggle)}'
      </button>
      {toggle ? <p>Toggle is true</p> : <p>Toggle is false</p>}
    </div>
  );
}

export class ClassListWithUpdate extends Component {
  constructor() {
    super();

    this.state = {
      currentTextInput: "",
      inputs: [],
    };
  }

  clickHandler = () => {
    const temp = this.state.inputs;
    temp.push(this.state.currentTextInput);
    this.setState({ inputs: temp });
    console.log(this.state.inputs);
  };

  render() {
    return (
      <div>
        <h1>Class Updating List</h1>
        <input
          type="text"
          placeholder="enter text"
          onChange={({ target }) => {
            this.setState({ currentTextInput: target.value });
          }}
        />
        <button onClick={this.clickHandler}>+</button>
        <ul>
          {this.state.inputs.map((val) => (
            <li key={val}>{val}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export function FunctionListWithUpdate() {
  const [currentTextInput, setCurrentTextInput] = useState("");
  const [inputs, setInputs] = useState([]);

  const clickHandler = () => {
    const temp = [ ...inputs, currentTextInput ];
    setInputs(temp);
  };

  // The array given as second parameter called 'dependency-list'.
  // We pass the variable we want to triger the event.
  useEffect(
        () => {console.log(inputs);}, 
        [inputs]
    );

  return (
    <div>
        <h1>Functional Updating List</h1>
      <input
        type="text" placeholder="enter text" onChange={({ target }) => {setCurrentTextInput(target.value)}}
      />
      <button onClick={clickHandler}>+</button>
      <ul>
        {
        inputs.map((val) => (
          <li key={val}>{val}</li>
        ))
        }
      </ul>
    </div>
  );
}


export function SearchComp() {
    const [searchWord, setSearchWord] = useState("");
    const [list] = useState([
        "Apple", "Orange", "Grapefruit", "Watermelon", "Mellon"
    ]);

    return(
        <div>
            <input type="text" placeholder="text to search" onChange={({target}) => {setSearchWord(target.value)}}/>
            {
                (searchWord === "")
                ?
                    <ul>
                        {list.map((val) => <li key={val}>{val}</li>)}
                    </ul>
                :
                <ul>
                    {list.filter( val => val.includes(searchWord) )
                    .map((val) => <li key={val}>{val}</li>)}
                </ul>
            }
        </div>
    );
}


export function DetectKeyboard() {
    const [keyPressed, setKeyPressed] = useState("");

    function keyDownListener(ev){
        setKeyPressed(`You pressed '${ev.key}'\t- with keyCode=${ev.code}`);
    }

    return(
        <div>
            <p>Select the text box to put it in focus, <br />
            then press keys on your keboard</p>
            <input type="text" onKeyDown={keyDownListener}/>
            <p>
                {keyPressed}
            </p>
        </div>
    );
}