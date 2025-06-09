import { useState } from "react";
import { observer } from "mobx-react";
import { CountStore } from "./count";



export const CounterButtonNormal = observer(
    () => {

        const [count] = useState(new CountStore);
        return (
            <div>
                <button onClick={count.decrement}>-</button>
                <span>{count.readCount}</span>
                <button onClick={count.increment}>+</button>
            </div>
        );
    }
)