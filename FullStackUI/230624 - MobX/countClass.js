import { action, computed, makeObservable, observable, autorun, reaction } from "mobx";

class Store{

    constructor(){
        this.count = 0;
        // The makeObservable(this, options) function must receive
        // an options' object, that specifies for each field/method
        // its mobx element (observables, actions etc..)
        makeObservable(this, {
            count: observable,
            readFormattedValue: computed,
            increment: action,
            decrement: action,
            setValue: action,
        });
        // Reactions are usually added from within the constructor
        // The reaction function has 2 parameters:
        // 1) data function - a function that returns the data we want
        // to observe (follow). The data is being passed automatically
        // to the next function inside 'value' parameter.
        // 2) reaction function - this is the function that will run
        // whenever the observed data is being updated.
        // This function defines the side-effect that occurs in updates.
        this.disposer = reaction(() => this.count, (value, previousValue, reaction) => {
            console.log("Store Class, reaction; value = " + value);
        })
        // disposer function - reaction/autorun functions return a
        // 'disposer' function, which we can hold in a variable.
        // The disposer function is being called to shut down the reaction.
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

}

const store = new Store();

export default store;