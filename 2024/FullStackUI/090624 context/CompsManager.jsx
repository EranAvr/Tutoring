import { useContext } from "react";
import { ThemeContext, DifferentContext } from "./myContexts";

/*
    In this example, we show the use of the Context API.

    By importing our custom Context-objects, we can use the Context mechanism.
    Each Provider-component is a container, which dictate the context value
    for its children components (children, grandchildren etc..) .
    Each component that needs a context-value, search up the components tree
    for the closest Provider, and read the value it holds.
    NOTICE: 'useContext()' method and the Provider comp, must belong to the same
    Context object we made.


    The examples are separated by <he> tags.

    1. First example shows parallel Providers,
    of the same Context object (ThemeContext).
    2. Second example shows nested Providers of 
    the same Context-object type.
    3. Third example combine nested Providers of different context types.
    Notice- in this example, the innermost Provider is NOT of the same Context-object type
    of <MyParagraph />, so we keep on searching up the tree.

*/


function MyTitle(){
    return(
        <h2> {useContext(ThemeContext)} </h2>
    );
}
function MyParagraph(){
    return(
        <p> {useContext(DifferentContext)} </p>
    );
}

export default function CompsManager(){
    return(
        <>
            <ThemeContext.Provider value="light">
                <MyTitle />
            </ThemeContext.Provider>
            <ThemeContext.Provider value="dark">
                <MyTitle />
            </ThemeContext.Provider>
            <hr />
            <ThemeContext.Provider value="red">
                <h1>Nested Providers:</h1>
                <p>
                    This is an example for nested Providers, <br />
                    i.e. Provider inside another Provider. <br />
                    Here, the value of the Provider is:
                    <MyTitle />
                </p>

                <ThemeContext.Provider value="blue">
                    <span>Here, in the innermost Provider, the value is:</span>
                    <MyTitle />
                </ThemeContext.Provider>
            </ThemeContext.Provider>
            <hr />
            <DifferentContext.Provider value="dog">

                <ThemeContext.Provider value="cat">
                    <MyParagraph />
                </ThemeContext.Provider>
                
            </DifferentContext.Provider>
        </>
    );
}
