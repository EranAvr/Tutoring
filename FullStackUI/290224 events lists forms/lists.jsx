import { Component } from "react";

const list1 = ["Apple", "Orange", "Grapefruit", "Watermelon"];
const list2 = [
  {
    text: "text for image 1",
    image:
      "https://img.freepik.com/free-photo/painting-mountain-lake-with-mountain-background_188544-9126.jpg",
  },
  {
    text: "some text for image 2",
    image:
      "https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?cs=srgb&dl=pexels-anjana-c-674010.jpg&fm=jpg",
  },
  {
    text: "another image text",
    image:
      "https://media.istockphoto.com/id/1146517111/photo/taj-mahal-mausoleum-in-agra.jpg?s=612x612&w=0&k=20&c=vcIjhwUrNyjoKbGbAQ5sOcEzDUgOfCsm9ySmJ8gNeRk=",
  },
];

// Examples for list-containers,
// starting with very simple example, and building it up gradually.
export class ListContainer extends Component {
  constructor() {
    super();
    this.state = {
      lst: list1,
    };
  }

  render() {
    return (
      <ul>
        {this.state.lst.map((parameter) => (
          <li key={parameter}> {parameter} </li>
        ))}
      </ul>
    );
  }
}

export class ListContainerWithIndices extends Component {
  constructor() {
    super();
    this.state = {
      lst: list1,
    };
  }

  render() {
    return (
      <ul>
        {this.state.lst.map((parameter, index) => (
          <li key={parameter}> {index + " " + parameter} </li>
        ))}
      </ul>
    );
  }
}

// Example of listing components,
// with a more complex component as a list item.
export class ListContainerWithImages extends Component {
  constructor() {
    super();
    this.state = {
      lst: list2,
    };
  }

  render() {
    return (
      <ul>
        {this.state.lst.map((jsonObj) => (
          <PresentInfo
            key={jsonObj.text}
            image={jsonObj.image}
            text={jsonObj.text}
          />
        ))}
      </ul>
    );
  }
}

function PresentInfo(props) {
  return (
    <div>
      <img src={props.image} alt="" style={{ width: "50px" }} />
      <span> {props.text} </span>
    </div>
  );
}

// Here, we can see two ways to iterate through JSON in our code.
// REMEMBER- JSON is a list of key-value pairs,
// so we can do the following:
//  1. use Object.keys(myJsonObject) and run map over the keys
//  2. use Object.entries(myJsonObject) and run map over its entries

// See the following examples-

export class ListContainerFromJsonKeys extends Component {
  constructor() {
    super();
    this.state = {
      userName: "John Smith",
      age: 100,
      email: "wrgwerevds@mail.com",
    };
  }

  render() {
    return (
      <div>
        <h3>Print JSON by keys</h3>
        <ul>
          {Object.keys(this.state).map((k) => (
            <li key={k}> {k + " " + this.state[k]} </li>
          ))}
        </ul>
      </div>
    );
  }
}
export class ListContainerFromJsonEntries extends Component {
  constructor() {
    super();
    this.state = {
      userName: "John Smith",
      age: 100,
      email: "wrgwerevds@mail.com",
    };
  }

  render() {
    return (
      <div>
        <h3>Print JSON by entries</h3>
        <ul>
          {Object.entries(this.state).map(([k, v]) => (
            <li key={k}> {k + " " + v} </li>
          ))}
        </ul>
      </div>
    );
  }
}
