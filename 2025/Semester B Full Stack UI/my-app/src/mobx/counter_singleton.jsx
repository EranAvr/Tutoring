import { action, observable } from "mobx";
import { observer } from "mobx-react";

/*
    כדי שטעינה מחודשת של רכיב-פונקציה לא
    תיצור מחדש את משתנה המצב שלנו, נאלצנו
    להוציא אותו מהקומפוננטה ולהפוך אותו לגלובלי.
    משמעות הדבר: יש משתנה מצב אחד ויחיד,
    ואם ניצור כמה כפתורים שונים, כולם פונים אל
    אותו משתנה המצב ואותו הדאטה.
    זה מוגבל!!
    ניתן לפתור את העניין ע"י שימוש בפונקציה-
    useLocalObservable()
*/
// create the state variable-
const count = observable.box(0);

export const CounterButtonSingleton = observer(
    () => {

    // decrement/increment actions-
    const decrement = action(
        () => {count.set( count.get() - 1 ); console.log(count.get());
        }
    );
    const increment = action(
        () => {count.set( count.get() + 1 ); console.log(count.get());}
    );
    
    return(
        <div>
            <button onClick={decrement}>-</button>
            <span>{ count.get() }</span>
            <button onClick={increment}>+</button>
        </div>
    );
}
)