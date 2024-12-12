import { useContext } from 'react';
import {MyContext} from './pageContext'

function SubTree(props){
    return(
        <div>
                <h1>Subtree {props.serialNum}</h1>
                <p>
                    Subtree-{props.serialNum} value: {useContext(MyContext)}
                </p>
        </div>
    );
}

export default function PageCompTree(){

    return(
        <div>
            <p>
                Default value: {useContext(MyContext)}
            </p>

            <MyContext.Provider value='test value 1'>
                <SubTree serialNum="1"/>
            </MyContext.Provider>
            

            <MyContext.Provider value='test value 2'>
                <SubTree serialNum="2"/>
            </MyContext.Provider>
            
        </div>
    );
}