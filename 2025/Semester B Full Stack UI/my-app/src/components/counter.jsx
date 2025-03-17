import { useEffect, useState } from 'react'

export default function Counter(props){
    const [count, setCount] = useState(0)

  useEffect(
    () => {console.log("Data was changed")},
    [count])

  function countUp(){
    setCount(count + 1);
  }

  return (
    <div>
      <button onClick={countUp}> Count up </button>
      <span>{count}</span>
      <button onClick={ () => {setCount(count - 1)} }> Count down </button>
    </div>
  )
}