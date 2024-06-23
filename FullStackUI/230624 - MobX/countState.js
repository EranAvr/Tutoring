import { action, observable } from "mobx";


// single value observable
const count = observable.box(0);

// actions for modifying data
const increment = action(() => {
    count.set(count.get() + 1);
});
const decrement = action(() => {
    count.set(count.get() - 1);
});
const setValue = action((val) => {
    count.set(val);
});

export {count, increment, decrement, setValue};