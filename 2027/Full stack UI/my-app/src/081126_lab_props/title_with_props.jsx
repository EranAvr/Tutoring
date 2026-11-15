const myStyle = {color: "blue"}

export default function Title(props){
  return <h1 style={myStyle}>{props.text}</h1>
}