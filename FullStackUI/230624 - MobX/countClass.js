import { action, computed, makeObservable, observable, reaction } from "mobx";

class Store{

    constructor(){
        this.count = 0;
        makeObservable(this, {
            count: observable,
            readFormattedValue: computed,
            increment: action,
            decrement: action,
            setValue: action,
        });
        // The makeObservable(this, options) function must receive
        // an options' object, that specifies for each field/method
        // its mobx element (observables, actions etc..)
    }

    get readFormattedValue () {
        return "@@ " + this.count + " @@";
    }
    increment = () => {
        this.count++;
    }
    decrement = () => {
        this.count--;
    }
    setValue = (val) => {
        this.count = val;
    }
    printStat = reaction(() => {
        console.log(this.count);
    })

}

const store = new Store();

export default store;