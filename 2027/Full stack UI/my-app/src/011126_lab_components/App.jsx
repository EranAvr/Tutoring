
//import './App.css'
import Title from "./011126_lab_components/title_with_props"
import PropsLogger from "./011126_lab_components/props_logger"
import CounterWithSteps from "./011126_lab_components/counter_with_steps"
import ColorfulDiv from "./011126_lab_components/colorful_div"

function App() {

  return (
    <>
    <PropsLogger text="my text" num={36}/>
    <CounterWithSteps step={10}/>
    <div>
            <Title text="Gallery"/>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Optio, ratione. Excepturi consequatur et optio tempore fuga repellendus eligendi quae, laborum pariatur quaerat accusamus, hic ullam velit, quibusdam quos. Deleniti, facere?
    </div>
    <hr />
    <div>
            <Title text="Shop"/>
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ratione placeat incidunt, fuga rem nam dignissimos cupiditate numquam eum, vero, dicta deserunt! Delectus quod in animi debitis praesentium possimus natus quisquam.
    </div>
    <hr />
    <ColorfulDiv />
    <ColorfulDiv bg="blue" />
    </>
  )
}

export default App
